/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group004;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1297;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group058.x4yEkjMMz2zJQ18F1uLrEW2InO7mdTTf;
import org.phobos.secure.group063.XW3aHjjnidQUfqkcuBj5fxYkJBL9zDVE;
import org.phobos.secure.group042.fMY6U3nWVpegyHRzdUW3mAUAqeqRIE5t;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import oshi.util.tuples.Pair;

public class AntiBotModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<Boolean> health;
    public final /* synthetic */ SecureClass0603<XW3aHjjnidQUfqkcuBj5fxYkJBL9zDVE> mode;
    public final /* synthetic */ Set<UUID> field001;
    public final /* synthetic */ SecureClass0603<Boolean> duplicate;
    public final /* synthetic */ SecureClass0603<Boolean> angle;
    public final /* synthetic */ Set<UUID> field002;
    public final /* synthetic */ SecureClass0603<Boolean> gamemode;
    public final /* synthetic */ SecureClass0603<Boolean> iD;
    public static /* synthetic */ AntiBotModule field003;
    public final /* synthetic */ List<UUID> field004;
    public final /* synthetic */ Set<UUID> field005;
    public final /* synthetic */ SecureClass0603<Boolean> name;
    public final /* synthetic */ Map<UUID, Long> field006;
    public final /* synthetic */ Map<UUID, Pair<Integer, Long>> field007;
    public final /* synthetic */ Set<UUID> field008;

    public /* synthetic */ AntiBotModule(SecureClass0242 veVp8GdEZBQBpeNrcexzQtKUkRy7mkyc) {
        super(veVp8GdEZBQBpeNrcexzQtKUkRy7mkyc, "AntiBot", SecureClass1004.kK5IjbPNwxtu8lnDS8tj81KqTHxby8IZ, "Filters out bots", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<XW3aHjjnidQUfqkcuBj5fxYkJBL9zDVE>("Mode", XW3aHjjnidQUfqkcuBj5fxYkJBL9zDVE.Custom));
        this.duplicate = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Duplicate"));
        this.gamemode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Gamemode"));
        this.angle = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Angle"));
        this.iD = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("ID"));
        this.name = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Name"));
        this.health = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Health"));
        this.field007 = new ConcurrentHashMap<UUID, Pair<Integer, Long>>();
        this.field004 = new ArrayList<UUID>();
        this.field005 = ConcurrentHashMap.newKeySet();
        this.field008 = ConcurrentHashMap.newKeySet();
        this.field001 = ConcurrentHashMap.newKeySet();
        this.field006 = new ConcurrentHashMap<UUID, Long>();
        this.field002 = ConcurrentHashMap.newKeySet();
        this.cfr_renamed_89("Filter", this.duplicate, this.gamemode, this.angle, this.iD, this.name, this.health).CHtaYu9Grw4Vg2Qs8gwqVn9dNVUIDSjg(this.HXKToIX7gBo24TngT1OfGtreIPDvasLA(this.mode, new XW3aHjjnidQUfqkcuBj5fxYkJBL9zDVE[]{XW3aHjjnidQUfqkcuBj5fxYkJBL9zDVE.Custom}));
        this.cfr_renamed_69(new fMY6U3nWVpegyHRzdUW3mAUAqeqRIE5t(this));
        this.cfr_renamed_69(new x4yEkjMMz2zJQ18F1uLrEW2InO7mdTTf(this));
        field003 = this;
    }

    public static /* bridge */ /* synthetic */ boolean oUmImCJmnh8lEelrq6ryD0RIKWVbO86w(class_1297 LnsE8mHwIITQiR0Yy4egZsEhq24ELy0T) {
        return field003.iSdhNRC3V5cOu0jBoL4jlUwN74dl4CB7() && field003.DdH0e7nrz6q1lBDK2ReYNo2nu9YBaku5(LnsE8mHwIITQiR0Yy4egZsEhq24ELy0T);
    }
}

