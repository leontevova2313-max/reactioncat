/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

public class BNDwidgetTheme
extends Struct<BNDwidgetTheme>
implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OUTLINECOLOR;
    public static final int ITEMCOLOR;
    public static final int INNERCOLOR;
    public static final int INNERSELECTEDCOLOR;
    public static final int TEXTCOLOR;
    public static final int TEXTSELECTEDCOLOR;
    public static final int SHADETOP;
    public static final int SHADEDOWN;

    protected BNDwidgetTheme(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BNDwidgetTheme create(long address, @Nullable ByteBuffer container) {
        return new BNDwidgetTheme(address, container);
    }

    public BNDwidgetTheme(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), BNDwidgetTheme.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="NVGcolor")
    public NVGColor outlineColor() {
        return BNDwidgetTheme.noutlineColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor itemColor() {
        return BNDwidgetTheme.nitemColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor innerColor() {
        return BNDwidgetTheme.ninnerColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor innerSelectedColor() {
        return BNDwidgetTheme.ninnerSelectedColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor textColor() {
        return BNDwidgetTheme.ntextColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor textSelectedColor() {
        return BNDwidgetTheme.ntextSelectedColor(this.address());
    }

    public int shadeTop() {
        return BNDwidgetTheme.nshadeTop(this.address());
    }

    public int shadeDown() {
        return BNDwidgetTheme.nshadeDown(this.address());
    }

    public BNDwidgetTheme outlineColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDwidgetTheme.noutlineColor(this.address(), value);
        return this;
    }

    public BNDwidgetTheme outlineColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.outlineColor());
        return this;
    }

    public BNDwidgetTheme itemColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDwidgetTheme.nitemColor(this.address(), value);
        return this;
    }

    public BNDwidgetTheme itemColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.itemColor());
        return this;
    }

    public BNDwidgetTheme innerColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDwidgetTheme.ninnerColor(this.address(), value);
        return this;
    }

    public BNDwidgetTheme innerColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.innerColor());
        return this;
    }

    public BNDwidgetTheme innerSelectedColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDwidgetTheme.ninnerSelectedColor(this.address(), value);
        return this;
    }

    public BNDwidgetTheme innerSelectedColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.innerSelectedColor());
        return this;
    }

    public BNDwidgetTheme textColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDwidgetTheme.ntextColor(this.address(), value);
        return this;
    }

    public BNDwidgetTheme textColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.textColor());
        return this;
    }

    public BNDwidgetTheme textSelectedColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDwidgetTheme.ntextSelectedColor(this.address(), value);
        return this;
    }

    public BNDwidgetTheme textSelectedColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.textSelectedColor());
        return this;
    }

    public BNDwidgetTheme shadeTop(int value) {
        BNDwidgetTheme.nshadeTop(this.address(), value);
        return this;
    }

    public BNDwidgetTheme shadeDown(int value) {
        BNDwidgetTheme.nshadeDown(this.address(), value);
        return this;
    }

    public BNDwidgetTheme set(NVGColor outlineColor, NVGColor itemColor, NVGColor innerColor, NVGColor innerSelectedColor, NVGColor textColor, NVGColor textSelectedColor, int shadeTop, int shadeDown) {
        this.outlineColor(outlineColor);
        this.itemColor(itemColor);
        this.innerColor(innerColor);
        this.innerSelectedColor(innerSelectedColor);
        this.textColor(textColor);
        this.textSelectedColor(textSelectedColor);
        this.shadeTop(shadeTop);
        this.shadeDown(shadeDown);
        return this;
    }

    public BNDwidgetTheme set(BNDwidgetTheme src) {
        MemoryUtil.memCopy(src.address(), this.address(), SIZEOF);
        return this;
    }

    public static BNDwidgetTheme malloc() {
        return new BNDwidgetTheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BNDwidgetTheme calloc() {
        return new BNDwidgetTheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BNDwidgetTheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDwidgetTheme(MemoryUtil.memAddress(container), container);
    }

    public static BNDwidgetTheme create(long address) {
        return new BNDwidgetTheme(address, null);
    }

    @Nullable
    public static BNDwidgetTheme createSafe(long address) {
        return address == 0L ? null : new BNDwidgetTheme(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(BNDwidgetTheme.__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = BNDwidgetTheme.__create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        return address == 0L ? null : new Buffer(address, capacity);
    }

    @Deprecated
    public static BNDwidgetTheme mallocStack() {
        return BNDwidgetTheme.malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDwidgetTheme callocStack() {
        return BNDwidgetTheme.calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDwidgetTheme mallocStack(MemoryStack stack) {
        return BNDwidgetTheme.malloc(stack);
    }

    @Deprecated
    public static BNDwidgetTheme callocStack(MemoryStack stack) {
        return BNDwidgetTheme.calloc(stack);
    }

    @Deprecated
    public static Buffer mallocStack(int capacity) {
        return BNDwidgetTheme.malloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer callocStack(int capacity) {
        return BNDwidgetTheme.calloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return BNDwidgetTheme.malloc(capacity, stack);
    }

    @Deprecated
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return BNDwidgetTheme.calloc(capacity, stack);
    }

    public static BNDwidgetTheme malloc(MemoryStack stack) {
        return new BNDwidgetTheme(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BNDwidgetTheme calloc(MemoryStack stack) {
        return new BNDwidgetTheme(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static NVGColor noutlineColor(long struct) {
        return NVGColor.create(struct + (long)OUTLINECOLOR);
    }

    public static NVGColor nitemColor(long struct) {
        return NVGColor.create(struct + (long)ITEMCOLOR);
    }

    public static NVGColor ninnerColor(long struct) {
        return NVGColor.create(struct + (long)INNERCOLOR);
    }

    public static NVGColor ninnerSelectedColor(long struct) {
        return NVGColor.create(struct + (long)INNERSELECTEDCOLOR);
    }

    public static NVGColor ntextColor(long struct) {
        return NVGColor.create(struct + (long)TEXTCOLOR);
    }

    public static NVGColor ntextSelectedColor(long struct) {
        return NVGColor.create(struct + (long)TEXTSELECTEDCOLOR);
    }

    public static int nshadeTop(long struct) {
        return UNSAFE.getInt(null, struct + (long)SHADETOP);
    }

    public static int nshadeDown(long struct) {
        return UNSAFE.getInt(null, struct + (long)SHADEDOWN);
    }

    public static void noutlineColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)OUTLINECOLOR, NVGColor.SIZEOF);
    }

    public static void nitemColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)ITEMCOLOR, NVGColor.SIZEOF);
    }

    public static void ninnerColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)INNERCOLOR, NVGColor.SIZEOF);
    }

    public static void ninnerSelectedColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)INNERSELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void ntextColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)TEXTCOLOR, NVGColor.SIZEOF);
    }

    public static void ntextSelectedColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)TEXTSELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void nshadeTop(long struct, int value) {
        UNSAFE.putInt(null, struct + (long)SHADETOP, value);
    }

    public static void nshadeDown(long struct, int value) {
        UNSAFE.putInt(null, struct + (long)SHADEDOWN, value);
    }

    static {
        Struct.Layout layout = BNDwidgetTheme.__struct(BNDwidgetTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDwidgetTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDwidgetTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDwidgetTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDwidgetTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDwidgetTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDwidgetTheme.__member(4), BNDwidgetTheme.__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OUTLINECOLOR = layout.offsetof(0);
        ITEMCOLOR = layout.offsetof(1);
        INNERCOLOR = layout.offsetof(2);
        INNERSELECTEDCOLOR = layout.offsetof(3);
        TEXTCOLOR = layout.offsetof(4);
        TEXTSELECTEDCOLOR = layout.offsetof(5);
        SHADETOP = layout.offsetof(6);
        SHADEDOWN = layout.offsetof(7);
    }

    public static class Buffer
    extends StructBuffer<BNDwidgetTheme, Buffer>
    implements NativeResource {
        private static final BNDwidgetTheme ELEMENT_FACTORY = BNDwidgetTheme.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected BNDwidgetTheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="NVGcolor")
        public NVGColor outlineColor() {
            return BNDwidgetTheme.noutlineColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor itemColor() {
            return BNDwidgetTheme.nitemColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor innerColor() {
            return BNDwidgetTheme.ninnerColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor innerSelectedColor() {
            return BNDwidgetTheme.ninnerSelectedColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor textColor() {
            return BNDwidgetTheme.ntextColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor textSelectedColor() {
            return BNDwidgetTheme.ntextSelectedColor(this.address());
        }

        public int shadeTop() {
            return BNDwidgetTheme.nshadeTop(this.address());
        }

        public int shadeDown() {
            return BNDwidgetTheme.nshadeDown(this.address());
        }

        public Buffer outlineColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDwidgetTheme.noutlineColor(this.address(), value);
            return this;
        }

        public Buffer outlineColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.outlineColor());
            return this;
        }

        public Buffer itemColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDwidgetTheme.nitemColor(this.address(), value);
            return this;
        }

        public Buffer itemColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.itemColor());
            return this;
        }

        public Buffer innerColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDwidgetTheme.ninnerColor(this.address(), value);
            return this;
        }

        public Buffer innerColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.innerColor());
            return this;
        }

        public Buffer innerSelectedColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDwidgetTheme.ninnerSelectedColor(this.address(), value);
            return this;
        }

        public Buffer innerSelectedColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.innerSelectedColor());
            return this;
        }

        public Buffer textColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDwidgetTheme.ntextColor(this.address(), value);
            return this;
        }

        public Buffer textColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.textColor());
            return this;
        }

        public Buffer textSelectedColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDwidgetTheme.ntextSelectedColor(this.address(), value);
            return this;
        }

        public Buffer textSelectedColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.textSelectedColor());
            return this;
        }

        public Buffer shadeTop(int value) {
            BNDwidgetTheme.nshadeTop(this.address(), value);
            return this;
        }

        public Buffer shadeDown(int value) {
            BNDwidgetTheme.nshadeDown(this.address(), value);
            return this;
        }
    }
}

