/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_8685;
import org.phobos.secure.x1DY041XvwghGy7xcFOJHKLEtyjyV049.fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3;

public interface IPlayerListEntry {
    public void setCape(class_2960 var1);

    public void setSkin(class_2960 var1, String var2, class_8685.class_7920 var3);

    public fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3 getUser();

    public void setUser(fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3 var1);

    public class_2561 getFormattedUsername();

    public class_2561 getFormattedPlayerName();
}

