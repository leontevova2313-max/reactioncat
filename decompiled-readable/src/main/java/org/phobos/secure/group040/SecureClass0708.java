/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group040;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Optional;
import net.minecraft.class_1735;
import net.minecraft.class_746;
import org.phobos.secure.group005.SecureClass0071;
import org.phobos.secure.group016.SecureClass0268;
import org.phobos.secure.group016.SecureInterface0038;

public class SecureClass0708
implements SecureInterface0038 {
    public final /* synthetic */ SecureClass0071 field001;
    public final /* synthetic */ String name;
    public final /* synthetic */ SecureClass0268 field002;
    public final /* synthetic */ SecureClass0268 field003;

    public /* synthetic */ SecureClass0708(String PhHW93tBMOrFajM8PqJw2zOsTFgDKt0N) {
        this.field003 = new SecureClass0268();
        this.field002 = new SecureClass0268();
        this.field001 = new SecureClass0071();
        this.name = PhHW93tBMOrFajM8PqJw2zOsTFgDKt0N;
    }

    public static /* bridge */ /* synthetic */ SecureClass0708 fFS4XPwKjr5hPAqnQgDCfmX5EsIeVj54(String epRUcEMMdsBf1kWsafUk0zWMIKOHFvXR, class_746 nUEPZ4WHTYaljRTLc5BdAk1cZXiYoydS) {
        SecureClass0708 field004 = new SecureClass0708(epRUcEMMdsBf1kWsafUk0zWMIKOHFvXR);
        for (int E9FQDLfv25KEnqgWCh6bCPK0iLrOgNpu = 9; E9FQDLfv25KEnqgWCh6bCPK0iLrOgNpu < 36; ++E9FQDLfv25KEnqgWCh6bCPK0iLrOgNpu) {
            class_1735 field005 = nUEPZ4WHTYaljRTLc5BdAk1cZXiYoydS.field_7498.method_7611(E9FQDLfv25KEnqgWCh6bCPK0iLrOgNpu);
            field004.cTjIPbYBlYKOE3vTOzdhs5d1do7XbhX6(field005, field004.field003);
        }
        int field006 = 36;
        while (true) {
            if (field006 >= 45) {
                field004.QdpeKeenhlUfH2XaqY8go0A2MPCUAex0(nUEPZ4WHTYaljRTLc5BdAk1cZXiYoydS.method_6079(), field004.field001);
                return field004;
            }
            class_1735 class_17352 = nUEPZ4WHTYaljRTLc5BdAk1cZXiYoydS.field_7498.method_7611(field006);
            field004.cTjIPbYBlYKOE3vTOzdhs5d1do7XbhX6(class_17352, field004.field002);
            ++field006;
        }
    }

    public static /* bridge */ /* synthetic */ Optional<SecureClass0708> Wq3b5UGlpHB8iMxypneRrcJ8ZDC59wVy(String Tn7D9ETrHvJoiimUfts86KRpQFs2oXeI, String j5J5aiqyXXVHI2qsB2mgDteGiwqzngUR) {
        try {
            JsonObject field007 = JsonParser.parseString((String)j5J5aiqyXXVHI2qsB2mgDteGiwqzngUR).getAsJsonObject();
            SecureClass0708 field008 = new SecureClass0708(Tn7D9ETrHvJoiimUfts86KRpQFs2oXeI);
            field008.field002.pGkRfeGzCbk9riPldFNewgKsQVa8sNO4(field007.get("hotbar"));
            field008.field003.pGkRfeGzCbk9riPldFNewgKsQVa8sNO4(field007.get("inventory"));
            if (field007.has("offhand")) {
                field008.field001.pGkRfeGzCbk9riPldFNewgKsQVa8sNO4(field007.get("offhand"));
            }
            return Optional.of(field008);
        }
        catch (Throwable zlQnkGQLzNQrI9IszHUm9lbKaHekokQ9) {
            return Optional.empty();
        }
    }
}

