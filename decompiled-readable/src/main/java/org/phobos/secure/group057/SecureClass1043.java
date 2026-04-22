/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group057;

import java.util.HashMap;
import java.util.Map;
import org.phobos.secure.group033.SecureClass0589;
import org.phobos.secure.group051.SecureClass0916;
import org.phobos.secure.group021.SecureClass0342;

public class SecureClass1043 {
    public static final /* synthetic */ SecureClass0589 field001;
    public static final /* synthetic */ SecureClass0342 field002;
    public final /* synthetic */ SecureClass0916 field003;
    public final /* synthetic */ Map<String, Object> field004;
    public static final /* synthetic */ SecureClass0342 field005;
    public static final /* synthetic */ SecureClass0342 field006;

    static {
        field001 = new SecureClass0589("dest", "org.mpris.MediaPlayer2.spotify");
        field006 = new SecureClass0342("org.mpris.MediaPlayer2.Player.PlayPause");
        field002 = new SecureClass0342("org.mpris.MediaPlayer2.Player.Next");
        field005 = new SecureClass0342("org.mpris.MediaPlayer2.Player.Previous");
    }

    public /* synthetic */ SecureClass1043() {
        this.field003 = new SecureClass0916(new SecureClass0589[]{field001}, "/org/mpris/MediaPlayer2");
        this.field004 = new HashMap<String, Object>();
    }
}

