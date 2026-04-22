/*
 * Decompiled with CFR.
 */
package org.phobos.secure.group011;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value={ElementType.METHOD})
@Retention(value=RetentionPolicy.RUNTIME)
public @interface SecureAnnotation0003 {
    public int priority() default 10;

    public boolean direct() default false;
}

