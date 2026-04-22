/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group018;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import org.lwjgl.glfw.GLFW;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group005.SecureClass0074;
import org.phobos.secure.group006.F9Drgr2HCfMKxhSBQxWFgvHGjKXOY4jT;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group032._2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group061._9vnlCm5pTzxFqQn0znMH00bhEfNpaGCo;
import org.phobos.secure.group050._1BPUls137YBv0umVhJVtJjGS9HwH50nI;
import org.phobos.secure.group053.SecureClass0962;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;

public class RenderModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<_9vnlCm5pTzxFqQn0znMH00bhEfNpaGCo> lineOverride;
    public static /* synthetic */ RenderModule field001;
    public final /* synthetic */ SecureClass0603<F9Drgr2HCfMKxhSBQxWFgvHGjKXOY4jT> lineMode;
    public final /* synthetic */ SecureClass0603<Boolean> global;
    public final /* synthetic */ SecureClass0603<_9vnlCm5pTzxFqQn0znMH00bhEfNpaGCo> boxOverride;
    public final /* synthetic */ SecureClass0603<Boolean> field002;
    public final /* synthetic */ SecureClass0603<Boolean> field003;
    public final /* synthetic */ SecureClass0603<Float> field004;
    public final /* synthetic */ SecureClass0603<Boolean> capture;
    public final /* synthetic */ SecureClass0603<F9Drgr2HCfMKxhSBQxWFgvHGjKXOY4jT> field005;
    public final /* synthetic */ SecureClass0603<Float> speed;
    public final /* synthetic */ SecureClass0603<Color> lineColor;
    public final /* synthetic */ SecureClass0603<_1BPUls137YBv0umVhJVtJjGS9HwH50nI> samples;
    public final /* synthetic */ SecureClass0603<Color> boxColor;

    public static /* bridge */ /* synthetic */ int qPJDADxqokbFcnDKQ6t7iTTvpFYWRI2L() {
        if (!RenderModule.field001.field002.getValue().booleanValue()) {
            return -1;
        }
        return RenderModule.field001.samples.getValue().samples;
    }

    public static /* bridge */ /* synthetic */ RenderModule nd7XCfhjE5Nqgza3dwK8omUAzW4yp6k7() {
        return field001;
    }

    public static /* bridge */ /* synthetic */ void HkpsY4gOTx0tuxn20Awqo2NsxKx7WFk4(_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW kC0sH2WEMxNP2zhbSBu8eAF0rxf18ZfM) {
        field001.DVk6E3Q60WwUN4xJrlamV2JWrQi5bVsF(kC0sH2WEMxNP2zhbSBu8eAF0rxf18ZfM);
    }

    public static /* bridge */ /* synthetic */ boolean JSwEeVP9gHi8R49fnJEwGywEpuysE5r1() {
        return field001 != null && RenderModule.field001.field003.getValue() != false;
    }

    public static /* bridge */ /* synthetic */ void gI3gItf6zFKsjM1m6rzrCPhnKf9uOLMB(_2Z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW) {
        field001.qYLcADWs4VKe0rY5LGHWz13yrovDa177(z9QIkjoQ8h0b0EwuVa8YKzR8fbJPjqW);
    }

    public /* synthetic */ RenderModule(SecureClass0242 YYyEHGvy3fPQv32pfBM31Arwksu9rVxs) {
        super(YYyEHGvy3fPQv32pfBM31Arwksu9rVxs, "Render", SecureClass1004.V1nLLzYpJR2xYMtHxliJhvng0Wltqhpg, "Client render settings", new int[0]);
        this.capture = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Capture", true).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("If disabled, not visible to screen-shares"));
        this.field002 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("MSAA", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Line smoothing"));
        this.samples = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_1BPUls137YBv0umVhJVtJjGS9HwH50nI>("Samples", _1BPUls137YBv0umVhJVtJjGS9HwH50nI.X8));
        this.global = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Global").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Overrides global rendering"));
        this.field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<F9Drgr2HCfMKxhSBQxWFgvHGjKXOY4jT>("BoxMode", F9Drgr2HCfMKxhSBQxWFgvHGjKXOY4jT.Circle));
        this.lineMode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<F9Drgr2HCfMKxhSBQxWFgvHGjKXOY4jT>("LineMode", F9Drgr2HCfMKxhSBQxWFgvHGjKXOY4jT.Circle));
        this.boxOverride = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_9vnlCm5pTzxFqQn0znMH00bhEfNpaGCo>("BoxOverride", _9vnlCm5pTzxFqQn0znMH00bhEfNpaGCo.Merge));
        this.lineOverride = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<_9vnlCm5pTzxFqQn0znMH00bhEfNpaGCo>("LineOverride", _9vnlCm5pTzxFqQn0znMH00bhEfNpaGCo.Merge));
        this.boxColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("BoxColor", new Color(255, 0, 255, 100)).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.lineColor = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0074("LineColor", Color.WHITE).Z7lglFWtojVYz88Osm1oJX7xVrwWExTs());
        this.field004 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("GlobalSteps", Float.valueOf(60.0f), Float.valueOf(5.0f), Float.valueOf(100.0f)).cfr_renamed_110(() -> this.field005.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(F9Drgr2HCfMKxhSBQxWFgvHGjKXOY4jT.Circle) || this.lineMode.tQgAGKXb4P8to9BfEtwhNA3h5QWR8RVV(F9Drgr2HCfMKxhSBQxWFgvHGjKXOY4jT.Circle)));
        this.speed = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0962<Float>("Speed", Float.valueOf(100.0f), Float.valueOf(10.0f), Float.valueOf(300.0f), "%").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Shader speed"));
        this.field003 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("BFS").HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Borderless fullscreen"));
        this.sHPLV8tZrmu7k4oeFU2WDqE7UJw1qfEH().Bzwke1M5FlTzwSIiayOylGfWslMeNwBR(this.global).DEoVjWq5cTdAOvCIAHO8lnvs6M5sooSH(this.cfr_renamed_89("Box", this.field005, this.boxOverride, this.boxColor), this.cfr_renamed_89("Line", this.lineMode, this.lineOverride, this.lineColor)).nYrqZnKDIcDvPj6wpTlQbWb1cFINYbUd(this.field004).FiWUVtLnQ2nHr66BIgpc3QVevLaxynsa();
        this.ZOs4tT9mSWk3IpkDN4DipiX8gK8e6maz(this.field002, this.samples);
        this.field003.cfr_renamed_123(EkItf6psMY6zRK6yFIEawUl2MntlnYvv -> {
            Dimension field006 = Toolkit.getDefaultToolkit().getScreenSize();
            long field007 = P9cXUwrNt0Xh6Ncq21eiS6elpBhrpQQ3.method_22683().method_4490();
            if (EkItf6psMY6zRK6yFIEawUl2MntlnYvv.booleanValue()) {
                GLFW.glfwSetWindowAttrib((long)field007, (int)131077, (int)0);
                GLFW.glfwSetWindowMonitor((long)field007, (long)0L, (int)0, (int)0, (int)field006.width, (int)field006.height, (int)-1);
                return;
            }
            if (GLFW.glfwGetWindowAttrib((long)field007, (int)131077) == 0) {
                GLFW.glfwSetWindowAttrib((long)field007, (int)131077, (int)1);
                GLFW.glfwSetWindowMonitor((long)field007, (long)0L, (int)30, (int)30, (int)(field006.width - 30), (int)(field006.height - 30), (int)-1);
            }
        });
        field001 = this;
    }
}

