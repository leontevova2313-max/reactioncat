/*
 * Decompiled with CFR.
 */
package io.netty.buffer;

public interface PoolChunkMetric {
    public int usage();

    public int chunkSize();

    public int freeBytes();
}

