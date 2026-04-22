/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group001;

import java.util.function.IntUnaryOperator;
import net.minecraft.class_5603;
import net.minecraft.class_5605;
import net.minecraft.class_5606;
import net.minecraft.class_5609;
import net.minecraft.class_5610;
import net.minecraft.class_630;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group017.SecureEnum0004;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group057.SecureEnum0020;
import org.phobos.secure.group057.SecureEnum0019;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class CapesModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<SecureEnum0004> wind;
    public final /* synthetic */ SecureClass0603<Boolean> animate;
    public final /* synthetic */ SecureClass0603<Integer> height;
    public final /* synthetic */ SecureClass0603<Integer> strave;
    public static /* synthetic */ CapesModule field001;
    public final /* synthetic */ SecureClass0603<SecureEnum0020> movement;
    public final /* synthetic */ SecureClass0603<SecureEnum0019> style;
    public final /* synthetic */ SecureClass0603<Integer> gravity;

    public static /* bridge */ /* synthetic */ int h48Dyj92bjMzG5e2aopCtYFbbBBWOfnd() {
        return CapesModule.field001.gravity.getValue();
    }

    public /* synthetic */ CapesModule(SecureClass0242 ahgA8eDBqgy8m0BEFQp0gwtZiY6AcrMv) {
        super(ahgA8eDBqgy8m0BEFQp0gwtZiY6AcrMv, "Capes", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Manages capes", new int[0]);
        this.animate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Animate"));
        this.wind = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<SecureEnum0004>("Wind", SecureEnum0004.None));
        this.style = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<SecureEnum0019>("Style", SecureEnum0019.Single));
        this.movement = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<SecureEnum0020>("Movement", SecureEnum0020.Polygons));
        this.gravity = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Gravity", 25, 1, 50));
        this.height = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Height", 6, 1, 10));
        this.strave = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Strave", 2, 1, 10));
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.animate, this.wind, this.style, this.movement, this.gravity, this.height, this.strave);
        field001 = this;
    }

    public static /* bridge */ /* synthetic */ class_630[] OpG4UJ3X4Zo4PsmsPwo7oewmAdIhe46a(int LV7pyStRbEw8P2MGXVwZbspl65tLLmXk, int r9wGByP33MxnJWDEYy0blA1VkHjjqDKC, IntUnaryOperator kdfRDy5pOyX1L72H4IZ6ZW3gloYkCdGF, IntUnaryOperator intUnaryOperator) {
        class_630[] class_630Array = new class_630[16];
        class_5609 field002 = new class_5609();
        class_5610 class_56102 = field002.method_32111();
        for (int d3uI4X0Obxw77NrfNkXTGLUJt0wHPOjr = 0; d3uI4X0Obxw77NrfNkXTGLUJt0wHPOjr < 16; ++d3uI4X0Obxw77NrfNkXTGLUJt0wHPOjr) {
            class_56102.method_32117("customCape_" + d3uI4X0Obxw77NrfNkXTGLUJt0wHPOjr, class_5606.method_32108().method_32101(kdfRDy5pOyX1L72H4IZ6ZW3gloYkCdGF.applyAsInt(d3uI4X0Obxw77NrfNkXTGLUJt0wHPOjr), intUnaryOperator.applyAsInt(d3uI4X0Obxw77NrfNkXTGLUJt0wHPOjr)).method_32099(-5.0f, (float)d3uI4X0Obxw77NrfNkXTGLUJt0wHPOjr, -1.0f, 10.0f, 1.0f, 1.0f, class_5605.field_27715, 1.0f, 0.5f), class_5603.method_32090((float)0.0f, (float)0.0f, (float)0.0f));
        }
        class_630 field003 = class_56102.method_32112(LV7pyStRbEw8P2MGXVwZbspl65tLLmXk, r9wGByP33MxnJWDEYy0blA1VkHjjqDKC);
        int field004 = 0;
        while (field004 < 16) {
            class_630Array[field004] = field003.method_32086("customCape_" + field004);
            ++field004;
        }
        return class_630Array;
    }

    public static /* bridge */ /* synthetic */ int cfr_renamed_86() {
        return CapesModule.field001.height.getValue();
    }

    public static /* bridge */ /* synthetic */ SecureEnum0019 MpK46PnZhpOqC5mCeacKgBrVqv0Q2zUk() {
        return CapesModule.field001.style.getValue();
    }

    public static /* bridge */ /* synthetic */ SecureEnum0004 skua10wLsLJhDeBTVlsRzBkeTBsb6006() {
        return CapesModule.field001.wind.getValue();
    }

    public static /* bridge */ /* synthetic */ SecureEnum0020 hMWvjB8cGH3Q0UtCoW5O1fQ9KiFdMIfy() {
        return CapesModule.field001.movement.getValue();
    }

    public static /* bridge */ /* synthetic */ boolean RkLi0hqJ7Mz6MytvJ7Ebg1aIvUywTtLI() {
        return CapesModule.field001.animate.getValue();
    }

    public static /* bridge */ /* synthetic */ int ip7iKt4Yf5IYZhhhrCyKgyBU3i4yz2Qt() {
        return CapesModule.field001.strave.getValue();
    }
}

