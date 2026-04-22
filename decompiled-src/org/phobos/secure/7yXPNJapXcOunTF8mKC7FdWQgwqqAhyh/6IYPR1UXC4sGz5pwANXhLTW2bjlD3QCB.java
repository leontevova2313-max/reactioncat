/*
 * Decompiled with CFR.
 */
package org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh;

import com.google.gson.Gson;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import org.phobos.secure.u5iaET0r1hQ6KD5VP0DVrfpJMZ8tdPeI.LUPlQBUBMdLTuYSSXl7Mq87Q9AEuiLWX;

public class _6IYPR1UXC4sGz5pwANXhLTW2bjlD3QCB
implements LUPlQBUBMdLTuYSSXl7Mq87Q9AEuiLWX {
    public final /* synthetic */ WinNT.HANDLE tFgAgUApXmpupQHgU4QrqhIr1V2jOO6t;
    public final /* synthetic */ WinDef.HWND SDP2viLFjHvQKsUJ4zC6rZErQ1Nbu2kN;
    public static final /* synthetic */ Gson yHvBM5zL4GO02cPHAt6YReA1nBvwxB7J;
    public final /* synthetic */ int wsYJYldFq2eXHZAdCrVZnSocutidjIvI;
    public /* synthetic */ long UKYMqYI3oIImurJLA28vKDkNHeNniH48;

    public /* synthetic */ _6IYPR1UXC4sGz5pwANXhLTW2bjlD3QCB(String cNv9R6XZxnc5MjQfa1mX6FJv0XIDeQN4) {
        this.UKYMqYI3oIImurJLA28vKDkNHeNniH48 = 10000L;
        this.wsYJYldFq2eXHZAdCrVZnSocutidjIvI = this.ycKQeYMWAciec8HzkKsRKY3WwOlAqEdq(cNv9R6XZxnc5MjQfa1mX6FJv0XIDeQN4);
        if (this.wsYJYldFq2eXHZAdCrVZnSocutidjIvI == -1) {
            throw new IllegalStateException("Process of executable " + cNv9R6XZxnc5MjQfa1mX6FJv0XIDeQN4 + " not found");
        }
        this.tFgAgUApXmpupQHgU4QrqhIr1V2jOO6t = this.iaveD4xs7o78kiXyvNg3OEqeFLGJA9gF(this.wsYJYldFq2eXHZAdCrVZnSocutidjIvI);
        if (this.tFgAgUApXmpupQHgU4QrqhIr1V2jOO6t == null) {
            throw new IllegalStateException("Process handle of " + this.wsYJYldFq2eXHZAdCrVZnSocutidjIvI + " not found");
        }
        this.SDP2viLFjHvQKsUJ4zC6rZErQ1Nbu2kN = this.YqBQGM7astGwYTYuou9XDFMQEiFXyAEp(this.wsYJYldFq2eXHZAdCrVZnSocutidjIvI, hWND -> {
            String TdpyBq89jxqRcsYSLthQVV5EdlVd7WfD = this.iaLa6mFMIiVLdaF7LvgJAGL2KXZhWjOX(hWND);
            return !TdpyBq89jxqRcsYSLthQVV5EdlVd7WfD.equals("Spotify Debug Window") && !TdpyBq89jxqRcsYSLthQVV5EdlVd7WfD.equals("DevTools");
        });
        if (this.cfr_renamed_258().isEmpty()) {
            throw new IllegalStateException("Window for process " + this.wsYJYldFq2eXHZAdCrVZnSocutidjIvI + " not found");
        }
    }

    static {
        yHvBM5zL4GO02cPHAt6YReA1nBvwxB7J = new Gson();
    }
}

