import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MakeReadableSources {
    private static final Pattern PACKAGE_PATTERN = Pattern.compile("(?m)^package\\s+([\\w.]+);");
    private static final Pattern TYPE_PATTERN = Pattern.compile(
        "(?m)^(?:public\\s+|protected\\s+|private\\s+)?(?:abstract\\s+|final\\s+|sealed\\s+|non-sealed\\s+)*(class|interface|enum|record|@interface)\\s+([A-Za-z_][A-Za-z0-9_]*)"
    );
    private static final Pattern MODULE_NAME_PATTERN = Pattern.compile(
        "super\\((?s:.*?)\"([A-Za-z][A-Za-z0-9 ]{1,60})\"\\s*,\\s*jAjUdhSJZoq13PSzPZw48f1KQAflzpMr"
    );
    private static final Pattern SETTING_ASSIGNMENT_PATTERN = Pattern.compile(
        "this\\.(\\w+)\\s*=\\s*this\\.[\\w$]+\\((?s:.*?)\"([A-Za-z][A-Za-z0-9 ]{1,60})\"(?s:.*?)\\);"
    );
    private static final Pattern FIELD_DECLARATION_PATTERN = Pattern.compile(
        "(?m)^\\s*(?:public|protected|private)?(?:\\s+static)?(?:\\s+final)?(?:\\s+transient)?(?:\\s+volatile)?(?:\\s+/\\*.*?\\*/)?\\s*[\\w$.<>\\[\\], ?]+\\s+(\\w+)\\s*(?:=|;)"
    );
    private static final Set<String> ROOT_RESOURCE_NAMES = Set.of(
        "fabric.mod.json",
        "phoboslite.mixins.json",
        "phoboslite.accesswidener",
        "phoboslite-refmap.json",
        "icon.png"
    );
    private static final Set<String> ROOT_RESOURCE_DIRECTORIES = Set.of(
        "assets",
        "META-INF"
    );
    private static final Set<String> MODULE_NAME_STOP_WORDS = Set.of(
        "Automatically",
        "Forces",
        "Places",
        "Prevents",
        "Shows",
        "Moves",
        "Allows",
        "Makes",
        "Displays",
        "Changes",
        "Speeds",
        "Blocks"
    );
    private static final Pattern OBFUSCATED_IDENTIFIER_PATTERN = Pattern.compile("^(?:_[A-Za-z0-9]{8,}|[A-Za-z0-9]{16,})$");

    public static void main(String[] args) throws Exception {
        Path inputRoot = args.length > 0 ? Path.of(args[0]) : Path.of("decompiled-src");
        Path outputRoot = args.length > 1 ? Path.of(args[1]) : Path.of("decompiled-readable");
        Path projectRoot = args.length > 2 ? Path.of(args[2]) : Path.of(".");

        Path javaRoot = outputRoot.resolve(Path.of("src", "main", "java"));
        Path resourcesRoot = outputRoot.resolve(Path.of("src", "main", "resources"));
        recreateDirectory(outputRoot);
        copyTree(inputRoot, javaRoot);
        copyProjectResources(projectRoot, resourcesRoot);

        List<JavaFile> javaFiles = scanJavaFiles(javaRoot);
        Map<String, String> packageRenameMap = buildPackageRenameMap(javaFiles);
        Map<String, String> classRenameMap = buildClassRenameMap(javaFiles);

        for (JavaFile javaFile : javaFiles) {
            String updated = javaFile.content;
            String newPackageName = packageRenameMap.getOrDefault(javaFile.packageName, javaFile.packageName);
            String newClassName = classRenameMap.getOrDefault(javaFile.fqcn, javaFile.className);

            updated = updated.replace(javaFile.fqcn, newPackageName + "." + newClassName);
            updated = replacePackageReferences(updated, javaFile.packageName, newPackageName);
            updated = replaceTypeDeclarationName(updated, javaFile.className, newClassName);
            updated = replaceSimpleClassReferences(updated, javaFile.className, newClassName);

            Map<String, String> fieldRenameMap = shouldRenameFields(javaFile)
                ? buildFieldRenameMap(updated)
                : Map.of();
            updated = applyFieldRenames(updated, fieldRenameMap);
            javaFile.content = updated;
            javaFile.fieldRenameMap = fieldRenameMap;
            javaFile.currentPackageName = newPackageName;
            javaFile.currentClassName = newClassName;
        }

        applyClassRenames(javaFiles, classRenameMap);
        recreateDirectory(javaRoot);
        writeJavaFiles(javaFiles, classRenameMap);
        writeMappingFiles(outputRoot, javaFiles, packageRenameMap, classRenameMap);
    }

    private static void recreateDirectory(Path root) throws IOException {
        if (Files.exists(root)) {
            Files.walk(root)
                .sorted(Comparator.reverseOrder())
                .forEach(path -> {
                    try {
                        Files.delete(path);
                    } catch (IOException exception) {
                        throw new RuntimeException(exception);
                    }
                });
        }
        Files.createDirectories(root);
    }

    private static void copyTree(Path inputRoot, Path outputRoot) throws IOException {
        Files.walkFileTree(inputRoot, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                Files.createDirectories(outputRoot.resolve(inputRoot.relativize(dir)));
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                Files.copy(file, outputRoot.resolve(inputRoot.relativize(file)), StandardCopyOption.REPLACE_EXISTING);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    private static void copyProjectResources(Path projectRoot, Path resourcesRoot) throws IOException {
        Files.createDirectories(resourcesRoot);

        for (String fileName : ROOT_RESOURCE_NAMES) {
            Path source = projectRoot.resolve(fileName);
            if (Files.isRegularFile(source)) {
                Files.copy(source, resourcesRoot.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
            }
        }

        for (String directoryName : ROOT_RESOURCE_DIRECTORIES) {
            Path sourceDir = projectRoot.resolve(directoryName);
            if (!Files.isDirectory(sourceDir)) {
                continue;
            }
            copyTree(sourceDir, resourcesRoot.resolve(directoryName));
        }
    }

    private static List<JavaFile> scanJavaFiles(Path javaRoot) throws IOException {
        List<JavaFile> result = new ArrayList<>();
        Files.walkFileTree(javaRoot, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (!file.getFileName().toString().endsWith(".java")) {
                    return FileVisitResult.CONTINUE;
                }

                String content = Files.readString(file, StandardCharsets.UTF_8);
                Matcher packageMatcher = PACKAGE_PATTERN.matcher(content);
                Matcher typeMatcher = TYPE_PATTERN.matcher(content);
                if (!packageMatcher.find() || !typeMatcher.find()) {
                    return FileVisitResult.CONTINUE;
                }

                String packageName = packageMatcher.group(1);
                String typeKind = typeMatcher.group(1);
                String className = typeMatcher.group(2);
                result.add(new JavaFile(file, packageName, className, packageName + "." + className, content, typeKind));
                return FileVisitResult.CONTINUE;
            }
        });
        return result;
    }

    private static Map<String, String> buildPackageRenameMap(List<JavaFile> javaFiles) {
        Map<String, String> result = new LinkedHashMap<>();
        Map<String, Integer> counters = new HashMap<>();

        for (JavaFile javaFile : javaFiles) {
            if (!javaFile.packageName.startsWith("org.phobos.secure.")) {
                continue;
            }

            String segment = javaFile.packageName.substring("org.phobos.secure.".length());
            if (!isObfuscatedIdentifier(segment) || result.containsKey(javaFile.packageName)) {
                continue;
            }

            int next = counters.merge("securePackage", 1, Integer::sum);
            result.put(javaFile.packageName, "org.phobos.secure.group" + String.format("%03d", next));
        }

        return result;
    }

    private static Map<String, String> buildClassRenameMap(List<JavaFile> javaFiles) {
        Map<String, String> result = new LinkedHashMap<>();
        Map<String, Integer> usedNames = new HashMap<>();

        for (JavaFile javaFile : javaFiles) {
            if (!isRenamableProjectClass(javaFile)) {
                continue;
            }

            Matcher matcher = MODULE_NAME_PATTERN.matcher(javaFile.content);
            if (!matcher.find()) {
                continue;
            }

            String moduleName = matcher.group(1).trim();
            if (!isLikelyModuleName(moduleName)) {
                continue;
            }

            String baseName = sanitizePascalCase(moduleName) + "Module";
            int count = usedNames.merge(baseName, 1, Integer::sum);
            String newName = count == 1 ? baseName : baseName + count;
            result.put(javaFile.fqcn, newName);
        }

        for (JavaFile javaFile : javaFiles) {
            if (!isRenamableProjectClass(javaFile) || result.containsKey(javaFile.fqcn) || !isObfuscatedIdentifier(javaFile.className)) {
                continue;
            }

            String prefix = switch (javaFile.typeKind) {
                case "interface" -> "SecureInterface";
                case "enum" -> "SecureEnum";
                case "record" -> "SecureRecord";
                case "@interface" -> "SecureAnnotation";
                default -> "SecureClass";
            };
            int count = usedNames.merge(prefix, 1, Integer::sum);
            result.put(javaFile.fqcn, prefix + String.format("%04d", count));
        }

        return result;
    }

    private static boolean shouldRenameFields(JavaFile javaFile) {
        return javaFile.packageName.startsWith("org.phobos.secure");
    }

    private static boolean isRenamableProjectClass(JavaFile javaFile) {
        return javaFile.packageName.startsWith("org.phobos.secure");
    }

    private static boolean isLikelyModuleName(String moduleName) {
        if (moduleName.isBlank() || moduleName.length() > 24) {
            return false;
        }

        String[] parts = moduleName.trim().split("\\s+");
        if (parts.length == 0 || parts.length > 2) {
            return false;
        }

        for (String part : parts) {
            if (!part.matches("[A-Za-z][A-Za-z0-9]{1,15}")) {
                return false;
            }
            if (MODULE_NAME_STOP_WORDS.contains(part)) {
                return false;
            }
        }

        return true;
    }

    private static Map<String, String> buildFieldRenameMap(String content) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> usedNames = new LinkedHashSet<>();
        Matcher matcher = SETTING_ASSIGNMENT_PATTERN.matcher(content);

        while (matcher.find()) {
            String fieldName = matcher.group(1);
            String literal = matcher.group(2).trim();
            if (fieldName.startsWith("cfr_renamed_")) {
                continue;
            }

            String candidate = sanitizeCamelCase(literal);
            if (candidate.isBlank() || candidate.equals(fieldName)) {
                continue;
            }
            if (!candidate.matches("[a-z][A-Za-z0-9]{1,30}")) {
                continue;
            }

            String uniqueName = candidate;
            int suffix = 2;
            while (usedNames.contains(uniqueName)) {
                uniqueName = candidate + suffix++;
            }

            usedNames.add(uniqueName);
            result.put(fieldName, uniqueName);
        }

        int fallbackCounter = 1;
        Matcher fieldMatcher = FIELD_DECLARATION_PATTERN.matcher(content);
        while (fieldMatcher.find()) {
            String fieldName = fieldMatcher.group(1);
            if (result.containsKey(fieldName) || !isObfuscatedIdentifier(fieldName) && !fieldName.startsWith("cfr_renamed_")) {
                continue;
            }

            String uniqueName;
            do {
                uniqueName = "field" + String.format("%03d", fallbackCounter++);
            } while (usedNames.contains(uniqueName));

            usedNames.add(uniqueName);
            result.put(fieldName, uniqueName);
        }

        return result;
    }

    private static String applyFieldRenames(String content, Map<String, String> fieldRenameMap) {
        String updated = content;
        for (Map.Entry<String, String> entry : fieldRenameMap.entrySet()) {
            updated = updated.replaceAll("\\b" + Pattern.quote(entry.getKey()) + "\\b", entry.getValue());
        }
        return updated;
    }

    private static void applyClassRenames(List<JavaFile> javaFiles, Map<String, String> classRenameMap) {
        Map<String, String> simpleNameMap = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : classRenameMap.entrySet()) {
            String oldFqcn = entry.getKey();
            String oldSimple = oldFqcn.substring(oldFqcn.lastIndexOf('.') + 1);
            simpleNameMap.put(oldSimple, entry.getValue());
        }

        for (JavaFile javaFile : javaFiles) {
            String updated = javaFile.content;
            for (Map.Entry<String, String> entry : simpleNameMap.entrySet()) {
                updated = updated.replaceAll("\\b" + Pattern.quote(entry.getKey()) + "\\b", entry.getValue());
            }
            javaFile.content = updated;
        }
    }

    private static void writeJavaFiles(List<JavaFile> javaFiles, Map<String, String> classRenameMap) throws IOException {
        for (JavaFile javaFile : javaFiles) {
            String newClassName = javaFile.currentClassName;
            Path root = findJavaSourceRoot(javaFile.path);
            Path newPath = root.resolve(javaFile.currentPackageName.replace('.', '\\')).resolve(newClassName + ".java");
            Files.createDirectories(newPath.getParent());
            Files.deleteIfExists(javaFile.path);
            Files.writeString(newPath, javaFile.content, StandardCharsets.UTF_8);
        }
    }

    private static Path findJavaSourceRoot(Path path) {
        Path current = path.getParent();
        while (current != null && !current.getFileName().toString().equals("java")) {
            current = current.getParent();
        }
        return current == null ? path.getParent() : current;
    }

    private static void writeMappingFiles(Path outputRoot, List<JavaFile> javaFiles, Map<String, String> packageRenameMap, Map<String, String> classRenameMap) throws IOException {
        List<String> packageLines = new ArrayList<>();
        packageLines.add("Readable package renames");
        packageLines.add("");
        for (Map.Entry<String, String> entry : packageRenameMap.entrySet()) {
            packageLines.add(entry.getKey() + " -> " + entry.getValue());
        }
        Files.write(outputRoot.resolve("package-renames.txt"), packageLines, StandardCharsets.UTF_8);

        List<String> classLines = new ArrayList<>();
        classLines.add("Readable class renames");
        classLines.add("");

        for (Map.Entry<String, String> entry : classRenameMap.entrySet()) {
            classLines.add(entry.getKey() + " -> " + entry.getValue());
        }

        Files.write(outputRoot.resolve("class-renames.txt"), classLines, StandardCharsets.UTF_8);

        List<String> fieldLines = new ArrayList<>();
        fieldLines.add("Readable field renames");
        fieldLines.add("");

        for (JavaFile javaFile : javaFiles) {
            if (javaFile.fieldRenameMap.isEmpty()) {
                continue;
            }
            String displayName = classRenameMap.getOrDefault(javaFile.fqcn, javaFile.className);
            fieldLines.add(displayName + " (" + javaFile.fqcn + ")");
            for (Map.Entry<String, String> fieldEntry : javaFile.fieldRenameMap.entrySet()) {
                fieldLines.add("  " + fieldEntry.getKey() + " -> " + fieldEntry.getValue());
            }
            fieldLines.add("");
        }

        Files.write(outputRoot.resolve("field-renames.txt"), fieldLines, StandardCharsets.UTF_8);
    }

    private static String sanitizePascalCase(String value) {
        String[] parts = value.replaceAll("[^A-Za-z0-9]+", " ").trim().split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String part : parts) {
            if (part.isBlank()) {
                continue;
            }
            builder.append(Character.toUpperCase(part.charAt(0)));
            if (part.length() > 1) {
                builder.append(part.substring(1));
            }
        }
        return builder.length() == 0 ? "Unknown" : builder.toString();
    }

    private static String sanitizeCamelCase(String value) {
        String pascal = sanitizePascalCase(value);
        if (pascal.isBlank()) {
            return "";
        }
        return Character.toLowerCase(pascal.charAt(0)) + pascal.substring(1);
    }

    private static boolean isObfuscatedIdentifier(String value) {
        return OBFUSCATED_IDENTIFIER_PATTERN.matcher(value).matches();
    }

    private static String replaceExact(String content, String oldValue, String newValue) {
        return content.replaceAll("(?<![A-Za-z0-9_$.])" + Pattern.quote(oldValue) + "(?![A-Za-z0-9_$.])", Matcher.quoteReplacement(newValue));
    }

    private static String replaceTypeDeclarationName(String content, String oldName, String newName) {
        return content.replaceFirst(
            "(?m)^((?:public\\s+|protected\\s+|private\\s+)?(?:abstract\\s+|final\\s+|sealed\\s+|non-sealed\\s+)*(?:class|interface|enum|record|@interface)\\s+)" + Pattern.quote(oldName) + "(\\b)",
            "$1" + Matcher.quoteReplacement(newName) + "$2"
        );
    }

    private static String replaceSimpleClassReferences(String content, String oldName, String newName) {
        return content.replaceAll("\\b" + Pattern.quote(oldName) + "\\b", Matcher.quoteReplacement(newName));
    }

    private static String replacePackageReferences(String content, String oldPackage, String newPackage) {
        if (oldPackage.equals(newPackage)) {
            return content;
        }

        String updated = content.replace("package " + oldPackage + ";", "package " + newPackage + ";");
        updated = updated.replace(oldPackage + ".", newPackage + ".");
        return updated;
    }

    private static final class JavaFile {
        private final Path path;
        private final String packageName;
        private final String className;
        private final String fqcn;
        private final String typeKind;
        private String content;
        private String currentPackageName;
        private String currentClassName;
        private Map<String, String> fieldRenameMap = Map.of();

        private JavaFile(Path path, String packageName, String className, String fqcn, String content, String typeKind) {
            this.path = path;
            this.packageName = packageName;
            this.className = className;
            this.fqcn = fqcn;
            this.content = content;
            this.typeKind = typeKind;
            this.currentPackageName = packageName;
            this.currentClassName = className;
        }
    }
}
