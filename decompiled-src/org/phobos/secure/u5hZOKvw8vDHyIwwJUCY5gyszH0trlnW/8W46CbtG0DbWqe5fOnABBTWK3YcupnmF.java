/*
 * Decompiled with CFR.
 */
package org.phobos.secure.u5hZOKvw8vDHyIwwJUCY5gyszH0trlnW;

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
import org.phobos.secure.DvHN4PkxykAoANi4roFzZmZTSvw4GCMi.LemJ3h7iuD1SneU8zfNFngVNizHGdB79;

public final class _8W46CbtG0DbWqe5fOnABBTWK3YcupnmF {
    public static /* bridge */ /* synthetic */ JsonElement WqRNDzHsgFdBrDaR17M2XO6E8KU6w6vB(URLConnection gOeb9Q1wgQyZLv0FfskQ5Y7Ao1XVFsSv) throws IOException, JsonParseException {
        try (InputStream inputStream = gOeb9Q1wgQyZLv0FfskQ5Y7Ao1XVFsSv.getInputStream();){
            InputStreamReader kx6iWFDEleCAVCB9YWapLnhGFIrcrhkb = new InputStreamReader(inputStream);
            BufferedReader prXYDijmoiGv48LOC8ge65fVbXDelgJA = new BufferedReader(kx6iWFDEleCAVCB9YWapLnhGFIrcrhkb);
            JsonElement jsonElement = JsonParser.parseReader((Reader)prXYDijmoiGv48LOC8ge65fVbXDelgJA);
            return jsonElement;
        }
    }

    @SafeVarargs
    public static /* bridge */ /* synthetic */ <N extends Number> JsonElement VnFsxvyvUCL2iF46iHo5nq8g9MbMYg6s(N ... rxTEUTXDJh9a2e3gPZ4RBWhZ3FLXu0fy) {
        if (rxTEUTXDJh9a2e3gPZ4RBWhZ3FLXu0fy.length == 0) {
            throw new IllegalArgumentException("Unable to write 0 numbers");
        }
        Function<Number[], String> MKchMPVLh8tnW7eXRcnZkRi8D4nj66UO = bZWAFcjwsVCpkS3vodB6V4ILmYkyrPmb -> {
            StringBuilder bVdcc00CLFopgOOA3SJiV3pPrFJj2zoK = new StringBuilder();
            Number[] numberArray = bZWAFcjwsVCpkS3vodB6V4ILmYkyrPmb;
            int n = numberArray.length;
            int n2 = 0;
            while (true) {
                if (n2 >= n) {
                    String IhRxuM7zLBWTVFW0YoYYjVUmj5ev4Fm0 = bVdcc00CLFopgOOA3SJiV3pPrFJj2zoK.toString();
                    return IhRxuM7zLBWTVFW0YoYYjVUmj5ev4Fm0.substring(0, IhRxuM7zLBWTVFW0YoYYjVUmj5ev4Fm0.length() - 1);
                }
                Number sqR1tIbT7bdJITpmcFN7vZZOGGuU2q3U = numberArray[n2];
                bVdcc00CLFopgOOA3SJiV3pPrFJj2zoK.append(_8W46CbtG0DbWqe5fOnABBTWK3YcupnmF.MdueGFko3kSs2oiPDIIQaCEMSiS5F6Vt(sqR1tIbT7bdJITpmcFN7vZZOGGuU2q3U)).append("&");
                ++n2;
            }
        };
        return new JsonPrimitive(MKchMPVLh8tnW7eXRcnZkRi8D4nj66UO.apply((Number[])rxTEUTXDJh9a2e3gPZ4RBWhZ3FLXu0fy));
    }

    public static /* bridge */ /* synthetic */ Long D0x3MRJPMmaVTisuxYCoP0rpCy3JdUhX(JsonElement ymSyfFU6Yx6zNYg4aqyyMTexQiAqRRCF, long uBl8tkgHjhNTmWj6jEbAIptkdfqh18Oy) {
        return ymSyfFU6Yx6zNYg4aqyyMTexQiAqRRCF != null ? ymSyfFU6Yx6zNYg4aqyyMTexQiAqRRCF.getAsLong() : uBl8tkgHjhNTmWj6jEbAIptkdfqh18Oy;
    }

    public /* synthetic */ _8W46CbtG0DbWqe5fOnABBTWK3YcupnmF() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ <N extends Number> String MdueGFko3kSs2oiPDIIQaCEMSiS5F6Vt(N O3ocADoVfLWXAVX7QkOabMHlvAK20SCT) {
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Integer) {
            Integer n = (Integer)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(n);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Float) {
            Float yGo30MZ37t5ODj1gcmJ1xPvm2phfHbaN = (Float)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(yGo30MZ37t5ODj1gcmJ1xPvm2phfHbaN);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Double) {
            Double LveeREEgMLM2M7p6StkD3Zfedn0kYL8k = (Double)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(LveeREEgMLM2M7p6StkD3Zfedn0kYL8k);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Long) {
            Long UFrAXDyEloqNio0t8GdIEFdwKyDPu0IJ = (Long)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(UFrAXDyEloqNio0t8GdIEFdwKyDPu0IJ);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Short) {
            Short O0bdmiTRqh6v3UH8Om8MhwyYDedxboai = (Short)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(O0bdmiTRqh6v3UH8Om8MhwyYDedxboai);
        }
        if (O3ocADoVfLWXAVX7QkOabMHlvAK20SCT instanceof Byte) {
            Byte MSxVjJQo2a00834IeoYX6cbzmhJsGCEQ = (Byte)O3ocADoVfLWXAVX7QkOabMHlvAK20SCT;
            return String.valueOf(MSxVjJQo2a00834IeoYX6cbzmhJsGCEQ);
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
        String hmYyy9Qm9ONMWkab4jT0tDyNzbcidkKk = Qgqka2D4jubDwKCfQE9OlC1xAKOjCSZy.getAsString();
        if (!hmYyy9Qm9ONMWkab4jT0tDyNzbcidkKk.contains("&")) {
            if (xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W.length != 1) {
                throw new IllegalArgumentException("Parsed singleton, invalid action counter");
            }
            N n = _8W46CbtG0DbWqe5fOnABBTWK3YcupnmF.Akct2k6I3eT73MdGlEgZMEjh73ajBgbZ(QIfRNvlhkkMAVSamuxkzvy8KHyYeUiZc, hmYyy9Qm9ONMWkab4jT0tDyNzbcidkKk);
            xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W[0].accept(n);
            return;
        }
        String[] EM565UF7hgaogxoQo3s6K0oahKT5KTeo = hmYyy9Qm9ONMWkab4jT0tDyNzbcidkKk.split("&");
        ArrayList<N> gZmmIcOttI6xdCUos98C6kd4GjcJyw6g = new ArrayList<N>();
        for (String pcU4rQDZMCJveXFpKU8EuSn4vLfw1xuC : EM565UF7hgaogxoQo3s6K0oahKT5KTeo) {
            N WAnTMwTWZ4eJHZKhaW7RtcCOvHOLc42n = _8W46CbtG0DbWqe5fOnABBTWK3YcupnmF.Akct2k6I3eT73MdGlEgZMEjh73ajBgbZ(QIfRNvlhkkMAVSamuxkzvy8KHyYeUiZc, pcU4rQDZMCJveXFpKU8EuSn4vLfw1xuC);
            gZmmIcOttI6xdCUos98C6kd4GjcJyw6g.add(WAnTMwTWZ4eJHZKhaW7RtcCOvHOLc42n);
        }
        int X2bORBMnyWrTSp1RGWWsq99DNTbIKeYE = gZmmIcOttI6xdCUos98C6kd4GjcJyw6g.size();
        if (X2bORBMnyWrTSp1RGWWsq99DNTbIKeYE != xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W.length) {
            throw new IllegalArgumentException("Parsed: %s, Expected: %s".formatted(X2bORBMnyWrTSp1RGWWsq99DNTbIKeYE, xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W.length));
        }
        int A3eDKVhVC8cNEopD1tAm33pNRx7xBM8V = 0;
        while (A3eDKVhVC8cNEopD1tAm33pNRx7xBM8V < X2bORBMnyWrTSp1RGWWsq99DNTbIKeYE) {
            Number rq4q13G8G7yw3BNqkSia6cPOErlvT65v = (Number)gZmmIcOttI6xdCUos98C6kd4GjcJyw6g.get(A3eDKVhVC8cNEopD1tAm33pNRx7xBM8V);
            Consumer<N> qdJARx3fNibZFdFigPggG2dxUPY2i5Gc = xQ9u7nuZyDZgERbwb5uzYvspQuoxcV3W[A3eDKVhVC8cNEopD1tAm33pNRx7xBM8V];
            qdJARx3fNibZFdFigPggG2dxUPY2i5Gc.accept(rq4q13G8G7yw3BNqkSia6cPOErlvT65v);
            ++A3eDKVhVC8cNEopD1tAm33pNRx7xBM8V;
        }
        return;
    }
}

