/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import org.phobos.mixin.game.entity.ILivingEntity;
import org.phobos.secure.DvHN4PkxykAoANi4roFzZmZTSvw4GCMi.aShWJb7GsPklnUjCbBB8BxbIaQIrfg6r;
import org.phobos.secure.R891IQaB1q1R6FZkTp79IwNZk8RxLxVJ.v9v8NRcsHu09KTRwCFHSDyMPo2NcVkGV;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.Wsafkpz6daKMV5dmmJv1iWqXD7boHROb;
import org.phobos.secure.x1DY041XvwghGy7xcFOJHKLEtyjyV049.ZXwmCfEFj3YKBWmDCJZ6rhLOuqh12lGO;

public interface IAbstractClientPlayerEntity
extends ILivingEntity {
    public Wsafkpz6daKMV5dmmJv1iWqXD7boHROb[] getPredictions();

    public int getJumpScore();

    public void addJumpScore();

    public void setJumpScore(int var1);

    public ZXwmCfEFj3YKBWmDCJZ6rhLOuqh12lGO getMovementModel();

    public v9v8NRcsHu09KTRwCFHSDyMPo2NcVkGV getHistory();

    public aShWJb7GsPklnUjCbBB8BxbIaQIrfg6r getEntityData();
}

