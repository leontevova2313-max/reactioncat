/*
 * Decompiled with CFR.
 */
package org.phobos.secure.qwnJceFRoTXJI0UskFHEqkD6CQNDGKam;

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
import org.phobos.secure.4k3gik5pyIxZVtRuXHmSCzcVVUmECG0a.o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC.EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb;
import org.phobos.secure.gmiI1CTwwvZFUELNezEUoIb0sTdZUISE.czPiZojedg4B2omXjWkcJ0wdvvLswW2S;
import org.phobos.secure.u5hZOKvw8vDHyIwwJUCY5gyszH0trlnW.zevoPXeZmo1ql5PpxQkkdqLlJ17C0vFf;

public class TZwvCROPyXpvCXQpYKsIMFE2MbEZnyha
extends zevoPXeZmo1ql5PpxQkkdqLlJ17C0vFf {
    public final /* synthetic */ MutableObject<Optional<TrayIcon>> Xx7Fvf3FLE0exrjfQ1dBU5b6c2CxdqcQ;

    public /* synthetic */ TZwvCROPyXpvCXQpYKsIMFE2MbEZnyha(EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb) {
        block6: {
            this.Xx7Fvf3FLE0exrjfQ1dBU5b6c2CxdqcQ = new MutableObject(Optional.empty());
            try {
                if (SystemTray.isSupported()) {
                    SystemTray v2WY0M03HNqh7PnWt0qRZDy2PFybCUs1 = SystemTray.getSystemTray();
                    PopupMenu QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx = new PopupMenu();
                    MenuItem iCbQZUUTgiUskr8dTnzm30bPobTKY8aO = new MenuItem("Exit");
                    iCbQZUUTgiUskr8dTnzm30bPobTKY8aO.addActionListener(fFhIsZmSPgMRfrix6nHT4Vmbq2N0gFrm -> System.exit(0));
                    QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx.add(new MenuItem(czPiZojedg4B2omXjWkcJ0wdvvLswW2S.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.tnNO9sjqYkhz1EEvQ5qgi9LLO5JQHe0e()));
                    QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx.addSeparator();
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx, "Skins", o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().lt5l0lSgaNyIMp3OQAVd78Ow1ijLCzTz.getValue(), OMNJvfL6COhFQZtuOE9PIG0gJF4TCTmX -> o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().lt5l0lSgaNyIMp3OQAVd78Ow1ijLCzTz.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)OMNJvfL6COhFQZtuOE9PIG0gJF4TCTmX));
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx, "Capes", o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().XVAOrvKPadV4YLACL1YS01MkOTX5QJAj.getValue(), U9Mz82FQqGeSY5GpkhbU4osAZhfDTWXY -> o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().XVAOrvKPadV4YLACL1YS01MkOTX5QJAj.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)U9Mz82FQqGeSY5GpkhbU4osAZhfDTWXY));
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx, "Notifications", o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().H0bVI5oHfoktzSkw7YBxTFd2yYXY02lC.getValue(), dSHKc6mo022LtJGlpTsUvuKnV1JBG2SZ -> o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().H0bVI5oHfoktzSkw7YBxTFd2yYXY02lC.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)dSHKc6mo022LtJGlpTsUvuKnV1JBG2SZ));
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx, "Shared", o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().qoROvH0slFjLpJJWpOmzJbNqvf54xkUW.getValue(), kIGuv91Miil1GucyRywBoNPZwm7hOPBj -> o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().qoROvH0slFjLpJJWpOmzJbNqvf54xkUW.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)kIGuv91Miil1GucyRywBoNPZwm7hOPBj));
                    this.tESYn0kc9cqeutyoVJ7NJ1FHMjpHqooc(QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx, "Theme", o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().g2Nta5OBFaxTlnmCANKQc1m6thGKGbSW.getValue(), Qkmyn5B52bsZUsVKfPd9KeOLMJZ6SWnr -> o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx.QTESbMzM6c152tVdKAuB8wI4qmt2X1BJ().g2Nta5OBFaxTlnmCANKQc1m6thGKGbSW.crraVzykwykyJsThoWn3tfrxvjJ10d3S((Boolean)Qkmyn5B52bsZUsVKfPd9KeOLMJZ6SWnr));
                    QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx.addSeparator();
                    QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx.add(iCbQZUUTgiUskr8dTnzm30bPobTKY8aO);
                    String dpJOKcftUfboFtt6JGkZ3hlvcGXYV0Up = System.getProperty("user.home");
                    File QTOXO2uPjFfdUhenjBNkRNf5LtlOk4GE = new File(dpJOKcftUfboFtt6JGkZ3hlvcGXYV0Up, "earthhack/icon.png");
                    if (!QTOXO2uPjFfdUhenjBNkRNf5LtlOk4GE.exists()) {
                        ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.iZOuRrnCz8bIh3qH1t7E1PPqJebpE0Az("Tray", "Unable to load image.");
                        return;
                    }
                    Image z11w4KovN2ftg0HW07VGP9B3CltcqQ6V = new ImageIcon(QTOXO2uPjFfdUhenjBNkRNf5LtlOk4GE.getAbsolutePath()).getImage();
                    TrayIcon W5V2XUfDNoqbngHTJ6WwHbLBkqp530p2 = new TrayIcon(z11w4KovN2ftg0HW07VGP9B3CltcqQ6V, "3arthh4ck", QvqH5j6WQ9zg2LtOVovdIiNLe4LQ6mrx);
                    W5V2XUfDNoqbngHTJ6WwHbLBkqp530p2.setImageAutoSize(true);
                    try {
                        v2WY0M03HNqh7PnWt0qRZDy2PFybCUs1.add(W5V2XUfDNoqbngHTJ6WwHbLBkqp530p2);
                    }
                    catch (AWTException slQhnlaJAAUYwQK0YNQn1fnw8MzHMrIi) {
                        ehHzOWjVOo2ijjkm566XV6MAnIeIpIwb.VBKKICA4errUdfWscXHa0Olfvhvmc8h2("Tray", "Failed to load into tray.");
                    }
                    this.Xx7Fvf3FLE0exrjfQ1dBU5b6c2CxdqcQ.setValue(Optional.of(W5V2XUfDNoqbngHTJ6WwHbLBkqp530p2));
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

