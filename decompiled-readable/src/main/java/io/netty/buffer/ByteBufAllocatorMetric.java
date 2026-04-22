/*
 * Decompiled with CFR.
 */
package io.netty.buffer;

public interface ByteBufAllocatorMetric {
    public long usedHeapMemory();

    public long usedDirectMemory();
}

