/*
 * Decompiled with CFR.
 */
package io.netty.buffer.search;

import io.netty.buffer.search.AbstractSearchProcessorFactory;
import io.netty.buffer.search.SearchProcessor;
import io.netty.util.internal.PlatformDependent;

public class BitapSearchProcessorFactory
extends AbstractSearchProcessorFactory {
    private final long[] bitMasks = new long[256];
    private final long successBit;

    BitapSearchProcessorFactory(byte[] needle) {
        if (needle.length > 64) {
            throw new IllegalArgumentException("Maximum supported search pattern length is 64, got " + needle.length);
        }
        long bit = 1L;
        byte[] byArray = needle;
        int n = byArray.length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                this.successBit = 1L << needle.length - 1;
                return;
            }
            byte c = byArray[n2];
            int n3 = c & 0xFF;
            this.bitMasks[n3] = this.bitMasks[n3] | bit;
            bit <<= 1;
            ++n2;
        }
    }

    @Override
    public Processor newSearchProcessor() {
        return new Processor(this.bitMasks, this.successBit);
    }

    public static class Processor
    implements SearchProcessor {
        private final long[] bitMasks;
        private final long successBit;
        private long currentMask;

        Processor(long[] bitMasks, long successBit) {
            this.bitMasks = bitMasks;
            this.successBit = successBit;
        }

        @Override
        public boolean process(byte value) {
            this.currentMask = (this.currentMask << 1 | 1L) & PlatformDependent.getLong(this.bitMasks, (long)value & 0xFFL);
            return (this.currentMask & this.successBit) == 0L;
        }

        @Override
        public void reset() {
            this.currentMask = 0L;
        }
    }
}

