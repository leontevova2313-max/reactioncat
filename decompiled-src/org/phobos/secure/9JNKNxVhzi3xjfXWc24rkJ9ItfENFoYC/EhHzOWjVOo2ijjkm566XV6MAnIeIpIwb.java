/*
 * Decompiled with CFR.
 */
package org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC;

import engine.linking.NativeMethodHandler;
import java.nio.file.Path;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import org.phobos.secure.0dlmuoMYLMuYPO0vDrDlwmMFyqqO6D1f.ZLoUipwMUMW6D7WItb5WiPzz6AYP9Ozb;
import org.phobos.secure.0dlmuoMYLMuYPO0vDrDlwmMFyqqO6D1f.oyIi7sKFetxdBeAx2cL1a5OEe38nxukI;
import org.phobos.secure.16Mnnb0zAYVJk3sUWllcgfOZyIAaMcd2._5XKGiJcEGAwF7BtBai1JA5fpnGaX8Q2O;
import org.phobos.secure.1QTSqdFu1qt4b1WvDl15MoAj2vMj5tlJ.nHrXr2U17d82HnxlaoVpxUyDRNW90E2b;
import org.phobos.secure.233YlkA2dSoXPmZOG4uyJFB5W5MKs63U.iJ4xidgLfPAKDLKjE0Nwm0mR8nMadStI;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx.D1bcv5X2RbqauOIJZ7H69HfBkbyGfcTR;
import org.phobos.secure.2KM7i3HC4IscymVjDC1ZdaVuCiRLkgDx.heIDGP8t1rXOCEc4vk7o4zRyIfgtESXr;
import org.phobos.secure.4S056CN3zuBvpqFiPUuxVM463jrKvbvj.Ebc69RhQoH0j6iCkzbiTbDh0FCy6mYam;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.FWOK8F0nHHTgM2jVB1hCjmalSqYtE932;
import org.phobos.secure.4ankqQTX08KHaG3hRKAriJZJvFiF7YAw.xkVapQvDsjtSecGBgMvS1Bs5RfYhpdrj;
import org.phobos.secure.4k3gik5pyIxZVtRuXHmSCzcVVUmECG0a.o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx;
import org.phobos.secure.5bPTSlW9H7Qt0ssdAgoEGVBBNQt12dCY.ZaMH1F78hPzrCBzJ5n2izo5SK8ICh2zn;
import org.phobos.secure.5lpPjH4tBOjuRslbBVCcle1ySviv7iTt.fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2p;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh.T0GxaHkbVi3llJNdfvHs76VpOS2fUCSL;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh.ZAGvZ8N6f75yY0JlNKwOPH6F6f9pwbXH;
import org.phobos.secure.7yXPNJapXcOunTF8mKC7FdWQgwqqAhyh.awMNPO9g9jjmgTv8nfoPWGV1S7aBYJ2E;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.FCGUvnQ2fFE9myiPpUmki1apsKWoMJG4;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.SK7EzygKSUutVbZMaykXlkRgOIJJZACP;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE.VvcsCpoNXO1HH3SQvCff8sgmHfIZOdQ3;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE._3f2q4wpDyYapTzun1DJL9HOv63XNN0b0;
import org.phobos.secure.9JA6nKEdvkMaYgGxbP5o8ET2jaNDNhYE._7pVQ6K7NRily4FeTT6DyZAL8moJ2olHb;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC.oekVtkj6g1OTZeZ3NFcPOByzpxzeIBke;
import org.phobos.secure.9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC.saroSFC46UbrKFZnWleVGFDu3MK5WAMz;
import org.phobos.secure.AuMPaDyo4HD2Mdz6ox1zOjYGNwTJpKkh.Ydx07PQw3Sqg1pPDSXYZ7P7Dy7IJxXeo;
import org.phobos.secure.AuMPaDyo4HD2Mdz6ox1zOjYGNwTJpKkh.yePBmJ6A5m1DSku4NNKQbbrSTkJWgRFy;
import org.phobos.secure.Bv8mkeGBsP5EDWvAExIaT17O9mzLwSxn.B5vWmUTtMRo9RkMTtnzbYvDJzS7PkXnm;
import org.phobos.secure.Bv8mkeGBsP5EDWvAExIaT17O9mzLwSxn.wPaC5tCw7WVyRaszJ00zHnED8LTV8Vv9;
import org.phobos.secure.E7qwU8abcwz3brAbulptWa86RqdgSg2V._78VhAz5HjtWd680p3R1vT1QJa6l3gGq3;
import org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW.O7yEORijIzO9I9Mcpaw4t40pXRUpyoPF;
import org.phobos.secure.FD1M8xx1CUcwZMnOiOG8cxXvj3uzSrUW._4CmZexeGs6ygV9P6WcJ4mONpzzyKr241;
import org.phobos.secure.JvKxozE6bl8AwcyhK99COx2dUHLEtDrG._4DCuQgiZRMdemp7aTrBgYmxrffGYvd67;
import org.phobos.secure.KCc25p0Ms0G8li5hGx4IIWIcsKmCc9nl.Ws9lGYjpVLer9oWnGwFIQ41nRQuMBYFr;
import org.phobos.secure.KTCd4jNwkUmzY5o86On7O3FWe7L0rhHm.xef0daoJkwtizGWMVZ1kEKfF3MB4Mq9S;
import org.phobos.secure.L6iyrcIs2cjPMNtXn4nGdMNqvAE9CTGz.tjmzrzK24DIrk1d3AB2OH9bOi8iw5ve8;
import org.phobos.secure.MpluYqz5kopiubvq0FxGSsRakZ18ildf.l5Y379IZqfbzSWTmYHVbWGyGdLUdo83k;
import org.phobos.secure.N8Mbvei5jZJniHivyFx9alrtSLUznZLt.Q1L3fcmHqa2NwSfKYlYnehFrmhhS2Htu;
import org.phobos.secure.NdpuLH05nuMBrXiq1Mkn9WVLgxgBpULm.PuRlupm35R61dEKCmBApruLhPM7T4dRV;
import org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir.MJguaT1DIAntWQH5DnRmZy35LCD8rbvp;
import org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir.YOqccXp6natgra0Zp2mzpRzdY5gFh4X4;
import org.phobos.secure.QXHXtRyloXeqPw0DdQTO29pDMZZhfbir.Z4jqvriKMuPniaKZSfccp8V3PGB4HCD1;
import org.phobos.secure.RugDPRqy5xmkJR7Yctr5fQZFvaNSp12I.GEEkDkvM8O2wv7RQdNuFM5opiKyja70G;
import org.phobos.secure.SFDLLxag6BrgT2xFaaiwM4KXMC6N6SbP.WN7ERhV8jPB4lEzVu2JqTDaHUR2OQApj;
import org.phobos.secure.W9m0rhPIkf1wWzaJlxYCfTnyvdHTPQJo.k5iMG8pEOyB98WhrQotJXdllTgvowIBe;
import org.phobos.secure.WImki23QfccO83WDzvL29AaNQYxbrmkQ.eikUxQvRnj4a4VGxGyUf2Hy9JKtqxYZa;
import org.phobos.secure.XgtuoRE7Nn2SaMa6CCKtbXRVenWLiNmf.oty55slyoASCo5SoIp8kVrhE5SrTHJO3;
import org.phobos.secure.ZNQOE3cldQWPqAt3fBqZzirrkDYRRcqe.amKpsbkspgo9CPuzNdWIepUr5ZdmUotn;
import org.phobos.secure.ZNQOE3cldQWPqAt3fBqZzirrkDYRRcqe.tU09nOXLVErOKh2s8fu35lapUEQURjE1;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B.Fb08wnKCEwtQ1e1t259vxoiWkhEzB5eZ;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B.ue1YPf3xdyMWT8wD3aDWGQYW2eY5PFUg;
import org.phobos.secure.Zg5piRqRGJmmkmUCqBJbLypTJlZdBA7B.vykO6JGd1oW1ufVslKsOJ4YInsleU2yr;
import org.phobos.secure.alaztrOdEaHtHUSzgWnXKSglr2FhoUDG.JL73jsFMioKzK1tgeRDZP8qGqJg5t6e4;
import org.phobos.secure.crgZDLfSiyBb2xtoxU83BmjTtRKCKydt.EkJchWlX73FqbWwrraP4scYUeVWaT8Ce;
import org.phobos.secure.d1e1dzetKUO8NeW3EP3jTje523wHVwd5._5Ej87I18pZeVn0mw531zgSfzRXgYFasW;
import org.phobos.secure.fTk4RlLkMp5c4dhA0Mjh9YGk4LiwJiv4._9jd9HOQXys7XsbL0GnlmCSEZpmXhveWw;
import org.phobos.secure.fTk4RlLkMp5c4dhA0Mjh9YGk4LiwJiv4._9xumpI2i8LkAwy0NmTKnTN4MG0I4fLIU;
import org.phobos.secure.gmiI1CTwwvZFUELNezEUoIb0sTdZUISE.MMwUDFA3hx00wHDDeAE1wzJ5xyx8ZOvx;
import org.phobos.secure.l8qVgd4h8KzeLunhDKmsS7NoEAXv88uf.EyQcM0R3t8t8UMjcsXiCrszklX0Z27tE;
import org.phobos.secure.l8qVgd4h8KzeLunhDKmsS7NoEAXv88uf._06UI6DMDBg42Ra1MGEwPbLWBT1iLoA2W;
import org.phobos.secure.m0W5AbJZPb6oL8kGQnlxCA1x2TGXa70A.qygXhRHG6tcJJpKLLA9I943xE0DWC74q;
import org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND.h3SzzdBY9uIH3K6PhezfNUIuRgNxNYqW;
import org.phobos.secure.nbWGeZTzMqiEB4gqz1Iz85vZQnoZLOND.idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.STIwd3FLE29MdjITyKF1PTkuQyykm1IF;
import org.phobos.secure.oqUC6PDfpdLuWstoEUDlKxT3Xk6NpgUX.cWV6Ocdw6VlWODCyvwYvJapHdif6jIuy;
import org.phobos.secure.pc6HIQuJAclXcc4JCpbef8Fre45f1Kdg.onR8E15Uu72sqGZOExsrkgrCmGkMbzRH;
import org.phobos.secure.qwnJceFRoTXJI0UskFHEqkD6CQNDGKam.TZwvCROPyXpvCXQpYKsIMFE2MbEZnyha;
import org.phobos.secure.s6BjRjmuQbcwr3ZfDYcfyZoaATqNdajb.AXcu8WdyxRgvvIJdNPjp4oO8peSe8iAc;
import org.phobos.secure.t0qWw7zeufscC4VvH6JqtmEJzabrhuCQ.WYj2CHvNmNPxAFeXbXpFfyHUlydHOq3C;
import org.phobos.secure.t0qWw7zeufscC4VvH6JqtmEJzabrhuCQ.bvgskAKfL6fDlNjFgP1ZZO4gr9bz4hxL;
import org.phobos.secure.zldfmHZHeiUwGiHn9xaS24B8lnBqhcRI.So66TOvMfmkZhXhsUT9ud9eFmr85stIi;
import org.slf4j.Logger;

public class EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb
extends UnicastRemoteObject
implements STIwd3FLE29MdjITyKF1PTkuQyykm1IF,
JL73jsFMioKzK1tgeRDZP8qGqJg5t6e4 {
    public /* synthetic */ h3SzzdBY9uIH3K6PhezfNUIuRgNxNYqW jgrF0TPEvmFRiMoNEWbPdkNnbQRKqnBe;
    public static /* synthetic */ byte[] CF58Q9ucibwHUwwanVWnKvLJJmGvWKA3;
    public static final /* synthetic */ Path xe90IxiqwlNUHNNOVD27CHKBAXZUEmx7;
    public final /* synthetic */ onR8E15Uu72sqGZOExsrkgrCmGkMbzRH ODgM513bV5DFynegwmlZsD4B2i4YA20K;
    public /* synthetic */ long E7uXrbWI6h4nke3QKKLD3kr45rsn6K2p;
    public static final /* synthetic */ fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2p zdHV2rO1ndAhaYoTQM6XO6t7QZdNGeOj;
    public final /* synthetic */ List<Consumer<FWOK8F0nHHTgM2jVB1hCjmalSqYtE932>> ARjec40JGMgQfp2gPNLHogXCFgeL7EqO;
    public final /* synthetic */ qygXhRHG6tcJJpKLLA9I943xE0DWC74q Hz0rE0GicX9PP5gWWZUaf3t09WHZMIUm;
    public static volatile /* synthetic */ boolean EgXAXgTfpf4NLJ7JIn6v9ADgoEgAEyjZ;
    public static /* synthetic */ boolean FBCmWkaJ8diJ1BLTAJ6SMvCf9wGwZlYH;
    public /* synthetic */ long cfr_renamed_304;
    public final /* synthetic */ List<Consumer<amKpsbkspgo9CPuzNdWIepUr5ZdmUotn>> cfr_renamed_305;
    public final /* synthetic */ Logger cfr_renamed_306;
    public /* synthetic */ ExecutorService cfr_renamed_307;
    public final /* synthetic */ ue1YPf3xdyMWT8wD3aDWGQYW2eY5PFUg cfr_renamed_308;
    public /* synthetic */ Thread YhSO2nrUMesHSd4mwSTEBFTpSt69UFZm;
    public final /* synthetic */ oty55slyoASCo5SoIp8kVrhE5SrTHJO3 ndZu6Jd3L9nByD85udvgF2ItNaHdcklb;
    public static final /* synthetic */ byte[][] cfr_renamed_309;
    public final /* synthetic */ AXcu8WdyxRgvvIJdNPjp4oO8peSe8iAc cfr_renamed_310;
    public final /* synthetic */ saroSFC46UbrKFZnWleVGFDu3MK5WAMz FDmnaLzU69wP4t4pFMqDdaWQtwnV804Z;
    public /* synthetic */ o3AyhlXLgkqFnb8vu462uSMpqQ4ubfNx MKOplfdAfaCxt2FWTzivnDD6lapon2nN;
    public /* synthetic */ _78VhAz5HjtWd680p3R1vT1QJa6l3gGq3 W86JdwVPwvbpi0kk0ATN8OqW8XEUgvMH;
    public /* synthetic */ B5vWmUTtMRo9RkMTtnzbYvDJzS7PkXnm LzW37vMnw3FVLwm53mCtgotO8Pa67rw8;
    public /* synthetic */ ZLoUipwMUMW6D7WItb5WiPzz6AYP9Ozb cPZqG8Sh1qpVhFHs6gwYdaAIcu3nhgcr;
    public /* synthetic */ idVpPPx6TQdE8UlrapnS7YLa3KP8KsOz cfr_renamed_311;
    public /* synthetic */ VvcsCpoNXO1HH3SQvCff8sgmHfIZOdQ3 p4qjvzEDiDb8KZzBAWVJoL3nl5o18fnb;
    public /* synthetic */ tU09nOXLVErOKh2s8fu35lapUEQURjE1 Coh8gQQ88jik5oNl06CBlAit2XEGenxD;
    public final /* synthetic */ Z4jqvriKMuPniaKZSfccp8V3PGB4HCD1 QpUYd3wvR0nxACx6hEsK5xU59KJhCLoH;
    public final /* synthetic */ MJguaT1DIAntWQH5DnRmZy35LCD8rbvp cfr_renamed_312;
    public /* synthetic */ ZaMH1F78hPzrCBzJ5n2izo5SK8ICh2zn mohrdS6M9IHjhg9qAOEG5f3qwMMZL570;
    public /* synthetic */ oyIi7sKFetxdBeAx2cL1a5OEe38nxukI LraaBcOLrhXVyBFWdvUXuqGqXojVIoi0;
    public /* synthetic */ _5XKGiJcEGAwF7BtBai1JA5fpnGaX8Q2O cfr_renamed_313;
    public final /* synthetic */ xef0daoJkwtizGWMVZ1kEKfF3MB4Mq9S FHP0AZ4XNxMoWnC8rKubeFS4SsvX6gBt;
    public /* synthetic */ GEEkDkvM8O2wv7RQdNuFM5opiKyja70G TemttGcocMBM7R3UQ3t7zzJvi7XrDZOf;
    public final /* synthetic */ Z4jqvriKMuPniaKZSfccp8V3PGB4HCD1 E14k0kVoGeEMiUKHUMF5LPzioZYe7HN6;
    public /* synthetic */ iJ4xidgLfPAKDLKjE0Nwm0mR8nMadStI cfr_renamed_314;
    public final /* synthetic */ class_310 MVAbM7h5UkMG5e6PRtPjC4BAVJm6KlGn;
    public /* synthetic */ PuRlupm35R61dEKCmBApruLhPM7T4dRV NslVV5bSitEerN9gX0rQaUc5F4o9TVMY;
    public /* synthetic */ EkJchWlX73FqbWwrraP4scYUeVWaT8Ce acaNe7R57NU8xMlwftjS6GdDquG0m9cf;
    public final /* synthetic */ Ws9lGYjpVLer9oWnGwFIQ41nRQuMBYFr AwQbiocvihLcNCLEtH8mHDP6kuM1EMqU;
    public /* synthetic */ k5iMG8pEOyB98WhrQotJXdllTgvowIBe LKuEKhLyVY3S0fAbwPm4KhYQBlztdYbd;
    public /* synthetic */ _4DCuQgiZRMdemp7aTrBgYmxrffGYvd67 dIC8UjlLw2HqgYL6dTHmfhhVzWGBYPvi;
    public /* synthetic */ _9xumpI2i8LkAwy0NmTKnTN4MG0I4fLIU bkjHvJ93vu5mLE2wrshE5DXuhy23j4yh;
    public /* synthetic */ D1bcv5X2RbqauOIJZ7H69HfBkbyGfcTR SSalDJvyxE45BSfNbITlL8ZIMHbVu1Ti;
    public /* synthetic */ Q1L3fcmHqa2NwSfKYlYnehFrmhhS2Htu Kpd1SlCXjrPMKBpEjOXTNHxLWDY0TYo7;
    public /* synthetic */ Fb08wnKCEwtQ1e1t259vxoiWkhEzB5eZ WTvkb2ZsqRx6laUlSZbiLVlGPI4x2YLW;
    public /* synthetic */ yePBmJ6A5m1DSku4NNKQbbrSTkJWgRFy N0goMEKIZ9yLSbKkpUSX2Vu5lBO4qhSc;
    public /* synthetic */ T0GxaHkbVi3llJNdfvHs76VpOS2fUCSL cfr_renamed_315;
    public /* synthetic */ vykO6JGd1oW1ufVslKsOJ4YInsleU2yr GPIkCnL95rEhKjXNuU92cAw9eUugTbAe;
    public /* synthetic */ TZwvCROPyXpvCXQpYKsIMFE2MbEZnyha jBEJd9wXmvb87qTdlaa65xAk7RrafRJ0;
    public /* synthetic */ WN7ERhV8jPB4lEzVu2JqTDaHUR2OQApj DPbsvbhdtPNZ3WR1t54MPjLugGQa0Jzv;
    public /* synthetic */ So66TOvMfmkZhXhsUT9ud9eFmr85stIi n5PYbyY0QhGsPiNPC61ut28MIIU38bMn;
    public /* synthetic */ _06UI6DMDBg42Ra1MGEwPbLWBT1iLoA2W U42x0aMwberhAJVaePAvtJswLhx2WYVW;
    public /* synthetic */ nHrXr2U17d82HnxlaoVpxUyDRNW90E2b cfr_renamed_316;
    public /* synthetic */ MMwUDFA3hx00wHDDeAE1wzJ5xyx8ZOvx i5lQ9QLfWWxBkmBFweB5OauRrxrQVr3h;
    public /* synthetic */ xkVapQvDsjtSecGBgMvS1Bs5RfYhpdrj R4I9xATLdh1hgg4kuQS7WFYw9sBy8m5T;
    public /* synthetic */ cWV6Ocdw6VlWODCyvwYvJapHdif6jIuy OWXXc1Vja7EAwDZx6BEucIFTuJSypz4G;
    public /* synthetic */ ZAGvZ8N6f75yY0JlNKwOPH6F6f9pwbXH HVNYuRFijbQmlzFPpR4aZivmCYYfYFXQ;
    public /* synthetic */ _4CmZexeGs6ygV9P6WcJ4mONpzzyKr241 PiwBppFapkfnEmvA2iFdxQOvznjvyUwN;
    public /* synthetic */ tjmzrzK24DIrk1d3AB2OH9bOi8iw5ve8 v6Y73M5cxKhNzRsW5Dgn4dJ1qW2KRK4M;
    public /* synthetic */ O7yEORijIzO9I9Mcpaw4t40pXRUpyoPF iVJteoeotiz7b3NyZ8TqBavRTiXGw5UX;
    public /* synthetic */ eikUxQvRnj4a4VGxGyUf2Hy9JKtqxYZa cfr_renamed_317;
    public /* synthetic */ awMNPO9g9jjmgTv8nfoPWGV1S7aBYJ2E R6zVhX86XYJVFcgcyzrXKavByZpoFI2L;
    public /* synthetic */ oekVtkj6g1OTZeZ3NFcPOByzpxzeIBke xaa7GcE6yURN1rbAJrVXkj2WaYz1nltk;
    public /* synthetic */ bvgskAKfL6fDlNjFgP1ZZO4gr9bz4hxL N1zhJpTk8uMgTbR3NhKeiBXRYehKKKXo;
    public /* synthetic */ SK7EzygKSUutVbZMaykXlkRgOIJJZACP lDnwO4VrjkB3UPUN20EsaIPEinVSyZiO;
    public /* synthetic */ l5Y379IZqfbzSWTmYHVbWGyGdLUdo83k YcyMon6LxGH2XJ9IURJJVl1f5AhahRfO;
    public /* synthetic */ _7pVQ6K7NRily4FeTT6DyZAL8moJ2olHb KMg9s6CoNB0Y4y1wL8eTYaqgWdM654Wn;
    public /* synthetic */ EyQcM0R3t8t8UMjcsXiCrszklX0Z27tE cfr_renamed_318;
    public /* synthetic */ _3f2q4wpDyYapTzun1DJL9HOv63XNN0b0 Uv8q140rOVJWfBufEPMt6emo0uLKbK8c;
    public /* synthetic */ _9jd9HOQXys7XsbL0GnlmCSEZpmXhveWw XZAOOTp1Gr5dl8bQfFBQUCxaLxQPY43S;
    public /* synthetic */ wPaC5tCw7WVyRaszJ00zHnED8LTV8Vv9 cfr_renamed_319;
    public /* synthetic */ Ebc69RhQoH0j6iCkzbiTbDh0FCy6mYam yJ2dhBtf3pBS3rEXCU0OAnW5OwVmDMQ6;
    public /* synthetic */ YOqccXp6natgra0Zp2mzpRzdY5gFh4X4 ag6hxa2gSi4SmEoWjMY2p9JW4a3qfpmL;
    public /* synthetic */ heIDGP8t1rXOCEc4vk7o4zRyIfgtESXr Rnm2ipgpSvudI5ro1SH93oGnMQ7Ql5O2;
    public /* synthetic */ Ydx07PQw3Sqg1pPDSXYZ7P7Dy7IJxXeo Q8skCU5ikxeSsGLx7MthGr2AEOw9YmMy;
    public /* synthetic */ FCGUvnQ2fFE9myiPpUmki1apsKWoMJG4 VsCQxCKbARrRvc0rb2oDERxjV4j8XlQj;
    public /* synthetic */ WYj2CHvNmNPxAFeXbXpFfyHUlydHOq3C PbX7ZSXj9j0qERukD7ka7KAtvDbmwj6H;

    public static /* bridge */ /* synthetic */ void S3yM43JVkf8EYVVvCMVMgr1y662rKyjq(Runnable TeHu753ZN8ZFe0XmxY44Q05QN6PK5XD9) {
        _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().UXMRY8meCaAnlLFB42TocatoHskqw6hd().gy9K6Ew6VRIff7F2M55gLolOafdiFDrY(TeHu753ZN8ZFe0XmxY44Q05QN6PK5XD9);
    }

    public static /* bridge */ /* synthetic */ <T> CompletableFuture<T> supplyAsync(Supplier<T> liiP6ivtrwf80ksJzbVkL8KndFsVIPEm) {
        return CompletableFuture.supplyAsync(liiP6ivtrwf80ksJzbVkL8KndFsVIPEm, _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().cfr_renamed_320());
    }

    public static /* bridge */ /* synthetic */ void XmA7DkS9oixKv7O3yqHttIvO35rGp6YB(Runnable runnable) {
        CompletableFuture.runAsync(runnable, (Executor)class_310.method_1551());
    }

    public static /* bridge */ /* synthetic */ <T> CompletableFuture<T> cfr_renamed_321(Supplier<T> wDOwI3hcsdVum9Gkyvo0NghgcvFJDdEc) {
        return CompletableFuture.supplyAsync(wDOwI3hcsdVum9Gkyvo0NghgcvFJDdEc);
    }

    public /* synthetic */ EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb() throws RemoteException {
        this.__init__org_phobos_secure_9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC_EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb();
    }

    public native /* synthetic */ void __init__org_phobos_secure_9JNKNxVhzi3xjfXWc24rkJ9ItfENFoYC_EhHzOWjVOo2ijjkm566XV6MAnIeIpIwb() throws RemoteException;

    public static /* bridge */ /* synthetic */ CompletableFuture<Void> bMOwgjLAed32RCkjzDiD4MYOD7abJdaK(Runnable GBKEW2MlfWW5BQEvIJ6i7aBmvIDngWcr) {
        return CompletableFuture.runAsync(GBKEW2MlfWW5BQEvIJ6i7aBmvIDngWcr, _5Ej87I18pZeVn0mw531zgSfzRXgYFasW.vy0O2dGTVuT28ESAmaFu6j9eAa9DW6EJ().cfr_renamed_320());
    }

    public static /* bridge */ /* synthetic */ void eYsn3PtHqYjKhwOWYII5SYg7UtbCmgU3(class_2561 iHpwmkeLIYbriFkPMGfF5a02yS2nF5bp, amKpsbkspgo9CPuzNdWIepUr5ZdmUotn y810soHFVwk7t3wLR9Wgx3WdsYU1d9os) {
        y810soHFVwk7t3wLR9Wgx3WdsYU1d9os.pq6kejtIGf7D0XyUIoDspffgY3KBieLM.add(iHpwmkeLIYbriFkPMGfF5a02yS2nF5bp);
    }

    public static /* bridge */ /* synthetic */ void tmqRrlVcJsXFCSJG23D9t33tCN53ICUS(String qVFRxwBkFsJHj6rvXK4MjdOSRXfBPewg, FWOK8F0nHHTgM2jVB1hCjmalSqYtE932 IBQf5avpt2MHc4MqHYa9irsba0h7QWBV) {
        IBQf5avpt2MHc4MqHYa9irsba0h7QWBV.lulxWGLvVz4lUNCCYUlS1Tv5iTklGiP7(qVFRxwBkFsJHj6rvXK4MjdOSRXfBPewg);
    }

    public static /* bridge */ /* synthetic */ void ZHp35Guxu1FoZPW8Se0mc64Hl6GyM9rg() {
    }

    public static /* bridge */ /* synthetic */ void j6coD7LEhjdJzFCBUnhKaWHpBmHpTDUv(String EKKlJe6HXlcfP0zqGkh6owexkIO4jZsw, FWOK8F0nHHTgM2jVB1hCjmalSqYtE932 z7s7cURNDSQn5S83zL5EyBTcInOcbE9S) {
        z7s7cURNDSQn5S83zL5EyBTcInOcbE9S.lulxWGLvVz4lUNCCYUlS1Tv5iTklGiP7(EKKlJe6HXlcfP0zqGkh6owexkIO4jZsw);
    }

    static {
        NativeMethodHandler.registerNativeCallbacks(30);
        xe90IxiqwlNUHNNOVD27CHKBAXZUEmx7 = FabricLoader.getInstance().getGameDir().resolve("phoboslite");
        EgXAXgTfpf4NLJ7JIn6v9ADgoEgAEyjZ = true;
        zdHV2rO1ndAhaYoTQM6XO6t7QZdNGeOj = fEsGFiXSMvSWcanFvsnGzM2Fa0jIUp2p.API_1_1;
        cfr_renamed_309 = new byte[1024][32];
        CF58Q9ucibwHUwwanVWnKvLJJmGvWKA3 = new byte[0];
        FBCmWkaJ8diJ1BLTAJ6SMvCf9wGwZlYH = false;
        Arrays.fill((Object[])cfr_renamed_309, new byte[]{15, 15, 15, 15, 15, 15, 15, 15, 15});
    }
}

