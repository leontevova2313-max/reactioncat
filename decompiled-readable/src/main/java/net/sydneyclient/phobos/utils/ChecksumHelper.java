/*
 * Decompiled with CFR.
 */
package net.sydneyclient.phobos.utils;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import net.fabricmc.loader.api.FabricLoader;

public class ChecksumHelper {
    public static String getMD5Checksum(File file) {
        int i;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        MessageDigest digest = MessageDigest.getInstance("MD5");
        do {
            if ((i = fileInputStream.read(buffer)) <= 0) continue;
            digest.update(buffer, 0, i);
        } while (i != -1);
        fileInputStream.close();
        byte[] md5Checksum = digest.digest();
        StringBuilder builder = new StringBuilder();
        byte[] v7 = md5Checksum;
        int i8 = v7.length;
        int i9 = 0;
        while (i9 < i8) {
            byte b = v7[i9];
            builder.append(Integer.toString((b & 0xFF) + 256, 16).substring(1));
            ++i9;
        }
        return builder.toString();
    }

    public static File getModFile() {
        Path modsPath = FabricLoader.getInstance().getGameDir().resolve("mods");
        File[] files = modsPath.toFile().listFiles();
        if (files == null) {
            return null;
        }
        File[] v2 = files;
        int i3 = v2.length;
        int i4 = 0;
        while (i4 < i3) {
            File file = v2[i4];
            if (ChecksumHelper.isValidMod(file)) {
                return file;
            }
            ++i4;
        }
        return null;
    }

    /*
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean isValidMod(File file) {
        try (ZipFile zip = new ZipFile(file);){
            ZipEntry fmjEntry = zip.getEntry("fabric.mod.json");
            if (fmjEntry == null) {
                boolean i3 = false;
                return i3;
            }
            try (InputStream stream = zip.getInputStream(fmjEntry);){
                String content = new String(stream.readAllBytes(), StandardCharsets.UTF_8);
                JsonElement jsonElement = JsonParser.parseString((String)content);
                if (!(jsonElement instanceof JsonObject)) return false;
                JsonObject jsonObject = (JsonObject)jsonElement;
                if (!jsonObject.has("id")) return false;
                boolean i7 = "phobos".equals(jsonObject.get("id").getAsString());
                return i7;
            }
        }
        catch (Exception ignored) {
            return false;
        }
    }
}

