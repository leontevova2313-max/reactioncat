/*
 * Decompiled with CFR.
 */
package org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW;

import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.class_1059;
import net.minecraft.class_156;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_293;
import net.minecraft.class_2960;
import net.minecraft.class_4668;
import org.earthhack.ducks.IRenderLayer;
import org.lwjgl.opengl.GL11C;

public class _4vh0LGAVSEcuEVNm92IYhlsRDdI0mLnQ {
    public static final /* synthetic */ BiFunction<class_2960, Boolean, class_1921> e5lbpcgskiTjiHmedEW0OHoi3DsYBxs3;
    public static final /* synthetic */ class_1921 D0iix9kXScxykQIdX5c37yJzqubNLeWu;
    public static final /* synthetic */ BiFunction<class_2960, Boolean, class_1921> cWBnoGv0xusoTqko37XFI1FYicLJrjhy;
    public static final /* synthetic */ Function<class_2960, class_1921> FRMrMgKnASpMZOlLase3fMOCrk2fJszh;

    public static /* bridge */ /* synthetic */ void BKDa3oxN3uo54q5m0w9uLpGNsWQx3tuj(class_1921.class_4687 class_46872) {
        IRenderLayer Ty2T1Q3iL6Yo1u3LM7lwrw3Tr6P2HO14 = (IRenderLayer)class_46872;
        Ty2T1Q3iL6Yo1u3LM7lwrw3Tr6P2HO14.setStarter(() -> {
            GL11C.glEnable((int)32823);
            GL11C.glPolygonOffset((float)1.0f, (float)-1100000.0f);
        });
        Ty2T1Q3iL6Yo1u3LM7lwrw3Tr6P2HO14.setFinisher(() -> {
            GL11C.glPolygonOffset((float)1.0f, (float)1100000.0f);
            GL11C.glDisable((int)32823);
        });
    }

    public static /* bridge */ /* synthetic */ class_1921 cfr_renamed_440() {
        return D0iix9kXScxykQIdX5c37yJzqubNLeWu;
    }

    static {
        cWBnoGv0xusoTqko37XFI1FYicLJrjhy = class_156.method_34865((tOqx9WM9jJqxKrmARsmsX4baMmgI3luI, eWbrMUhSGNhSfwW1HeJFSBc3iKfyDyDK) -> {
            class_1921.class_4688 XSfvzkzgP235inWQsVBEG1oBGXNVplT2 = class_1921.class_4688.method_23598().method_34578(class_1921.field_29452).method_23604(class_4668.field_21348).method_34577((class_4668.class_5939)new class_4668.class_4683(tOqx9WM9jJqxKrmARsmsX4baMmgI3luI, false, false)).method_23615(class_1921.field_21370).method_23608(class_1921.field_21383).method_23611(class_1921.field_21385).method_23617(eWbrMUhSGNhSfwW1HeJFSBc3iKfyDyDK.booleanValue());
            class_1921.class_4687 kJ3b3MJ4qtSXXP5ntJfLiNs76XpIqhaq = class_1921.method_24049((String)"entity_cutout_see_through", (class_293)class_290.field_1580, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)true, (boolean)true, (class_1921.class_4688)XSfvzkzgP235inWQsVBEG1oBGXNVplT2);
            _4vh0LGAVSEcuEVNm92IYhlsRDdI0mLnQ.BKDa3oxN3uo54q5m0w9uLpGNsWQx3tuj(kJ3b3MJ4qtSXXP5ntJfLiNs76XpIqhaq);
            return kJ3b3MJ4qtSXXP5ntJfLiNs76XpIqhaq;
        });
        e5lbpcgskiTjiHmedEW0OHoi3DsYBxs3 = class_156.method_34865((ZZfdwAhno6Yj4hdAjeSKBdrPfL8DfxDj, lEnyIl8HyxXr1Yz5341061VtGDbLOYgx) -> {
            class_1921.class_4688 SQpyccEzf6MiNolTtw9HpEkjtUplOOkk = class_1921.class_4688.method_23598().method_34578(class_1921.field_29452).method_23604(class_4668.field_21348).method_34577((class_4668.class_5939)new class_4668.class_4683(ZZfdwAhno6Yj4hdAjeSKBdrPfL8DfxDj, false, false)).method_23615(class_1921.field_21370).method_23608(class_1921.field_21383).method_23611(class_1921.field_21385).method_23617(lEnyIl8HyxXr1Yz5341061VtGDbLOYgx.booleanValue());
            return class_1921.method_24049((String)"entity_cutout_transparency", (class_293)class_290.field_1580, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)true, (boolean)true, (class_1921.class_4688)SQpyccEzf6MiNolTtw9HpEkjtUplOOkk);
        });
        FRMrMgKnASpMZOlLase3fMOCrk2fJszh = class_156.method_34866(mOczDVbUPsoW432qHCQtjJNqf1Jhf2jw -> {
            class_1921.class_4688 class_46882 = class_1921.class_4688.method_23598().method_34578(class_1921.field_29450).method_34577((class_4668.class_5939)new class_4668.class_4683(mOczDVbUPsoW432qHCQtjJNqf1Jhf2jw, false, false)).method_23615(class_1921.field_21364).method_23608(class_1921.field_21383).method_23611(class_1921.field_21385).method_23617(true);
            class_1921.class_4687 class_46872 = class_1921.method_24049((String)"entity_solid_see_through", (class_293)class_290.field_1580, (class_293.class_5596)class_293.class_5596.field_27382, (int)1536, (boolean)true, (boolean)true, (class_1921.class_4688)class_46882);
            _4vh0LGAVSEcuEVNm92IYhlsRDdI0mLnQ.BKDa3oxN3uo54q5m0w9uLpGNsWQx3tuj(class_46872);
            return class_46872;
        });
        D0iix9kXScxykQIdX5c37yJzqubNLeWu = _4vh0LGAVSEcuEVNm92IYhlsRDdI0mLnQ.cWBnoGv0xusoTqko37XFI1FYicLJrjhy.apply(class_1059.field_5275, true);
    }

    public static /* bridge */ /* synthetic */ class_1921 cfr_renamed_29(class_2960 D8lyClBVHWX8YVKJkFXDnaU7vuAQQcL4) {
        return e5lbpcgskiTjiHmedEW0OHoi3DsYBxs3.apply(D8lyClBVHWX8YVKJkFXDnaU7vuAQQcL4, true);
    }

    public static /* bridge */ /* synthetic */ class_1921 Vn4kauqfgiIwTrvj8T5OjGwc7tFSduk4(class_2960 zS2sWtDug0ok0OhFJSLPljf4uEwjoNbY) {
        return FRMrMgKnASpMZOlLase3fMOCrk2fJszh.apply(zS2sWtDug0ok0OhFJSLPljf4uEwjoNbY);
    }
}

