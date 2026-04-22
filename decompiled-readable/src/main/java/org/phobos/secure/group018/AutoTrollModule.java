/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group018;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_156;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group001.SecureClass0003;
import org.phobos.secure.group009.VWEFfclxT9tQqs5L0TLIog9P5CnH2hZN;
import org.phobos.secure.group007._5geIzNbB6CmTiXvAuJNRjyOTTGHZe2c7;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.SecureClass0414;
import org.phobos.secure.group024.NTTknPqZuwPP6gSQ96Bavzbi67qRp11a;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group038.SecureClass0667;
import org.phobos.secure.group047.SecureClass0840;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group031.SecureClass0547;
import org.phobos.secure.group042.SecureClass0754;
import org.phobos.secure.group046.SecureClass0812;
import org.phobos.secure.group050.SecureClass0901;
import org.phobos.secure.group050.SecureInterface0126;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class AutoTrollModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Long>> tPM;
    public final /* synthetic */ MutableObject<SecureClass0901> field001;
    public final /* synthetic */ SecureClass0812 field002;
    public final /* synthetic */ SecureClass0603<Long> killedTimeout;
    public final /* synthetic */ List<String> field003;
    public final /* synthetic */ Map<String, Long> field004;
    public final /* synthetic */ SecureClass0603<Boolean> mentioned;
    public /* synthetic */ String field005;
    public final /* synthetic */ SecureClass0603<String> target;
    public /* synthetic */ boolean field006;
    public final /* synthetic */ SecureClass0603<Boolean> killed;

    public /* synthetic */ AutoTrollModule(SecureClass0242 htSf5L5A81XWESQuYZprOh17SZ9m7Zat) {
        super(htSf5L5A81XWESQuYZprOh17SZ9m7Zat, "AutoTroll", SecureClass1004.j4RfuOW3OWeYFllJ5KchqSyloIlQMUdK, "Trolls whoever you killed recently", new int[0]);
        this.target = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0667("Target", "Player").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Specific player"));
        this.tPM = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0547("TPM", SecureInterface0126.wMAZSEjvEoULCU29BTHtikjbktQ9hg7X(50L, 200L), 25L, 200L));
        this.killed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Killed").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Troll players you have killed"));
        this.killedTimeout = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0840("KilledTimeout", 5000L, 500L, 30000L));
        this.mentioned = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Mentioned"));
        this.field001 = new MutableObject();
        this.field004 = new HashMap<String, Long>();
        this.field006 = false;
        this.field002 = new SecureClass0812().QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("fat").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("what ur Bmi ugly fat", "fat boy").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("LOLLLL AINT U 500 POUNDS").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("projection")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("nn").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("noname").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("random").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("Im known af", "Who u").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("Lel who u?").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("u Nn").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("name 10 people who know u lel", "Ok name atleast 3 nn").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("name 3 people who know u", "lel u wish 1 person knew u", "nn").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("lol so ironic").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("u not famous like me").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("u mad im more known than u", "lol").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("never heard of u g")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("iq").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("intelligence quotient").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("im smart af", "and u dumb", "thats why im a business owner and u not").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("Im a genius millionaire", "u live in the slums g", "in the suburbs").cfr_renamed_362(xmRjPXXMkiCaT42tlm7xdLl7SYVFTUHM -> String.valueOf(SecureClass0754.cDJbBoFVXgY2kWyTD6VdjZRf8P0DN1i2(1000, Integer.MAX_VALUE)))).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("white").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("black").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("chink").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("aint u jewish", "fucking kike").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("coming from a kike btw", "lel jew 4 lyfe")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("poor").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("no money").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("b4b").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("bands").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("You aint even got 10 dollars to ur name").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("u poor g").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("ur house on my wrist btw").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("move 100k rn g", "Lel u cant move 100k").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("U prolly got no nfts")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("gg").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("good game").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("wp").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("nigga said gg", "LOL").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("Ye gg bro but u ass", "like below average ass").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("lel u mad")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("kys").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("lel u coping", "fat fuck").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("lel u mad").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("stay mad faggot").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("u getting heated")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("dox").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("swat").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("u harmless").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("try me nigga").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("run those 1s", "faggot").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("lel u opsecless").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("Ur binned nigga").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("watchout nigga im harmful", "id kill ur family").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("LOLL UR DOXXED TO THE BONES!!")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("bad bait").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("stop baiting").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("lel what bait", "im deadass").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("irony").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("holy cope").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("u soft")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("nigga").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("nga").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("nigger").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("Im white retard").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("LOLL u mad", "See how u losing ur mind over this LOLLL")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("ur bad").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("ur ass").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("ur horrible").cfr_renamed_362(GbzaLgr6vaKZbxQJpgG9yzzdT9a37t39 -> "Lol dont u carry %s totems".formatted(this.cfr_renamed_363((SecureClass0414)GbzaLgr6vaKZbxQJpgG9yzzdT9a37t39))).Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("Still better than u").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("Is that why u dying 2 me").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("ironic", "killed u w no armor a few days ago").cfr_renamed_362(Fl9Ub6zsr8tyLoCBdy7B97PdhsnQia23 -> "LOL %s-0".formatted(SecureClass0754.cDJbBoFVXgY2kWyTD6VdjZRf8P0DN1i2(20, 60)))).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("shut up").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("shut the fuck up").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("stfu").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("sybau").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("syfm").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("pipe down").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("shut up").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("Make me lil boy").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("U mad nigga", "LOOLLOLOL").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("why u angry", "im happy u angry").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("lel im living in ur head")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("not funny").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("unfunny").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("corny").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("cornball").TgPiZMNmK3hai7J2YIfsPj2kIqcaCtTs(k85HxOWjlZp5S2ke6yyU5f2Hfmz4iRZZ -> "Pretty ironic", mQs06LiWcbA0BkhmC91nBGH0igkznMQP -> "Aint ur name %s".formatted(mQs06LiWcbA0BkhmC91nBGH0igkznMQP.AVBM7Xvx6UiduIbtrATffqbH3Fqp4Lnf()), cPIQ5IDLEORSlfjx7FsbsmosHRRIj2Mo -> "U cant be typing with that name").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("u just retarded")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("main").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("main up").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("alias").TgPiZMNmK3hai7J2YIfsPj2kIqcaCtTs(o3VkBuQMGHT6zMDI61PkDY0irOC0qBmL -> "My main is %s".formatted(o3VkBuQMGHT6zMDI61PkDY0irOC0qBmL.AVBM7Xvx6UiduIbtrATffqbH3Fqp4Lnf())).cfr_renamed_362(j4sxdZiaBTsE9ASMTHtDWO2D5DeJJ8RJ -> "Im %s".formatted(AutoTrollModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724 == null ? "the king" : AutoTrollModule.P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.field_1724.method_5820()))).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("i win").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("No u didnt").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("in ur dreams buddy")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("u lost").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("u died").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("me?", "who u talking 2").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("No i didnt").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("nope", "lel no kills on me").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("source?").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("in ur dreams buddy", "keep dreaming")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("skid").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("Aint that u", "lel u a skid").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("who me?", "me?? who u talkin to")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("paste").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("u use a paste lel", "nigga thinks his shitware isnt oyvey").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("didnt u skid oyvey in 2021")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("newgen").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("newfag").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("U joined this year").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("joined b4 u").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("LOLLL")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("unc").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("ur old").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("u pushing 40 urself").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("let me guess ur age", "9", "Ok 8 maybe")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("prac").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("prac main").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("hop on 2b").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("dont u play 5b5t LOLLL").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("u play 6b g", "pack it up").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("u main 9b wrap it up")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("u logged").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("u logging").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("ez log").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("Lel i got kicked").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("kicked").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("LOL", "do something about it", "LOLOLOOL DO SOMETHING").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("Me: 1 U: 20", "U winning in logs g", "the only thing u winning in btw")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("i got kicked").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("got kicked").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("Sure").Ha6aKGeWK4xNw8pgafBgyLm8c3hMfSr8("yea keep lying").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("we all know thats not true", "LOL", "keep logging fatass nigga")).QJPqnABk1enXWOxlhuUEojqhTVMK9AZ1(new SecureClass0901().PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("autobait").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("autotroll").PKihsCkm8QHJ8LcsGUadFjuNhtSKSPOe("spammer").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("LOLLL U hs cant handle it", "fat retard", "u getting autobaited rn").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("i just know more words than u", "3rd world ass nigga", "u live in a shed").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("U GETTING BAITED BY SPAMMER LOL", "THATS SAD", "my spammer smarter than u lelmode").XJiib5lSIK9hqpOQmrQqAsaYYASovtrW("lelcopter u retarded?", "lel ur falling for the bait"));
        this.field005 = null;
        this.field003 = (List)class_156.method_654(new ArrayList<E>(), HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ -> {
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("LOL");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("LOLOOLOL");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("HUSH UP NIGGA");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("PIPE DOWN LOOOL");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("FAT FUCK");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("UR A BITCH LOL");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("LOLLL 10-0");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("LOOLLL 30-0");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("FRI3ND");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("FR13NDDD");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("LOLL");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("FRIENDD");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("HELLO");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("HELLO Fr13NDD");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("REFUND UR PASTE");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("LOL AINT U RATTED");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("LOL AINT U BINNED");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("Move 10k rn");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("Move 100k dog");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("lel");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("lel");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("lel");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("nigger");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("nigga");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("uninstall this game");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("dumb retard");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("dumb kike");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("fat retard");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("fat kike");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("ugly nigger");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("pedophile");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("kike");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("faggot");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("3rd worlder");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("yea keep talking retard");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("Still cant shut up");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("LOL SEE UR MAD");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("nigga u mad af");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("kys retard");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("kys nigga");
            HHLTxWdOHaUbo758KH4Un7Uel4L1fCVQ.add("kys nigger");
        });
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.killed, this.killedTimeout);
        this.cfr_renamed_69(new VWEFfclxT9tQqs5L0TLIog9P5CnH2hZN(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new NTTknPqZuwPP6gSQ96Bavzbi67qRp11a(this));
        this.cfr_renamed_69(new _5geIzNbB6CmTiXvAuJNRjyOTTGHZe2c7(this, htSf5L5A81XWESQuYZprOh17SZ9m7Zat));
        SecureClass0003.sJOlTeSDRzmurL2RNlES7yuuv5w6UlMP(this, () -> this.field001.setValue(null));
    }
}

