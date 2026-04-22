/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group046;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.io.File;
import java.util.Optional;
import javax.swing.ImageIcon;
import org.apache.commons.lang3.mutable.MutableObject;
import org.phobos.secure.group008.SecureClass0128;
import org.phobos.secure.group015.SecureClass0242;
import org.phobos.secure.group030.SecureClass0527;
import org.phobos.secure.group053.SecureClass0966;

public class SecureClass0830
extends SecureClass0966 {
    public final /* synthetic */ MutableObject<Optional<TrayIcon>> field001;

    public /* synthetic */ SecureClass0830(SecureClass0242 ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        block6: {
            this.field001 = new MutableObject(Optional.empty());
            try {
                if (SystemTray.isSupported()) {
                    SystemTray field002 = SystemTray.getSystemTray();
                    PopupMenu field003 = new PopupMenu();
                    MenuItem field004 = new MenuItem("Exit");
                    field004.addActionListener(fFhIsZmSPgMRfrix6nHT4Vmbq2N0gFrm -> System.exit(0));
                    field003.add(new MenuItem(SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.tnNO9sjqYkhz1EEvQ5qgi9LLO5JQHe0e()));
                    field003.addSeparator();
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(field003, "Skins", SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().lt5l0lSgaNyIMp3OQAVd78Ow1ijLCzTz.getValue(), OMNJvfL6COhFQZtuOE9PIG0gJF4TCTmX -> SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().lt5l0lSgaNyIMp3OQAVd78Ow1ijLCzTz.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)OMNJvfL6COhFQZtuOE9PIG0gJF4TCTmX));
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(field003, "Capes", SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().XVAOrvKPadV4YLACL1YS01MkOTX5QJAj.getValue(), U9Mz82FQqGeSY5GpkhbU4osAZhfDTWXY -> SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().XVAOrvKPadV4YLACL1YS01MkOTX5QJAj.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)U9Mz82FQqGeSY5GpkhbU4osAZhfDTWXY));
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(field003, "Notifications", SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().H0bVI5oHfoktzSkw7YBxTFd2yYXY02lC.getValue(), dSHKc6mo022LtJGlpTsUvuKnV1JBG2SZ -> SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().H0bVI5oHfoktzSkw7YBxTFd2yYXY02lC.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)dSHKc6mo022LtJGlpTsUvuKnV1JBG2SZ));
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(field003, "Shared", SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().qoROvH0slFjLpJJWpOmzJbNqvf54xkUW.getValue(), kIGuv91Miil1GucyRywBoNPZwm7hOPBj -> SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().qoROvH0slFjLpJJWpOmzJbNqvf54xkUW.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)kIGuv91Miil1GucyRywBoNPZwm7hOPBj));
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(field003, "Theme", SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().g2Nta5OBFaxTlnmCANKQc1m6thGKGbSW.getValue(), Qkmyn5B52bsZUsVKfPd9KeOLMJZ6SWnr -> SecureClass0128.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().g2Nta5OBFaxTlnmCANKQc1m6thGKGbSW.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)Qkmyn5B52bsZUsVKfPd9KeOLMJZ6SWnr));
                    field003.addSeparator();
                    field003.add(field004);
                    String field005 = System.getProperty("user.home");
                    File field006 = new File(field005, "earthhack/icon.png");
                    if (!field006.exists()) {
                        ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.iZOuRrnCz8bIh3qH1t7E1PPqJebpE0Az("Tray", "Unable to load image.");
                        return;
                    }
                    Image field007 = new ImageIcon(field006.getAbsolutePath()).getImage();
                    TrayIcon field008 = new TrayIcon(field007, "3arthh4ck", field003);
                    field008.setImageAutoSize(true);
                    try {
                        field002.add(field008);
                    }
                    catch (AWTException slQhnlaJAAUYwQK0YNQn1fnw8MzHMrIi) {
                        ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.VBKKICA4errUdfWscXHa0Olfvhvmc8h2("Tray", "Failed to load into tray.");
                    }
                    this.field001.setValue(Optional.of(field008));
                    break block6;
                }
                ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.iZOuRrnCz8bIh3qH1t7E1PPqJebpE0Az("Tray", "Tray is not supported!");
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }
}

