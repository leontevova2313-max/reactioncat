/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group056;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import org.phobos.secure.group003.SecureClass0033;
import org.phobos.secure.group007.zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8;
import org.phobos.secure.group014.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group024.d8NIc2dgXgNohkOSB4AG2DAPWKeS5pT2;
import org.phobos.secure.group024.iOmqMA0h5hW0dtQjEtPzGBkd9XWqoj0h;
import org.phobos.secure.group025.SecureClass0430;
import org.phobos.secure.group034.SecureClass0603;
import org.phobos.secure.group041.SecureClass0719;
import org.phobos.secure.group055.SecureInterface0135;
import org.phobos.secure.group055.SecureClass1004;
import org.phobos.secure.group031.Iky5odevXsl2Zy8Q9RBEsZ0TJw7EKLEO;
import org.phobos.secure.group031.SecureClass0547;
import org.phobos.secure.group053.iuQrERTgI28pyCf1v7bXT8YsX8MmvI8Y;
import org.phobos.secure.group056.SecureClass1022;
import org.phobos.secure.group056.SecureClass1027;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvCleanerModule
extends SecureClass1027 {
    public final /* synthetic */ SecureClass0603<zIxo9S3ZoIQdxcYi4kPWONMdfzJwRtq8<Long>> delay;
    public static final /* synthetic */ Logger field001;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 field002;
    public /* synthetic */ boolean field003;
    public final /* synthetic */ SecureClass0603<Iky5odevXsl2Zy8Q9RBEsZ0TJw7EKLEO> mode;
    public final /* synthetic */ SecureClass0603<iOmqMA0h5hW0dtQjEtPzGBkd9XWqoj0h> inventory;
    public final /* synthetic */ SecureClass0603<Boolean> silent;
    public static /* synthetic */ InvCleanerModule field004;
    public final /* synthetic */ SecureClass0603<Set<class_1792>> whitelist;

    public static /* bridge */ /* synthetic */ InvCleanerModule lLF3ZlEJwzDoVLmAzkWT9MyUxZ7QtV3L() {
        return field004;
    }

    public /* synthetic */ InvCleanerModule(SecureClass0242 ykORN6jAjCF4036kvJDWYiJBZ369wEQY) {
        super(ykORN6jAjCF4036kvJDWYiJBZ369wEQY, "InvCleaner", SecureClass1004.cfr_renamed_106, "Throws away useless items", new int[0]);
        this.mode = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<Iky5odevXsl2Zy8Q9RBEsZ0TJw7EKLEO>("Mode", Iky5odevXsl2Zy8Q9RBEsZ0TJw7EKLEO.Normal));
        this.inventory = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0033<iOmqMA0h5hW0dtQjEtPzGBkd9XWqoj0h>("Inventory", iOmqMA0h5hW0dtQjEtPzGBkd9XWqoj0h.Silent));
        this.delay = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0547("Delay", 50L, 0L, 500L, true));
        this.silent = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass1022("Silent", false).HcOyVcABtRvav3iRe1JO6o3I6XyxtI97("Disables swing when dropping"));
        this.whitelist = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0719("Whitelist", new class_1792[0]).UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, Iky5odevXsl2Zy8Q9RBEsZ0TJw7EKLEO.Normal));
        this.field002 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.field003 = false;
        SecureClass0430 field005 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Helmet", class_1802.field_22027, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0).s3ujiTqdWvJU0I0AOLAUVaNo6c8Fl6k4());
        SecureClass0430 field006 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Chestplate", class_1802.field_22028, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0).s3ujiTqdWvJU0I0AOLAUVaNo6c8Fl6k4());
        SecureClass0430 field007 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Leggings", class_1802.field_22029, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0).s3ujiTqdWvJU0I0AOLAUVaNo6c8Fl6k4());
        SecureClass0430 field008 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Boots", class_1802.field_22030, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0).s3ujiTqdWvJU0I0AOLAUVaNo6c8Fl6k4());
        SecureClass0430 field009 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Sword", class_1802.field_22022, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0).s3ujiTqdWvJU0I0AOLAUVaNo6c8Fl6k4());
        SecureClass0430 field010 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Pickaxe", class_1802.field_22024, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0).s3ujiTqdWvJU0I0AOLAUVaNo6c8Fl6k4());
        SecureClass0430 field011 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Shield", class_1802.field_8255, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0).s3ujiTqdWvJU0I0AOLAUVaNo6c8Fl6k4());
        SecureClass0430 field012 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Crystals", class_1802.field_8301, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0));
        SecureClass0430 field013 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("XP", class_1802.field_8287, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0));
        SecureClass0430 field014 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Totems", class_1802.field_8288, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0));
        SecureClass0430 field015 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Gaps", class_1802.field_8367, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0));
        SecureClass0430 field016 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Pearls", class_1802.field_8634, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0));
        SecureClass0430 field017 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("EChests", class_1802.field_8466, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0));
        SecureClass0430 field018 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Obsidian", class_1802.field_8281, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0));
        SecureClass0430 field019 = this.yoCh2Tzjuuh19oKP0On1HXH6GaurB4et(new SecureClass0430("Choruses", class_1802.field_8233, 1).xkxcH8ZB11xB1ToG2dihX5KpXPp3QB2y(1).bLl4kaaW6zQfLUKsyCp9lHIYiSJEcDF2(0));
        List<SecureClass0603> field020 = List.of(field005, field006, field007, field008, field009, field010, field011, field012, field013, field014, field015, field016, field017, field018, field019);
        for (SecureClass0603 o8vxAybpGur9a8engYbRFNWOHF47vAyZ : field020) {
            o8vxAybpGur9a8engYbRFNWOHF47vAyZ.UajfDomVvYUeiLofg3W5x7BNyJV8hzHJ(this.mode, Iky5odevXsl2Zy8Q9RBEsZ0TJw7EKLEO.CrystalPvP);
        }
        ArrayList<class_1792> field021 = new ArrayList<class_1792>();
        Iterator<SecureClass0603> iterator = field020.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.cfr_renamed_69(new iuQrERTgI28pyCf1v7bXT8YsX8MmvI8Y(this));
                this.cfr_renamed_69(new d8NIc2dgXgNohkOSB4AG2DAPWKeS5pT2(this, ykORN6jAjCF4036kvJDWYiJBZ369wEQY, field020, field021));
                field004 = this;
                return;
            }
            SecureClass0603 field022 = iterator.next();
            field021.add((class_1792)((SecureInterface0135)field022.getValue()).Y6Nk0e6yZ9Yxyl8A5gEiVheaxvCGSzLi());
        }
    }

    static {
        field001 = LoggerFactory.getLogger(InvCleanerModule.class);
    }
}

