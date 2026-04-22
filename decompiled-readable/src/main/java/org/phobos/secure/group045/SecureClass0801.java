/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group045;

import net.minecraft.class_5568;
import net.minecraft.class_5570;
import net.minecraft.class_5572;
import net.minecraft.class_5573;
import net.minecraft.class_5578;
import org.phobos.mixin.game.world.ISectionedEntityCache;
import org.phobos.mixin.game.world.ISimpleEntityLookup;

public final class SecureClass0801 {
    public static /* bridge */ /* synthetic */ <T extends class_5568> class_5570<T> Va4b3IjMgDJgRf8cC6F3LmEivu9XiXOp(class_5570<T> class_55702) {
        class_5570 field001 = new class_5570();
        class_55702.method_31751().forEach(arg_0 -> ((class_5570)field001).method_31753(arg_0));
        return field001;
    }

    public /* synthetic */ SecureClass0801() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ <T extends class_5568> class_5578<T> nwtB8IYfRu1GcN8B3q1rCVvExs3IgKBH(class_5578<T> McFhVCW84nBxp24vqxYT6B45OfDGw4z6) {
        ISimpleEntityLookup field002 = (ISimpleEntityLookup)McFhVCW84nBxp24vqxYT6B45OfDGw4z6;
        return new class_5578(SecureClass0801.Va4b3IjMgDJgRf8cC6F3LmEivu9XiXOp(field002.getEntityIndex()), SecureClass0801.k0qtJwbhtjboyxRujSyJxzcpKafVcsEj(field002.getEntityCache()));
    }

    public static /* bridge */ /* synthetic */ <T extends class_5568> class_5572<T> qhgvGjIDWmpWaVDIXaEEr6KbdUI9EV3Y(Class<T> Cf6oDoL2WC3Y5HCBOoF7DrJi1tHNRzr0, class_5572<T> HPRnBWCPETbd1YAbaouWGUE7AVD7LNO8) {
        class_5572 field003 = new class_5572(Cf6oDoL2WC3Y5HCBOoF7DrJi1tHNRzr0, HPRnBWCPETbd1YAbaouWGUE7AVD7LNO8.method_31768());
        HPRnBWCPETbd1YAbaouWGUE7AVD7LNO8.method_31766().forEach(arg_0 -> ((class_5572)field003).method_31764(arg_0));
        return field003;
    }

    public static /* bridge */ /* synthetic */ <T extends class_5568> class_5573<T> k0qtJwbhtjboyxRujSyJxzcpKafVcsEj(class_5573<T> RP6olu76c36XaySXjEmfFBLp0GxyJ9Pd) {
        ISectionedEntityCache field004 = (ISectionedEntityCache)RP6olu76c36XaySXjEmfFBLp0GxyJ9Pd;
        class_5573 class_55732 = new class_5573(field004.getEntityClass(), field004.getPosToStatus());
        field004.getTrackedPositions().forEach(l -> ((ISectionedEntityCache)class_55732).getTrackedPositions().add(l));
        field004.getTrackingSections().forEach((lR4bMwlQ56Yjt1f2yZTdxzr6Gd2yo2SA, class_55722) -> ((ISectionedEntityCache)class_55732).getTrackingSections().putIfAbsent(lR4bMwlQ56Yjt1f2yZTdxzr6Gd2yo2SA, SecureClass0801.qhgvGjIDWmpWaVDIXaEEr6KbdUI9EV3Y(field004.getEntityClass(), class_55722)));
        return class_55732;
    }
}

