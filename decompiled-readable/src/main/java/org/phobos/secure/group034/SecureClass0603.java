/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group034;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.Nullable;
import org.phobos.secure.group008.SecureInterface0015;
import org.phobos.secure.group018.SecureClass0295;
import org.phobos.secure.group026.SecureInterface0072;
import org.phobos.secure.group016.SecureInterface0038;
import org.phobos.secure.group020.SecureInterface0050;
import org.phobos.secure.group022.SecureInterface0063;
import org.phobos.secure.group037.SecureInterface0095;
import org.phobos.secure.group054.SecureInterface0130;
import org.phobos.secure.group062.SecureInterface0143;

public abstract class SecureClass0603<V>
implements SecureInterface0015<V>,
Supplier<V>,
Predicate<V>,
SecureInterface0038,
SecureInterface0050,
SecureInterface0143,
SecureInterface0063<V>,
SecureInterface0072,
EventSubscriber {
    public /* synthetic */ SecureInterface0130 field001;
    public final /* synthetic */ String name;
    public /* synthetic */ boolean field002;
    public final /* synthetic */ V field003;
    @Nullable
    public /* synthetic */ String field004;
    public final /* synthetic */ List<Consumer<V>> field005;
    public /* synthetic */ SecureClass0295 field006;
    public /* synthetic */ boolean field007;
    public final /* synthetic */ List<BiConsumer<V, V>> field008;
    public /* synthetic */ boolean field009;
    public /* synthetic */ SecureInterface0095 field010;
    public /* synthetic */ boolean field011;
    public /* synthetic */ V field012;

    public /* synthetic */ SecureClass0603(String ufr95fjcpI7nuqFGydC7fZLrJxIyGyrA, @Nullable String oNIcMu6asC3snhJmiiGFprbuleBqFiIK, V AzfrOiYQiK6GIbhrDaPCAr9qktkoDooX) {
        this.field001 = SecureInterface0130.Z9Q347xopZXa5TwDjWAtOpsPhqjNSjpP;
        this.field011 = true;
        this.field005 = new CopyOnWriteArrayList<Consumer<V>>();
        this.field008 = new CopyOnWriteArrayList<BiConsumer<V, V>>();
        this.field007 = false;
        this.name = ufr95fjcpI7nuqFGydC7fZLrJxIyGyrA;
        this.field004 = oNIcMu6asC3snhJmiiGFprbuleBqFiIK;
        this.field003 = AzfrOiYQiK6GIbhrDaPCAr9qktkoDooX;
        this.field012 = AzfrOiYQiK6GIbhrDaPCAr9qktkoDooX;
    }
}

