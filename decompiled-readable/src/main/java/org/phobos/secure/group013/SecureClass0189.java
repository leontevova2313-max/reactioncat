/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group013;

import com.google.gson.Gson;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinNT;
import org.phobos.secure.group054.SecureInterface0132;

public class SecureClass0189
implements SecureInterface0132 {
    public final /* synthetic */ WinNT.HANDLE processHandleOf;
    public final /* synthetic */ WinDef.HWND spotifyDebugWindow;
    public static final /* synthetic */ Gson field001;
    public final /* synthetic */ int processOfExecutable;
    public /* synthetic */ long field002;

    public /* synthetic */ SecureClass0189(String cNv9R6XZxnc5MjQfa1mX6FJv0XIDeQN4) {
        this.field002 = 10000L;
        this.processOfExecutable = this.ycKQeYMWAciec8HzkKsRKY3WwOlAqEdq(cNv9R6XZxnc5MjQfa1mX6FJv0XIDeQN4);
        if (this.processOfExecutable == -1) {
            throw new IllegalStateException("Process of executable " + cNv9R6XZxnc5MjQfa1mX6FJv0XIDeQN4 + " not found");
        }
        this.processHandleOf = this.iaveD4xs7o78kiXyvNg3OEqeFLGJA9gF(this.processOfExecutable);
        if (this.processHandleOf == null) {
            throw new IllegalStateException("Process handle of " + this.processOfExecutable + " not found");
        }
        this.spotifyDebugWindow = this.YqBQGM7astGwYTYuou9XDFMQEiFXyAEp(this.processOfExecutable, hWND -> {
            String field003 = this.iaLa6mFMIiVLdaF7LvgJAGL2KXZhWjOX(hWND);
            return !field003.equals("Spotify Debug Window") && !field003.equals("DevTools");
        });
        if (this.cfr_renamed_258().isEmpty()) {
            throw new IllegalStateException("Window for process " + this.processOfExecutable + " not found");
        }
    }

    static {
        field001 = new Gson();
    }
}

