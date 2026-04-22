/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group056;

import engine.linking.NativeMethodHandler;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.apache.commons.lang3.function.TriConsumer;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group006.SecureInterface0010;
import org.phobos.secure.group007.SecureClass0112;
import org.phobos.secure.group008.SecureInterface0016;
import org.phobos.secure.group012.SecureInterface0027;
import org.phobos.secure.group014.SecureClass0220;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group029.oechGA0VibwaDVwq9oKkePiaHkhTIejE;
import org.phobos.secure.group032.XtS5soJKpLuXIPt1kGeWXS6f1q83I7uw;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0666;
import org.phobos.secure.group055.SecureClass1013;
import org.phobos.secure.group057.SecureEnum0021;
import org.phobos.secure.group016.SecureInterface0038;
import org.phobos.secure.group020.SecureInterface0050;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group022.SecureClass0378;
import org.phobos.secure.group030.SecureClass0527;
import org.phobos.secure.group037.SecureInterface0095;
import org.phobos.secure.group037.SecureInterface0094;
import org.phobos.secure.group052.SecureClass0940;
import org.phobos.secure.group053.SecureInterface0129;
import org.phobos.secure.group053.SecureClass0966;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1024;
import org.phobos.secure.group062.SecureInterface0143;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass1027
extends SecureClass0966
implements SecureInterface0038,
SecureInterface0050,
SecureInterface0016,
SecureInterface0129,
SecureInterface0134,
SecureInterface0027,
SecureInterface0143,
SecureInterface0094,
SecureInterface0010<SecureClass0220>,
SecureInterface0095 {
    public /* synthetic */ String field001;
    public /* synthetic */ boolean field002;
    public final /* synthetic */ String name;
    public final /* synthetic */ List<TriConsumer<class_746, class_638, class_636>> field003;
    public /* synthetic */ SecureClass0603<Boolean> field004;
    public final /* synthetic */ List<SecureClass0603<?>> field005;
    public final /* synthetic */ List<SecureClass1024> field006;
    public static final /* synthetic */ Logger field007;
    public final /* synthetic */ SecureClass0242 field008;
    public final /* synthetic */ MutableObject<Boolean> field009;
    public final /* synthetic */ List<SecureClass1013> field010;
    public final /* synthetic */ SecureClass0377 field011;
    public final /* synthetic */ SecureClass0377 field012;
    public /* synthetic */ String field013;
    public final /* synthetic */ int field014;
    public final /* synthetic */ List<SecureClass0603<?>> field015;
    public /* synthetic */ SecureClass0603<SecureClass0666> bind;
    public final /* synthetic */ boolean field016;
    public final /* synthetic */ SecureClass0378 field017;
    public /* synthetic */ boolean field018;
    public final /* synthetic */ List<SecureClass0220> field019;
    public final /* synthetic */ String field020;
    public final /* synthetic */ SecureClass0377 field021;
    public final /* synthetic */ SecureClass0377 field022;
    public final /* synthetic */ List<TriConsumer<class_746, class_638, class_636>> field023;

    public /* synthetic */ SecureClass1027(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, String nsF5HGIOT0cvQquODNzGR5ps90IDeFvu, SecureClass0378 C17slTDkhhRYuFDqVwy9tobftM2niwgA, int ... bUHdBITMmIjfqIQVfsEhNkO5WJxU8R4q) {
        this(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, nsF5HGIOT0cvQquODNzGR5ps90IDeFvu, "", C17slTDkhhRYuFDqVwy9tobftM2niwgA, bUHdBITMmIjfqIQVfsEhNkO5WJxU8R4q);
    }

    public /* synthetic */ SecureClass1027(SecureClass0242 Qx9zvn8Mnh55vwee0rcCer3xqaIdAgSV, String hdiRIMhIka2PZMaSrUAPyktiCnyF7TBE, String dg8U6ZDLDdpwPECkte22oAD7azIXVnsj, SecureClass0378 Ea645WaBRLBJhRuk9Uq4ZRyJtYjUkJAh, int ... XOVQl0JGk02XL977qiCHfDFoCh1sgJV9) {
        SecureClass0112 field024;
        this.field015 = new ArrayList<SecureClass0603<?>>();
        this.field005 = new ArrayList<SecureClass0603<?>>();
        this.field009 = new MutableObject((Object)false);
        this.field011 = new SecureClass0377();
        this.field022 = new SecureClass0377();
        this.field021 = new SecureClass0377();
        this.field012 = new SecureClass0377();
        this.field019 = new ArrayList<SecureClass0220>();
        this.field006 = new ArrayList<SecureClass1024>();
        this.field010 = new ArrayList<SecureClass1013>();
        this.field003 = new ArrayList<TriConsumer<class_746, class_638, class_636>>();
        this.field023 = new ArrayList<TriConsumer<class_746, class_638, class_636>>();
        this.field002 = false;
        this.field018 = false;
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Hidden", false));
        this.field008 = Qx9zvn8Mnh55vwee0rcCer3xqaIdAgSV;
        this.name = hdiRIMhIka2PZMaSrUAPyktiCnyF7TBE;
        this.field020 = dg8U6ZDLDdpwPECkte22oAD7azIXVnsj;
        this.field017 = Ea645WaBRLBJhRuk9Uq4ZRyJtYjUkJAh;
        this.field014 = XOVQl0JGk02XL977qiCHfDFoCh1sgJV9.length > 0 ? XOVQl0JGk02XL977qiCHfDFoCh1sgJV9[0] : -1;
        this.field016 = SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.h9Cjd7kO7zIEyNi70jY7zFuQoWkHfl9H().TRtJL8LJ7isXaPlFPqWfsDmss8gV6DTx().isBeta();
        this.bind = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0940("Bind").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Toggle key"));
        if (this.field014 != -1 && (field024 = Qx9zvn8Mnh55vwee0rcCer3xqaIdAgSV.zXRovTDggDKj5S44ST4orLEuYg5vYQIw().cfr_renamed_1016(SecureEnum0021.Keyboard, this.field014)) != null) {
            this.bind.WzTNlVqrT6GQ7RhlvyGsKLIXoFTdQpSy().ZW2YLlMTCrnU6Dj5zbORqFCsL6VdQnpf().add(field024);
        }
        this.cfr_renamed_69(new oechGA0VibwaDVwq9oKkePiaHkhTIejE(this, Qx9zvn8Mnh55vwee0rcCer3xqaIdAgSV));
        XtS5soJKpLuXIPt1kGeWXS6f1q83I7uw.IaCMs8cXnkZIEZpHWqkXll8QX8P7SxI7(this);
    }

    public /* synthetic */ SecureClass1027(SecureClass0242 i68ljSK88ZHwEn2MjbWq4o5sEJxCdQpL, String o6yQjChemEseBSCESV5GBvX2QHebA15S, SecureClass0378 zGGVJm5cx0epHIlODOIO95W7tZFE1isI, String qQUj498gSTq8qCixZ4eKO3nHYMNUr1UQ, int ... We3LxL1clUZKDPxEe4uRTeLUKZoEJd3o) {
        this(i68ljSK88ZHwEn2MjbWq4o5sEJxCdQpL, o6yQjChemEseBSCESV5GBvX2QHebA15S, qQUj498gSTq8qCixZ4eKO3nHYMNUr1UQ, zGGVJm5cx0epHIlODOIO95W7tZFE1isI, We3LxL1clUZKDPxEe4uRTeLUKZoEJd3o);
    }

    public static /* bridge */ /* synthetic */ void D1oMmtg5ta6E3AwV8yUulmGAGxNf0QHR(TriConsumer YqSbd99cdoipUBAiY1Mty6nO3RCnMPtP) {
        YqSbd99cdoipUBAiY1Mty6nO3RCnMPtP.accept((Object)SecureClass1027.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724, (Object)SecureClass1027.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1687, (Object)SecureClass1027.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1761);
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(33);
        field007 = LoggerFactory.getLogger(SecureClass1027.class);
    }
}

