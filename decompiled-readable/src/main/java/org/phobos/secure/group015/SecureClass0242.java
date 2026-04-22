/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group015;

import engine.linking.NativeMethodHandler;
import java.nio.file.Path;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import org.phobos.secure.group001.SecureClass0010;
import org.phobos.secure.group001.SecureClass0008;
import org.phobos.secure.group002.SecureClass0016;
import org.phobos.secure.group003.SecureClass0043;
import org.phobos.secure.group004.SecureInterface0005;
import org.phobos.secure.group005.SecureClass0068;
import org.phobos.secure.group005.SecureClass0070;
import org.phobos.secure.group009.SecureClass0136;
import org.phobos.secure.group007.IRCModule;
import org.phobos.secure.group007.SecureClass0117;
import org.phobos.secure.group008.SecureClass0128;
import org.phobos.secure.group010.SecureClass0159;
import org.phobos.secure.group011.SecureEnum0003;
import org.phobos.secure.group013.SecureClass0202;
import org.phobos.secure.group013.SecureClass0205;
import org.phobos.secure.group013.SecureClass0191;
import org.phobos.secure.group014.SecureClass0222;
import org.phobos.secure.group014.SecureClass0232;
import org.phobos.secure.group014.SecureClass0235;
import org.phobos.secure.group014.SecureClass0212;
import org.phobos.secure.group014.SecureClass0215;
import org.phobos.secure.group015.SecureClass0247;
import org.phobos.secure.group015.SecureClass0250;
import org.phobos.secure.group017.SecureClass0285;
import org.phobos.secure.group017.SecureClass0286;
import org.phobos.secure.group019.SecureClass0302;
import org.phobos.secure.group019.SecureClass0316;
import org.phobos.secure.group025.SecureClass0429;
import org.phobos.secure.group026.SecureClass0455;
import org.phobos.secure.group026.SecureClass0446;
import org.phobos.secure.group032.SecureClass0563;
import org.phobos.secure.group033.SecureClass0592;
import org.phobos.secure.group034.SecureClass0610;
import org.phobos.secure.group035.SecureClass0626;
import org.phobos.secure.group038.SecureClass0664;
import org.phobos.secure.group039.SecureClass0681;
import org.phobos.secure.group041.SecureClass0728;
import org.phobos.secure.group047.SecureClass0844;
import org.phobos.secure.group047.SecureClass0854;
import org.phobos.secure.group047.SecureClass0856;
import org.phobos.secure.group049.SecureClass0885;
import org.phobos.secure.group051.SecureClass0932;
import org.phobos.secure.group057.SecureClass1039;
import org.phobos.secure.group058.SecureClass1056;
import org.phobos.secure.group060.SecureClass1096;
import org.phobos.secure.group063.NotificationsModule;
import org.phobos.secure.group063.SecureClass1153;
import org.phobos.secure.group061.SecureClass1107;
import org.phobos.secure.group061.SecureClass1116;
import org.phobos.secure.group061.SecureClass1118;
import org.phobos.secure.group016.SecureInterface0040;
import org.phobos.secure.group020.SecureClass0325;
import org.phobos.secure.group022.SecureClass0361;
import org.phobos.secure.group028.SecureClass0483;
import org.phobos.secure.group028.SecureClass0484;
import org.phobos.secure.group030.SecureClass0532;
import org.phobos.secure.group036.SecureClass0631;
import org.phobos.secure.group036.SecureClass0628;
import org.phobos.secure.group037.SecureClass0646;
import org.phobos.secure.group040.SecureClass0698;
import org.phobos.secure.group040.SecureClass0700;
import org.phobos.secure.group042.SecureInterface0106;
import org.phobos.secure.group042.SecureClass0742;
import org.phobos.secure.group044.SecureClass0786;
import org.phobos.secure.group046.SecureClass0830;
import org.phobos.secure.group050.SecureClass0899;
import org.phobos.secure.group052.SecureClass0952;
import org.phobos.secure.group052.SecureClass0944;
import org.phobos.secure.group062.SecureClass1135;
import org.slf4j.Logger;

public class SecureClass0242
extends UnicastRemoteObject
implements SecureInterface0106,
SecureInterface0040 {
    public /* synthetic */ SecureClass0698 field001;
    public static /* synthetic */ byte[] field002;
    public static final /* synthetic */ Path field003;
    public final /* synthetic */ SecureClass0786 field004;
    public /* synthetic */ long field005;
    public static final /* synthetic */ SecureEnum0003 field006;
    public final /* synthetic */ List<Consumer<IRCModule>> field007;
    public final /* synthetic */ SecureClass0646 field008;
    public static volatile /* synthetic */ boolean field009;
    public static /* synthetic */ boolean field010;
    public /* synthetic */ long field011;
    public final /* synthetic */ List<Consumer<NotificationsModule>> field012;
    public final /* synthetic */ Logger field013;
    public /* synthetic */ ExecutorService field014;
    public final /* synthetic */ SecureClass1116 field015;
    public /* synthetic */ Thread field016;
    public final /* synthetic */ SecureClass1096 field017;
    public static final /* synthetic */ byte[][] field018;
    public final /* synthetic */ SecureClass0899 field019;
    public final /* synthetic */ SecureClass0250 field020;
    public /* synthetic */ SecureClass0128 field021;
    public /* synthetic */ SecureClass0429 field022;
    public /* synthetic */ SecureClass0302 field023;
    public /* synthetic */ SecureClass0010 field024;
    public /* synthetic */ SecureClass0700 field025;
    public /* synthetic */ SecureClass0235 field026;
    public /* synthetic */ SecureClass1153 field027;
    public final /* synthetic */ SecureClass0856 field028;
    public final /* synthetic */ SecureClass0844 field029;
    public /* synthetic */ SecureClass0159 field030;
    public /* synthetic */ SecureClass0008 field031;
    public /* synthetic */ SecureClass0016 field032;
    public final /* synthetic */ SecureClass0610 field033;
    public /* synthetic */ SecureClass0885 field034;
    public final /* synthetic */ SecureClass0856 field035;
    public /* synthetic */ SecureInterface0005 field036;
    public final /* synthetic */ class_310 field037;
    public /* synthetic */ SecureClass0728 field038;
    public /* synthetic */ SecureClass0325 field039;
    public final /* synthetic */ SecureClass0592 field040;
    public /* synthetic */ SecureClass1039 field041;
    public /* synthetic */ SecureClass0563 field042;
    public /* synthetic */ SecureClass0484 field043;
    public /* synthetic */ SecureClass0068 field044;
    public /* synthetic */ SecureClass0681 field045;
    public /* synthetic */ SecureClass1107 field046;
    public /* synthetic */ SecureClass0286 field047;
    public /* synthetic */ SecureClass0202 field048;
    public /* synthetic */ SecureClass1118 field049;
    public /* synthetic */ SecureClass0830 field050;
    public /* synthetic */ SecureClass0932 field051;
    public /* synthetic */ SecureClass1135 field052;
    public /* synthetic */ SecureClass0628 field053;
    public /* synthetic */ SecureClass0043 field054;
    public /* synthetic */ SecureClass0532 field055;
    public /* synthetic */ SecureClass0117 field056;
    public /* synthetic */ SecureClass0742 field057;
    public /* synthetic */ SecureClass0205 field058;
    public /* synthetic */ SecureClass0446 field059;
    public /* synthetic */ SecureClass0626 field060;
    public /* synthetic */ SecureClass0455 field061;
    public /* synthetic */ SecureClass1056 field062;
    public /* synthetic */ SecureClass0191 field063;
    public /* synthetic */ SecureClass0247 field064;
    public /* synthetic */ SecureClass0944 field065;
    public /* synthetic */ SecureClass0232 field066;
    public /* synthetic */ SecureClass0664 field067;
    public /* synthetic */ SecureClass0215 field068;
    public /* synthetic */ SecureClass0631 field069;
    public /* synthetic */ SecureClass0212 field070;
    public /* synthetic */ SecureClass0483 field071;
    public /* synthetic */ SecureClass0316 field072;
    public /* synthetic */ SecureClass0136 field073;
    public /* synthetic */ SecureClass0854 field074;
    public /* synthetic */ SecureClass0070 field075;
    public /* synthetic */ SecureClass0285 field076;
    public /* synthetic */ SecureClass0222 field077;
    public /* synthetic */ SecureClass0952 field078;

    public static /* bridge */ /* synthetic */ void S3yM43JVkf8EYVVvCMVMgr1y662rKyjq(Runnable TeHu753ZN8ZFe0XmxY44Q05QN6PK5XD9) {
        SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().UXMRY8meCaAnlLFB42TocatoHskqw6hd().gy9K6Ew6VRIff7F2M55gLolOafdiFDrY(TeHu753ZN8ZFe0XmxY44Q05QN6PK5XD9);
    }

    public static /* bridge */ /* synthetic */ <T> CompletableFuture<T> supplyAsync(Supplier<T> liiP6ivtrwf80ksJzbVkL8KndFsVIPEm) {
        return CompletableFuture.supplyAsync(liiP6ivtrwf80ksJzbVkL8KndFsVIPEm, SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().cfr_renamed_320());
    }

    public static /* bridge */ /* synthetic */ void XmA7DkS9oixKv7O3yqHttIvO35rGp6YB(Runnable runnable) {
        CompletableFuture.runAsync(runnable, (Executor)class_310.method_1551());
    }

    public static /* bridge */ /* synthetic */ <T> CompletableFuture<T> cfr_renamed_321(Supplier<T> wDOwI3hcsdVum9Gkyvo0NghgcvFJDdEc) {
        return CompletableFuture.supplyAsync(wDOwI3hcsdVum9Gkyvo0NghgcvFJDdEc);
    }

    public /* synthetic */ SecureClass0242() throws RemoteException {
        this.__init__org_phobos_secure_9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC_EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb();
    }

    public native /* synthetic */ void __init__org_phobos_secure_9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC_EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb() throws RemoteException;

    public static /* bridge */ /* synthetic */ CompletableFuture<Void> bMOwgjLAed32RCkjzDiD4MYOD7abJdaK(Runnable GBKEW2MlfWW5BQEvIJ6i7aBmvIDngWcr) {
        return CompletableFuture.runAsync(GBKEW2MlfWW5BQEvIJ6i7aBmvIDngWcr, SecureClass0361.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().cfr_renamed_320());
    }

    public static /* bridge */ /* synthetic */ void eYsn3PtHqYjKhwOWYII5SYg7UtbCmgU3(class_2561 iHpwmkeLIYbriFkPMGfF5a02yS2nF5bp, NotificationsModule y810soHFVwk7t3wLR9Wgx3WdsYU1d9os) {
        y810soHFVwk7t3wLR9Wgx3WdsYU1d9os.pq6kejtIGf7D0XyUIoDspffgY3KBieLM.add(iHpwmkeLIYbriFkPMGfF5a02yS2nF5bp);
    }

    public static /* bridge */ /* synthetic */ void tmqRrlVcJsXFCSJG23D9t33tCN53ICUS(String qVFRxwBkFsJHj6rvXK4MjdOSRXfBPewg, IRCModule IBQf5avpt2MHc4MqHYa9irsba0h7QWBV) {
        IBQf5avpt2MHc4MqHYa9irsba0h7QWBV.lulxWGLvVz4lUNCCYUlS1Tv5iTklGiP7(qVFRxwBkFsJHj6rvXK4MjdOSRXfBPewg);
    }

    public static /* bridge */ /* synthetic */ void ZHp35Guxu1FoZPW8Se0mc64Hl6GyM9rg() {
    }

    public static /* bridge */ /* synthetic */ void j6coD7LEhjdJzFCBUnhKaWHpBmHpTDUv(String EKKlJe6HXlcfP0zqGkh6owexkIO4jZsw, IRCModule z7s7cURNDSQn5S83zL5EyBTcInOcbE9S) {
        z7s7cURNDSQn5S83zL5EyBTcInOcbE9S.lulxWGLvVz4lUNCCYUlS1Tv5iTklGiP7(EKKlJe6HXlcfP0zqGkh6owexkIO4jZsw);
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(30);
        field003 = FabricLoader.getInstance().getGameDir().resolve("phoboslite");
        field009 = true;
        field006 = SecureEnum0003.API_1_1;
        field018 = new byte[1024][32];
        field002 = new byte[0];
        field010 = false;
        Arrays.fill((Object[])field018, new byte[]{15, 15, 15, 15, 15, 15, 15, 15, 15});
    }
}

