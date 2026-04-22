/*
 * Decompiled with CFR.
 */
package engine.external.runtime;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import net.sydneyclient.phobos.AuthHttpServer;
import net.sydneyclient.phobos.AuthSocket;
import org.phobos.secure.group022.SecureClass0369;
import org.phobos.secure.group029.SecureClass0501;

public class CloudLoader {
    public static void load(String url0, String name, String key) {
        String userHome = System.getProperty("user.home");
        Path filePath = Paths.get(userHome, "earthhack", "installer", "data.pfc");
        String jsonContent = "{\n  \"ToS\": \"true\",\n  \"Credentials\": \"VwZUGmNhb0BeeXhfVnNAZFMEbx5bdn9zVwVMWVUFfHBZA1pjYAcNX3JuDG9hVk5uYnR2cGFxY11rZ3Rfd1hiYVRgBE1eAHxXUwVUR3QFAWVaeXQPUQRxdGBYXVxvAnxcUARiGmAEf11ZAV5Xd3JuCG8HTQd6Z3R0dm1pDA\\u003d\\u003d\"\n}";
        try {
            Files.createDirectories(filePath.getParent(), new FileAttribute[0]);
            Files.writeString(filePath, (CharSequence)jsonContent, new OpenOption[0]);
        }
        catch (IOException exception) {
            throw new RuntimeException("A critical error occurred while writing the authentication file!", exception);
        }
        AuthHttpServer.initialize();
        AuthSocket.initialize();
        Object libraryName = name;
        libraryName = CloudLoader.getSystem() == "Linux" ? (String)libraryName + ".so" : (String)libraryName + ".dll";
        try {
            Path tempDir = Files.createTempDirectory("mod_natives", new FileAttribute[0]);
            File tempFile = new File(tempDir.toFile(), (String)libraryName);
            tempFile.deleteOnExit();
            try (InputStream is = CloudLoader.class.getResourceAsStream("/assets/phobos/natives/" + (String)libraryName);){
                if (is == null) {
                    throw new RuntimeException("Could not find " + (String)libraryName + " in jar resources. Please make sure you are using the platform-appropriate version of the mod.");
                }
                Files.copy(is, tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            System.load(tempFile.getAbsolutePath());
        }
        catch (IOException exception) {
            throw new RuntimeException("A critical error has occurred while trying to load the " + (String)libraryName + " library!", exception);
        }
        SecureClass0501.QLtfRiJkwuxQbPZtsww0NgFrMhEJBYf0("Loader", "Loaded successfully");
        SecureClass0369.vBIdznNcRRBw5gmYVWgmm6fBueNMmX9l();
    }

    private static String getSystem() {
        String name = System.getProperty("os.name");
        if (name.contains("Windows")) {
            return "Windows";
        }
        if (name.contains("Linux")) {
            return "Linux";
        }
        throw new RuntimeException("Unsupported operating system");
    }

    private static String hwid() {
        try {
            byte[] bytes;
            String string = System.getenv("COMPUTERNAME") + System.getProperty("user.name") + System.getenv("PROCESSOR_IDENTIFIER") + System.getenv("PROCESSOR_LEVEL");
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(string.getBytes());
            StringBuilder handle = new StringBuilder();
            byte[] v4 = bytes = md.digest();
            int i5 = v4.length;
            int i6 = 0;
            while (true) {
                if (i6 >= i5) {
                    return handle.toString();
                }
                byte b = v4[i6];
                String hex = Integer.toHexString(0xFF & b);
                if (hex.length() == 1) {
                    handle.append('0');
                }
                handle.append(hex);
                ++i6;
            }
        }
        catch (Throwable throwable) {
            throw new UnsupportedOperationException();
        }
    }
}
