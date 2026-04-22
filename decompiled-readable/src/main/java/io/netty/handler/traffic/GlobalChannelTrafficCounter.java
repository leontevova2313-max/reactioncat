/*
 * Decompiled with CFR.
 */
package io.netty.handler.traffic;

import io.netty.handler.traffic.GlobalChannelTrafficShapingHandler;
import io.netty.handler.traffic.TrafficCounter;
import io.netty.util.internal.ObjectUtil;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GlobalChannelTrafficCounter
extends TrafficCounter {
    public GlobalChannelTrafficCounter(GlobalChannelTrafficShapingHandler trafficShapingHandler, ScheduledExecutorService executor, String name, long checkInterval) {
        super(trafficShapingHandler, executor, name, checkInterval);
        ObjectUtil.checkNotNullWithIAE(executor, "executor");
    }

    @Override
    public synchronized void start() {
        if (this.monitorActive) {
            return;
        }
        this.lastTime.set(GlobalChannelTrafficCounter.milliSecondFromNano());
        long localCheckInterval = this.checkInterval.get();
        if (localCheckInterval > 0L) {
            this.monitorActive = true;
            this.monitor = new MixedTrafficMonitoringTask((GlobalChannelTrafficShapingHandler)this.trafficShapingHandler, this);
            this.scheduledFuture = this.executor.scheduleAtFixedRate(this.monitor, 0L, localCheckInterval, TimeUnit.MILLISECONDS);
        }
    }

    @Override
    public synchronized void stop() {
        if (!this.monitorActive) {
            return;
        }
        this.monitorActive = false;
        this.resetAccounting(GlobalChannelTrafficCounter.milliSecondFromNano());
        this.trafficShapingHandler.doAccounting(this);
        if (this.scheduledFuture != null) {
            this.scheduledFuture.cancel(true);
        }
    }

    @Override
    public void resetCumulativeTime() {
        Iterator<V> iterator = ((GlobalChannelTrafficShapingHandler)this.trafficShapingHandler).channelQueues.values().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                super.resetCumulativeTime();
                return;
            }
            GlobalChannelTrafficShapingHandler.PerChannel perChannel = (GlobalChannelTrafficShapingHandler.PerChannel)iterator.next();
            perChannel.channelTrafficCounter.resetCumulativeTime();
        }
    }

    private static class MixedTrafficMonitoringTask
    implements Runnable {
        private final GlobalChannelTrafficShapingHandler trafficShapingHandler1;
        private final TrafficCounter counter;

        MixedTrafficMonitoringTask(GlobalChannelTrafficShapingHandler trafficShapingHandler, TrafficCounter counter) {
            this.trafficShapingHandler1 = trafficShapingHandler;
            this.counter = counter;
        }

        @Override
        public void run() {
            if (!this.counter.monitorActive) {
                return;
            }
            long newLastTime = TrafficCounter.milliSecondFromNano();
            this.counter.resetAccounting(newLastTime);
            Iterator<V> iterator = this.trafficShapingHandler1.channelQueues.values().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    this.trafficShapingHandler1.doAccounting(this.counter);
                    return;
                }
                GlobalChannelTrafficShapingHandler.PerChannel perChannel = (GlobalChannelTrafficShapingHandler.PerChannel)iterator.next();
                perChannel.channelTrafficCounter.resetAccounting(newLastTime);
            }
        }
    }
}

