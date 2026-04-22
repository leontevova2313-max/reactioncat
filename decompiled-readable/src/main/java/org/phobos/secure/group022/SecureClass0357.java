/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group022;

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
import org.phobos.secure.group009.SecureClass0138;

public final class SecureClass0357 {
    public static final /* synthetic */ Map<class_5251, class_124> field001;

    static {
        field001 = (Map)class_156.method_654(new HashMap<K, V>(), dTCUpsfCUFstAAcIQ4cPoTbK3iX7tQdm -> {
            class_124[] class_124Array = class_124.values();
            int n = class_124Array.length;
            int n2 = 0;
            while (n2 < n) {
                class_124 field002 = class_124Array[n2];
                class_5251 field003 = class_5251.method_27718((class_124)field002);
                if (field003 != null) {
                    dTCUpsfCUFstAAcIQ4cPoTbK3iX7tQdm.put(field003, field002);
                }
                ++n2;
            }
            return;
        });
    }

    public static /* bridge */ /* synthetic */ String pBuQvndXqgWJpJf2vOWOVYYIXOCB8a0X(String field004) {
        if (field004 != null && !field004.isEmpty()) {
            return field004.substring(0, 1).toUpperCase() + field004.substring(1).toLowerCase();
        }
        return field004;
    }

    public static /* bridge */ /* synthetic */ String F9qYmBYAiQoGrbQkZMAH0Nhs3fwOgSPj(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        String field005 = list.getFirst();
        int field006 = 1;
        while (field006 < list.size()) {
            while (list.get(field006).indexOf(field005) != 0) {
                if (!(field005 = field005.substring(0, field005.length() - 1)).isEmpty()) continue;
                return "";
            }
            ++field006;
        }
        return field005;
    }

    public static /* bridge */ /* synthetic */ String eKaxkJA8Na3y0T00Xb58K8MoDHHeu0Xc(int AMHERQFWWKElvSJ6H4uCDh3fj0T0IcF3) {
        return RandomStringUtils.random((int)AMHERQFWWKElvSJ6H4uCDh3fj0T0IcF3, (boolean)true, (boolean)true);
    }

    public static /* bridge */ /* synthetic */ String BNp8rpLe3LY5ibYhRCxbWisFV3FHTKoA(String field011) {
        try {
            MessageDigest field007 = MessageDigest.getInstance("SHA-1");
            field007.update(field011.getBytes(StandardCharsets.UTF_8));
            byte[] field008 = field007.digest();
            StringBuilder stringBuilder = new StringBuilder();
            byte[] byArray = field008;
            int n = byArray.length;
            int n2 = 0;
            while (true) {
                if (n2 >= n) {
                    return stringBuilder.toString();
                }
                byte field009 = byArray[n2];
                String field010 = Integer.toHexString(0xFF & field009);
                if (field010.length() == 1) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(field010);
                ++n2;
            }
        }
        catch (Throwable jppuZglmbyodVoiaUspOYfMx5arNby09) {
            return field011;
        }
    }

    public static /* bridge */ /* synthetic */ String fuFCyA8BQJBLhYsNHUHSzlOeyom2q4Yn(class_2561 fRZxeG9qmpyRB3pNyJLpX2uqfc86c84D, String ZiWDzUao9y5MS97hYiZWBGqYdbBRODUi, boolean KZYYa4jM6SCEF8Ef6BfPk6FjYAncbTRb) {
        StringBuilder field012 = new StringBuilder();
        field012.append(ZiWDzUao9y5MS97hYiZWBGqYdbBRODUi);
        fRZxeG9qmpyRB3pNyJLpX2uqfc86c84D.method_27658((JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj, SLVZUD6gQy8oIQqmMocXFYCeo0JXzZuN) -> {
            class_5251 field013;
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10967()) {
                field012.append(ZiWDzUao9y5MS97hYiZWBGqYdbBRODUi);
                field012.append(SLVZUD6gQy8oIQqmMocXFYCeo0JXzZuN);
                return Optional.empty();
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10984()) {
                field012.append('\u00a7').append("l");
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10966()) {
                field012.append('\u00a7').append("o");
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10986()) {
                field012.append('\u00a7').append("m");
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10987()) {
                field012.append('\u00a7').append("k");
            }
            if (JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10965()) {
                field012.append('\u00a7').append("n");
            }
            if ((field013 = JwWUqtS8nQPDJgV7gDjqfJUcpH8Us8bj.method_10973()) != null) {
                class_124 field014 = field001.get(field013);
                if (field014 != null) {
                    field012.append('\u00a7').append(field014.method_36145());
                } else if (KZYYa4jM6SCEF8Ef6BfPk6FjYAncbTRb) {
                    field012.append('\u00a7').append(field013.method_27723());
                }
            }
            field012.append(SLVZUD6gQy8oIQqmMocXFYCeo0JXzZuN);
            field012.append(ZiWDzUao9y5MS97hYiZWBGqYdbBRODUi);
            return Optional.empty();
        }, class_2583.field_24360);
        return field012.toString();
    }

    public static /* bridge */ /* synthetic */ String BoKAhLSkZHa8o5F21VdpTG81vA8jGTRs(String nEXXQiq9ys4lH637ZgmjTDX65t2pucXa) {
        return SecureClass0138.BnVqhYVmG4Bybp5X5ZrftgIvHGAsxvuS(nEXXQiq9ys4lH637ZgmjTDX65t2pucXa).replaceAll("\u00a7#[0-9A-Fa-f]{6}", "");
    }

    public static /* bridge */ /* synthetic */ String Xpnnl3soEwBJHZfMoA48jIiBO0sOpWtk(String field015, int e3YG5yIRE9A3AzevE1tk7B9o1yAMoXTG) {
        if (field015.length() > e3YG5yIRE9A3AzevE1tk7B9o1yAMoXTG) {
            return field015.substring(0, e3YG5yIRE9A3AzevE1tk7B9o1yAMoXTG);
        }
        return field015;
    }

    public /* synthetic */ SecureClass0357() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ boolean GYzhvjJhkrdhhYFOH522mcvamPnWJVl1(String string) {
        if (string != null && !string.isEmpty()) {
            String field016 = "^[a-zA-Z0-9]*$";
            return string.matches(field016);
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
            char field017 = cArray[n2];
            if (!Character.isDigit(field017)) {
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
        return SecureClass0138.BnVqhYVmG4Bybp5X5ZrftgIvHGAsxvuS(mnEKPO3pkgyvb7VoK7odeQ92tBXREell);
    }
}

