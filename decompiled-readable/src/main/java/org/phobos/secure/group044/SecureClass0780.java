/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group044;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import org.phobos.secure.group005.ZmhQvBj1hsneBiCE5mQtyrJCu6sMtKNW;
import org.phobos.secure.group006.SecureClass0091;
import org.phobos.secure.group014.kHsOa2pojj4enOuRlkkGbdYhA3GQhMfx;
import org.phobos.secure.group015.w5zq6H8vnhHyNOG38RgsxHo9dQzSxhZD;
import org.phobos.secure.group027.SecureClass0477;
import org.phobos.secure.group048.SecureClass0874;
import org.phobos.secure.group020.hHsisKhf5veRingra2TBJca2KVpeF4sq;
import org.phobos.secure.group028.NPiTmM1zcaD4f6DYb8vIZJ2BwInBGrur;
import org.phobos.secure.group030.SecureClass0527;
import org.phobos.secure.group042.SecureClass0755;
import org.phobos.secure.group059.SecureClass1077;
import org.phobos.secure.group059.XAJk1exHAYrviwt2wzJeSPzZroDg2wV4;

public class SecureClass0780
extends SecureClass0477 {
    public final /* synthetic */ SecureClass1077 field001;
    public final /* synthetic */ Color field002;
    public final /* synthetic */ List<SecureClass0091> field003;
    public final /* synthetic */ Color field004;
    public /* synthetic */ boolean field005;
    public /* synthetic */ boolean field006;

    public /* synthetic */ SecureClass0780(SecureClass0874 wGynAYEDhvqe6gA0sp7JiEYHOEjUmuz7, SecureClass0755 vcVJmY2jkLzvkEny3sSqmE9OpdclQlkK, float gmYKiqZbpaCrxR6RJlrcPeJKNbL68Smz, float f, float f2, float NCJS5LCQviifkSjdezBva7wRsgtOAPsF, SecureClass1077 xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT) {
        super(wGynAYEDhvqe6gA0sp7JiEYHOEjUmuz7, vcVJmY2jkLzvkEny3sSqmE9OpdclQlkK, gmYKiqZbpaCrxR6RJlrcPeJKNbL68Smz, f, f2, NCJS5LCQviifkSjdezBva7wRsgtOAPsF, null);
        this.field003 = new ArrayList<SecureClass0091>();
        this.field002 = new Color(70, 70, 70, 150);
        this.field004 = new Color(0, 0, 0, 0);
        this.field001 = xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT;
        this.field003.add(new hHsisKhf5veRingra2TBJca2KVpeF4sq(this, "Start", xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT));
        this.field003.add(new ZmhQvBj1hsneBiCE5mQtyrJCu6sMtKNW(this, "Stop", xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT));
        if (xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT.N9141ALIScFnfFjYHBnPj9RMMr3fzCAs()) {
            if (SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.tnNO9sjqYkhz1EEvQ5qgi9LLO5JQHe0e().equalsIgnoreCase(xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT.URwetEiv3BGZK9aN0SeDqZ1IcD9kcSfB()) || SecureClass0527.SoLIj1FEDp2Rm6qudweYu8EFO90U85cE.h9Cjd7kO7zIEyNi70jY7zFuQoWkHfl9H().TRtJL8LJ7isXaPlFPqWfsDmss8gV6DTx().isAdmin()) {
                this.field003.add(new XAJk1exHAYrviwt2wzJeSPzZroDg2wV4(this, "Visibility", xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT.b5KOkaP3UVPZv8xmzJF1y3ouOoEQrwIe(), xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT));
                this.field003.add(new w5zq6H8vnhHyNOG38RgsxHo9dQzSxhZD(this, "Delete", xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT));
            }
        } else {
            this.field003.add(new kHsOa2pojj4enOuRlkkGbdYhA3GQhMfx(this, "Edit", xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT));
            this.field003.add(new NPiTmM1zcaD4f6DYb8vIZJ2BwInBGrur(this, "Publish", xqWHnJ34FxRuGk6Z8wBdmDVSAO616cOT));
        }
    }
}

