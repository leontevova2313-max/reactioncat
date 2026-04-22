/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group054;

import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.apache.commons.lang3.mutable.MutableInt;
import org.phobos.secure.group041.SecureClass0717;

public final class SecureClass0967 {
    public static /* bridge */ /* synthetic */ boolean cfr_renamed_986(class_1657 C7bIhqZonoiZ4ed7FCGwTAgjCsomISXy, class_638 BjTqDXSTIZaFheCvxgYBfXymm3ulj2Bi, class_238 smu0fAEdYWkIZUGNB7WR8khqfNwVxyFC, boolean bl) {
        class_243[] field001;
        class_243 field002 = C7bIhqZonoiZ4ed7FCGwTAgjCsomISXy.method_33571();
        if (!bl) {
            class_3965 class_39652 = BjTqDXSTIZaFheCvxgYBfXymm3ulj2Bi.method_17742(new class_3959(field002, smu0fAEdYWkIZUGNB7WR8khqfNwVxyFC.method_1005(), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)C7bIhqZonoiZ4ed7FCGwTAgjCsomISXy));
            return class_39652 == null || !class_39652.method_17783().equals((Object)class_239.class_240.field_1332);
        }
        class_243[] class_243Array = field001 = SecureClass0967.tgYPjirDaL6o4KLfP3QpzpkLGQCYgvnd(smu0fAEdYWkIZUGNB7WR8khqfNwVxyFC);
        int n = class_243Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_243 field003 = class_243Array[n2];
            class_3965 field004 = BjTqDXSTIZaFheCvxgYBfXymm3ulj2Bi.method_17742(new class_3959(field002, field003, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)C7bIhqZonoiZ4ed7FCGwTAgjCsomISXy));
            if (field004 != null && !field004.method_17783().equals((Object)class_239.class_240.field_1332)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ int cfr_renamed_987(class_746 Wn7hkUu4zLhcXP9BL0FvZjVTPzWAVPPs, class_638 w0ETyXRqM6xSWVrpj8FibthqEaIt7xnw, class_2338 v0ajr2tWJxJWgQDBNi2JhirHOC7C4IDs) {
        class_243 field005 = Wn7hkUu4zLhcXP9BL0FvZjVTPzWAVPPs.method_33571();
        class_243 field006 = v0ajr2tWJxJWgQDBNi2JhirHOC7C4IDs.method_46558();
        class_243[] field007 = new class_243[]{field006, field006.method_1031(0.5, 0.0, 0.0), field006.method_1031(-0.5, 0.0, 0.0), field006.method_1031(0.5, 0.0, 0.5), field006.method_1031(0.5, 0.0, -0.5), field006.method_1031(0.5, 0.5, 0.0), field006.method_1031(0.5, -0.5, 0.0)};
        AtomicInteger field008 = new AtomicInteger();
        MutableInt field009 = new MutableInt(Integer.MAX_VALUE);
        class_243[] class_243Array = field007;
        int n = class_243Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_243 class_2432 = class_243Array[n2];
            SecureClass0717.KZxDLf7TZbORGrkdPKONVqnEHEz7cJBo(field005, class_2432, (class_1297)Wn7hkUu4zLhcXP9BL0FvZjVTPzWAVPPs, (class_1937)w0ETyXRqM6xSWVrpj8FibthqEaIt7xnw, SQvh7m38b1zAtvm7xabnSPsPM2aTZ1EW -> {
                if (SQvh7m38b1zAtvm7xabnSPsPM2aTZ1EW == null) {
                    return null;
                }
                class_2338 class_23382 = SQvh7m38b1zAtvm7xabnSPsPM2aTZ1EW.method_17777();
                if (!w0ETyXRqM6xSWVrpj8FibthqEaIt7xnw.method_8320(class_23382).method_45474()) {
                    field008.incrementAndGet();
                }
                return SQvh7m38b1zAtvm7xabnSPsPM2aTZ1EW.method_17777().equals((Object)v0ajr2tWJxJWgQDBNi2JhirHOC7C4IDs) ? SQvh7m38b1zAtvm7xabnSPsPM2aTZ1EW : null;
            });
            field009.setValue(Math.min(field009.getValue(), field008.get()));
            field008.set(0);
            ++n2;
        }
        return field009.getValue();
    }

    public static /* bridge */ /* synthetic */ boolean WYLvo1ZSMGwTeg8LNN7MHiFiwBXSgmdY(class_746 nKo934RVJs5gxWGDFq6J5K3rNQ0OlosR, class_638 vr5S9CNT1Lc9LlxBAwKCL5caZqqC0Qpn, class_2338 EMgNZDQ4TiGb0KMIHAanxbbTU1M9hWaH, int jEgYMGU9Qf9ZTgzER37YYs2WO5e8ilEI) {
        class_243 field010 = nKo934RVJs5gxWGDFq6J5K3rNQ0OlosR.method_33571();
        class_243 field011 = EMgNZDQ4TiGb0KMIHAanxbbTU1M9hWaH.method_46558();
        if (jEgYMGU9Qf9ZTgzER37YYs2WO5e8ilEI == -1) {
            class_3965 field012 = vr5S9CNT1Lc9LlxBAwKCL5caZqqC0Qpn.method_17742(new class_3959(field010, field011, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)nKo934RVJs5gxWGDFq6J5K3rNQ0OlosR));
            return field012 != null && field012.method_17777().equals((Object)EMgNZDQ4TiGb0KMIHAanxbbTU1M9hWaH);
        }
        return SecureClass0967.cfr_renamed_987(nKo934RVJs5gxWGDFq6J5K3rNQ0OlosR, vr5S9CNT1Lc9LlxBAwKCL5caZqqC0Qpn, EMgNZDQ4TiGb0KMIHAanxbbTU1M9hWaH) <= jEgYMGU9Qf9ZTgzER37YYs2WO5e8ilEI;
    }

    public static /* bridge */ /* synthetic */ boolean DwYtnRLj8JCqeYgfD9v3mTwAXRPFoPuv(class_1657 lty6iy1ioye46EMe3yc8x2GMR23JRrBQ, class_638 DIiZBAEvzHYDvP4ptf83hW9HQpcyw9u8, class_1297 ORfHuo070UirGq9tU5AJs1uWz7Op4ZSW, boolean GpjbjZFyYgkv9CjaWW5OGORjoUjSnmbG) {
        class_243[] field013;
        class_238 field014 = ORfHuo070UirGq9tU5AJs1uWz7Op4ZSW.method_5829();
        class_243 field015 = lty6iy1ioye46EMe3yc8x2GMR23JRrBQ.method_33571();
        if (!GpjbjZFyYgkv9CjaWW5OGORjoUjSnmbG) {
            class_243 field016 = field014.method_1005();
            class_3965 field017 = DIiZBAEvzHYDvP4ptf83hW9HQpcyw9u8.method_17742(new class_3959(field015, field016, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)lty6iy1ioye46EMe3yc8x2GMR23JRrBQ));
            return field017 == null || !field017.method_17783().equals((Object)class_239.class_240.field_1332) || field017.method_17784() == null;
        }
        class_243[] class_243Array = field013 = SecureClass0967.tgYPjirDaL6o4KLfP3QpzpkLGQCYgvnd(field014);
        int n = class_243Array.length;
        int n2 = 0;
        while (n2 < n) {
            class_243 field018 = class_243Array[n2];
            class_3965 field019 = DIiZBAEvzHYDvP4ptf83hW9HQpcyw9u8.method_17742(new class_3959(field015, field018, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, (class_1297)lty6iy1ioye46EMe3yc8x2GMR23JRrBQ));
            if (field019 == null || !field019.method_17783().equals((Object)class_239.class_240.field_1332) || field019.method_17784() == null) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    public static /* bridge */ /* synthetic */ class_243[] tgYPjirDaL6o4KLfP3QpzpkLGQCYgvnd(class_238 QgBw7zacjW22BuHSx78UZ8fgMUJMoKlE) {
        class_243 field020 = new class_243(QgBw7zacjW22BuHSx78UZ8fgMUJMoKlE.field_1323, QgBw7zacjW22BuHSx78UZ8fgMUJMoKlE.field_1322, QgBw7zacjW22BuHSx78UZ8fgMUJMoKlE.field_1321);
        class_243 field021 = new class_243(QgBw7zacjW22BuHSx78UZ8fgMUJMoKlE.field_1320, QgBw7zacjW22BuHSx78UZ8fgMUJMoKlE.field_1325, QgBw7zacjW22BuHSx78UZ8fgMUJMoKlE.field_1324);
        return new class_243[]{field020, new class_243(field021.field_1352, field020.field_1351, field020.field_1350), new class_243(field020.field_1352, field020.field_1351, field021.field_1350), new class_243(field021.field_1352, field020.field_1351, field021.field_1350), new class_243(field020.field_1352, field021.field_1351, field020.field_1350), new class_243(field021.field_1352, field021.field_1351, field020.field_1350), new class_243(field020.field_1352, field021.field_1351, field021.field_1350), new class_243(field021.field_1352, field021.field_1351, field021.field_1350), QgBw7zacjW22BuHSx78UZ8fgMUJMoKlE.method_1005()};
    }

    public /* synthetic */ SecureClass0967() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static /* bridge */ /* synthetic */ int EENOXdT1xakk4XfmYmxreuGyRncnokCZ(class_746 CodbpHMWPCUT0M93ZNboYO4X8RlCKTsR, class_638 class_6382, class_2338 class_23382, class_243 smwpz1uRAhJyy7cRhI84r83CC6IK8GfQ) {
        class_243 class_2432 = CodbpHMWPCUT0M93ZNboYO4X8RlCKTsR.method_33571();
        AtomicInteger atomicInteger = new AtomicInteger();
        SecureClass0717.KZxDLf7TZbORGrkdPKONVqnEHEz7cJBo(class_2432, smwpz1uRAhJyy7cRhI84r83CC6IK8GfQ, (class_1297)CodbpHMWPCUT0M93ZNboYO4X8RlCKTsR, (class_1937)class_6382, v4cVoPfXYvCMg40OaZCOL63LO6qOmuQv -> {
            if (v4cVoPfXYvCMg40OaZCOL63LO6qOmuQv == null) {
                return null;
            }
            class_2338 field022 = v4cVoPfXYvCMg40OaZCOL63LO6qOmuQv.method_17777();
            if (!class_6382.method_8320(field022).method_45474()) {
                atomicInteger.incrementAndGet();
            }
            return v4cVoPfXYvCMg40OaZCOL63LO6qOmuQv.method_17777().equals((Object)class_23382) ? v4cVoPfXYvCMg40OaZCOL63LO6qOmuQv : null;
        });
        return atomicInteger.get();
    }

    public static /* bridge */ /* synthetic */ boolean KdobfFzupZ40MkpF3DOJHBe7PQi7qM9x(class_746 UiqvXfCIWXtiYAgCPoihhKU06EpaoGpJ, class_638 m0NZ2VfnFL1lDU7ByOIZRcbqlBpdYLJk, class_2338 class_23382, float[] XU1EaEBUX798FZDxXEpZZVoAYedov4dy, double Hzd3g0LdpwcpkwQw9BhQbuqfhr4Ns3tC) {
        class_243 field023 = UiqvXfCIWXtiYAgCPoihhKU06EpaoGpJ.method_33571();
        class_243 field024 = SecureClass0717.e0j2zMN79Jr3fjBgykXc9pkR0jDMRO46(XU1EaEBUX798FZDxXEpZZVoAYedov4dy[0], XU1EaEBUX798FZDxXEpZZVoAYedov4dy[1]);
        class_243 field025 = field023.method_1031(field024.field_1352 * Hzd3g0LdpwcpkwQw9BhQbuqfhr4Ns3tC, field024.field_1351 * Hzd3g0LdpwcpkwQw9BhQbuqfhr4Ns3tC, field024.field_1350 * Hzd3g0LdpwcpkwQw9BhQbuqfhr4Ns3tC);
        class_3965 field026 = m0NZ2VfnFL1lDU7ByOIZRcbqlBpdYLJk.method_17742(new class_3959(field023, field025, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)UiqvXfCIWXtiYAgCPoihhKU06EpaoGpJ));
        return field026 != null && field026.method_17777().equals((Object)class_23382);
    }
}

