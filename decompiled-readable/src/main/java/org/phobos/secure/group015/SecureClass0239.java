/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group015;

import java.util.Iterator;
import java.util.function.Predicate;
import net.minecraft.class_303;
import net.minecraft.class_7469;
import org.phobos.secure.group010._06qI5ihciyQ5igDqp5vagZbZb4JohxRk;
import org.phobos.secure.group032.SecureEnum0009;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group035.IJnZ1IGdXLobMGOSdAICZim4rpBOXKlA;
import org.phobos.secure.group044.YBze6zTrrz5apci010NF4UdE5aYYCl1J;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group059.SecureClass1068;
import org.phobos.secure.group059.SecureEnum0023;

public class SecureClass0239
extends SecureClass1068<class_7469> {
    public final /* synthetic */ SecureClass0603<Integer> limit;
    public static /* synthetic */ SecureClass0239 field001;
    public final /* synthetic */ SecureClass0603<Boolean> color;
    public final /* synthetic */ SecureClass0603<Float> scale;

    public static /* bridge */ /* synthetic */ SecureClass0239 SVcnnAstV33JeFixDK9hz3MHeyjvgeRM() {
        return field001;
    }

    public static /* bridge */ /* synthetic */ void cfr_renamed_300(SecureClass0239 RLbDEqe3hoxzB0dRfu7EbNjcDQt8KSXC, Predicate yyZGomZ0rIMgjnjY80aiGlcrB2skOjBy) {
        RLbDEqe3hoxzB0dRfu7EbNjcDQt8KSXC.H1u8jfyCgTjQi0jOf4GzlrYmiKp3yYgd(yyZGomZ0rIMgjnjY80aiGlcrB2skOjBy);
    }

    public static /* bridge */ /* synthetic */ boolean cfr_renamed_48() {
        return false;
    }

    public /* synthetic */ SecureClass0239() {
        super("Chat");
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Color"));
        this.limit = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Limit", 100, 5, 150));
        this.scale = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Scale", Float.valueOf(100.0f), Float.valueOf(15.0f), Float.valueOf(200.0f)));
        this.cfr_renamed_69(new _06qI5ihciyQ5igDqp5vagZbZb4JohxRk(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new YBze6zTrrz5apci010NF4UdE5aYYCl1J(this));
        IJnZ1IGdXLobMGOSdAICZim4rpBOXKlA.cfr_renamed_301(auVSbxdK5PgXYPcYEaZupYlZqoMxzv8y -> {
            this.W518ctVUzjUVAxmMSQcWMxZCbqNBLfI0(true);
            Iterator<class_303> iterator = this.LdgjddWyqimqfkQyBYp089KlQbt3ion5().Plhq8JYts4x7Zqe2hK5zBYXdwlFCCFxA().e4Wf3i8jz2C4MOJHQCQH2uipqjR80gDP().iterator();
            while (iterator.hasNext()) {
                class_303 field002 = iterator.next();
                this.t4AY245PUHiCzetCe9N3k6ahUblnkC4x(field002.comp_893(), field002.comp_915(), (boolean)auVSbxdK5PgXYPcYEaZupYlZqoMxzv8y);
            }
            return;
        });
        this.GLpuAM8HqBGd05kjGUBu7q1xQPxbeftG(false);
        this.ZDcS1BbqDTAJYXGbpdN0eyHPoALC3i0r = SecureEnum0023.Bottom;
        this.IsZlh8Sr0iUmNsKLb8QrUfcBvf7WmhLQ = SecureEnum0009.Left;
        field001 = this;
    }
}

