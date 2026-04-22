/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import net.minecraft.class_1309;
import net.minecraft.class_1799;
import org.phobos.secure.group029.SecureClass0506;
import org.phobos.secure.group022.SecureClass0377;
import org.phobos.secure.group040.SecureClass0704;

public interface ILivingEntity {
    public void setPrevBodyPitch(float var1);

    public float getPrevBodyPitch();

    public void setPrevRightLegPivotZ(float var1);

    public float getPrevRightLegPivotZ();

    public void setPrevLeftLegPivotZ(float var1);

    public float getPrevLeftLegPivotZ();

    public void setPrevRightLegPivotY(float var1);

    public float getPrevRightLegPivotY();

    public void setPrevLeftLegPivotY(float var1);

    public float getPrevLeftLegPivotY();

    public void setPrevHeadPivotY(float var1);

    public float getPrevHeadPivotY();

    public void setPrevBodyPivotY(float var1);

    public float getPrevBodyPivotY();

    public void setPrevLeftArmPivotY(float var1);

    public float getPrevLeftArmPivotY();

    public void setPrevRightArmPivotY(float var1);

    public float getPrevRightArmPivotY();

    public float getPrevRightArmPitch();

    public float getPrevLeftArmPitch();

    public SecureClass0377 getBodyPitchAnimation();

    public SecureClass0377 getRightLegPivotZAnimation();

    public SecureClass0377 getLeftLegPivotZAnimation();

    public SecureClass0377 getRightLegPivotYAnimation();

    public SecureClass0377 getLeftLegPivotYAnimation();

    public SecureClass0377 getHeadPivotYAnimation();

    public SecureClass0377 getBodyPivotYAnimation();

    public SecureClass0377 getLeftArmPivotYAnimation();

    public SecureClass0377 getRightArmPivotYAnimation();

    public SecureClass0377 getRightArmPitchAnimation();

    public SecureClass0377 getLeftArmPitchAnimation();

    public SecureClass0377 getGlobalAnimation();

    public SecureClass0704 getSneakAnimations();

    public boolean is$sneaking();

    public void set$sneaking(boolean var1);

    public SecureClass0377 cfr_renamed_1();

    public void setLastLerp(long var1);

    public class_1799 qvWYd5cioN5ski3L3rgHm6MbdCNconzk();

    public void setLastMainhandStack(class_1799 var1);

    public class_1799 OvIdOSBEVB7QrO8zg54Grdl01cHz1jVo();

    public void setLastOffhandStack(class_1799 var1);

    public int getLastMainhandCount();

    public void setLastMainhandCount(int var1);

    public int getLastOffhandCount();

    public void setLastOffhandCount(int var1);

    public SecureClass0506 getGhostModel();

    public void setGhostModel(SecureClass0506 var1);

    public float getLastAttackCooldown();

    public static ILivingEntity cast(class_1309 entity) {
        return (ILivingEntity)entity;
    }
}

