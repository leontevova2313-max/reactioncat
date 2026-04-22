/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group005;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.phobos.secure.group012.SecureClass0177;

public class SecureClass0082 {
    public static /* synthetic */ SecureClass0082 field001;
    public final /* synthetic */ List<SecureClass0177> field002;

    static {
        field001 = new SecureClass0082();
    }

    public /* synthetic */ SecureClass0082() {
        this.field002 = new ArrayList<SecureClass0177>();
        Random field003 = new Random();
        int field004 = 0;
        while (field004 < 100) {
            for (int IDhcioryBbdwLKmYQMxzi1cP4RQMTanH = 0; IDhcioryBbdwLKmYQMxzi1cP4RQMTanH < 3; ++IDhcioryBbdwLKmYQMxzi1cP4RQMTanH) {
                SecureClass0177 field005 = new SecureClass0177(25 * field004, IDhcioryBbdwLKmYQMxzi1cP4RQMTanH * -50, field003.nextInt(3) + 1, field003.nextInt(2) + 1);
                this.field002.add(field005);
            }
            ++field004;
        }
        return;
    }
}

