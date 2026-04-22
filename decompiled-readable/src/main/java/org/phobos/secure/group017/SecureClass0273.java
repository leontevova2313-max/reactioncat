/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group017;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.phobos.secure.group009.SecureInterface0018;
import org.phobos.secure.group011.SecureClass0166;
import org.phobos.secure.group011.eoXsmskmSCRJ685A0cGofvtweVlRrLsW;
import org.phobos.secure.group015._97llkWaMVAqBl5KPlEyYywTpUQt2y5VT;
import org.phobos.secure.group024._1UNQDCbIJXKZECHBSvKk218HkryFe72f;
import org.phobos.secure.group038.U5MlvJEZCATxBTGwtHAKKM2tkub86g3o;
import org.phobos.secure.group023.SecureClass0383;
import org.phobos.secure.group046.SecureInterface0114;
import org.phobos.secure.group059.SecureClass1077;

public class SecureClass0273<T>
implements SecureInterface0018<SecureClass0273<T>>,
SecureInterface0114 {
    public final /* synthetic */ Class<? super T> field001;
    public final /* synthetic */ List<U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?>> field002;
    public final /* synthetic */ _1UNQDCbIJXKZECHBSvKk218HkryFe72f<?>[] field003;
    public /* synthetic */ Object field004;
    public /* synthetic */ boolean field005;
    public /* synthetic */ boolean field006;
    public final /* synthetic */ List<SecureClass0383> field007;
    public final /* synthetic */ List<_97llkWaMVAqBl5KPlEyYywTpUQt2y5VT> field008;
    public final /* synthetic */ List<SecureClass0166> field009;
    public final /* synthetic */ String name;
    public final /* synthetic */ SecureClass1077 field010;
    public /* synthetic */ boolean field011;

    public static /* bridge */ /* synthetic */ _1UNQDCbIJXKZECHBSvKk218HkryFe72f<?> AbcQSDVMwtDRc1JtITcjRrz41SxVKWDQ(SecureClass0273<?> emnfeCLIPvQfGel1AI4AtH5dESaXMebG, String OZZWMKKFMuyRnoQMbC1wB5IcNctEukKU) {
        _1UNQDCbIJXKZECHBSvKk218HkryFe72f<?>[] field012 = emnfeCLIPvQfGel1AI4AtH5dESaXMebG.field003;
        int n = field012.length;
        int n2 = 0;
        while (n2 < n) {
            _1UNQDCbIJXKZECHBSvKk218HkryFe72f<?> field013 = field012[n2];
            if (field013.getName().equals(OZZWMKKFMuyRnoQMbC1wB5IcNctEukKU)) {
                return field013;
            }
            ++n2;
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object Ekg83AoKsI07Sz7QaahfdhSkf8JLX0X8(SecureClass0273<?> wy2f9bTjDMS9ychgAT9YJGW76CSkUN, Object field019) {
        _1UNQDCbIJXKZECHBSvKk218HkryFe72f<?> field014;
        U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?> field015;
        String field016 = field019.toString();
        if (field019.getClass().equals(String.class) && field016.startsWith("&") && (field015 = SecureClass0273.wxuOB5kIZJQg534ntyuQzldQAVFfH1R6(wy2f9bTjDMS9ychgAT9YJGW76CSkUN, field016.substring(1))) != null) {
            return field015.getValue();
        }
        if (field019.getClass().equals(String.class) && field016.startsWith("&") && (field014 = SecureClass0273.AbcQSDVMwtDRc1JtITcjRrz41SxVKWDQ(wy2f9bTjDMS9ychgAT9YJGW76CSkUN, field016.substring(1))) != null) {
            U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?> field017;
            Object field018 = field014.getValue();
            if (field018.getClass().equals(String.class) && (field017 = SecureClass0273.wxuOB5kIZJQg534ntyuQzldQAVFfH1R6(wy2f9bTjDMS9ychgAT9YJGW76CSkUN, field018.toString().substring(1))) != null) {
                return field017.getValue();
            }
            return field014.getValue();
        }
        return field019;
    }

    public static /* bridge */ /* synthetic */ Object[] JljFKbZGvIMJazzUP8NuUfrOLN3UH1D8(SecureClass0273<?> ni5W8msVrtK3JQJsYu0ZjuXt6Y4lrgTA, Object[] AVYgdHqMPfkMnppSTft4WkhyXSADAIdh) {
        Object[] field020 = new Object[AVYgdHqMPfkMnppSTft4WkhyXSADAIdh.length];
        int field021 = 0;
        while (field021 < AVYgdHqMPfkMnppSTft4WkhyXSADAIdh.length) {
            field020[field021] = SecureClass0273.Ekg83AoKsI07Sz7QaahfdhSkf8JLX0X8(ni5W8msVrtK3JQJsYu0ZjuXt6Y4lrgTA, AVYgdHqMPfkMnppSTft4WkhyXSADAIdh[field021]);
            ++field021;
        }
        return field020;
    }

    public static /* bridge */ /* synthetic */ U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?> wxuOB5kIZJQg534ntyuQzldQAVFfH1R6(SecureClass0273<?> wy2f9bTjDMS9ychgAT9YJGW76CSkUN, String USqVY97QkThhxmWaSwGhzsj6gXXzaH8Q) {
        U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?> field022;
        for (U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?> field023 : wy2f9bTjDMS9ychgAT9YJGW76CSkUN.field002) {
            if (!field023.getName().equals(USqVY97QkThhxmWaSwGhzsj6gXXzaH8Q)) continue;
            return field023;
        }
        Iterator<U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?>> iterator = wy2f9bTjDMS9ychgAT9YJGW76CSkUN.field010.MxaPrfQfcICGPFVtANUT2VgcoFqp9hQY().iterator();
        do {
            if (iterator.hasNext()) continue;
            return null;
        } while (!(field022 = iterator.next()).getName().equals(USqVY97QkThhxmWaSwGhzsj6gXXzaH8Q));
        return field022;
    }

    public static /* bridge */ /* synthetic */ List<SecureClass0273<?>> JDV4hscEPN0nMInQsKasGGazoQzPFTxF(Object object, String yZXXK5U72aZuyBk0axj9na1J0nxQhlsc, Class<?> clazz) {
        ArrayList<SecureClass0273<?>> field024 = new ArrayList<SecureClass0273<?>>();
        Method[] methodArray = clazz.getDeclaredMethods();
        int n = methodArray.length;
        int n2 = 0;
        while (n2 < n) {
            Method field025 = methodArray[n2];
            _1UNQDCbIJXKZECHBSvKk218HkryFe72f[] field012 = new _1UNQDCbIJXKZECHBSvKk218HkryFe72f[field025.getParameters().length];
            for (int qKjwFbEAIBhDsKW4aGg2eScFG4X0pzNp = 0; qKjwFbEAIBhDsKW4aGg2eScFG4X0pzNp < field025.getParameters().length; ++qKjwFbEAIBhDsKW4aGg2eScFG4X0pzNp) {
                Parameter parameter = field025.getParameters()[qKjwFbEAIBhDsKW4aGg2eScFG4X0pzNp];
                field012[qKjwFbEAIBhDsKW4aGg2eScFG4X0pzNp] = new _1UNQDCbIJXKZECHBSvKk218HkryFe72f<?>(parameter.getName(), parameter.getType());
            }
            String field026 = yZXXK5U72aZuyBk0axj9na1J0nxQhlsc + "." + field025.getName();
            SecureClass0273<?> field027 = new SecureClass0273<?>(null, field026, field025.getReturnType() == Void.class ? null : field025.getReturnType(), field012);
            field027.field009.add(new eoXsmskmSCRJ685A0cGofvtweVlRrLsW("invokedynamic&" + field025.getName(), field025, object));
            field024.add(field027);
            ++n2;
        }
        return field024;
    }

    public /* synthetic */ SecureClass0273(SecureClass1077 dOc4IU5L5IR5XGl7dmcX3Ziajdhkr4sw, String fyDZ3S7HWd7ugEvcXHMeSRXviURtzaNP, Class<? super T> aILvNcAAZzvW37poYevNwh6B3TetghIL, _1UNQDCbIJXKZECHBSvKk218HkryFe72f<?>[] RGoqpAB33A4t4MzmWladwRmjz5HqCODi) {
        this.field009 = new CopyOnWriteArrayList<SecureClass0166>();
        this.field007 = new CopyOnWriteArrayList<SecureClass0383>();
        this.field002 = new CopyOnWriteArrayList<U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?>>();
        this.field008 = new ArrayList<_97llkWaMVAqBl5KPlEyYywTpUQt2y5VT>();
        this.field004 = null;
        this.field006 = false;
        this.field005 = false;
        this.field010 = dOc4IU5L5IR5XGl7dmcX3Ziajdhkr4sw;
        this.name = fyDZ3S7HWd7ugEvcXHMeSRXviURtzaNP;
        this.field001 = aILvNcAAZzvW37poYevNwh6B3TetghIL;
        this.field003 = RGoqpAB33A4t4MzmWladwRmjz5HqCODi;
    }
}

