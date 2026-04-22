/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group035;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.http.HttpClient;
import java.util.Optional;
import java.util.UUID;
import net.minecraft.class_124;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_5250;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.phobos.secure.group017.SecureClass0272;
import org.phobos.secure.group026.u5Wyzr1x0A1PEilKFFfRl2wGXpExqxDz;
import org.phobos.secure.group033.k5t9jQO2Hrybb4pn52A66gWRRxJY7u2E;
import org.phobos.secure.group030.SecureClass0536;
import org.phobos.secure.group040.SecureClass0707;
import org.phobos.secure.group042.GameTiersModule;
import org.phobos.secure.group054.SecureInterface0134;

public class SecureClass0617
implements SecureInterface0134 {
    public static final /* synthetic */ Gson field001;
    public static final /* synthetic */ HttpClient field002;

    @NotNull
    public static /* bridge */ /* synthetic */ String lPkd8Jl6DjSi7Xjkcfq9ukyXwRxGFCX2(k5t9jQO2Hrybb4pn52A66gWRRxJY7u2E wLTFpYopvyHFWWqyZlQxj4JIDNdIUKQh) {
        if (GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().zlSeLCmHYF28HtACxhj1r8OaQ5otTzE5().getValue().booleanValue() && wLTFpYopvyHFWWqyZlQxj4JIDNdIUKQh.uuGxpZqAH6GjW2bS29VEefHKlUYouhQB() && wLTFpYopvyHFWWqyZlQxj4JIDNdIUKQh.Q2mIpQ0K59DPq12odhtj0tEc2HHc3RIx() != null && wLTFpYopvyHFWWqyZlQxj4JIDNdIUKQh.KdtfkWt8k9rvC3saJhApMbxfqsA803Ta() != null) {
            return "R" + (wLTFpYopvyHFWWqyZlQxj4JIDNdIUKQh.KdtfkWt8k9rvC3saJhApMbxfqsA803Ta() == 0 ? "H" : "L") + "T" + wLTFpYopvyHFWWqyZlQxj4JIDNdIUKQh.Q2mIpQ0K59DPq12odhtj0tEc2HHc3RIx();
        }
        return (wLTFpYopvyHFWWqyZlQxj4JIDNdIUKQh.V8PrTCwkD4PmPmhBoERE4tuLEY6TP01y() == 0 ? "H" : "L") + "T" + wLTFpYopvyHFWWqyZlQxj4JIDNdIUKQh.vw3IHvw95YdpjuYedTTQnHNMdlb9cKe2();
    }

    public static /* bridge */ /* synthetic */ HttpClient QM8W44tLapgDwpkPThCix4VKjEyUHs20() {
        return field002;
    }

    static {
        field001 = new GsonBuilder().create();
        field002 = HttpClient.newHttpClient();
    }

    public static /* bridge */ /* synthetic */ Optional<u5Wyzr1x0A1PEilKFFfRl2wGXpExqxDz> vIBjuV5RnSAGQeOorRucLY5RmMBc3hYn(UUID IT2gxAnE9rSx3B5GgxabZlJJxtbrETPc) {
        SecureClass0707 field003 = SecureClass0272.IFZmoXs2dR0yHPYkIgWWftztu7TcULGJ("vanilla");
        return SecureClass0272.IUCryiWVsdc6NGVR054Tdp4eL6Q189vr(IT2gxAnE9rSx3B5GgxabZlJJxtbrETPc).map(jc7F1WJnL9rCfsUvqQJeBcmB32MZpnet -> {
            if (jc7F1WJnL9rCfsUvqQJeBcmB32MZpnet.xNHkkuKjyqvrxpw2iWqVy7tgHEEDcbAp() == null) {
                return null;
            }
            k5t9jQO2Hrybb4pn52A66gWRRxJY7u2E field004 = jc7F1WJnL9rCfsUvqQJeBcmB32MZpnet.xNHkkuKjyqvrxpw2iWqVy7tgHEEDcbAp().get(field003.cfr_renamed_332());
            Optional<u5Wyzr1x0A1PEilKFFfRl2wGXpExqxDz> field005 = jc7F1WJnL9rCfsUvqQJeBcmB32MZpnet.Lw5cCiUGqYIXqcy6YAXLB22ahp8AdNh8();
            if (field004 == null) {
                return field005.orElse(null);
            }
            return field004.Q1kFtRsc5qqZ6WpCflipO7UUVPzv5LRm(field003);
        });
    }

    public static /* bridge */ /* synthetic */ class_2561 KFdiYifp5hcp8zQrxjtw3zssvgICqxeF(class_1657 t29Xm9m4njai1ZkMYu3Jcv6cO5mJ4HMI, class_2561 field010) {
        class_5250 field006;
        if (t29Xm9m4njai1ZkMYu3Jcv6cO5mJ4HMI instanceof class_746 && GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().YIQRjtUobZI3Y4LYam0798lr9q0w5i7n().getValue().booleanValue()) {
            String field007 = GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().cfr_renamed_482();
            class_5250 field008 = class_2561.method_43470((String)field007).method_54663(SecureClass0617.K5l1m1XLJEQAnHFthhXvF5a8nRxfLdsp(field007));
            SecureClass0707 field009 = SecureClass0617.pUnHWnt3R23CJMy87p2Lu1pXTMaZpxA8("vanilla");
            if (GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().CddL4D8dJZIOvZ7lldHw5JRZqR5UL33r().getValue().booleanValue() && field009 != null && field009.nbHPDZEpHSRGdKBj7IN6JQDiD1ML20ww().isPresent()) {
                class_2561.method_43470((String)field009.nbHPDZEpHSRGdKBj7IN6JQDiD1ML20ww().get().toString()).method_10852((class_2561)field008).method_10852((class_2561)class_2561.method_43470((String)" | ").method_27692(class_124.field_1080));
                return field008.method_10852(field010);
            }
            field008.method_10852((class_2561)class_2561.method_43470((String)" | ").method_27692(class_124.field_1080));
            return field008.method_10852(field010);
        }
        if (GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().RTjwLgcE7OrfJobtRvwDHqwPyM6cDjLK() || P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_1542()) {
            return field010;
        }
        switch (GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().qSrM4K6xj8mgVZ7P5Uzo2Y3nEzhjsb41().getValue()) {
            default: {
                throw new MatchException(null, null);
            }
            case Tier: {
                class_5250 class_52502 = SecureClass0617.vIBjuV5RnSAGQeOorRucLY5RmMBc3hYn(t29Xm9m4njai1ZkMYu3Jcv6cO5mJ4HMI.method_5667()).map(yqTWjqMrKrz3CDkBTlf4ukDdqbrfPjQ9 -> {
                    String field011 = SecureClass0617.lPkd8Jl6DjSi7Xjkcfq9ukyXwRxGFCX2(yqTWjqMrKrz3CDkBTlf4ukDdqbrfPjQ9.cfr_renamed_483());
                    class_5250 field012 = class_2561.method_43470((String)field011).method_54663(SecureClass0617.K5l1m1XLJEQAnHFthhXvF5a8nRxfLdsp(field011));
                    if (GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().CddL4D8dJZIOvZ7lldHw5JRZqR5UL33r().getValue().booleanValue() && yqTWjqMrKrz3CDkBTlf4ukDdqbrfPjQ9.Ani9RkkHrR2ISanYVEPOBybaN8mGk0gz() != null && yqTWjqMrKrz3CDkBTlf4ukDdqbrfPjQ9.Ani9RkkHrR2ISanYVEPOBybaN8mGk0gz().nbHPDZEpHSRGdKBj7IN6JQDiD1ML20ww().isPresent()) {
                        return class_2561.method_43470((String)yqTWjqMrKrz3CDkBTlf4ukDdqbrfPjQ9.Ani9RkkHrR2ISanYVEPOBybaN8mGk0gz().nbHPDZEpHSRGdKBj7IN6JQDiD1ML20ww().get().toString()).method_10852((class_2561)field012);
                    }
                    return field012;
                }).orElse(null);
                break;
            }
            case Rank: {
                class_5250 class_52502 = field006 = (class_5250)SecureClass0272.IUCryiWVsdc6NGVR054Tdp4eL6Q189vr(t29Xm9m4njai1ZkMYu3Jcv6cO5mJ4HMI.method_5667()).map(q16OZoOCeCU2ikmEpXAcjaDXK2tjFLYx -> class_2561.method_43470((String)("#" + q16OZoOCeCU2ikmEpXAcjaDXK2tjFLYx.ISrz70KxjFQUjfFXlg9XeRrTMyGl3WXx()))).orElse(null);
            }
        }
        if (field006 != null) {
            field006.method_10852((class_2561)class_2561.method_43470((String)" | ").method_27692(class_124.field_1080));
            return field006.method_10852(field010);
        }
        return field010;
    }

    public static /* bridge */ /* synthetic */ int K5l1m1XLJEQAnHFthhXvF5a8nRxfLdsp(String string) {
        if (string.startsWith("R")) {
            return 10671871;
        }
        return (Integer)GameTiersModule.Eff0VTJx6ss7leBrbtCLD0LCTt0Z7X74().dAn3ivpPf7TSb9zZEyaZ0YBlAJRywN3E().getOrDefault((Object)string, (Object)0xD3D3D3);
    }

    public static /* bridge */ /* synthetic */ SecureClass0707 pUnHWnt3R23CJMy87p2Lu1pXTMaZpxA8(String n2u6WeiLS6XXCkvdDVP4F5xOOKwe2kqP) {
        return SecureClass0272.IFZmoXs2dR0yHPYkIgWWftztu7TcULGJ(n2u6WeiLS6XXCkvdDVP4F5xOOKwe2kqP);
    }

    public static /* bridge */ /* synthetic */ class_2561 bnexxOYWxFxi0QZn5gjaBcniK9ZcOlhN(SecureClass0536 tBYAwB5TUyZyXJEsPNzuhBBnptfDM0Bv) {
        class_5250 field013 = class_2561.method_43473().method_27693("=== Rankings for " + tBYAwB5TUyZyXJEsPNzuhBBnptfDM0Bv.name() + " ===");
        tBYAwB5TUyZyXJEsPNzuhBBnptfDM0Bv.xNHkkuKjyqvrxpw2iWqVy7tgHEEDcbAp().forEach((pgbTxhHyYO73yMxWrEYqwVrX6wDr9TrX, ahzktrAZ5u0rvFzcNU5AVbK5Cl67TUis) -> {
            if (pgbTxhHyYO73yMxWrEYqwVrX6wDr9TrX == null) {
                return;
            }
            SecureClass0707 field014 = SecureClass0272.IFZmoXs2dR0yHPYkIgWWftztu7TcULGJ(pgbTxhHyYO73yMxWrEYqwVrX6wDr9TrX);
            String field015 = SecureClass0617.lPkd8Jl6DjSi7Xjkcfq9ukyXwRxGFCX2(ahzktrAZ5u0rvFzcNU5AVbK5Cl67TUis);
            class_5250 field016 = class_2561.method_43470((String)field015).method_27694(IRBuceRLa5FQlGvkw7WndjU65lEYuvSC -> IRBuceRLa5FQlGvkw7WndjU65lEYuvSC.method_36139(SecureClass0617.K5l1m1XLJEQAnHFthhXvF5a8nRxfLdsp(field015)));
            field013.method_10852((class_2561)class_2561.method_43470((String)"\n").method_10852(field014.N44Ygm4bpj4qv86ukbWJ6GA01pTi6MHo(true)).method_27693(": ").method_10852((class_2561)field016));
        });
        return field013;
    }
}

