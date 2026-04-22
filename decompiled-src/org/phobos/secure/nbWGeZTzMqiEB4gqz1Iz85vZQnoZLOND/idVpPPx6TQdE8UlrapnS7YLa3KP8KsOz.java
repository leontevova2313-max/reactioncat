/*
 * Decompiled with CFR.
 */
package org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.earthhack.mixin.EventSubscriber;
import org.jetbrains.annotations.NotNull;
import org.phobos.secure.4k3gik5pyIxZVtRuXHmSCzcVVUmECG0a.VSmyt9oU0k5sIB6xVtuu5aJOtN3YZGXS;
import org.phobos.secure.7KgfbqPz0TZEvgx4F8x37flDNykxuB6z.Clq78lUFfrlfEED5Jvdujg2UiVeWfZ0S;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7;
import org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW.GcjRSpKmUAI8eyAlecF89GnExRq1z1th;
import org.phobos.secure.FHrRuSkAu2Jnzxr70NDRibfexy9RdMsn.NpAHJpGCixQnXglwyTbXq6LTOAq9EePF;
import org.phobos.secure.KCc25p0Ms0G8li5hGx4IIWIcsKmCc9nl.gnJFUK26GV6oK0nvDO6xLhUf7aRmgM6m;
import org.phobos.secure.KTCd4jNwkUmzY5o86On7O3FWe7L0rhHm.xKLhkyrlGUsy0s9kxgUBs2WuOb520RQK;
import org.phobos.secure.RugDPRqy5xmkJR7Yctr5fQZFvaNSp12I.Ao6akQZOgCwSanF62ZhhJdtqsNixeHgA;
import org.phobos.secure.W9m0rhPIkf1wWzaJlxYCfTnyvdHTPQJo.ViuBCJvVau4FOkcUEnFMQky7eyU7C75b;
import org.phobos.secure.W9m0rhPIkf1wWzaJlxYCfTnyvdHTPQJo._5PHTrtQ3XfdTTOKeZEkfxqZ09VaGU6U3;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ.LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ.lGHeuVxTS6kYBSigcPsdwbOC9QO8LF3o;
import org.phobos.secure.ZNQOE3cldQWPqAt3fBqZzirrkDYRRcqe.ZWikDnDtvWmPc6099UmFNaAfFFdWEokc;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B.tuVlVosF8VuJ610Mb2RXV3KitUIAbacc;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B.zC4i9iM94pEOEDpMMviMRim5Tjqp7iXG;
import org.phobos.secure.crgZDLfSiyBb2xtoxU83BmjTtRKCKydt.Gnr39EjOTVRE0YwBA3lHYt4qHdJbrcub;
import org.phobos.secure.cxD3bbysrD3GZeMPRiFOph5AKymUJItE.d5r9qTJ2SzQeolB5i4cSm8Q8H1aYMhfH;
import org.phobos.secure.cxD3bbysrD3GZeMPRiFOph5AKymUJItE.dp6L0GhifrvwdNRACMadOyaudushcTG6;
import org.phobos.secure.cxD3bbysrD3GZeMPRiFOph5AKymUJItE.n9BzlriMI0gm1XKITo5SdQcbQdgbliTY;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._5Ej87I18pZeVn0mw531zgSfzRXgYFasW;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.qrIaq3RwxFCwWKU5ZXZ8joTkjcYtVIAM;
import org.phobos.secure.dNotqec7vuODLFQFFQOYliDfOW7R0ZYp.xK2tn5MBqTOiCpJIFI8qS7V8Y4IpvT5S;
import org.phobos.secure.fTk4RlLkMp5c4dhA0Mjh9YGk4LiwJiv4.XDlo46VT8qSN32ETtlCraohg4vyIomGw;
import org.phobos.secure.p1PHpeWxsaHJXtCrqkXUI0cbzHYz3ZaJ.QWXM8ZyfVfh2Jn6hrJpGWHrpQUHCQC78;
import org.phobos.secure.qwnJceFRoTXJI0UskFHEqkD6CQNDGKam.MVOH9WPhPm0RNJ8iCYmyYEoo2QEjRDFY;
import org.phobos.secure.qwnJceFRoTXJI0UskFHEqkD6CQNDGKam.XRPszHK8Ub2ruRwX4BJHhw1fpC6PzgQW;
import org.phobos.secure.u5hZOKvw8vDHyIwwJUCY5gyszH0trlnW.g96CzaBGiMRHY8QHVoTTQKHat21zBqFT;
import org.phobos.secure.u5hZOKvw8vDHyIwwJUCY5gyszH0trlnW.zevoPXeZmo1ql5PpxQkkdqLlJ17C0vFf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz
extends zevoPXeZmo1ql5PpxQkkdqLlJ17C0vFf
implements EventSubscriber {
    public /* synthetic */ float iLOtmrjkXsEX7suiGIWSpeKpTaf6wPC0;
    public /* synthetic */ boolean cfr_renamed_867;
    public /* synthetic */ boolean Um1CLTajC1MHfSQB1AQ8qJV1DTrnTN4E;
    public /* synthetic */ float QYjmAwYZnYGOAzke8IxHdm90HMoLcX02;
    public /* synthetic */ float s5vyWPCC3hXhH56lnDSZuiOsRprQWqEq;
    public /* synthetic */ float RZjnywXJCvQJwI1CZEyJmpCHKwnKJBIX;
    public /* synthetic */ boolean DZDUwKgF1RioF6uZ1ap87aJms1TKFEWS;
    public /* synthetic */ float flPCsLZeuYIN4cJqyJyWlZfX4QITUYpb;
    public /* synthetic */ boolean FD2RmWQp4xfZQWQ0RtjRumFo3ed9XRaj;
    public static final /* synthetic */ Logger nC5Ln5Xz2SD9FhWpcyQE9ejK2b4ZmO99;
    public /* synthetic */ float cfr_renamed_583;
    public /* synthetic */ float aq7DMEggXWBZchw2sPMUj82lEHIV7Dd5;
    public /* synthetic */ float Whg4DLHpGiYeEtSHJWud8yagc0zHYrOM;
    public /* synthetic */ float D6QqeCvha0cexMag8NRp2NbIlSYJ8Uo1;
    public /* synthetic */ float ZJ27RHjUvJy4PvlME1lGzxAESdyuDblG;
    public /* synthetic */ float RuTYvIiveEvSDDTt3q9eWrClT4xVcYUJ;
    public /* synthetic */ float WHKi7S6fbSACfBvGkSKqcWa5XgIQARIq;
    public /* synthetic */ float cfr_renamed_868;
    public /* synthetic */ boolean wT5vA0J6rARn1YArb5xNfwZnNtaxqfHM;
    public final /* synthetic */ gnJFUK26GV6oK0nvDO6xLhUf7aRmgM6m Mk3mu5i0AaTrgjoNlSDWkXNazn6Zceyk;
    public /* synthetic */ float InIF3N9ijTo8kWqa0LEdxX1rHxcmZrFV;
    public final /* synthetic */ Queue<Runnable> fAdzFEvGDUmJfcZKfMA9FQW65QMK5mRp;
    public /* synthetic */ boolean mGe2VtZ3a5BCuqDcQO8xdEHl7qTpAUFX;
    public final /* synthetic */ LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs kQnCTtYsrvuKGMWDMbVidTYtjOdPTWgY;
    public final /* synthetic */ dp6L0GhifrvwdNRACMadOyaudushcTG6 Rl4KzmEpBYsDMr9l6MR0ZKBL9FTEoyTw;
    public final /* synthetic */ lGHeuVxTS6kYBSigcPsdwbOC9QO8LF3o gUgR4b73OxQOvnYuFdqZAt7BwLuBVyVz;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 GlgOJqkWU5pT2gOIV8BRwM3kx2FYBWD1;
    public final /* synthetic */ zC4i9iM94pEOEDpMMviMRim5Tjqp7iXG kd8G3FotSet0fFqGbNShXxySBITjWz0B;
    public /* synthetic */ float WCIBBFsu0n8wFjCUw5dMJefZbbvsYQrT;
    public final /* synthetic */ kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7 u4Qr97Ai1mF6ncmYexYeUKKZgQOsLUrv;
    public /* synthetic */ float cfr_renamed_869;
    public /* synthetic */ float cfr_renamed_870;
    public /* synthetic */ float NtSYQFC0CcQhu1qfHrvQkKbm9apYEBlP;

    public /* synthetic */ idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz() {
        this.kQnCTtYsrvuKGMWDMbVidTYtjOdPTWgY = LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs.oF2EUJ9g35Agp6TDl1V3X9C28qux8NQ0(LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs.P2QWQJ2Nx6BbTWCb6HTsTNJov2V2DUHL);
        this.GlgOJqkWU5pT2gOIV8BRwM3kx2FYBWD1 = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.gUgR4b73OxQOvnYuFdqZAt7BwLuBVyVz = new lGHeuVxTS6kYBSigcPsdwbOC9QO8LF3o();
        this.kd8G3FotSet0fFqGbNShXxySBITjWz0B = new zC4i9iM94pEOEDpMMviMRim5Tjqp7iXG();
        this.Mk3mu5i0AaTrgjoNlSDWkXNazn6Zceyk = new gnJFUK26GV6oK0nvDO6xLhUf7aRmgM6m();
        this.u4Qr97Ai1mF6ncmYexYeUKKZgQOsLUrv = new kH5TeNqhlxvR6CnWEu6oJeLFCgvNXYB7();
        this.fAdzFEvGDUmJfcZKfMA9FQW65QMK5mRp = new ConcurrentLinkedQueue<Runnable>();
        this.Rl4KzmEpBYsDMr9l6MR0ZKBL9FTEoyTw = new dp6L0GhifrvwdNRACMadOyaudushcTG6();
        this.cfr_renamed_69(new qrIaq3RwxFCwWKU5ZXZ8joTkjcYtVIAM(this));
        this.cfr_renamed_69(new Gnr39EjOTVRE0YwBA3lHYt4qHdJbrcub(this));
        this.cfr_renamed_69(new MVOH9WPhPm0RNJ8iCYmyYEoo2QEjRDFY(this));
        this.cfr_renamed_69(new QWXM8ZyfVfh2Jn6hrJpGWHrpQUHCQC78(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new XRPszHK8Ub2ruRwX4BJHhw1fpC6PzgQW(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new GcjRSpKmUAI8eyAlecF89GnExRq1z1th(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new xK2tn5MBqTOiCpJIFI8qS7V8Y4IpvT5S(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new n9BzlriMI0gm1XKITo5SdQcbQdgbliTY(this));
        this.cfr_renamed_69(new ZWikDnDtvWmPc6099UmFNaAfFFdWEokc(this));
        this.cfr_renamed_69(new VSmyt9oU0k5sIB6xVtuu5aJOtN3YZGXS(this, 1));
        this.cfr_renamed_69(new xKLhkyrlGUsy0s9kxgUBs2WuOb520RQK(this));
        this.cfr_renamed_69(new ViuBCJvVau4FOkcUEnFMQky7eyU7C75b(this));
        this.cfr_renamed_69(new NpAHJpGCixQnXglwyTbXq6LTOAq9EePF(this));
        this.cfr_renamed_69(new Ao6akQZOgCwSanF62ZhhJdtqsNixeHgA(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new g96CzaBGiMRHY8QHVoTTQKHat21zBqFT(this, Integer.MAX_VALUE));
        this.cfr_renamed_69(new Clq78lUFfrlfEED5Jvdujg2UiVeWfZ0S(this));
        this.cfr_renamed_69(new d5r9qTJ2SzQeolB5i4cSm8Q8H1aYMhfH(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new XDlo46VT8qSN32ETtlCraohg4vyIomGw(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new _5PHTrtQ3XfdTTOKeZEkfxqZ09VaGU6U3(this, Integer.MIN_VALUE));
        this.cfr_renamed_69(new tuVlVosF8VuJ610Mb2RXV3KitUIAbacc(this, Integer.MIN_VALUE));
    }

    @NotNull
    public static /* bridge */ /* synthetic */ LENY51Ft35pW0BwBGtkoNAFkClAhR1Rs FPU8lHqV8vqQkP9OBjEWD0YqU0XarQWm() {
        return _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().jbJBRBvK3Na5rdi1h4WNK99O8tRtiWJB().kQnCTtYsrvuKGMWDMbVidTYtjOdPTWgY;
    }

    public static /* bridge */ /* synthetic */ boolean WdIj8jisqpClnExRcTqhuUnV4Pf5gPnh() {
        return _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().jbJBRBvK3Na5rdi1h4WNK99O8tRtiWJB().Um1CLTajC1MHfSQB1AQ8qJV1DTrnTN4E;
    }

    static {
        nC5Ln5Xz2SD9FhWpcyQE9ejK2b4ZmO99 = LoggerFactory.getLogger(idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz.class);
    }
}

