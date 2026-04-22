/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group024;

import java.util.ArrayList;

public class SecureClass0419 {
    public final /* synthetic */ String field001;
    public final /* synthetic */ Object field002;

    public /* synthetic */ SecureClass0419(String aUpnZaMlftIy9w88caJpi9T6DFyCZ85F, Object Q9pJJQgDHCkaJaTuaTV5DCK4D32YDbEE) {
        this.field001 = aUpnZaMlftIy9w88caJpi9T6DFyCZ85F;
        this.field002 = Q9pJJQgDHCkaJaTuaTV5DCK4D32YDbEE;
    }

    public static /* bridge */ /* synthetic */ Object JRcuX3162ZdMdpAXjhOCP4MVIrg94Eqr(String mCyJFo1XITuTg82jrJdzIDPP2CTBFR2N) {
        String[] field003 = mCyJFo1XITuTg82jrJdzIDPP2CTBFR2N.split(" ", 2);
        if (field003.length != 2) {
            throw new IllegalArgumentException("Invalid variant: " + mCyJFo1XITuTg82jrJdzIDPP2CTBFR2N);
        }
        String field004 = field003[0];
        String field005 = field003[1];
        if (field004.startsWith("variant")) {
            String[] field006 = field005.split(" ", 2);
            return SecureClass0419.TVFQ747K0nyZbwoZzQM0fuqgtosIrv8m(field006[0], field006[1]);
        }
        if (field004.startsWith("dict")) {
            return SecureClass0419.Hexm0YmRKiI8eMqd1qPfWgvLHtj2zR9E(field005);
        }
        throw new IllegalArgumentException("Invalid variant signature: " + field004);
    }

    public static /* bridge */ /* synthetic */ SecureClass0419 kJh10cQOXCQj7y93nawQZmhLffsGPGAM(String field007) {
        field007 = field007.trim().replace("\n", "");
        while (field007.contains("  ")) {
            field007 = field007.replace("  ", " ");
        }
        return new SecureClass0419("variant", SecureClass0419.JRcuX3162ZdMdpAXjhOCP4MVIrg94Eqr(field007));
    }

    public static /* bridge */ /* synthetic */ Object TVFQ747K0nyZbwoZzQM0fuqgtosIrv8m(String WdPddEgzyHfNMoRWVYUqA8yPoDdyXhd0, String string) {
        switch (WdPddEgzyHfNMoRWVYUqA8yPoDdyXhd0) {
            case "array": {
                String field008 = string.substring(1, string.length() - 1).trim();
                ArrayList<Object> arrayList = new ArrayList<Object>();
                StringBuilder field009 = new StringBuilder();
                boolean field010 = false;
                boolean field011 = false;
                boolean field012 = false;
                String field013 = null;
                for (int i = 0; i < field008.length(); ++i) {
                    char field014 = field008.charAt(i);
                    if (field014 == '\"') {
                        boolean bl = field011 = !field011;
                    }
                    if (!field011) {
                        if (field014 == '(') {
                            field010 = true;
                        }
                        if (field014 == ')') {
                            field010 = false;
                            arrayList.add(SecureClass0419.Hexm0YmRKiI8eMqd1qPfWgvLHtj2zR9E(String.valueOf(field009) + ")"));
                            field009 = new StringBuilder();
                            continue;
                        }
                        if (!field010 && field014 == ' ' && !field009.isEmpty()) {
                            String string2 = field009.toString().trim();
                            field009 = new StringBuilder();
                            if (field013 == null) {
                                if (!string2.equals("dict")) {
                                    field013 = string2;
                                }
                            } else {
                                Object field015 = SecureClass0419.TVFQ747K0nyZbwoZzQM0fuqgtosIrv8m(field013, string2);
                                if (!(field015 instanceof SecureClass0419)) {
                                    field012 = true;
                                }
                                arrayList.add(field015);
                                field013 = null;
                            }
                        }
                    }
                    field009.append(field014);
                }
                if (field013 != null) {
                    String field016 = field009.toString().trim();
                    Object field017 = SecureClass0419.TVFQ747K0nyZbwoZzQM0fuqgtosIrv8m(field013, field016);
                    if (!(field017 instanceof SecureClass0419)) {
                        field012 = true;
                    }
                    arrayList.add(field017);
                }
                if (!field012) {
                    return arrayList.toArray(new SecureClass0419[0]);
                }
                if (arrayList.getFirst() instanceof String) {
                    return arrayList.toArray(new String[0]);
                }
                return arrayList.toArray();
            }
            case "string": {
                return string.substring(1, string.length() - 1);
            }
            case "int32": {
                return Integer.parseInt(string);
            }
            case "uint32": {
                return Integer.parseUnsignedInt(string);
            }
            case "int64": {
                return Long.parseLong(string);
            }
            case "uint64": {
                return Long.parseUnsignedLong(string);
            }
            case "double": {
                return Double.parseDouble(string);
            }
        }
        return string;
    }

    public static /* bridge */ /* synthetic */ SecureClass0419 Hexm0YmRKiI8eMqd1qPfWgvLHtj2zR9E(String string) {
        String field018 = null;
        String string2 = null;
        StringBuilder field019 = new StringBuilder();
        boolean field020 = false;
        boolean field021 = false;
        int n = 0;
        while (true) {
            block13: {
                char field022;
                block11: {
                    block14: {
                        block12: {
                            if (n >= string.length()) {
                                return new SecureClass0419(string2, SecureClass0419.JRcuX3162ZdMdpAXjhOCP4MVIrg94Eqr(field019.toString().trim()));
                            }
                            field022 = string.charAt(n);
                            if (field022 == '\"') {
                                boolean bl = field021 = !field021;
                            }
                            if (field021) break block11;
                            if (field022 != '(') break block12;
                            field020 = true;
                            break block13;
                        }
                        if (field022 != ')') break block14;
                        field020 = false;
                        break block13;
                    }
                    if (!field020 || field022 != ' ') break block11;
                    if (field019.isEmpty()) break block13;
                    if (field018 == null) {
                        field018 = field019.toString();
                        field019 = new StringBuilder();
                        if (!field018.equals("string")) {
                            throw new IllegalArgumentException("Invalid dict sig type: " + field018);
                        }
                    } else if (string2 == null) {
                        string2 = (String)SecureClass0419.TVFQ747K0nyZbwoZzQM0fuqgtosIrv8m(field018, field019.toString().trim());
                        field019 = new StringBuilder();
                    }
                }
                if (field020) {
                    field019.append(field022);
                }
            }
            ++n;
        }
    }
}

