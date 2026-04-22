/*
 * Decompiled with CFR.
 */
package io.netty.channel.unix;

import io.netty.channel.unix.GenericUnixChannelOption;

public final class IntegerUnixChannelOption
extends GenericUnixChannelOption<Integer> {
    public IntegerUnixChannelOption(String name, int level, int optname) {
        super(name, level, optname);
    }
}

