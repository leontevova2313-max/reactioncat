/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import net.minecraft.class_1309;
import net.minecraft.class_1799;
import org.phobos.secure.GDhmoYavlf9ThZKuxeuADTOSzks51z7E.jLQ6isMQnXJe826RO1rfaJ9btcM3lDyk;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5.U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8;
import org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND.Nok3KLvu0zRyccMtdN1MEFO3U2PomhtE;

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

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getBodyPitchAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getRightLegPivotZAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getLeftLegPivotZAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getRightLegPivotYAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getLeftLegPivotYAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getHeadPivotYAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getBodyPivotYAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getLeftArmPivotYAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getRightArmPivotYAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getRightArmPitchAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getLeftArmPitchAnimation();

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 getGlobalAnimation();

    public Nok3KLvu0zRyccMtdN1MEFO3U2PomhtE getSneakAnimations();

    public boolean is$sneaking();

    public void set$sneaking(boolean var1);

    public U44IsK0KMFUxpYDCbDxt9D2mLn84o3p8 cfr_renamed_1();

    public void setLastLerp(long var1);

    public class_1799 qvWYd5cioN5ski3L3rgHm6MbdCNconzk();

    public void setLastMainhandStack(class_1799 var1);

    public class_1799 OvIdOSBEVB7QrO8zg54Grdl01cHz1jVo();

    public void setLastOffhandStack(class_1799 var1);

    public int getLastMainhandCount();

    public void setLastMainhandCount(int var1);

    public int getLastOffhandCount();

    public void setLastOffhandCount(int var1);

    public jLQ6isMQnXJe826RO1rfaJ9btcM3lDyk getGhostModel();

    public void setGhostModel(jLQ6isMQnXJe826RO1rfaJ9btcM3lDyk var1);

    public float getLastAttackCooldown();

    public static ILivingEntity cast(class_1309 entity) {
        return (ILivingEntity)entity;
    }
}

