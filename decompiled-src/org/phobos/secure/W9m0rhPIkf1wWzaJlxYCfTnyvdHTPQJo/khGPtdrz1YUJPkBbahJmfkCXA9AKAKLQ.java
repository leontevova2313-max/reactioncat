/*
 * Decompiled with CFR.
 */
package org.phobos.secure.W9m0rhPIkf1wWzaJlxYCfTnyvdHTPQJo;

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
import org.phobos.secure.U5tRY8D8bLVbxLWfBvdbYKpfmRZaBK7l._5S1etikiB95hSUyjg6JEpcSnX1CqZn3B;
import org.phobos.secure.zldfmHZHeiUwGiHn9xaS24B8lnBqhcRI.wk6hvwV3gAlBeUi1fOf19fLTxgNHbhzT;

/*
 * Exception performing whole class analysis ignored.
 */
public class khGPtdrz1YUJPkBbahJmfkCXA9AKAKLQ {
    public static /* bridge */ /* synthetic */ byte[] cfr_renamed_638(File exhowvpuWX18o5d3TCs4eRWSEjPKwGoO) throws Exception {
        int pSmw5JoUYhVFkFtReNqRfQltLIlfPe7Y;
        FileInputStream fileInputStream = new FileInputStream(exhowvpuWX18o5d3TCs4eRWSEjPKwGoO);
        byte[] XgvnpHIjXYr8UeOSZPEgy2i0LzHAQlmI = new byte[1024];
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        do {
            if ((pSmw5JoUYhVFkFtReNqRfQltLIlfPe7Y = ((InputStream)fileInputStream).read(XgvnpHIjXYr8UeOSZPEgy2i0LzHAQlmI)) <= 0) continue;
            messageDigest.update(XgvnpHIjXYr8UeOSZPEgy2i0LzHAQlmI, 0, pSmw5JoUYhVFkFtReNqRfQltLIlfPe7Y);
        } while (pSmw5JoUYhVFkFtReNqRfQltLIlfPe7Y != -1);
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
            Path cZlWzaDZ3WzcBFm3dmRnMsqrK409PWkA = new File(System.getProperty("user.home"), "earthhack").toPath().resolve("installer");
            if (!cZlWzaDZ3WzcBFm3dmRnMsqrK409PWkA.toFile().exists()) {
                return null;
            }
            String string = Files.readString(cZlWzaDZ3WzcBFm3dmRnMsqrK409PWkA.resolve("data.pfc"));
            if (string.isEmpty()) {
                return null;
            }
            JsonObject Pviro1HY0exngUAuy5pLkDhbqNmjBphE = JsonParser.parseString((String)string).getAsJsonObject();
            JsonElement to7rblo9mJ77YDStFe1lEFuSy2siuUPt = Pviro1HY0exngUAuy5pLkDhbqNmjBphE.get("Credentials");
            if (to7rblo9mJ77YDStFe1lEFuSy2siuUPt == null) {
                return null;
            }
            String iUehfbo4jiHtC9wZjtewWGFldJzOIEoS = to7rblo9mJ77YDStFe1lEFuSy2siuUPt.getAsString();
            String gzd76s7YK8hAZD3INjeRNazN1Jm8TJlA = wk6hvwV3gAlBeUi1fOf19fLTxgNHbhzT.cfr_renamed_391(iUehfbo4jiHtC9wZjtewWGFldJzOIEoS);
            String[] akM8WlIk1hOmmdE0qOi4Pi2o4Y2wAkkk = gzd76s7YK8hAZD3INjeRNazN1Jm8TJlA.split("__#__");
            if (akM8WlIk1hOmmdE0qOi4Pi2o4Y2wAkkk.length != 2) {
                return null;
            }
            String hbqK2ylo25qMFNJjqFh8KrlCZlvwtd4O = wk6hvwV3gAlBeUi1fOf19fLTxgNHbhzT.cfr_renamed_391(akM8WlIk1hOmmdE0qOi4Pi2o4Y2wAkkk[0]);
            String f9YQQURVBSCZkuaxF4aXPSS9W15SN9Yr = wk6hvwV3gAlBeUi1fOf19fLTxgNHbhzT.cfr_renamed_391(akM8WlIk1hOmmdE0qOi4Pi2o4Y2wAkkk[1]);
            return new String[]{f9YQQURVBSCZkuaxF4aXPSS9W15SN9Yr, hbqK2ylo25qMFNJjqFh8KrlCZlvwtd4O};
        }
        catch (Throwable rtZDiLGoPGmqu05fWHShuB1oGnqIcn2u) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ _5S1etikiB95hSUyjg6JEpcSnX1CqZn3B<InputStream, Integer> kpHiXTl0FCUT4O82Y3jqOf4ekYWHujqH(String BNLj9CIC6mAupnFOvglAX2wtB9TjUh0J, String eL2qH5qNjqcHPOEHqtksjbUFqCPqpeo3) throws IOException {
        URL qEsNS5YtbVFcgutxwp5dcwSIeEKWIFmH = new URL(BNLj9CIC6mAupnFOvglAX2wtB9TjUh0J);
        HttpURLConnection G4NjBeUe9AKJQY14Gl0LjgTqjCABgMs7 = (HttpURLConnection)qEsNS5YtbVFcgutxwp5dcwSIeEKWIFmH.openConnection();
        G4NjBeUe9AKJQY14Gl0LjgTqjCABgMs7.setRequestMethod("POST");
        G4NjBeUe9AKJQY14Gl0LjgTqjCABgMs7.setConnectTimeout(10000);
        G4NjBeUe9AKJQY14Gl0LjgTqjCABgMs7.setReadTimeout(30000);
        G4NjBeUe9AKJQY14Gl0LjgTqjCABgMs7.setDoOutput(true);
        if (eL2qH5qNjqcHPOEHqtksjbUFqCPqpeo3 != null) {
            G4NjBeUe9AKJQY14Gl0LjgTqjCABgMs7.setRequestProperty("Content-Type", "application/json");
            try (OutputStream O7sx6RrEK1rifCQzECly7KldewEafDPL = G4NjBeUe9AKJQY14Gl0LjgTqjCABgMs7.getOutputStream();){
                O7sx6RrEK1rifCQzECly7KldewEafDPL.write(eL2qH5qNjqcHPOEHqtksjbUFqCPqpeo3.getBytes(StandardCharsets.UTF_8));
            }
        }
        return _5S1etikiB95hSUyjg6JEpcSnX1CqZn3B.APiuQwOpO9PzpcQljkTVB2Nd2SDSeyee(G4NjBeUe9AKJQY14Gl0LjgTqjCABgMs7.getInputStream(), G4NjBeUe9AKJQY14Gl0LjgTqjCABgMs7.getResponseCode());
    }

    public static /* bridge */ /* synthetic */ String RnBN6FZ9vYJokNsqwqAbojtpTEvmiBgS(File PFWPglrygCFpITXu8uzVu0dlk84S1S3r) throws Exception {
        byte[] gHFIu0y2s8lSiDGZ9l4JF8SyQcNYRrXh = khGPtdrz1YUJPkBbahJmfkCXA9AKAKLQ.cfr_renamed_638(PFWPglrygCFpITXu8uzVu0dlk84S1S3r);
        StringBuilder fWbha1TAjsotJZhwzkiTtyVjr1mzPgdN = new StringBuilder();
        byte[] byArray = gHFIu0y2s8lSiDGZ9l4JF8SyQcNYRrXh;
        int n = byArray.length;
        int n2 = 0;
        while (n2 < n) {
            byte IdQtBmdnYwvMqpIwXmjILhGfXc8EiPwm = byArray[n2];
            fWbha1TAjsotJZhwzkiTtyVjr1mzPgdN.append(Integer.toString((IdQtBmdnYwvMqpIwXmjILhGfXc8EiPwm & 0xFF) + 256, 16).substring(1));
            ++n2;
        }
        return fWbha1TAjsotJZhwzkiTtyVjr1mzPgdN.toString();
    }

    @Nullable
    public static /* bridge */ /* synthetic */ File nv6BznrjQAox5djFvpnk9T03Zr0mysr7() {
        Path KwPmDnSRvnS0UJpWXEERqunnqWmB9U6N = FabricLoader.getInstance().getGameDir().resolve("mods");
        File[] gx4Y9YULVo5khj0qbalCs75j0XIjwOox = KwPmDnSRvnS0UJpWXEERqunnqWmB9U6N.toFile().listFiles();
        if (gx4Y9YULVo5khj0qbalCs75j0XIjwOox == null) {
            return null;
        }
        File[] fileArray = gx4Y9YULVo5khj0qbalCs75j0XIjwOox;
        int n = fileArray.length;
        int n2 = 0;
        while (n2 < n) {
            File NpNikpr2OMZCN9Cbzl8MZhm3tgsIGnx9 = fileArray[n2];
            if (khGPtdrz1YUJPkBbahJmfkCXA9AKAKLQ.Ld2IqsJxGHr8RfHN0EqbKez3cT5y0r7q(NpNikpr2OMZCN9Cbzl8MZhm3tgsIGnx9)) {
                return NpNikpr2OMZCN9Cbzl8MZhm3tgsIGnx9;
            }
            ++n2;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ void itBTfj3LYNXqIGqTwg4RNeVnnrZfB180() {
    }
}

