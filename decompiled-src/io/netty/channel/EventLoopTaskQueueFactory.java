/*
 * Decompiled with CFR.
 */
package io.netty.channel;

import java.util.Queue;

public interface EventLoopTaskQueueFactory {
    public Queue<Runnable> newTaskQueue(int var1);
}

