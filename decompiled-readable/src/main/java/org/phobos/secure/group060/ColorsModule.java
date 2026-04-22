/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group060;

import java.awt.Color;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group048._4EYFHVUTIwV0ENxZ36Ks2RkIZNwYX3ag;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1027;

public class ColorsModule
extends SecureClass1027 {
    public static /* synthetic */ float field001;
    public static /* synthetic */ ColorsModule field002;
    public final /* synthetic */ SecureClass0603<Integer> speed;
    public static final /* synthetic */ Color field003;
    public final /* synthetic */ SecureClass0603<Color> color;

    static {
        field003 = new Color(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public static /* bridge */ /* synthetic */ ColorsModule CBbCYalAkLz95FQbLPBJwWcEs1cg1qoI() {
        return field002;
    }

    public static /* bridge */ /* synthetic */ float NEGseh6AOwsEuKg0GAwIRSZxZxSByPHY(double FOdJGHGHcty9pXnF0w1zXZBuiX2eIulW) {
        return (float)((double)field001 - FOdJGHGHcty9pXnF0w1zXZBuiX2eIulW * (double)0.001f);
    }

    public /* synthetic */ ColorsModule(SecureClass0242 WF28XVcpqFcXzYebunAoBRyj4ws7WB3i) {
        super(WF28XVcpqFcXzYebunAoBRyj4ws7WB3i, "Colors", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Controls global color", new int[0]);
        this.color = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("Color", Color.WHITE).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Global color"));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Integer>("Speed", 50, 0, 100).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Rainbow speed"));
        WF28XVcpqFcXzYebunAoBRyj4ws7WB3i.qYvTNv8WpDMa6MWfszNKU2f0kLw4WPv9().vX7WzZjJYXQQ11WCdpLxvgQDfOs7XfUw(new _4EYFHVUTIwV0ENxZ36Ks2RkIZNwYX3ag(WF28XVcpqFcXzYebunAoBRyj4ws7WB3i));
        field002 = this;
    }
}

