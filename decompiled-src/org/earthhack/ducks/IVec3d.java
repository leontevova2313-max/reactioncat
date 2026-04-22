/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

public interface IVec3d {
    default public void set(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public void setX(double var1);

    public void setY(double var1);

    public void setZ(double var1);
}

