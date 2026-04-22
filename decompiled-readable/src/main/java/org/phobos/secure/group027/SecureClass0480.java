/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group027;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group008.SecureClass0128;
import org.phobos.secure.group048.SecureInterface0119;
import org.phobos.secure.group063.SecureClass1145;
import org.phobos.secure.group040.SecureClass0708;

public class SecureClass0480
extends SecureClass1145<SecureClass0708>
implements SecureInterface0119 {
    public static final /* synthetic */ Path field001;
    public static final /* synthetic */ SecureClass0480 field002;
    public final /* synthetic */ MutableObject<SecureClass0708> field003;
    public final /* synthetic */ MutableBoolean field004;

    public static /* bridge */ /* synthetic */ void stop() {
        field001.toFile().mkdirs();
        Iterator<T> iterator = SecureClass0480.field002.iterator();
        while (iterator.hasNext()) {
            SecureClass0708 field005 = (SecureClass0708)iterator.next();
            try {
                Files.writeString(field001.resolve(field005.getName() + ".json"), (CharSequence)field005.syKFGJzqrCtbfvVOwCajUMKR84gWsmmY(cfr_renamed_328), new OpenOption[0]);
            }
            catch (Throwable throwable) {
            }
        }
        return;
    }

    public static /* bridge */ /* synthetic */ void asTX5nZlsS4qmlDrYwmHUiVFh3Wz0ETr() {
        File[] field006 = field001.toFile().listFiles();
        if (field006 == null) {
            return;
        }
        SecureClass0480 field007 = SecureClass0480.field002;
        for (File LWKLopeiFFErHmFT6DcqAK6XacB3QGly : field006) {
            String[] stringArray = LWKLopeiFFErHmFT6DcqAK6XacB3QGly.getName().split("\\.");
            String field008 = stringArray.length > 0 ? stringArray[stringArray.length - 2] : LWKLopeiFFErHmFT6DcqAK6XacB3QGly.getName();
            try {
                String field009 = Files.readString(LWKLopeiFFErHmFT6DcqAK6XacB3QGly.toPath());
                SecureClass0708.Wq3b5UGlpHB8iMxypneRrcJ8ZDC59wVy(field008, field009).ifPresent(field007::rs6ebe0vLusAQbFvhxTOqqdZKSHJidxv);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        String field010 = SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().PHBE4hWDmoINKUEmf31FHeK0at0vqtZS.getValue();
        if (field010.equalsIgnoreCase("none")) {
            return;
        }
        field007.qC2TVK9LFkHRG3VZKSRRXeWMRVeQJhOx(field010);
    }

    static {
        field001 = Path.of(System.getProperty("user.home"), "earthhack", "kits");
        field002 = new SecureClass0480();
    }

    public /* synthetic */ SecureClass0480() {
        this.field003 = new MutableObject(null);
        this.field004 = new MutableBoolean(false);
    }
}

