/*
 * Decompiled with CFR.
 */
package io.netty.channel;

import io.netty.channel.SelectStrategy;

public interface SelectStrategyFactory {
    public SelectStrategy newSelectStrategy();
}

