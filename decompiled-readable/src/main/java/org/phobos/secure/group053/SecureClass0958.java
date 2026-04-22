/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group053;

import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import org.phobos.secure.group024.LemJ3h7iuD1SneU8zfNFngVNizHGdB79;

public final class SecureClass0958 {
    public static /* bridge */ /* synthetic */ JsonElement WqRNDzHsgFdBrDaR17M2XO6E8KU6w6vB(URLConnection gOeb9Q1wgQyZLv0FfskQ5Y7Ao1XVFsSv) throws IOException, JsonParseException {
        try (InputStream inputStream = gOeb9Q1wgQyZLv0FfskQ5Y7Ao1XVFsSv.getInputStream();){
            InputStreamReader field001 = new InputStreamReader(inputStream);
            BufferedReader field002 = new BufferedReader(field001);
            JsonElement jsonElement = JsonParser.parseReader((Reader)field002);
            return jsonElement;
        }
    }

    @SafeVarargs
    public static /* bridge */ /* synthetic */ <N extends Number> JsonElement VnFsxvyvUCL2iF46iHo5nq8g9MbMYg6s(N ... rxTEUTXDJh9a2e3gPZ4RBWhZ3FLXu0fy) {
        if (rxTEUTXDJh9a2e3gPZ4RBWhZ3FLXu0fy.length == 0) {
            throw new IllegalArgumentException("Unable to write 0 numbers");
        }
        Function<Number[], String> field003 = bZWAFcjwsVCpkS3vodB6V4ILmYkyrPmb -> {
            StringBuilder field004 = new StringBuilder();
            Number[] numberArray = bZWAFcjwsVCpkS3vodB6V4ILmYkyrPmb;
            int n = numberArray.length;
            int n2 = 0;
            while (true) {
                if (n2 >= n) {
                    String field005 = field004.toString();
                    return field005.substring(0, field005.length() - 1);
                }
                Number field006 = numberArray[n2];
                field004.append(SecureClass0958.MdueGFko3kSs2oiPDIIQaCEMSiS5F6Vt(field006)).append("&");
                ++n2;
            }
        };
        return new JsonPrimitive(field003.apply((Number[])rxTEUTXDJh9a2e3gPZ4RBWhZ3FLXu0fy));
    }

    public static /* bridge */ /* synthetic */ Long D0x3MRJPMmaVTisuxYCoP0rpCy3JdUhX(JsonElement ymSyfFU6Yx6zNYg4aqyyMTexQiAqRRCF, long uBl8tkgHjhNTmWj6jEbAIptkdfqh18Oy) {
        return ymSyfFU6Yx6zNYg4aqyyMTexQiAqRRCF != null ? ymSyfFU6Yx6zNYg4aqyyMTexQiAqRRCF.getAsLong() : uBl8tkgHjhNTmWj6jEbAIptkdfqh18Oy;
    }

    public /* synthetic */ SecureClass0958() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ <N extends Number> String MdueGFko3kSs2oiPDIIQaCEMSiS5F6Vt(N O3ocADoVfLWXAVX7QkOabMHlvAK20SCT) {
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Integer) {
            Integer n = (Integer)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(n);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Float) {
            Float field007 = (Float)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(field007);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Double) {
            Double field008 = (Double)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(field008);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Long) {
            Long field009 = (Long)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(field009);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Short) {
            Short field010 = (Short)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(field010);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Byte) {
            Byte field011 = (Byte)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(field011);
        }
        throw new UnsupportedOperationException("Unsupported writing type: %s".formatted(O3ocADoVfLWXAVX7QkOabMHlvAK20SCT.getClass().getSimpleName()));
    }

    public static /* bridge */ /* synthetic */ <N extends Number> N Akct2k6I3eT73MdGlEgZMEjh73ajBgbZ(N n, String qXyGlymJw2FwhHlzruHUCE0BszggDgAM) {
        if (n instanceof Integer) {
            return LemJ3h7iuD1SneU8zfNFngVNizHGdB79.XamkFcs4LuFmE7h0YR0F6OO2HZxXAHZy(Integer.valueOf(qXyGlymJw2FwhHlzruHUCE0BszggDgAM), n);
        }
        if (n instanceof Float) {
            return LemJ3h7iuD1SneU8zfNFngVNizHGdB79.XamkFcs4LuFmE7h0YR0F6OO2HZxXAHZy(Float.valueOf(qXyGlymJw2FwhHlzruHUCE0BszggDgAM), n);
        }
        if (n instanceof Double) {
            return LemJ3h7iuD1SneU8zfNFngVNizHGdB79.XamkFcs4LuFmE7h0YR0F6OO2HZxXAHZy(Double.valueOf(qXyGlymJw2FwhHlzruHUCE0BszggDgAM), n);
        }
        if (n instanceof Long) {
            return LemJ3h7iuD1SneU8zfNFngVNizHGdB79.XamkFcs4LuFmE7h0YR0F6OO2HZxXAHZy(Long.valueOf(qXyGlymJw2FwhHlzruHUCE0BszggDgAM), n);
        }
        if (n instanceof Short) {
            return LemJ3h7iuD1SneU8zfNFngVNizHGdB79.XamkFcs4LuFmE7h0YR0F6OO2HZxXAHZy(Short.valueOf(qXyGlymJw2FwhHlzruHUCE0BszggDgAM), n);
        }
        if (n instanceof Byte) {
            return LemJ3h7iuD1SneU8zfNFngVNizHGdB79.XamkFcs4LuFmE7h0YR0F6OO2HZxXAHZy(Byte.valueOf(qXyGlymJw2FwhHlzruHUCE0BszggDgAM), n);
        }
        throw new UnsupportedOperationException("Unsupported writing type: %s".formatted(n.getClass().getSimpleName()));
    }

    public static /* bridge */ /* synthetic */ Boolean yWFqiKj5oFs8tCTo8UF0cwE5BcRN5SlF(JsonElement j0PUeDg2yjG6c1B13rgcncARLzjrNfjR, boolean Atl9PnziPuuExlMU4m7c1NmP948Cw37I) {
        return j0PUeDg2yjG6c1B13rgcncARLzjrNfjR != null ? j0PUeDg2yjG6c1B13rgcncARLzjrNfjR.getAsBoolean() : Atl9PnziPuuExlMU4m7c1NmP948Cw37I;
    }

    public static /* bridge */ /* synthetic */ String SxFFKdY5y9mJxFvJJWCGe2HbbXwF6hKj(JsonElement z0mYLOLNYlz3zNNPULe8vOJTglZVTnuB, String FDy0j03zrOzwlkQGnewIuQaXco6zxtcf) {
        return z0mYLOLNYlz3zNNPULe8vOJTglZVTnuB != null ? z0mYLOLNYlz3zNNPULe8vOJTglZVTnuB.getAsString() : FDy0j03zrOzwlkQGnewIuQaXco6zxtcf;
    }

    public static /* bridge */ /* synthetic */ Integer Ifa5BaPuDwFCU9kUtobgYFQhF3cI17qm(JsonElement QjuYYT4wnkLd3HSq3UzWlSgaLTMoWDgf, int ClNToflDsLlAQ90uGzTIbQEVuYCBRCt4) {
        return QjuYYT4wnkLd3HSq3UzWlSgaLTMoWDgf != null ? QjuYYT4wnkLd3HSq3UzWlSgaLTMoWDgf.getAsInt() : ClNToflDsLlAQ90uGzTIbQEVuYCBRCt4;
    }

    public static /* bridge */ /* synthetic */ Double iML68v24DKFrAZh6stfNUvMWYdFkIS28(JsonElement VWgUcjvNDuJX9QcBKuqgkRzfOsJTYGYj, double j8jBBUcBTYEGsaU7oAraxaIK4sQyrdrf) {
        return VWgUcjvNDuJX9QcBKuqgkRzfOsJTYGYj != null ? (double)VWgUcjvNDuJX9QcBKuqgkRzfOsJTYGYj.getAsFloat() : j8jBBUcBTYEGsaU7oAraxaIK4sQyrdrf;
    }

    public static /* bridge */ /* synthetic */ Float lTClhOlZJ8FwXWDtnmSYRWzQDFv4C4XE(JsonElement jsonElement, float ZTvBRuzAA56urLDkQcAk7RnucPsc7hpC) {
        return Float.valueOf(jsonElement != null ? jsonElement.getAsFloat() : ZTvBRuzAA56urLDkQcAk7RnucPsc7hpC);
    }

    @SafeVarargs
    public static /* bridge */ /* synthetic */ <N extends Number> void QwvkPnSppWU1VBgOZZS1mIlPrh1mVZq6(JsonElement Qgqka2D4jubDwKCfQE9OlC1xAKOjCSZy, N QIfRNvlhkkMAVSamuxkzvy8KHyYeUiZc, Consumer<N> ... xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W) {
        String field012 = Qgqka2D4jubDwKCfQE9OlC1xAKOjCSZy.getAsString();
        if (!field012.contains("&")) {
            if (xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W.length != 1) {
                throw new IllegalArgumentException("Parsed singleton, invalid action counter");
            }
            N n = SecureClass0958.Akct2k6I3eT73MdGlEgZMEjh73ajBgbZ(QIfRNvlhkkMAVSamuxkzvy8KHyYeUiZc, field012);
            xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W[0].accept(n);
            return;
        }
        String[] field013 = field012.split("&");
        ArrayList<N> field014 = new ArrayList<N>();
        for (String pcU4rQDZMCJveXFpKU8EuSn4vLfw1xuC : field013) {
            N field015 = SecureClass0958.Akct2k6I3eT73MdGlEgZMEjh73ajBgbZ(QIfRNvlhkkMAVSamuxkzvy8KHyYeUiZc, pcU4rQDZMCJveXFpKU8EuSn4vLfw1xuC);
            field014.add(field015);
        }
        int field016 = field014.size();
        if (field016 != xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W.length) {
            throw new IllegalArgumentException("Parsed: %s, Expected: %s".formatted(field016, xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W.length));
        }
        int field017 = 0;
        while (field017 < field016) {
            Number field018 = (Number)field014.get(field017);
            Consumer<N> field019 = xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W[field017];
            field019.accept(field018);
            ++field017;
        }
        return;
    }
}

