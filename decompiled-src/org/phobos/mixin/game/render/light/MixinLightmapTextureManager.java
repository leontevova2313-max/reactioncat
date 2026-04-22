/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.game.render.light;

import java.awt.Color;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1294;
import net.minecraft.class_1309;
import net.minecraft.class_2874;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_757;
import net.minecraft.class_765;
import org.earthhack.mixin.EventSubscriber;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B.TB35HHeLoBdhDWg9rFqolXt0i2WdbJ8R;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value={class_765.class})
public abstract class MixinLightmapTextureManager
implements EventSubscriber {
    @Shadow
    @Final
    private class_1043 field_4138;
    @Shadow
    private float field_21528;
    @Shadow
    @Final
    private class_310 field_4137;
    @Shadow
    @Final
    private class_757 field_4134;
    @Shadow
    @Final
    private class_1011 field_4133;
    @Shadow
    private boolean field_4135;

    @Shadow
    protected abstract float method_23795(float var1);

    @Shadow
    public static float method_23284(class_2874 type, int lightLevel) {
        return 0.0f;
    }

    @Shadow
    protected abstract float method_42597(float var1);

    @Shadow
    protected abstract float method_42596(class_1309 var1, float var2, float var3);

    @Shadow
    private static void method_46557(Vector3f vec) {
    }

    @Overwrite
    public void method_3313(float delta) {
        if (this.field_4135) {
            this.field_4135 = false;
            this.field_4137.method_16011().method_15396("lightTex");
            class_638 clientWorld = this.field_4137.field_1687;
            if (clientWorld != null) {
                float f = clientWorld.method_23783(1.0f);
                float g = clientWorld.method_23789() > 0 ? 1.0f : f * 0.95f + 0.05f;
                float h = ((Double)this.field_4137.field_1690.method_42472().method_41753()).floatValue();
                float i = this.method_42597(delta) * h;
                float j = this.method_42596((class_1309)this.field_4137.field_1724, i, delta) * h;
                float k = this.field_4137.field_1724.method_3140();
                float l = this.field_4137.field_1724.method_6059(class_1294.field_5925) ? class_757.method_3174((class_1309)this.field_4137.field_1724, (float)delta) : (k > 0.0f && this.field_4137.field_1724.method_6059(class_1294.field_5927) ? k : 0.0f);
                Vector3f vector3f = new Vector3f(f, f, 1.0f).lerp((Vector3fc)new Vector3f(1.0f, 1.0f, 1.0f), 0.35f);
                float m = this.field_21528 + 1.5f;
                Vector3f vector3f2 = new Vector3f();
                int n = 0;
                while (true) {
                    if (n < 16) {
                    } else {
                        this.field_4138.method_4524();
                        this.field_4137.method_16011().method_15407();
                        break;
                    }
                    for (int o = 0; o < 16; ++o) {
                        float v;
                        Vector3f vector3f4;
                        float u;
                        float q;
                        float p = MixinLightmapTextureManager.method_23284(clientWorld.method_8597(), n) * g;
                        float r = q = MixinLightmapTextureManager.method_23284(clientWorld.method_8597(), o) * m;
                        float s = q * ((q * 0.6f + 0.4f) * 0.6f + 0.4f);
                        float t = q * (q * q * 0.6f + 0.4f);
                        vector3f2.set(r, s, t);
                        boolean bl = clientWorld.method_28103().method_28114();
                        if (bl) {
                            vector3f2.lerp((Vector3fc)new Vector3f(0.99f, 1.12f, 1.0f), 0.25f);
                            MixinLightmapTextureManager.method_46557(vector3f2);
                        } else {
                            Vector3f vector3f3 = new Vector3f((Vector3fc)vector3f).mul(p);
                            vector3f2.add((Vector3fc)vector3f3);
                            vector3f2.lerp((Vector3fc)new Vector3f(0.75f, 0.75f, 0.75f), 0.04f);
                            if (this.field_4134.method_3195(delta) > 0.0f) {
                                u = this.field_4134.method_3195(delta);
                                vector3f4 = new Vector3f((Vector3fc)vector3f2).mul(0.7f, 0.6f, 0.6f);
                                vector3f2.lerp((Vector3fc)vector3f4, u);
                            }
                        }
                        if (l > 0.0f && (v = Math.max(vector3f2.x(), Math.max(vector3f2.y(), vector3f2.z()))) < 1.0f) {
                            u = 1.0f / v;
                            vector3f4 = new Vector3f((Vector3fc)vector3f2).mul(u);
                            vector3f2.lerp((Vector3fc)vector3f4, l);
                        }
                        if (!bl) {
                            if (j > 0.0f) {
                                vector3f2.add(-j, -j, -j);
                            }
                            MixinLightmapTextureManager.method_46557(vector3f2);
                        }
                        float v2 = ((Double)this.field_4137.field_1690.method_42473().method_41753()).floatValue();
                        Vector3f vector3f5 = new Vector3f(this.method_23795(vector3f2.x), this.method_23795(vector3f2.y), this.method_23795(vector3f2.z));
                        vector3f2.lerp((Vector3fc)vector3f5, Math.max(0.0f, v2 - i));
                        vector3f2.lerp((Vector3fc)new Vector3f(0.75f, 0.75f, 0.75f), 0.04f);
                        MixinLightmapTextureManager.method_46557(vector3f2);
                        vector3f2.mul(255.0f);
                        int x = (int)vector3f2.x();
                        int y = (int)vector3f2.y();
                        int z = (int)vector3f2.z();
                        this.field_4133.method_4305(o, n, TB35HHeLoBdhDWg9rFqolXt0i2WdbJ8R.iU34vlhxY4HYPuI3t1IG4GLpjalR1rwR() ? Color.WHITE.hashCode() : 0xFF000000 | z << 16 | y << 8 | x);
                    }
                    ++n;
                }
            }
        }
    }
}

