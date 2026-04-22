/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group049;

import java.util.ArrayList;
import java.util.List;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group025.SecureClass0438;
import org.phobos.secure.group038.SecureClass0658;
import org.phobos.secure.group048.SecureClass0874;
import org.phobos.secure.group016.SecureInterface0038;
import org.phobos.secure.group020.SecureInterface0050;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group031._0MnN11Kzh4ROHzllo3WVOi5QDtclQ3QS;
import org.phobos.secure.group042.SecureClass0755;

public class SecureClass0882<T extends Enum<T>>
extends SecureClass0438<T, SecureClass0033<T>> {
    public final /* synthetic */ SecureClass0377 field001;
    public final /* synthetic */ SecureClass0377 field002;
    public final /* synthetic */ List<_0MnN11Kzh4ROHzllo3WVOi5QDtclQ3QS<T>> field003;
    public /* synthetic */ boolean field004;
    public /* synthetic */ boolean field005;

    public /* synthetic */ SecureClass0882(SecureClass0874 apctYbOwwiTWz2nUNIZLN8UYbfPMsoJc, SecureClass0755 P1eQdTHIj2h7sks3QhQ1VghoXfQhT0Nc, float f, float sIVQBQyRruTKD4mMZ9MtguYVe9WbaQKw, float S0dMRWblaDe1IpZxGYN9kcVYib54Q5bE, float bvD3q7wgjt69XbA0vsFFf5q5pZDFPMvB, SecureClass0658 NFzV4f6nkq4w9hZO8jyVEMfxQsH0FCyV, String WJM4ZnLtxvg3Yfznz72ADvy00QAVvOCO, SecureClass0033<T> Pez8EFqlXSLZtTjjpnbHcTTyPLwtxVe5) {
        super(apctYbOwwiTWz2nUNIZLN8UYbfPMsoJc, P1eQdTHIj2h7sks3QhQ1VghoXfQhT0Nc, f, sIVQBQyRruTKD4mMZ9MtguYVe9WbaQKw, S0dMRWblaDe1IpZxGYN9kcVYib54Q5bE, bvD3q7wgjt69XbA0vsFFf5q5pZDFPMvB, NFzV4f6nkq4w9hZO8jyVEMfxQsH0FCyV, WJM4ZnLtxvg3Yfznz72ADvy00QAVvOCO, Pez8EFqlXSLZtTjjpnbHcTTyPLwtxVe5);
        this.field003 = new ArrayList<_0MnN11Kzh4ROHzllo3WVOi5QDtclQ3QS<T>>();
        this.field002 = new SecureClass0377();
        this.field001 = new SecureClass0377();
        Enum[] enumArray = (Enum[])((Enum)Pez8EFqlXSLZtTjjpnbHcTTyPLwtxVe5.getValue()).getDeclaringClass().getEnumConstants();
        int n = enumArray.length;
        int n2 = 0;
        while (n2 < n) {
            Enum field006 = enumArray[n2];
            this.field003.add(new _0MnN11Kzh4ROHzllo3WVOi5QDtclQ3QS<T>(field006, SecureInterface0038.DnORU9xCHnEU9YjPe8MbDl5d9vjPKYQ7(field006, field006.name().replace("_", " ")), SecureInterface0050.ObBKCAIXlhfDd9ITFSMeFxrtGkuTAJyz(field006)));
            ++n2;
        }
        return;
    }
}

