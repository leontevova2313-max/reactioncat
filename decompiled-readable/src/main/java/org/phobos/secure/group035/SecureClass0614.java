/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group035;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.phobos.secure.group029.SecureClass0501;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureClass0614 {
    public static final /* synthetic */ List<Object> field001;
    public static final /* synthetic */ Logger field002;

    public static /* bridge */ /* synthetic */ void cfr_renamed_481(Object O9tEiztQ69KcEPIkGLlN3dq2Yymj9iTs) {
        field001.add(O9tEiztQ69KcEPIkGLlN3dq2Yymj9iTs);
    }

    public static /* bridge */ /* synthetic */ void BHsyt8fuzc7CraE4hHvCJTUl6vSmVg0C(String WuCkM826f1aVahBm0r9eNx4RS2c6Z3e2) {
        SecureClass0501.QLtfRiJkwuxQbPZtsww0NgFrMhEJBYf0("JavaVM", WuCkM826f1aVahBm0r9eNx4RS2c6Z3e2);
    }

    static {
        field002 = LoggerFactory.getLogger(SecureClass0614.class);
        field001 = new ArrayList<Object>();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static /* bridge */ /* synthetic */ void run() {
        SecureClass0614.BHsyt8fuzc7CraE4hHvCJTUl6vSmVg0C("Starting garbage collection session.");
        try {
            for (Object O247MxvbcAg2wwOXpY8J6L088dMF10Ar : field001) {
                Class<?> field003 = O247MxvbcAg2wwOXpY8J6L088dMF10Ar.getClass();
                for (Field RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX : field003.getDeclaredFields()) {
                    RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.setAccessible(true);
                    if (RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.getType().equals(List.class)) {
                        List field004 = (List)RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.get(O247MxvbcAg2wwOXpY8J6L088dMF10Ar);
                        try {
                            field004.clear();
                            SecureClass0614.BHsyt8fuzc7CraE4hHvCJTUl6vSmVg0C("Cleared %s as List.class".formatted(RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.getName()));
                        }
                        catch (Throwable throwable) {}
                        continue;
                    }
                    if (RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.getType().equals(Map.class)) {
                        Map map = (Map)RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.get(O247MxvbcAg2wwOXpY8J6L088dMF10Ar);
                        try {
                            map.clear();
                            SecureClass0614.BHsyt8fuzc7CraE4hHvCJTUl6vSmVg0C("Cleared %s as Map.class".formatted(RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.getName()));
                        }
                        catch (Throwable throwable) {}
                        continue;
                    }
                    if (RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.getType().equals(Queue.class)) {
                        Queue field005 = (Queue)RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.get(O247MxvbcAg2wwOXpY8J6L088dMF10Ar);
                        try {
                            field005.clear();
                            SecureClass0614.BHsyt8fuzc7CraE4hHvCJTUl6vSmVg0C("Cleared %s as Queue.class".formatted(RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.getName()));
                        }
                        catch (Throwable throwable) {}
                        continue;
                    }
                    if (!RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.getType().equals(Collection.class)) continue;
                    Collection collection = (Collection)RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.get(O247MxvbcAg2wwOXpY8J6L088dMF10Ar);
                    try {
                        collection.clear();
                        SecureClass0614.BHsyt8fuzc7CraE4hHvCJTUl6vSmVg0C("Cleared %s as Collection.class".formatted(RssLepqWkp5Gvt6LKCq9dqt5sOK5TBfX.getName()));
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        finally {
            System.gc();
            SecureClass0614.BHsyt8fuzc7CraE4hHvCJTUl6vSmVg0C("Closing memory section");
        }
    }
}

