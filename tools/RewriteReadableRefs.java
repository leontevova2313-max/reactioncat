import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class RewriteReadableRefs {
    public static void main(String[] args) throws Exception {
        Path projectRoot = args.length > 0 ? Path.of(args[0]) : Path.of("decompiled-readable");
        Path javaRoot = projectRoot.resolve(Path.of("src", "main", "java"));

        Map<String, String> packageMap = readMap(projectRoot.resolve("package-renames.txt"));
        Map<String, String> classMap = readMap(projectRoot.resolve("class-renames.txt"));
        List<Map.Entry<String, String>> fqcnReplacements = buildFqcnReplacements(packageMap, classMap);
        List<Map.Entry<String, String>> packageReplacements = new ArrayList<>(packageMap.entrySet());
        packageReplacements.sort(Comparator.comparingInt((Map.Entry<String, String> entry) -> entry.getKey().length()).reversed());

        try (Stream<Path> stream = Files.walk(javaRoot)) {
            stream.filter(path -> path.getFileName().toString().endsWith(".java")).forEach(path -> {
                try {
                    String original = Files.readString(path, StandardCharsets.UTF_8);
                    String updated = original;

                    for (Map.Entry<String, String> entry : fqcnReplacements) {
                        updated = updated.replace(entry.getKey(), entry.getValue());
                    }

                    for (Map.Entry<String, String> entry : packageReplacements) {
                        updated = updated.replace("package " + entry.getKey() + ";", "package " + entry.getValue() + ";");
                        updated = updated.replace(entry.getKey() + ".", entry.getValue() + ".");
                    }

                    if (!updated.equals(original)) {
                        Files.writeString(path, updated, StandardCharsets.UTF_8);
                    }
                } catch (IOException exception) {
                    throw new RuntimeException(exception);
                }
            });
        }
    }

    private static Map<String, String> readMap(Path path) throws IOException {
        Map<String, String> result = new LinkedHashMap<>();
        for (String line : Files.readAllLines(path, StandardCharsets.UTF_8)) {
            if (!line.contains(" -> ")) {
                continue;
            }
            String[] parts = line.split(" -> ", 2);
            result.put(parts[0].trim(), parts[1].trim());
        }
        return result;
    }

    private static List<Map.Entry<String, String>> buildFqcnReplacements(Map<String, String> packageMap, Map<String, String> classMap) {
        List<Map.Entry<String, String>> result = new ArrayList<>();
        for (Map.Entry<String, String> entry : classMap.entrySet()) {
            String oldFqcn = entry.getKey();
            int lastDot = oldFqcn.lastIndexOf('.');
            String oldPackage = oldFqcn.substring(0, lastDot);
            String newPackage = packageMap.getOrDefault(oldPackage, oldPackage);
            String newFqcn = newPackage + "." + entry.getValue();
            result.add(Map.entry(oldFqcn, newFqcn));
        }
        result.sort(Comparator.comparingInt((Map.Entry<String, String> entry) -> entry.getKey().length()).reversed());
        return result;
    }
}
