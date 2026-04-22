/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group024;

import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group026.SecureClass0449;
import org.phobos.secure.group029._0AbpDCplNXIPpxO9sh7RMCd5CgcJmRem;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058._4c4FvOl06ppNuJmBZGDFwhiaXyHebEsg;
import org.phobos.secure.group060.SecureClass1096;
import org.phobos.secure.group028.SecureClass0486;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;

public class SecureClass0425
extends SecureClass0486 {
    public final /* synthetic */ SecureClass0603<Float> maxSelfDamage;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field001;
    public final /* synthetic */ SecureClass0603<Long> field002;
    public final /* synthetic */ SecureClass1096 field003;
    public final /* synthetic */ SecureClass0603<Boolean> suicide;
    public /* synthetic */ float field004;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field005;
    public final /* synthetic */ SecureClass0449<_0AbpDCplNXIPpxO9sh7RMCd5CgcJmRem> field006;
    public final /* synthetic */ SecureClass0603<Float> minDamage;
    public final /* synthetic */ MutableObject<_0AbpDCplNXIPpxO9sh7RMCd5CgcJmRem> field007;
    public final /* synthetic */ MutableObject<Float> field008;
    public final /* synthetic */ SecureClass0603<Long> placeDelay;

    public /* synthetic */ SecureClass0425(SecureClass0242 S3QYD8Lv4W7a4smZmc181jk0mn9FlvuL) {
        super(S3QYD8Lv4W7a4smZmc181jk0mn9FlvuL, "AutoBed", "Explodes beds on enemies in nether", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, 6);
        this.minDamage = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("MinDamage", Float.valueOf(4.0f), Float.valueOf(0.0f), Float.valueOf(36.0f)));
        this.maxSelfDamage = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("MaxSelfDamage", Float.valueOf(8.0f), Float.valueOf(0.0f), Float.valueOf(36.0f)));
        this.suicide = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Suicide").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Ignore local player damage"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("PlaceDelay", 300L, 0L, 500L, true));
        this.placeDelay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("PlaceDelay", 0L, 0L, 500L, true));
        this.field003 = new SecureClass1096();
        this.field006 = new SecureClass0449<_0AbpDCplNXIPpxO9sh7RMCd5CgcJmRem>(7, _0AbpDCplNXIPpxO9sh7RMCd5CgcJmRem::new, new _0AbpDCplNXIPpxO9sh7RMCd5CgcJmRem[0]);
        this.field005 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field001 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field008 = new MutableObject((Object)Float.valueOf(0.0f));
        this.field007 = new MutableObject(null);
        this.field004 = 0.0f;
        this.cfr_renamed_89("Calculation", this.minDamage, this.maxSelfDamage, this.suicide);
        this.cfr_renamed_89("Placement", this.field002, this.placeDelay);
        this.cfr_renamed_69(new _4c4FvOl06ppNuJmBZGDFwhiaXyHebEsg(this, S3QYD8Lv4W7a4smZmc181jk0mn9FlvuL));
    }
}

