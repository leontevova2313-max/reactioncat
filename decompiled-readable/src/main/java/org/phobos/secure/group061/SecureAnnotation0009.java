/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group061;

import java.lang.annotation.Repeatable;
import org.phobos.secure.group033.SecureEnum0011;
import org.phobos.secure.group035.SecureEnum0014;
import org.phobos.secure.group042.SecureAnnotation0006;

@Repeatable(value=SecureAnnotation0006.class)
public @interface SecureAnnotation0009 {
    public SecureEnum0011[] method() default {SecureEnum0011.None};

    public Class<?> type() default Class.class;

    public String value();

    public Class<?>[] insertion() default {Class.class};

    public SecureEnum0014[] field() default {SecureEnum0014.None};
}

