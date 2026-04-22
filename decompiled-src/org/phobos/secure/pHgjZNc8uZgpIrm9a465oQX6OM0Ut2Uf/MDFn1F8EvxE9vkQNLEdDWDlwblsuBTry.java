/*
 * Decompiled with CFR.
 */
package org.phobos.secure.pHgjZNc8uZgpIrm9a465oQX6OM0Ut2Uf;

import net.minecraft.class_5568;
import net.minecraft.class_5570;
import net.minecraft.class_5572;
import net.minecraft.class_5573;
import net.minecraft.class_5578;
import org.phobos.mixin.game.world.ISectionedEntityCache;
import org.phobos.mixin.game.world.ISimpleEntityLookup;

public final class MDFn1F8EvxE9vkQNLEdDWDlwblsuBTry {
    public static /* bridge */ /* synthetic */ <T extends class_5568> class_5570<T> Va4b3IjMgDJgRf8cC6F3LmEivu9XiXOp(class_5570<T> class_55702) {
        class_5570 NBMFRYR8U1AgRP1g0VqVzzIfPa1kfmNI = new class_5570();
        class_55702.method_31751().forEach(arg_0 -> ((class_5570)NBMFRYR8U1AgRP1g0VqVzzIfPa1kfmNI).method_31753(arg_0));
        return NBMFRYR8U1AgRP1g0VqVzzIfPa1kfmNI;
    }

    public /* synthetic */ MDFn1F8EvxE9vkQNLEdDWDlwblsuBTry() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ <T extends class_5568> class_5578<T> nwtB8IYfRu1GcN8B3q1rCVvExs3IgKBH(class_5578<T> McFhVCW84nBxp24vqxYT6B45OfDGw4z6) {
        ISimpleEntityLookup DTAjB5ONNXwrG9WPcjIs78BWmOvKPscL = (ISimpleEntityLookup)McFhVCW84nBxp24vqxYT6B45OfDGw4z6;
        return new class_5578(MDFn1F8EvxE9vkQNLEdDWDlwblsuBTry.Va4b3IjMgDJgRf8cC6F3LmEivu9XiXOp(DTAjB5ONNXwrG9WPcjIs78BWmOvKPscL.getEntityIndex()), MDFn1F8EvxE9vkQNLEdDWDlwblsuBTry.k0qtJwbhtjboyxRujSyJxzcpKafVcsEj(DTAjB5ONNXwrG9WPcjIs78BWmOvKPscL.getEntityCache()));
    }

    public static /* bridge */ /* synthetic */ <T extends class_5568> class_5572<T> qhgvGjIDWmpWaVDIXaEEr6KbdUI9EV3Y(Class<T> Cf6oDoL2WC3Y5HCBOoF7DrJi1tHNRzr0, class_5572<T> HPRnBWCPETbd1YAbaouWGUE7AVD7LNO8) {
        class_5572 HVHT24kMsrI7HepVOaMBbePWJ9RlfMh7 = new class_5572(Cf6oDoL2WC3Y5HCBOoF7DrJi1tHNRzr0, HPRnBWCPETbd1YAbaouWGUE7AVD7LNO8.method_31768());
        HPRnBWCPETbd1YAbaouWGUE7AVD7LNO8.method_31766().forEach(arg_0 -> ((class_5572)HVHT24kMsrI7HepVOaMBbePWJ9RlfMh7).method_31764(arg_0));
        return HVHT24kMsrI7HepVOaMBbePWJ9RlfMh7;
    }

    public static /* bridge */ /* synthetic */ <T extends class_5568> class_5573<T> k0qtJwbhtjboyxRujSyJxzcpKafVcsEj(class_5573<T> RP6olu76c36XaySXjEmfFBLp0GxyJ9Pd) {
        ISectionedEntityCache sK3WH2GhUVbtd7hpiOBssGAOP6SFBnbu = (ISectionedEntityCache)RP6olu76c36XaySXjEmfFBLp0GxyJ9Pd;
        class_5573 class_55732 = new class_5573(sK3WH2GhUVbtd7hpiOBssGAOP6SFBnbu.getEntityClass(), sK3WH2GhUVbtd7hpiOBssGAOP6SFBnbu.getPosToStatus());
        sK3WH2GhUVbtd7hpiOBssGAOP6SFBnbu.getTrackedPositions().forEach(l -> ((ISectionedEntityCache)class_55732).getTrackedPositions().add(l));
        sK3WH2GhUVbtd7hpiOBssGAOP6SFBnbu.getTrackingSections().forEach((lR4bMwlQ56Yjt1f2yZTdxzr6Gd2yo2SA, class_55722) -> ((ISectionedEntityCache)class_55732).getTrackingSections().putIfAbsent(lR4bMwlQ56Yjt1f2yZTdxzr6Gd2yo2SA, MDFn1F8EvxE9vkQNLEdDWDlwblsuBTry.qhgvGjIDWmpWaVDIXaEEr6KbdUI9EV3Y(sK3WH2GhUVbtd7hpiOBssGAOP6SFBnbu.getEntityClass(), class_55722)));
        return class_55732;
    }
}

