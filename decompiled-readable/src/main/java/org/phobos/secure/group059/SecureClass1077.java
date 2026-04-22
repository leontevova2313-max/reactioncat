/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group059;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group011.SecureClass0166;
import org.phobos.secure.group011.SecureEnum0003;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.SecureClass0273;
import org.phobos.secure.group018.SecureEnum0005;
import org.phobos.secure.group024.SecureClass0407;
import org.phobos.secure.group038.U5MlvJEZCATxBTGwtHAKKM2tkub86g3o;
import org.phobos.secure.group023.SecureClass0383;
import org.phobos.secure.group031.SecureInterface0084;
import org.phobos.secure.group046.SecureInterface0114;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass1077
extends SecureClass0966
implements SecureInterface0114,
SecureInterface0084 {
    public final /* synthetic */ SecureClass0242 field001;
    public final /* synthetic */ List<U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?>> field002;
    public final /* synthetic */ Map<Integer, SecureClass0273<?>> field003;
    public final /* synthetic */ Map<String, Integer> field004;
    public /* synthetic */ int field005;
    public final /* synthetic */ List<SecureClass0166> field006;
    public final /* synthetic */ Map<Integer, U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?>> field007;
    public final /* synthetic */ boolean field008;
    public /* synthetic */ String field009;
    public final /* synthetic */ String field010;
    public /* synthetic */ int field011;
    public /* synthetic */ SecureEnum0003 field012;
    public final /* synthetic */ List<SecureClass0273<?>> field013;
    public final /* synthetic */ SecureClass0407 field014;
    public /* synthetic */ boolean field015;
    public final /* synthetic */ MutableObject<SecureClass0273<?>> field016;
    @Nullable
    public /* synthetic */ String field017;
    public final /* synthetic */ Map<SecureClass0273<?>, Integer> field018;
    public final /* synthetic */ List<SecureClass0383> field019;
    public final /* synthetic */ Map<U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?>, Integer> field020;
    public final /* synthetic */ File field021;
    public final /* synthetic */ String name;
    public final /* synthetic */ SecureEnum0005 field022;
    public /* synthetic */ boolean field023;

    public /* synthetic */ SecureClass1077(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, String NVwSDDHDPXZUZikosjWg0Cr0jRFOabIn, String ycass7beYEOJXeVGySKqFfACbQSbWVGo, File file, SecureEnum0005 FEzNd0V6vuvTlOQqHJy6Dbph9YGIwlHL) {
        this.field003 = new ConcurrentHashMap<Integer, SecureClass0273<?>>();
        this.field018 = new ConcurrentHashMap<SecureClass0273<?>, Integer>();
        this.field016 = new MutableObject();
        this.field007 = new ConcurrentHashMap<Integer, U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?>>();
        this.field020 = new ConcurrentHashMap<U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?>, Integer>();
        this.field006 = new CopyOnWriteArrayList<SecureClass0166>();
        this.field004 = new ConcurrentHashMap<String, Integer>();
        this.field013 = new CopyOnWriteArrayList<SecureClass0273<?>>();
        this.field002 = new CopyOnWriteArrayList<U5MlvJEZCATxBTGwtHAKKM2tkub86g3o<?>>();
        this.field019 = new ArrayList<SecureClass0383>();
        this.field005 = 0;
        this.field001 = ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb;
        this.name = NVwSDDHDPXZUZikosjWg0Cr0jRFOabIn;
        this.field010 = ycass7beYEOJXeVGySKqFfACbQSbWVGo;
        this.field021 = file;
        this.field022 = FEzNd0V6vuvTlOQqHJy6Dbph9YGIwlHL;
        this.field014 = new SecureClass0407(ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb, this);
        this.field008 = file == null;
        this.field014.cfr_renamed_1021().forEach(lnXL7DhNqKwTxa1ABSUkWExjisZCicA5 -> {
            if (lnXL7DhNqKwTxa1ABSUkWExjisZCicA5.h76z0n6oWzyTHkCv4sHHvNRUOawsdzUM() == null && lnXL7DhNqKwTxa1ABSUkWExjisZCicA5.getName().equals("unload") && lnXL7DhNqKwTxa1ABSUkWExjisZCicA5.hqTEN44XjmqVLRH715dubFa7HFOH9TAY() && this.field016.getValue() == null) {
                this.field016.setValue(lnXL7DhNqKwTxa1ABSUkWExjisZCicA5);
                return;
            }
            if (lnXL7DhNqKwTxa1ABSUkWExjisZCicA5.h76z0n6oWzyTHkCv4sHHvNRUOawsdzUM() == null && lnXL7DhNqKwTxa1ABSUkWExjisZCicA5.hqTEN44XjmqVLRH715dubFa7HFOH9TAY() && lnXL7DhNqKwTxa1ABSUkWExjisZCicA5.HGuSgTWPD8DOgqOfESbbO8yXBXFdLM6X().length == 1) {
                Class<?> field024 = lnXL7DhNqKwTxa1ABSUkWExjisZCicA5.HGuSgTWPD8DOgqOfESbbO8yXBXFdLM6X()[0].kASfjtWafsa5TO3RIKvfiWb2uKzOw5Dw();
                this.Bp6g9P21OTn0JCkxPu2lbKNn1IPtY41e((Class<E>)field024, (SecureClass0273<?>)lnXL7DhNqKwTxa1ABSUkWExjisZCicA5);
                return;
            }
            this.MXB7axDQxuzSHFyanYU6OR6YOof847vs().put(this.yzAI1NXVaar7EuFSIdxA7Z3vUQs1fY0F(), (SecureClass0273<?>)lnXL7DhNqKwTxa1ABSUkWExjisZCicA5);
            this.iQ1A8ybB8W3OZVpZcnUJ3jhiCSUl71Wg().put((SecureClass0273<?>)lnXL7DhNqKwTxa1ABSUkWExjisZCicA5, this.yzAI1NXVaar7EuFSIdxA7Z3vUQs1fY0F());
            this.cfr_renamed_1022().put(lnXL7DhNqKwTxa1ABSUkWExjisZCicA5.getName(), this.yzAI1NXVaar7EuFSIdxA7Z3vUQs1fY0F());
            this.q24pKyjN9uWbdxjr1tO4gBeyQkRtQbHE().add((SecureClass0273<?>)lnXL7DhNqKwTxa1ABSUkWExjisZCicA5);
            this.SSdM9cJo7vzq4Mp0DfIzCnKeDzLgoCNj(this.yzAI1NXVaar7EuFSIdxA7Z3vUQs1fY0F() + 1);
        });
    }
}

