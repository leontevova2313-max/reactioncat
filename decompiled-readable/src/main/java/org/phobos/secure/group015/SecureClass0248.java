/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group015;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import org.phobos.secure.group048.SecureInterface0119;

public final class SecureClass0248
implements SecureInterface0119 {
    public static /* bridge */ /* synthetic */ void nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(ByteBuf CJFWMZ0DLa8I1w7suRL4pHTCLMdthXmZ, String AEFB2hFGf5NjZDyGA43syF4ZZpZjKmbA) {
        byte[] field001 = AEFB2hFGf5NjZDyGA43syF4ZZpZjKmbA.getBytes(StandardCharsets.UTF_8);
        CJFWMZ0DLa8I1w7suRL4pHTCLMdthXmZ.writeInt(field001.length);
        CJFWMZ0DLa8I1w7suRL4pHTCLMdthXmZ.writeBytes(field001);
    }

    public static /* bridge */ /* synthetic */ void ip4FsCkQNQlglyUoeSNfGw2CNfHJo8lU(ByteBuf byteBuf, String[] rFxSSmnPVcNiMhb21oM2GVAOQM5NMu2b) {
        byteBuf.writeInt(rFxSSmnPVcNiMhb21oM2GVAOQM5NMu2b.length);
        String[] stringArray = rFxSSmnPVcNiMhb21oM2GVAOQM5NMu2b;
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            String string = stringArray[n2];
            SecureClass0248.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(byteBuf, string);
            ++n2;
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void ZF03hI9Nume8k3A2cUNAeFDNeRJHtFUt(ByteBuf qqzSTD1ghLVgrSOCKuSq5n9ekiq77MvZ, Instant f8dyPoPM6ho1WnvvEHxo1Dex27EfK6AW) {
        qqzSTD1ghLVgrSOCKuSq5n9ekiq77MvZ.writeLong(f8dyPoPM6ho1WnvvEHxo1Dex27EfK6AW.toEpochMilli());
    }

    public static /* bridge */ /* synthetic */ Instant cfr_renamed_325(ByteBuf J40pHZipr2nEopNt6MQtAIgYk2ahvUYY) {
        return Instant.ofEpochMilli(J40pHZipr2nEopNt6MQtAIgYk2ahvUYY.readLong());
    }

    public static /* bridge */ /* synthetic */ <T> void oek5venhKPwEq329GGycVejibxtCtbPB(ByteBuf ubeMRKzVlJmkakzlXpe4FFKiFpglCkPj, T si5s5SnC6eOZ1wvKyGOwlIdMCxl3ulg7, Function<T, String> D6B0px87HBPFC6ForPfad78O1BmqynFL) {
        SecureClass0248.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(ubeMRKzVlJmkakzlXpe4FFKiFpglCkPj, D6B0px87HBPFC6ForPfad78O1BmqynFL.apply(si5s5SnC6eOZ1wvKyGOwlIdMCxl3ulg7));
    }

    public static /* bridge */ /* synthetic */ JsonElement cfr_renamed_326(ByteBuf qxHqYo0bGYuWtgFvNqmkaUl5WA5wCYln) {
        return JsonParser.parseString((String)SecureClass0248.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(qxHqYo0bGYuWtgFvNqmkaUl5WA5wCYln));
    }

    public /* synthetic */ SecureClass0248() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ byte[] RrXUcQekE1kKh53cNpdBkEMn4VY8dMtE(ByteBuf Aoxr6mlQQonV13k162Uf1aktsn9xuP3T) {
        byte[] field002 = new byte[Aoxr6mlQQonV13k162Uf1aktsn9xuP3T.readInt()];
        Aoxr6mlQQonV13k162Uf1aktsn9xuP3T.readBytes(field002);
        return field002;
    }

    public static /* bridge */ /* synthetic */ String zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(ByteBuf byteBuf) {
        int field003 = byteBuf.readInt();
        byte[] field004 = new byte[field003];
        byteBuf.readBytes(field004);
        return new String(field004, StandardCharsets.UTF_8);
    }

    public static /* bridge */ /* synthetic */ String sucMmqB4UaC2hdTrgLnBHOEzgWMaDTr5(ByteBuf xyts3KlKx3WfmYYSINTE73eDeDTjM8pQ) {
        boolean field005 = xyts3KlKx3WfmYYSINTE73eDeDTjM8pQ.readBoolean();
        if (!field005) {
            return null;
        }
        return SecureClass0248.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(xyts3KlKx3WfmYYSINTE73eDeDTjM8pQ);
    }

    public static /* bridge */ /* synthetic */ <K, V> Map<K, V> IAN7SWV2POaXOwzdjBPrZtM42Ea3baxN(ByteBuf mN3kWoHcUuccogOIZhlq7jkxidN0pEwq, Function<String, K> tnI3mnMYysYLkfugUCHRVJZoejq8ywrC, Function<String, V> HhWTb7PCKnXCaioIAjl9nt444kbJMNNt) {
        int field006 = mN3kWoHcUuccogOIZhlq7jkxidN0pEwq.readInt();
        HashMap<K, V> field007 = new HashMap<K, V>();
        if (field006 == 0) {
            return field007;
        }
        int field008 = 0;
        while (field008 < field006) {
            field007.put(tnI3mnMYysYLkfugUCHRVJZoejq8ywrC.apply(SecureClass0248.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(mN3kWoHcUuccogOIZhlq7jkxidN0pEwq)), HhWTb7PCKnXCaioIAjl9nt444kbJMNNt.apply(SecureClass0248.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(mN3kWoHcUuccogOIZhlq7jkxidN0pEwq)));
            ++field008;
        }
        return field007;
    }

    public static /* bridge */ /* synthetic */ String[] cfr_renamed_327(ByteBuf EfdS8zUdioN9Jd3CpwSfhnsEayGuKpLX) {
        int field009 = EfdS8zUdioN9Jd3CpwSfhnsEayGuKpLX.readInt();
        String[] field010 = new String[field009];
        if (field009 == 0) {
            return field010;
        }
        int field011 = 0;
        while (field011 < field009) {
            field010[field011] = SecureClass0248.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(EfdS8zUdioN9Jd3CpwSfhnsEayGuKpLX);
            ++field011;
        }
        return field010;
    }

    public static /* bridge */ /* synthetic */ <K, V> void vMbTRIyFGFHmU2AYzDmsWYfaQs1g553U(ByteBuf fyApwyywjBpowDTWtiXSjF1cdiR3G9CL, Map<K, V> mOApaDUUFspSZZEGjnAYYpz4ZTVuwhr4, Function<K, String> CIKU3hiu33JoumpfJprDX718hZOUDlgv, Function<V, String> rxGadS52FuI99S4L7B6Dc0ylEfpphdLk) {
        fyApwyywjBpowDTWtiXSjF1cdiR3G9CL.writeInt(mOApaDUUFspSZZEGjnAYYpz4ZTVuwhr4.size());
        Iterator<Map.Entry<K, V>> iterator = mOApaDUUFspSZZEGjnAYYpz4ZTVuwhr4.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> field012 = iterator.next();
            SecureClass0248.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(fyApwyywjBpowDTWtiXSjF1cdiR3G9CL, CIKU3hiu33JoumpfJprDX718hZOUDlgv.apply(field012.getKey()));
            SecureClass0248.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(fyApwyywjBpowDTWtiXSjF1cdiR3G9CL, rxGadS52FuI99S4L7B6Dc0ylEfpphdLk.apply(field012.getValue()));
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void EPaXBN7n7QrOpkdR2O5DAjCF34sLeP2l(ByteBuf byteBuf, JsonElement gUQFBQqYxkMEKWP4WjPcqukTVwRku6g5) {
        SecureClass0248.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(byteBuf, cfr_renamed_328.toJson(gUQFBQqYxkMEKWP4WjPcqukTVwRku6g5));
    }

    public static /* bridge */ /* synthetic */ UUID znJaw4VM9O6t8dusRBfjjCigrHLDoNMe(ByteBuf jz5PxuMurIbUapXXuZnNj2gtrlP8BIse) {
        return new UUID(jz5PxuMurIbUapXXuZnNj2gtrlP8BIse.readLong(), jz5PxuMurIbUapXXuZnNj2gtrlP8BIse.readLong());
    }

    public static /* bridge */ /* synthetic */ <T> List<T> mB5D3f2I34DfIjUXMmsywcZUV6ejOQmQ(ByteBuf RdAWZVoFuqAynWSUQMP2hDup1OA9EPSH, Function<String, T> JVzizQwkdKuLBOehKqnf6NJbK4gNzg7x) {
        int field013 = RdAWZVoFuqAynWSUQMP2hDup1OA9EPSH.readInt();
        ArrayList<T> field014 = new ArrayList<T>(field013);
        if (field013 == 0) {
            return field014;
        }
        int field015 = 0;
        while (field015 < field013) {
            field014.add(JVzizQwkdKuLBOehKqnf6NJbK4gNzg7x.apply(SecureClass0248.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(RdAWZVoFuqAynWSUQMP2hDup1OA9EPSH)));
            ++field015;
        }
        return field014;
    }

    public static /* bridge */ /* synthetic */ void eBJosR27HtdptwaeruUIo2c087VHh5mX(ByteBuf d8MDa2tdh1VCxYX01oqUrJu20c4PzPFR, byte[] Ok896NZveApGkQ08PKrOhRc2VkCTB7rv) {
        d8MDa2tdh1VCxYX01oqUrJu20c4PzPFR.writeInt(Ok896NZveApGkQ08PKrOhRc2VkCTB7rv.length);
        d8MDa2tdh1VCxYX01oqUrJu20c4PzPFR.writeBytes(Ok896NZveApGkQ08PKrOhRc2VkCTB7rv);
    }

    public static /* bridge */ /* synthetic */ void Ug6pvvORwrpo9QcgtYL6u1NWVaGPOJYc(ByteBuf HrFC8TPWL4A2fFQ77Dtw98LPvmN4cafO, String AoWYA4zmyF2UaVRMXbIb2zwgwhifhWKX) {
        if (AoWYA4zmyF2UaVRMXbIb2zwgwhifhWKX == null) {
            HrFC8TPWL4A2fFQ77Dtw98LPvmN4cafO.writeBoolean(false);
            return;
        }
        HrFC8TPWL4A2fFQ77Dtw98LPvmN4cafO.writeBoolean(true);
        SecureClass0248.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(HrFC8TPWL4A2fFQ77Dtw98LPvmN4cafO, AoWYA4zmyF2UaVRMXbIb2zwgwhifhWKX);
    }

    public static /* bridge */ /* synthetic */ <T> void M0fYRXwLQY0f6B3UOPd9NQqjUPRvNeCn(ByteBuf Urm64xfz8G1ShgmeaoeM2Z50osAqCwgM, List<T> list, Function<T, String> eHFEG1NIWdNQG8odPjOqYPqibWPWbOOm) {
        Urm64xfz8G1ShgmeaoeM2Z50osAqCwgM.writeInt(list.size());
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T field016 = iterator.next();
            SecureClass0248.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(Urm64xfz8G1ShgmeaoeM2Z50osAqCwgM, eHFEG1NIWdNQG8odPjOqYPqibWPWbOOm.apply(field016));
        }
        return;
    }

    public static /* bridge */ /* synthetic */ <T> T hjtzg8TnwoThuglrPFtOlAKHYG5091Ol(ByteBuf YaDNP6GYS1cMxI5vIzk3sf3U1kvNQQWV, Function<String, T> tYbNaJ8Yuh1G8PUHLNrDtBnOuJMPu5zH) {
        return tYbNaJ8Yuh1G8PUHLNrDtBnOuJMPu5zH.apply(SecureClass0248.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(YaDNP6GYS1cMxI5vIzk3sf3U1kvNQQWV));
    }

    public static /* bridge */ /* synthetic */ void A4Z8GPA4WAV6XPtlCv7MT2vUf9iOftPE(ByteBuf PUeR1UsQxcTK0G1XJPJYZzT4teXJ6dr5, UUID rfZY2uJQTwZj87CcTF4TlzcFwpEeS84S) {
        PUeR1UsQxcTK0G1XJPJYZzT4teXJ6dr5.writeLong(rfZY2uJQTwZj87CcTF4TlzcFwpEeS84S.getMostSignificantBits());
        PUeR1UsQxcTK0G1XJPJYZzT4teXJ6dr5.writeLong(rfZY2uJQTwZj87CcTF4TlzcFwpEeS84S.getLeastSignificantBits());
    }
}

