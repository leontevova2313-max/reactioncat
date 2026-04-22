/*
 * Decompiled with CFR.
 */
package org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import net.minecraft.class_124;
import net.minecraft.class_156;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5251;
import org.apache.commons.lang3.RandomStringUtils;
import org.phobos.secure.4S056CN3zuBvpqFiPUuxVM463jrKvbvj.GQN3pcbQGTQ7E7jeq9LR8PmZG51ebHJS;

public final class _2a3WxkxqXcHePi5bxiNJTRtA74CnNQrU {
    public static final /* synthetic */ Map<class_5251, class_124> l7KuucdZOH1hZnBKg9TdbqkQCsySU15k;

    static {
        l7KuucdZOH1hZnBKg9TdbqkQCsySU15k = (Map)class_156.method_654(new HashMap<K, V>(), dTCUpsfCUFstAAcIQ4cPoTbK3iX7tQdm -> {
            class_124[] class_124Array = class_124.values();
            int n = class_124Array.length;
            int n2 = 0;
            while (n2 < n) {
                class_124 KR9TMQQE0egDXaAaf7WSrDo7R3UfabMu = class_124Array[n2];
                class_5251 HbjvgTtSn6pxvExNVIzqm86NfEOP2LGn = class_5251.method_27718((class_124)KR9TMQQE0egDXaAaf7WSrDo7R3UfabMu);
                if (HbjvgTtSn6pxvExNVIzqm86NfEOP2LGn != null) {
                    dTCUpsfCUFstAAcIQ4cPoTbK3iX7tQdm.put(HbjvgTtSn6pxvExNVIzqm86NfEOP2LGn, KR9TMQQE0egDXaAaf7WSrDo7R3UfabMu);
                }
                ++n2;
            }
            return;
        });
    }

    public static /* bridge */ /* synthetic */ String pBuQvndXqgWJpJf2vOWOVYYIXOCB8a0X(String YRoLrNhEH3Y45CENNrKBT1JGi0yn83KU) {
        if (YRoLrNhEH3Y45CENNrKBT1JGi0yn83KU != null && !YRoLrNhEH3Y45CENNrKBT1JGi0yn83KU.isEmpty()) {
            return YRoLrNhEH3Y45CENNrKBT1JGi0yn83KU.substring(0, 1).toUpperCase() + YRoLrNhEH3Y45CENNrKBT1JGi0yn83KU.substring(1).toLowerCase();
        }
        return YRoLrNhEH3Y45CENNrKBT1JGi0yn83KU;
    }

    public static /* bridge */ /* synthetic */ String F9qYmBYAiQoGrbQkZMAH0Nhs3fwOgSPj(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        String J6RvJrKHfsV3yt2nnvZcYgymvklPTXZW = list.getFirst();
        int yggY6fh4TwfdqJcyziOmZ7GAwJDcXKk2 = 1;
        while (yggY6fh4TwfdqJcyziOmZ7GAwJDcXKk2 < list.size()) {
            while (list.get(yggY6fh4TwfdqJcyziOmZ7GAwJDcXKk2).indexOf(J6RvJrKHfsV3yt2nnvZcYgymvklPTXZW) != 0) {
                if (!(J6RvJrKHfsV3yt2nnvZcYgymvklPTXZW = J6RvJrKHfsV3yt2nnvZcYgymvklPTXZW.substring(0, J6RvJrKHfsV3yt2nnvZcYgymvklPTXZW.length() - 1)).isEmpty()) continue;
                return "";
            }
            ++yggY6fh4TwfdqJcyziOmZ7GAwJDcXKk2;
        }
        return J6RvJrKHfsV3yt2nnvZcYgymvklPTXZW;
    }

    public static /* bridge */ /* synthetic */ String eKaxkJA8Na3y0T00Xb58K8MoDHHeu0Xc(int AMHERQFWWKElvSJ6H4uCDh3fj0T0IcF3) {
        return RandomStringUtils.random((int)AMHERQFWWKElvSJ6H4uCDh3fj0T0IcF3, (boolean)true, (boolean)true);
    }

    public static /* bridge */ /* synthetic */ String BNp8rpLe3LY5ibYhRCxbWisFV3FHTKoA(String I38OvlRaHmcwHRiUAR32jpIMZMvNqqPY) {
        try {
            MessageDigest xCud2yv1PVMx3HO4VLJ5i0unSGaepuWO = MessageDigest.getInstance("SHA-1");
            xCud2yv1PVMx3HO4VLJ5i0unSGaepuWO.update(I38OvlRaHmcwHRiUAR32jpIMZMvNqqPY.getBytes(StandardCharsets.UTF_8));
            byte[] cAafchvuV88auYyJe1iT7vDrGP6JOPkA = xCud2yv1PVMx3HO4VLJ5i0unSGaepuWO.digest();
            StringBuilder stringBuilder = new StringBuilder();
            byte[] byArray = cAafchvuV88auYyJe1iT7vDrGP6JOPkA;
            int n = byArray.length;
            int n2 = 0;
            while (true) {
                if (n2 >= n) {
                    return stringBuilder.toString();
                }
                byte ncD5k1ohJbssxf80guvehPIE9PVbVXtG = byArray[n2];
                String OA1Suplxn7lN44eN408oWuxzCcQOW4Bl = Integer.toHexString(0xFF & ncD5k1ohJbssxf80guvehPIE9PVbVXtG);
                if (OA1Suplxn7lN44eN408oWuxzCcQOW4Bl.length() == 1) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(OA1Suplxn7lN44eN408oWuxzCcQOW4Bl);
                ++n2;
            }
        }
        catch (Throwable jppuZglmbyodVoiaUspOYfMx5arNby09) {
            return I38OvlRaHmcwHRiUAR32jpIMZMvNqqPY;
        }
    }

    public static /* bridge */ /* synthetic */ String fuFCyA8BQJBLhYsNHUHSzlOeyom2q4Yn(class_2561 fRZxeG9qmpyRB3pNyJLpX2uqfc86c84D, String ZiWDzUao9y5MS97hYiZWBGqYdbBRODUi, boolean KZYYa4jM6SCEF8Ef6BfPk6FjYAncbTRb) {
        StringBuilder ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ = new StringBuilder();
        ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append(ZiWDzUao9y5MS97hYiZWBGqYdbBRODUi);
        fRZxeG9qmpyRB3pNyJLpX2uqfc86c84D.method_27658((JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj, SLVZUD6gQy8oIQqmMocXFYCeo0JXzZuN) -> {
            class_5251 T2Sq7RIvSq41yDoW2qiPxGRGDRYIqk6t;
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10967()) {
                ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append(ZiWDzUao9y5MS97hYiZWBGqYdbBRODUi);
                ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append(SLVZUD6gQy8oIQqmMocXFYCeo0JXzZuN);
                return Optional.empty();
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10984()) {
                ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append('\u00a7').append("l");
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10966()) {
                ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append('\u00a7').append("o");
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10986()) {
                ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append('\u00a7').append("m");
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10987()) {
                ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append('\u00a7').append("k");
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10965()) {
                ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append('\u00a7').append("n");
            }
            if ((T2Sq7RIvSq41yDoW2qiPxGRGDRYIqk6t = JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10973()) != null) {
                class_124 x7yXlgSCRk9ANo33V4vi4SlkZGL7qgOc = l7KuucdZOH1hZnBKg9TdbqkQCsySU15k.get(T2Sq7RIvSq41yDoW2qiPxGRGDRYIqk6t);
                if (x7yXlgSCRk9ANo33V4vi4SlkZGL7qgOc != null) {
                    ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append('\u00a7').append(x7yXlgSCRk9ANo33V4vi4SlkZGL7qgOc.method_36145());
                } else if (KZYYa4jM6SCEF8Ef6BfPk6FjYAncbTRb) {
                    ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append('\u00a7').append(T2Sq7RIvSq41yDoW2qiPxGRGDRYIqk6t.method_27723());
                }
            }
            ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append(SLVZUD6gQy8oIQqmMocXFYCeo0JXzZuN);
            ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.append(ZiWDzUao9y5MS97hYiZWBGqYdbBRODUi);
            return Optional.empty();
        }, class_2583.field_24360);
        return ERzZUPUBHjJmRngMF1oY1J9j0rYSEDaQ.toString();
    }

    public static /* bridge */ /* synthetic */ String BoKAhLSkZHa8o5F21VdpTG81vA8jGTRs(String nEXXQiq9ys4lH637ZgmjTDX65t2pucXa) {
        return GQN3pcbQGTQ7E7jeq9LR8PmZG51ebHJS.BnVqhYVmG4Bybp5X5ZrftgIvHGAsxvuS(nEXXQiq9ys4lH637ZgmjTDX65t2pucXa).replaceAll("\u00a7#[0-9A-Fa-f]{6}", "");
    }

    public static /* bridge */ /* synthetic */ String Xpnnl3soEwBJHZfMoA48jIiBO0sOpWtk(String LU83yykcBaQ9XKAdCiTeN9WJEIe53juT, int e3YG5yIRE9A3AzevE1tk7B9o1yAMoXTG) {
        if (LU83yykcBaQ9XKAdCiTeN9WJEIe53juT.length() > e3YG5yIRE9A3AzevE1tk7B9o1yAMoXTG) {
            return LU83yykcBaQ9XKAdCiTeN9WJEIe53juT.substring(0, e3YG5yIRE9A3AzevE1tk7B9o1yAMoXTG);
        }
        return LU83yykcBaQ9XKAdCiTeN9WJEIe53juT;
    }

    public /* synthetic */ _2a3WxkxqXcHePi5bxiNJTRtA74CnNQrU() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ boolean GYzhvjJhkrdhhYFOH522mcvamPnWJVl1(String string) {
        if (string != null && !string.isEmpty()) {
            String TmG0ZVanhFDAp14fhfqHSjYVu6M7vY9p = "^[a-zA-Z0-9]*$";
            return string.matches(TmG0ZVanhFDAp14fhfqHSjYVu6M7vY9p);
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ String JU3cfIE9LVVIG9Oe03NVz6iU9j6GlaNX(float iPdJDxGTsYt7JiL36TJ3gQnuf91Nh4b0) {
        if (iPdJDxGTsYt7JiL36TJ3gQnuf91Nh4b0 <= 4.0f) {
            return "\u00a74";
        }
        if (iPdJDxGTsYt7JiL36TJ3gQnuf91Nh4b0 <= 8.0f) {
            return "\u00a7c";
        }
        if (iPdJDxGTsYt7JiL36TJ3gQnuf91Nh4b0 <= 12.0f) {
            return "\u00a7e";
        }
        if (iPdJDxGTsYt7JiL36TJ3gQnuf91Nh4b0 <= 16.0f) {
            return "\u00a76";
        }
        if (iPdJDxGTsYt7JiL36TJ3gQnuf91Nh4b0 <= 18.0f) {
            return "\u00a72";
        }
        return "\u00a7a";
    }

    public static /* bridge */ /* synthetic */ boolean KeKp0f2xLCnENOBxISo6JKZZPAO8BsYD(String W3QSEOLEGvxYffkmbbWDBNpAEtQ9MSaZ) {
        if (W3QSEOLEGvxYffkmbbWDBNpAEtQ9MSaZ.isEmpty()) {
            return false;
        }
        char[] cArray = W3QSEOLEGvxYffkmbbWDBNpAEtQ9MSaZ.toCharArray();
        int n = cArray.length;
        int n2 = 0;
        while (n2 < n) {
            char ir0hviG2Wo9Z5ObkcUmgKK004OpwbEn8 = cArray[n2];
            if (!Character.isDigit(ir0hviG2Wo9Z5ObkcUmgKK004OpwbEn8)) {
                return false;
            }
            ++n2;
        }
        return true;
    }

    public static /* bridge */ /* synthetic */ String ZdXXup1svVd6mdR051896SV4Cb72B1pn(double a6AlUrZCFwbu8ARdcoQHYaDpjutHlTP5) {
        if (a6AlUrZCFwbu8ARdcoQHYaDpjutHlTP5 <= 4.0) {
            return "\u00a74";
        }
        if (a6AlUrZCFwbu8ARdcoQHYaDpjutHlTP5 <= 8.0) {
            return "\u00a7c";
        }
        if (a6AlUrZCFwbu8ARdcoQHYaDpjutHlTP5 <= 16.0) {
            return "\u00a7e";
        }
        if (a6AlUrZCFwbu8ARdcoQHYaDpjutHlTP5 <= 24.0) {
            return "\u00a76";
        }
        if (a6AlUrZCFwbu8ARdcoQHYaDpjutHlTP5 <= 36.0) {
            return "\u00a72";
        }
        return "\u00a7a";
    }

    public static /* bridge */ /* synthetic */ String FENPVCPMI4MOTVBiVmB0jGrEW3gO1oT6(String mnEKPO3pkgyvb7VoK7odeQ92tBXREell) {
        return GQN3pcbQGTQ7E7jeq9LR8PmZG51ebHJS.BnVqhYVmG4Bybp5X5ZrftgIvHGAsxvuS(mnEKPO3pkgyvb7VoK7odeQ92tBXREell);
    }
}

