/*
 * Decompiled with CFR.
 */
package io.netty.buffer;

final class LongLongHashMap {
    private static final int MASK_TEMPLATE = -2;
    private int mask;
    private long[] array;
    private int maxProbe;
    private long zeroVal;
    private final long emptyVal;

    LongLongHashMap(long emptyVal) {
        this.emptyVal = emptyVal;
        this.zeroVal = emptyVal;
        int initialSize = 32;
        this.array = new long[initialSize];
        this.mask = initialSize - 1;
        this.computeMaskAndProbe();
    }

    public long put(long key, long value) {
        long prev;
        int i;
        int index;
        if (key == 0L) {
            long prev2 = this.zeroVal;
            this.zeroVal = value;
            return prev2;
        }
        block0: while (true) {
            index = this.index(key);
            for (i = 0; i < this.maxProbe; ++i) {
                long existing = this.array[index];
                if (existing == key || existing == 0L) {
                    prev = existing == 0L ? this.emptyVal : this.array[index + 1];
                    this.array[index] = key;
                    this.array[index + 1] = value;
                    break block0;
                }
                index = index + 2 & this.mask;
            }
            this.expand();
        }
        while (i < this.maxProbe) {
            if (this.array[index = index + 2 & this.mask] == key) {
                this.array[index] = 0L;
                prev = this.array[index + 1];
                break;
            }
            ++i;
        }
        return prev;
    }

    public void remove(long key) {
        if (key == 0L) {
            this.zeroVal = this.emptyVal;
            return;
        }
        int index = this.index(key);
        for (int i = 0; i < this.maxProbe; ++i) {
            long existing = this.array[index];
            if (existing == key) {
                this.array[index] = 0L;
                break;
            }
            index = index + 2 & this.mask;
        }
    }

    public long get(long key) {
        if (key == 0L) {
            return this.zeroVal;
        }
        int index = this.index(key);
        int i = 0;
        while (i < this.maxProbe) {
            long existing = this.array[index];
            if (existing == key) {
                return this.array[index + 1];
            }
            index = index + 2 & this.mask;
            ++i;
        }
        return this.emptyVal;
    }

    private int index(long key) {
        key ^= key >>> 33;
        key *= -49064778989728563L;
        key ^= key >>> 33;
        key *= -4265267296055464877L;
        key ^= key >>> 33;
        return (int)key & this.mask;
    }

    private void expand() {
        long[] prev = this.array;
        this.array = new long[prev.length * 2];
        this.computeMaskAndProbe();
        int i = 0;
        while (i < prev.length) {
            long key = prev[i];
            if (key != 0L) {
                long val = prev[i + 1];
                this.put(key, val);
            }
            i += 2;
        }
        return;
    }

    private void computeMaskAndProbe() {
        int length = this.array.length;
        this.mask = length - 1 & 0xFFFFFFFE;
        this.maxProbe = (int)Math.log(length);
    }
}

