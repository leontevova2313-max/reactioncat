import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class ExtractModuleSettings {
    private static final Set<String> MODULE_WORDS = new LinkedHashSet<>(Arrays.asList(
        "Aura", "AutoCrystal", "Crystal", "Surround", "Timer", "Speed", "Fly", "Step",
        "Scaffold", "Blink", "Velocity", "NoFall", "NoSlow", "Reach", "Phase", "ESP",
        "HUD", "Nametag", "Tracers", "Chest", "ClickGui", "Offhand", "Totem", "AutoTotem",
        "AutoArmor", "AutoMine", "AutoReconnect", "AutoRespawn", "AutoTrap", "AutoXP",
        "AutoWalk", "AutoDupe", "Freecam", "MiddleClick", "Jesus", "EntitySpeed",
        "LongJump", "Sprint", "Strafe", "Xray", "Anchor", "AntiCheat", "AntiAim",
        "AntiHunger", "AntiWeb", "PacketFly", "Chat"
    ));

    private static final Set<String> IGNORE = new LinkedHashSet<>(Arrays.asList(
        "Code", "SourceFile", "LineNumberTable", "LocalVariableTable", "Signature",
        "InnerClasses", "StackMapTable", "MethodParameters", "BootstrapMethods", "this",
        "getValue", "valueOf", "equals", "hashCode", "toString", "Builder", "Normal",
        "Client", "Page", "Mode", "Timing", "Target", "Rotate", "Source", "Vector",
        "Distance", "Raytrace", "Jump", "Spread", "Lookup", "Mutable", "Switch", "Silent",
        "Entry", "SwitchResult", "InventorySync", "Use"
    ));

    private static final Pattern HUMAN = Pattern.compile("^[A-Za-z][A-Za-z0-9 _+-]{2,40}$");

    public static void main(String[] args) throws Exception {
        Path root = args.length > 0 ? Path.of(args[0]) : Path.of("org", "phobos", "secure");
        Map<String, Map<String, Object>> out = new LinkedHashMap<>();

        Files.walkFileTree(root, new SimpleFileVisitor<>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (!file.getFileName().toString().endsWith(".class") || file.getFileName().toString().contains("$")) {
                    return FileVisitResult.CONTINUE;
                }

                List<String> utf8s = parseUtf8Strings(file);
                LinkedHashSet<String> readable = new LinkedHashSet<>();
                for (String s : utf8s) {
                    if (s == null) {
                        continue;
                    }
                    String trimmed = s.trim();
                    if (trimmed.isEmpty() || trimmed.length() > 50 || trimmed.contains("/") || trimmed.contains(".") || IGNORE.contains(trimmed)) {
                        continue;
                    }
                    if (HUMAN.matcher(trimmed).matches()) {
                        readable.add(trimmed);
                    }
                }

                List<String> modules = new ArrayList<>();
                for (String value : readable) {
                    if (MODULE_WORDS.contains(value)) {
                        modules.add(value);
                    }
                }

                if (!modules.isEmpty()) {
                    List<String> settings = new ArrayList<>();
                    for (String value : readable) {
                        if (!modules.contains(value) && !IGNORE.contains(value)) {
                            settings.add(value);
                        }
                    }

                    Map<String, Object> info = new LinkedHashMap<>();
                    info.put("modules", modules);
                    info.put("settings", settings);
                    out.put(root.relativize(file).toString().replace('\\', '/'), info);
                }

                return FileVisitResult.CONTINUE;
            }
        });

        for (Map.Entry<String, Map<String, Object>> entry : out.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println("  modules: " + entry.getValue().get("modules"));
            System.out.println("  settings: " + entry.getValue().get("settings"));
        }

        TreeSet<String> uniqueModules = new TreeSet<>();
        for (Map<String, Object> info : out.values()) {
            @SuppressWarnings("unchecked")
            List<String> modules = (List<String>) info.get("modules");
            uniqueModules.addAll(modules);
        }
        System.out.println("UNIQUE_MODULES=" + uniqueModules);
    }

    private static List<String> parseUtf8Strings(Path classFile) throws IOException {
        try (InputStream input = Files.newInputStream(classFile); DataInputStream in = new DataInputStream(input)) {
            if (in.readInt() != 0xCAFEBABE) {
                return List.of();
            }

            in.readUnsignedShort();
            in.readUnsignedShort();
            int cpCount = in.readUnsignedShort();
            List<String> result = new ArrayList<>();

            for (int i = 1; i < cpCount; i++) {
                int tag = in.readUnsignedByte();
                switch (tag) {
                    case 1 -> result.add(in.readUTF());
                    case 3, 4 -> in.skipBytes(4);
                    case 5, 6 -> {
                        in.skipBytes(8);
                        i++;
                    }
                    case 7, 8, 16, 19, 20 -> in.skipBytes(2);
                    case 9, 10, 11, 12, 17, 18 -> in.skipBytes(4);
                    case 15 -> in.skipBytes(3);
                    default -> throw new IOException("Unsupported constant pool tag " + tag + " in " + classFile);
                }
            }

            return result;
        }
    }
}
