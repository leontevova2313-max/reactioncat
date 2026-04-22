/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group017;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;
import org.phobos.secure.group035.SecureClass0617;
import org.phobos.secure.group038.SecureClass0665;
import org.phobos.secure.group030.SecureClass0536;
import org.phobos.secure.group040.SecureClass0707;

public class SecureClass0272 {
    public static final /* synthetic */ List<SecureClass0707> field001;
    public static final /* synthetic */ Map<UUID, Optional<SecureClass0536>> field002;
    public static final /* synthetic */ AtomicBoolean field003;

    public static /* bridge */ /* synthetic */ CompletableFuture<SecureClass0536> N2uXwVjqv6PgigeYpMrr1NKPh7rnSjmX(String string) {
        return SecureClass0536.S6BDRA0uZLUR80nhDBDMSGZ71k5bCpVI(SecureClass0617.QM8W44tLapgDwpkPThCix4VKjEyUHs20(), string).thenApply(field004 -> {
            UUID uUID = SecureClass0272.RJUmLFskQEO02FV3na49qzlS3mx3kXgR(field004.cfr_renamed_329());
            field002.put(uUID, Optional.of(field004));
            return field004;
        });
    }

    public static /* bridge */ /* synthetic */ SecureClass0707 cfr_renamed_330(SecureClass0707 uab2J7qPTpom35gPalNDojQxjdIcN0NW2) {
        return field001.get((field001.indexOf(uab2J7qPTpom35gPalNDojQxjdIcN0NW2) + 1) % field001.size());
    }

    public static /* bridge */ /* synthetic */ Optional<SecureClass0536> IUCryiWVsdc6NGVR054Tdp4eL6Q189vr(UUID h55UXJ0sFjZKW3reQpH6YelzzLWMLNvW) {
        if (field003.get()) {
            return field002.computeIfAbsent(h55UXJ0sFjZKW3reQpH6YelzzLWMLNvW, uUID -> {
                if (h55UXJ0sFjZKW3reQpH6YelzzLWMLNvW.version() == 4) {
                    SecureClass0536.PkRUAmvrDzv5LQ3rezWq3l2av7c2p4qH(SecureClass0617.QM8W44tLapgDwpkPThCix4VKjEyUHs20(), h55UXJ0sFjZKW3reQpH6YelzzLWMLNvW).thenAccept(tT6iIQuMdScp5Lu41gE80CSKqKARFxLj2 -> field002.put(h55UXJ0sFjZKW3reQpH6YelzzLWMLNvW, Optional.ofNullable(tT6iIQuMdScp5Lu41gE80CSKqKARFxLj2)));
                }
                return Optional.empty();
            });
        }
        return field002.getOrDefault(h55UXJ0sFjZKW3reQpH6YelzzLWMLNvW, Optional.empty());
    }

    public static /* bridge */ /* synthetic */ void HyQrOKRTIgkexRcC7TtfE9xZuKtD6zKT() {
        SecureClass0665.AN6XPG9oZ6ioVr7vhRtxOYYJOn1J0EQN(SecureClass0617.QM8W44tLapgDwpkPThCix4VKjEyUHs20()).thenAccept(dYpw2saKryq4P4Y4BLVFJjY6GLwiSQDr -> {
            Map<UUID, Optional> field005 = dYpw2saKryq4P4Y4BLVFJjY6GLwiSQDr.cfr_renamed_331().stream().collect(Collectors.toMap(N3qnSln77yGQjvMPmg7VuBJ0vILAAbxj -> SecureClass0272.RJUmLFskQEO02FV3na49qzlS3mx3kXgR(N3qnSln77yGQjvMPmg7VuBJ0vILAAbxj.cfr_renamed_329()), Optional::of));
            Map<UUID, Optional> field006 = dYpw2saKryq4P4Y4BLVFJjY6GLwiSQDr.S9LnBzV2HhuG8NuMEkruW77zpBdrhrQ9().stream().collect(Collectors.toMap(Q54Vp1LJVZ8mdfXtX95VLfRQDSNTCXAH -> Q54Vp1LJVZ8mdfXtX95VLfRQDSNTCXAH, XX2vRQOZnM0p6VC5XoTiVOtlborzmFfs -> Optional.empty()));
            field002.clear();
            field002.putAll(field005);
            field002.putAll(field006);
            if (dYpw2saKryq4P4Y4BLVFJjY6GLwiSQDr.rPdldJuOVXesEebsMgFcjvAUKzAXHm3F() != null) {
                field003.set(dYpw2saKryq4P4Y4BLVFJjY6GLwiSQDr.rPdldJuOVXesEebsMgFcjvAUKzAXHm3F());
            }
        });
        try {
            field001.clear();
            field001.addAll((Collection<SecureClass0707>)SecureClass0707.FllBzYzNWOKXXmn3tAxNdLxnehrra9J9(SecureClass0617.QM8W44tLapgDwpkPThCix4VKjEyUHs20()).get());
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* bridge */ /* synthetic */ SecureClass0707 IFZmoXs2dR0yHPYkIgWWftztu7TcULGJ(String yOOq01uV2RTrVuS7PI4yQdIklrYk1eyw) {
        return field001.stream().filter(qBT8zAZ9PcImRvH5GMso9L4PPIhvDVJF -> qBT8zAZ9PcImRvH5GMso9L4PPIhvDVJF.cfr_renamed_332().equalsIgnoreCase(yOOq01uV2RTrVuS7PI4yQdIklrYk1eyw)).findFirst().orElse(SecureClass0707.YoGXuojpJgbt1UvMPfA46ttTAcQE0d4t);
    }

    public static /* bridge */ /* synthetic */ UUID RJUmLFskQEO02FV3na49qzlS3mx3kXgR(String U0G71mXDnibQdmJzfHXiEYnSIxfpSt53) {
        try {
            return UUID.fromString(U0G71mXDnibQdmJzfHXiEYnSIxfpSt53);
        }
        catch (Exception UMXDVFOyexmtHhhK0rvi6QpHERhIXVRh) {
            long field007 = Long.parseUnsignedLong(U0G71mXDnibQdmJzfHXiEYnSIxfpSt53.substring(0, 16), 16);
            long field008 = Long.parseUnsignedLong(U0G71mXDnibQdmJzfHXiEYnSIxfpSt53.substring(16), 16);
            return new UUID(field007, field008);
        }
    }

    static {
        field001 = new ArrayList<SecureClass0707>();
        field002 = new ConcurrentHashMap<UUID, Optional<SecureClass0536>>();
        field001.add(SecureClass0707.YoGXuojpJgbt1UvMPfA46ttTAcQE0d4t);
        field003 = new AtomicBoolean(true);
    }

    public static /* bridge */ /* synthetic */ void PVeqaF8yNuNjdq2nzWGlFReKIDGiwZ7L() {
        field002.clear();
    }
}

