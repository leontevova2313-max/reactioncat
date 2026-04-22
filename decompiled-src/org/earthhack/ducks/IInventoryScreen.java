/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks;

import net.minecraft.class_490;
import org.phobos.secure.0dlmuoMYLMuYPO0vDrDlwmMFyqqO6D1f.o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe;

public interface IInventoryScreen {
    public o4R7ZDStSl8cQlrNfmuqo0QAkFWrSJOe getOpenTime();

    public static IInventoryScreen generic(class_490 screen) {
        return (IInventoryScreen)screen;
    }
}

