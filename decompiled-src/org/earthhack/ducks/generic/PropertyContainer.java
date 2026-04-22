/*
 * Decompiled with CFR.
 */
package org.earthhack.ducks.generic;

import java.util.HashMap;
import java.util.Map;
import org.earthhack.ducks.generic.Property;

public class PropertyContainer {
    private final Map<String, Property<?>> properties = new HashMap<String, Property<?>>();

    public <T> void put(String identifier, T data) {
        this.properties.put(identifier, new Property<T>(data));
    }

    public <T> T get(String identifier, Class<T> type) {
        return (T)this.properties.get(identifier);
    }
}

