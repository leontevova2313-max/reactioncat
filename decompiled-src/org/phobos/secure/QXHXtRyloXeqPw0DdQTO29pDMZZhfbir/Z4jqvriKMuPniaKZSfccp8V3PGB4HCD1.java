/*
 * Decompiled with CFR.
 */
package org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import net.minecraft.class_1657;
import net.minecraft.class_638;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.aq3esJq99qZsuqhCZxRUZm0FaJTztcO4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Z4jqvriKMuPniaKZSfccp8V3PGB4HCD1 {
    public final /* synthetic */ aq3esJq99qZsuqhCZxRUZm0FaJTztcO4 cfr_renamed_561;
    public static final /* synthetic */ float ryE5RCsD53rGl4sn93vatLNbsktgIhc2 = 5.0f;
    public static final /* synthetic */ float zFnC7rKwgl5kX0BMmO3PfRYlUrcURpHv = 5.0f;
    public static final /* synthetic */ Logger kkwUYQAjEnLlIYLa5NQyADdi8vSY3DSG;
    public static final /* synthetic */ float KSbnCCygTSkVbS9cgLotkQuPhjQ4KAcK = 6.0f;

    static {
        kkwUYQAjEnLlIYLa5NQyADdi8vSY3DSG = LoggerFactory.getLogger(Z4jqvriKMuPniaKZSfccp8V3PGB4HCD1.class);
    }

    public /* synthetic */ Z4jqvriKMuPniaKZSfccp8V3PGB4HCD1(aq3esJq99qZsuqhCZxRUZm0FaJTztcO4 zAGWDwPgd80wEiipOfojCfWtVCmYHg4p) {
        this.cfr_renamed_561 = zAGWDwPgd80wEiipOfojCfWtVCmYHg4p;
    }

    public static /* bridge */ /* synthetic */ void KkePNMQBVoFwO67SfG3oMoSPQKwO7P8U(class_638 VbbuyTQmN1hCnmj0dAmhrMUVGVSho84t, Predicate<class_1657> lyjCHSKFhovHfiHG9wy8ZKzOM22VQyFZ, Function<class_1657, Float> Sq7d4NKztzcdYn7EDIDnmPSux8qFshZw, Consumer<Float> b2k4tWHC24EZ4GY7r8NyTFQBVfi4C3rR) {
        MutableObject mutableObject = new MutableObject((Object)Float.valueOf(0.0f));
        Iterator<E> iterator = VbbuyTQmN1hCnmj0dAmhrMUVGVSho84t.method_18456().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                b2k4tWHC24EZ4GY7r8NyTFQBVfi4C3rR.accept((Float)mutableObject.getValue());
                return;
            }
            class_1657 spZzMzYuvd7oFholWfJ7texuFxVLaYeW = (class_1657)iterator.next();
            if (!lyjCHSKFhovHfiHG9wy8ZKzOM22VQyFZ.test(spZzMzYuvd7oFholWfJ7texuFxVLaYeW)) continue;
            float iD4k2NWYGbSPaLZX7UmHD72pZe4DqG4L = Sq7d4NKztzcdYn7EDIDnmPSux8qFshZw.apply(spZzMzYuvd7oFholWfJ7texuFxVLaYeW).floatValue();
            if (!(((Float)mutableObject.getValue()).floatValue() < iD4k2NWYGbSPaLZX7UmHD72pZe4DqG4L)) continue;
            mutableObject.setValue((Object)Float.valueOf(iD4k2NWYGbSPaLZX7UmHD72pZe4DqG4L));
        }
    }
}

