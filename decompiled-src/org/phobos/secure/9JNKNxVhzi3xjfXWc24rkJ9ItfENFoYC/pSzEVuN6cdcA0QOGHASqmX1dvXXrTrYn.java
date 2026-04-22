/*
 * Decompiled with CFR.
 */
package org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC;

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
import org.phobos.secure.R891IQaB1q1R6FZkTp79IwNZk8RxLxVJ._3s17mXE4mMQKcvCyJ7p8i0NtKbEgITHX;

public final class pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn
implements _3s17mXE4mMQKcvCyJ7p8i0NtKbEgITHX {
    public static /* bridge */ /* synthetic */ void nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(ByteBuf CJFWMZ0DLa8I1w7suRL4pHTCLMdthXmZ, String AEFB2hFGf5NjZDyGA43syF4ZZpZjKmbA) {
        byte[] haNuzmEgdxmPzuG0xskyKMYGQLQUXtGJ = AEFB2hFGf5NjZDyGA43syF4ZZpZjKmbA.getBytes(StandardCharsets.UTF_8);
        CJFWMZ0DLa8I1w7suRL4pHTCLMdthXmZ.writeInt(haNuzmEgdxmPzuG0xskyKMYGQLQUXtGJ.length);
        CJFWMZ0DLa8I1w7suRL4pHTCLMdthXmZ.writeBytes(haNuzmEgdxmPzuG0xskyKMYGQLQUXtGJ);
    }

    public static /* bridge */ /* synthetic */ void ip4FsCkQNQlglyUoeSNfGw2CNfHJo8lU(ByteBuf byteBuf, String[] rFxSSmnPVcNiMhb21oM2GVAOQM5NMu2b) {
        byteBuf.writeInt(rFxSSmnPVcNiMhb21oM2GVAOQM5NMu2b.length);
        String[] stringArray = rFxSSmnPVcNiMhb21oM2GVAOQM5NMu2b;
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            String string = stringArray[n2];
            pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(byteBuf, string);
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
        pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(ubeMRKzVlJmkakzlXpe4FFKiFpglCkPj, D6B0px87HBPFC6ForPfad78O1BmqynFL.apply(si5s5SnC6eOZ1wvKyGOwlIdMCxl3ulg7));
    }

    public static /* bridge */ /* synthetic */ JsonElement cfr_renamed_326(ByteBuf qxHqYo0bGYuWtgFvNqmkaUl5WA5wCYln) {
        return JsonParser.parseString((String)pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(qxHqYo0bGYuWtgFvNqmkaUl5WA5wCYln));
    }

    public /* synthetic */ pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ byte[] RrXUcQekE1kKh53cNpdBkEMn4VY8dMtE(ByteBuf Aoxr6mlQQonV13k162Uf1aktsn9xuP3T) {
        byte[] jdmPzNpObb64Nt1vfLi0mKj2IwBzjrzG = new byte[Aoxr6mlQQonV13k162Uf1aktsn9xuP3T.readInt()];
        Aoxr6mlQQonV13k162Uf1aktsn9xuP3T.readBytes(jdmPzNpObb64Nt1vfLi0mKj2IwBzjrzG);
        return jdmPzNpObb64Nt1vfLi0mKj2IwBzjrzG;
    }

    public static /* bridge */ /* synthetic */ String zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(ByteBuf byteBuf) {
        int XTntFei8uhKM80Bgg8SFA46JjquhAfDQ = byteBuf.readInt();
        byte[] kBX2HoCEyuAKOFupYDkGNDFeeDa80WAW = new byte[XTntFei8uhKM80Bgg8SFA46JjquhAfDQ];
        byteBuf.readBytes(kBX2HoCEyuAKOFupYDkGNDFeeDa80WAW);
        return new String(kBX2HoCEyuAKOFupYDkGNDFeeDa80WAW, StandardCharsets.UTF_8);
    }

    public static /* bridge */ /* synthetic */ String sucMmqB4UaC2hdTrgLnBHOEzgWMaDTr5(ByteBuf xyts3KlKx3WfmYYSINTE73eDeDTjM8pQ) {
        boolean FJkbThtt14MyzCSyQ2BPAoa5EFGANIlP = xyts3KlKx3WfmYYSINTE73eDeDTjM8pQ.readBoolean();
        if (!FJkbThtt14MyzCSyQ2BPAoa5EFGANIlP) {
            return null;
        }
        return pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(xyts3KlKx3WfmYYSINTE73eDeDTjM8pQ);
    }

    public static /* bridge */ /* synthetic */ <K, V> Map<K, V> IAN7SWV2POaXOwzdjBPrZtM42Ea3baxN(ByteBuf mN3kWoHcUuccogOIZhlq7jkxidN0pEwq, Function<String, K> tnI3mnMYysYLkfugUCHRVJZoejq8ywrC, Function<String, V> HhWTb7PCKnXCaioIAjl9nt444kbJMNNt) {
        int DSd6ggtDTKMnYEcxhkwC23xZzPFMhiVQ = mN3kWoHcUuccogOIZhlq7jkxidN0pEwq.readInt();
        HashMap<K, V> XArEt6GKMJSY5FwhAfKKFzf1caNPm71h = new HashMap<K, V>();
        if (DSd6ggtDTKMnYEcxhkwC23xZzPFMhiVQ == 0) {
            return XArEt6GKMJSY5FwhAfKKFzf1caNPm71h;
        }
        int i2D5kiSDHCnx7HDFoSyqx5gu8Aa7xxKc = 0;
        while (i2D5kiSDHCnx7HDFoSyqx5gu8Aa7xxKc < DSd6ggtDTKMnYEcxhkwC23xZzPFMhiVQ) {
            XArEt6GKMJSY5FwhAfKKFzf1caNPm71h.put(tnI3mnMYysYLkfugUCHRVJZoejq8ywrC.apply(pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(mN3kWoHcUuccogOIZhlq7jkxidN0pEwq)), HhWTb7PCKnXCaioIAjl9nt444kbJMNNt.apply(pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(mN3kWoHcUuccogOIZhlq7jkxidN0pEwq)));
            ++i2D5kiSDHCnx7HDFoSyqx5gu8Aa7xxKc;
        }
        return XArEt6GKMJSY5FwhAfKKFzf1caNPm71h;
    }

    public static /* bridge */ /* synthetic */ String[] cfr_renamed_327(ByteBuf EfdS8zUdioN9Jd3CpwSfhnsEayGuKpLX) {
        int pW4tsTxfjqt2QTwxKqvaPy5UUQzUO9HO = EfdS8zUdioN9Jd3CpwSfhnsEayGuKpLX.readInt();
        String[] F1hYONBO1jnhg6sl01IYPVxgsKUfRf5l = new String[pW4tsTxfjqt2QTwxKqvaPy5UUQzUO9HO];
        if (pW4tsTxfjqt2QTwxKqvaPy5UUQzUO9HO == 0) {
            return F1hYONBO1jnhg6sl01IYPVxgsKUfRf5l;
        }
        int UwRBG8P6WzjhomtQsPfOQusuGTcOqbEQ = 0;
        while (UwRBG8P6WzjhomtQsPfOQusuGTcOqbEQ < pW4tsTxfjqt2QTwxKqvaPy5UUQzUO9HO) {
            F1hYONBO1jnhg6sl01IYPVxgsKUfRf5l[UwRBG8P6WzjhomtQsPfOQusuGTcOqbEQ] = pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(EfdS8zUdioN9Jd3CpwSfhnsEayGuKpLX);
            ++UwRBG8P6WzjhomtQsPfOQusuGTcOqbEQ;
        }
        return F1hYONBO1jnhg6sl01IYPVxgsKUfRf5l;
    }

    public static /* bridge */ /* synthetic */ <K, V> void vMbTRIyFGFHmU2AYzDmsWYfaQs1g553U(ByteBuf fyApwyywjBpowDTWtiXSjF1cdiR3G9CL, Map<K, V> mOApaDUUFspSZZEGjnAYYpz4ZTVuwhr4, Function<K, String> CIKU3hiu33JoumpfJprDX718hZOUDlgv, Function<V, String> rxGadS52FuI99S4L7B6Dc0ylEfpphdLk) {
        fyApwyywjBpowDTWtiXSjF1cdiR3G9CL.writeInt(mOApaDUUFspSZZEGjnAYYpz4ZTVuwhr4.size());
        Iterator<Map.Entry<K, V>> iterator = mOApaDUUFspSZZEGjnAYYpz4ZTVuwhr4.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> lal8spzRkyb7B7tE4pEvN64o3ZgEIHWl = iterator.next();
            pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(fyApwyywjBpowDTWtiXSjF1cdiR3G9CL, CIKU3hiu33JoumpfJprDX718hZOUDlgv.apply(lal8spzRkyb7B7tE4pEvN64o3ZgEIHWl.getKey()));
            pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(fyApwyywjBpowDTWtiXSjF1cdiR3G9CL, rxGadS52FuI99S4L7B6Dc0ylEfpphdLk.apply(lal8spzRkyb7B7tE4pEvN64o3ZgEIHWl.getValue()));
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void EPaXBN7n7QrOpkdR2O5DAjCF34sLeP2l(ByteBuf byteBuf, JsonElement gUQFBQqYxkMEKWP4WjPcqukTVwRku6g5) {
        pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(byteBuf, cfr_renamed_328.toJson(gUQFBQqYxkMEKWP4WjPcqukTVwRku6g5));
    }

    public static /* bridge */ /* synthetic */ UUID znJaw4VM9O6t8dusRBfjjCigrHLDoNMe(ByteBuf jz5PxuMurIbUapXXuZnNj2gtrlP8BIse) {
        return new UUID(jz5PxuMurIbUapXXuZnNj2gtrlP8BIse.readLong(), jz5PxuMurIbUapXXuZnNj2gtrlP8BIse.readLong());
    }

    public static /* bridge */ /* synthetic */ <T> List<T> mB5D3f2I34DfIjUXMmsywcZUV6ejOQmQ(ByteBuf RdAWZVoFuqAynWSUQMP2hDup1OA9EPSH, Function<String, T> JVzizQwkdKuLBOehKqnf6NJbK4gNzg7x) {
        int WOWNIpivSShOa83HhcXQFHt1TTF6pegl = RdAWZVoFuqAynWSUQMP2hDup1OA9EPSH.readInt();
        ArrayList<T> OwY2vQipBGNiGCKWyhnT7KLFoWc78dPy = new ArrayList<T>(WOWNIpivSShOa83HhcXQFHt1TTF6pegl);
        if (WOWNIpivSShOa83HhcXQFHt1TTF6pegl == 0) {
            return OwY2vQipBGNiGCKWyhnT7KLFoWc78dPy;
        }
        int GfCqMgjkP8bt5K2mver7NNWZQJr1J0wp = 0;
        while (GfCqMgjkP8bt5K2mver7NNWZQJr1J0wp < WOWNIpivSShOa83HhcXQFHt1TTF6pegl) {
            OwY2vQipBGNiGCKWyhnT7KLFoWc78dPy.add(JVzizQwkdKuLBOehKqnf6NJbK4gNzg7x.apply(pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(RdAWZVoFuqAynWSUQMP2hDup1OA9EPSH)));
            ++GfCqMgjkP8bt5K2mver7NNWZQJr1J0wp;
        }
        return OwY2vQipBGNiGCKWyhnT7KLFoWc78dPy;
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
        pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(HrFC8TPWL4A2fFQ77Dtw98LPvmN4cafO, AoWYA4zmyF2UaVRMXbIb2zwgwhifhWKX);
    }

    public static /* bridge */ /* synthetic */ <T> void M0fYRXwLQY0f6B3UOPd9NQqjUPRvNeCn(ByteBuf Urm64xfz8G1ShgmeaoeM2Z50osAqCwgM, List<T> list, Function<T, String> eHFEG1NIWdNQG8odPjOqYPqibWPWbOOm) {
        Urm64xfz8G1ShgmeaoeM2Z50osAqCwgM.writeInt(list.size());
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            T K06Rf7PEa9hCqC4Di1tdGDQhzqp3POKr = iterator.next();
            pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.nsRIpyNAuMvIcVO8vHRmWXFhQfk5lA4l(Urm64xfz8G1ShgmeaoeM2Z50osAqCwgM, eHFEG1NIWdNQG8odPjOqYPqibWPWbOOm.apply(K06Rf7PEa9hCqC4Di1tdGDQhzqp3POKr));
        }
        return;
    }

    public static /* bridge */ /* synthetic */ <T> T hjtzg8TnwoThuglrPFtOlAKHYG5091Ol(ByteBuf YaDNP6GYS1cMxI5vIzk3sf3U1kvNQQWV, Function<String, T> tYbNaJ8Yuh1G8PUHLNrDtBnOuJMPu5zH) {
        return tYbNaJ8Yuh1G8PUHLNrDtBnOuJMPu5zH.apply(pSzEVuN6cdcA0QOGHASqmX1dvXXrTrYn.zruHGGWZIPRFPfhtC7ZNFwFqX9JcQV4Q(YaDNP6GYS1cMxI5vIzk3sf3U1kvNQQWV));
    }

    public static /* bridge */ /* synthetic */ void A4Z8GPA4WAV6XPtlCv7MT2vUf9iOftPE(ByteBuf PUeR1UsQxcTK0G1XJPJYZzT4teXJ6dr5, UUID rfZY2uJQTwZj87CcTF4TlzcFwpEeS84S) {
        PUeR1UsQxcTK0G1XJPJYZzT4teXJ6dr5.writeLong(rfZY2uJQTwZj87CcTF4TlzcFwpEeS84S.getMostSignificantBits());
        PUeR1UsQxcTK0G1XJPJYZzT4teXJ6dr5.writeLong(rfZY2uJQTwZj87CcTF4TlzcFwpEeS84S.getLeastSignificantBits());
    }
}

