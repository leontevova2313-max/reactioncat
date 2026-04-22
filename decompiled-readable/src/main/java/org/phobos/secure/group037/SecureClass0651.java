/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group037;

import org.phobos.secure.group018.SecureClass0296;
import org.phobos.secure.group036.SecureClass0636;

public class SecureClass0651 {
    public final /* synthetic */ SecureClass0296<SecureClass0636> field001;
    public final /* synthetic */ SecureClass0636 field002;

    public /* synthetic */ SecureClass0651(StackTraceElement[] R86jq8ikJxzWzsUee2BS7g5wQgXoFGx3) {
        this.field001 = new SecureClass0296<T>();
        if (R86jq8ikJxzWzsUee2BS7g5wQgXoFGx3.length == 0) {
            this.field002 = null;
            return;
        }
        StackTraceElement field003 = R86jq8ikJxzWzsUee2BS7g5wQgXoFGx3[2];
        this.field002 = new SecureClass0636(field003.isNativeMethod(), field003.getFileName(), field003.getClassName(), field003.getMethodName(), field003.getLineNumber());
        int field004 = 2;
        while (field004 < R86jq8ikJxzWzsUee2BS7g5wQgXoFGx3.length) {
            StackTraceElement field005 = R86jq8ikJxzWzsUee2BS7g5wQgXoFGx3[field004];
            this.field001.dgTaCrSF85WfYBI3IKxnPxRF1Sgi2Ufc(new SecureClass0636(field005.isNativeMethod(), field005.getFileName(), field005.getClassName(), field005.getMethodName(), field005.getLineNumber()));
            ++field004;
        }
        return;
    }
}

