/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import org.phobos.mixin.game.entity.ILivingEntity;
import org.phobos.secure.group024.SecureClass0405;
import org.phobos.secure.group048.SecureClass0873;
import org.phobos.secure.group054.SecureClass0991;
import org.phobos.secure.group059.SecureInterface0141;

public interface IAbstractClientPlayerEntity
extends ILivingEntity {
    public SecureClass0991[] getPredictions();

    public int getJumpScore();

    public void addJumpScore();

    public void setJumpScore(int var1);

    public SecureInterface0141 getMovementModel();

    public SecureClass0873 getHistory();

    public SecureClass0405 getEntityData();
}

