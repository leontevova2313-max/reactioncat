/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group057;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import net.fabricmc.loader.api.FabricLoader;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group055.SecureInterface0135;
import org.phobos.secure.group062.SecureClass1139;

/*
 * Exception performing whole class analysis ignored.
 */
public class SecureClass1040 {
    public static /* bridge */ /* synthetic */ byte[] cfr_renamed_638(File exhowvpuWX18o5d3TCs4eRWSEjPKwGoO) throws Exception {
        int field001;
        FileInputStream fileInputStream = new FileInputStream(exhowvpuWX18o5d3TCs4eRWSEjPKwGoO);
        byte[] field002 = new byte[1024];
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        do {
            if ((field001 = ((InputStream)fileInputStream).read(field002)) <= 0) continue;
            messageDigest.update(field002, 0, field001);
        } while (field001 != -1);
        ((InputStream)fileInputStream).close();
        return messageDigest.digest();
    }

    /*
     * Exception decompiling
     */
    public static /* bridge */ /* synthetic */ boolean Ld2IqsJxGHr8RfHN0EqbKez3cT5y0r7q(File aF1KN63EJmr06deoWXDynqSkaYYOYxvi) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 12[CATCHBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* bridge */ /* synthetic */ String[] XUCyvjE9m1BceMMRn6FdEgvObFoHXLT9() {
        try {
            Path field003 = new File(System.getProperty("user.home"), "earthhack").toPath().resolve("installer");
            if (!field003.toFile().exists()) {
                return null;
            }
            String string = Files.readString(field003.resolve("data.pfc"));
            if (string.isEmpty()) {
                return null;
            }
            JsonObject field004 = JsonParser.parseString((String)string).getAsJsonObject();
            JsonElement field005 = field004.get("Credentials");
            if (field005 == null) {
                return null;
            }
            String field006 = field005.getAsString();
            String field007 = SecureClass1139.cfr_renamed_391(field006);
            String[] field008 = field007.split("__#__");
            if (field008.length != 2) {
                return null;
            }
            String field009 = SecureClass1139.cfr_renamed_391(field008[0]);
            String field010 = SecureClass1139.cfr_renamed_391(field008[1]);
            return new String[]{field010, field009};
        }
        catch (Throwable rtZDiLGoPGmqu05fWHShuB1oGnqIcn2u) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ SecureInterface0135<InputStream, Integer> kpHiXTl0FCUT4O82Y3jqOf4ekYWHujqH(String BNLj9CIC6mAupnFOvglAX2wtB9TjUh0J, String eL2qH5qNjqcHPOEHqtksjbUFqCPqpeo3) throws IOException {
        URL field011 = new URL(BNLj9CIC6mAupnFOvglAX2wtB9TjUh0J);
        HttpURLConnection field012 = (HttpURLConnection)field011.openConnection();
        field012.setRequestMethod("POST");
        field012.setConnectTimeout(10000);
        field012.setReadTimeout(30000);
        field012.setDoOutput(true);
        if (eL2qH5qNjqcHPOEHqtksjbUFqCPqpeo3 != null) {
            field012.setRequestProperty("Content-Type", "application/json");
            try (OutputStream O7sx6RrEK1rifCQzECly7KldewEafDPL = field012.getOutputStream();){
                O7sx6RrEK1rifCQzECly7KldewEafDPL.write(eL2qH5qNjqcHPOEHqtksjbUFqCPqpeo3.getBytes(StandardCharsets.UTF_8));
            }
        }
        return SecureInterface0135.APiuQwOpO9PzpcQljkTVB2Nd2SDSeyee(field012.getInputStream(), field012.getResponseCode());
    }

    public static /* bridge */ /* synthetic */ String RnBN6FZ9vYJokNsqwqAbojtpTEvmiBgS(File PFWPglrygCFpITXu8uzVu0dlk84S1S3r) throws Exception {
        byte[] field013 = SecureClass1040.cfr_renamed_638(PFWPglrygCFpITXu8uzVu0dlk84S1S3r);
        StringBuilder field014 = new StringBuilder();
        byte[] byArray = field013;
        int n = byArray.length;
        int n2 = 0;
        while (n2 < n) {
            byte field015 = byArray[n2];
            field014.append(Integer.toString((field015 & 0xFF) + 256, 16).substring(1));
            ++n2;
        }
        return field014.toString();
    }

    @Nullable
    public static /* bridge */ /* synthetic */ File nv6BznrjQAox5djFvpnk9T03Zr0mysr7() {
        Path field016 = FabricLoader.getInstance().getGameDir().resolve("mods");
        File[] field017 = field016.toFile().listFiles();
        if (field017 == null) {
            return null;
        }
        File[] fileArray = field017;
        int n = fileArray.length;
        int n2 = 0;
        while (n2 < n) {
            File field018 = fileArray[n2];
            if (SecureClass1040.Ld2IqsJxGHr8RfHN0EqbKez3cT5y0r7q(field018)) {
                return field018;
            }
            ++n2;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ void itBTfj3LYNXqIGqTwg4RNeVnnrZfB180() {
    }
}

