/*
 * Decompiled with CFR.
 */
package org.phobos.mixin.net;

import com.mojang.authlib.GameProfile;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_640;
import net.minecraft.class_8685;
import org.earthhack.ducks.IPlayerListEntry;
import org.earthhack.mixin.EventSubscriber;
import org.phobos.secure.group008.SecureClass0128;
import org.phobos.secure.group061.SecureClass1107;
import org.phobos.secure.group016.oOvS7efVKNNtpswOyYC2PG08rMH2O5fu;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group030.SecureClass0527;
import org.phobos.secure.group036.SecureClass0628;
import org.phobos.secure.group054.SecureInterface0134;
import org.phobos.secure.group059.fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={class_640.class})
public abstract class MixinPlayerListEntry
implements EventSubscriber,
SecureInterface0134,
IPlayerListEntry {
    @Unique
    private class_2561 name;
    @Unique
    private class_2960 cape;
    @Unique
    private fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3 content;
    @Unique
    private class_8685.class_7920 skinModel;
    @Shadow
    @Final
    private GameProfile field_3741;
    @Unique
    private class_2561 user;
    @Unique
    private class_2960 skin;
    @Unique
    private String skinUrl;

    @Override
    public class_2561 getFormattedPlayerName() {
        return this.user;
    }

    @Inject(method={"<init>"}, at={@At(value="TAIL")})
    private void onInit(GameProfile profile, boolean secureChatEnforced, CallbackInfo ci) {
        oOvS7efVKNNtpswOyYC2PG08rMH2O5fu skin;
        class_2960 cape;
        if (this.cape == null && (cape = SecureClass1107.cdoamY2efVZe8mfcV7LEEZd0AR4LL8a5(profile.getName())) != null) {
            this.cape = cape;
        }
        if (this.skin == null && (skin = SecureClass1107.AfdyhZwUrPt8nUoX64zZVdodZ73n9Cjc(profile.getName())) != null) {
            this.skin = skin.ouW7FO7Fnwc7CL94O3LcbJGcajc4ApDx();
            this.skinUrl = skin.whtPLTDbt7KnWzbdDSGiVUDqfx7UdKWz();
            this.skinModel = skin.iQT1c5KQnzj59uqTmQjOnVJkISbxWITg();
        }
        this.setSelf(profile);
        SecureClass0628 manager = SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().lt6xZvoJKQKE6SUt1W8d8Ef6uJON4yLr();
        fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3 user = manager.wMxlrh65EcTWmVAHg6Fi7H1wBOucTdsm(profile.getName());
        if (user == null) {
            return;
        }
        this.setUser(user);
    }

    @Unique
    private void setSelf(GameProfile profile) {
        if (P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1562() != null && MixinPlayerListEntry.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 != null && MixinPlayerListEntry.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_5820().equals(profile.getName())) {
            this.setUser(new fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3(SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.h9Cjd7kO7zIEyNi70jY7zFuQoWkHfl9H().TRtJL8LJ7isXaPlFPqWfsDmss8gV6DTx().getFormatting(), "Sydney", profile.getName()));
            return;
        }
    }

    @Override
    public void setCape(class_2960 identifier) {
        SecureClass1107.w7qw9eldRXmT9bGno4ha1sfcBctov7GG(this.field_3741.getName(), identifier);
        this.cape = identifier;
    }

    @Override
    public void setSkin(class_2960 identifier, String url, class_8685.class_7920 model) {
        SecureClass1107.Bly41awwDN02Bf6ZIKuZ4mvKcTZY9m5W(this.field_3741.getName(), identifier, url, model);
        this.skin = identifier;
        this.skinUrl = url;
        this.skinModel = model;
    }

    @Override
    public fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3 getUser() {
        return this.content;
    }

    @Override
    public void setUser(fvVGHhUrN2fB5fyvsiakmAsqsF50IMo3 user) {
        this.content = user;
        this.user = class_2561.method_43470((String)user.vefbKIVLti8bKnkRLk5ZfEoQbIUt4MRk());
        this.name = class_2561.method_43470((String)user.kbuKh8GWWfhWCwOqfBtKKPra5fCcEJrd());
    }

    @Inject(method={"getSkinTextures"}, at={@At(value="TAIL")}, cancellable=true)
    private void getSkinTexturesHook(CallbackInfoReturnable<class_8685> cir) {
        class_8685 original = (class_8685)cir.getReturnValue();
        class_2960 cape = this.cape != null && SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().XVAOrvKPadV4YLACL1YS01MkOTX5QJAj.getValue() != false ? this.cape : original.comp_1627();
        class_8685 replacement = new class_8685(this.skin != null && SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().lt5l0lSgaNyIMp3OQAVd78Ow1ijLCzTz.getValue() != false ? this.skin : original.comp_1626(), this.skinUrl != null && SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().lt5l0lSgaNyIMp3OQAVd78Ow1ijLCzTz.getValue() != false ? this.skinUrl : original.comp_1911(), cape, cape, this.skinModel != null ? this.skinModel : original.comp_1629(), original.comp_1630());
        cir.setReturnValue((Object)replacement);
    }

    @Shadow
    public abstract GameProfile method_2966();

    @Override
    public class_2561 getFormattedUsername() {
        return this.name;
    }
}

