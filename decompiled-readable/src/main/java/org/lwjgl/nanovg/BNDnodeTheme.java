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

public class BNDnodeTheme
extends Struct<BNDnodeTheme>
implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NODESELECTEDCOLOR;
    public static final int WIRESCOLOR;
    public static final int TEXTSELECTEDCOLOR;
    public static final int ACTIVENODECOLOR;
    public static final int WIRESELECTCOLOR;
    public static final int NODEBACKDROPCOLOR;
    public static final int NOODLECURVING;

    protected BNDnodeTheme(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BNDnodeTheme create(long address, @Nullable ByteBuffer container) {
        return new BNDnodeTheme(address, container);
    }

    public BNDnodeTheme(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), BNDnodeTheme.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="NVGcolor")
    public NVGColor nodeSelectedColor() {
        return BNDnodeTheme.nnodeSelectedColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor wiresColor() {
        return BNDnodeTheme.nwiresColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor textSelectedColor() {
        return BNDnodeTheme.ntextSelectedColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor activeNodeColor() {
        return BNDnodeTheme.nactiveNodeColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor wireSelectColor() {
        return BNDnodeTheme.nwireSelectColor(this.address());
    }

    @NativeType(value="NVGcolor")
    public NVGColor nodeBackdropColor() {
        return BNDnodeTheme.nnodeBackdropColor(this.address());
    }

    public int noodleCurving() {
        return BNDnodeTheme.nnoodleCurving(this.address());
    }

    public BNDnodeTheme nodeSelectedColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDnodeTheme.nnodeSelectedColor(this.address(), value);
        return this;
    }

    public BNDnodeTheme nodeSelectedColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.nodeSelectedColor());
        return this;
    }

    public BNDnodeTheme wiresColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDnodeTheme.nwiresColor(this.address(), value);
        return this;
    }

    public BNDnodeTheme wiresColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.wiresColor());
        return this;
    }

    public BNDnodeTheme textSelectedColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDnodeTheme.ntextSelectedColor(this.address(), value);
        return this;
    }

    public BNDnodeTheme textSelectedColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.textSelectedColor());
        return this;
    }

    public BNDnodeTheme activeNodeColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDnodeTheme.nactiveNodeColor(this.address(), value);
        return this;
    }

    public BNDnodeTheme activeNodeColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.activeNodeColor());
        return this;
    }

    public BNDnodeTheme wireSelectColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDnodeTheme.nwireSelectColor(this.address(), value);
        return this;
    }

    public BNDnodeTheme wireSelectColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.wireSelectColor());
        return this;
    }

    public BNDnodeTheme nodeBackdropColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDnodeTheme.nnodeBackdropColor(this.address(), value);
        return this;
    }

    public BNDnodeTheme nodeBackdropColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.nodeBackdropColor());
        return this;
    }

    public BNDnodeTheme noodleCurving(int value) {
        BNDnodeTheme.nnoodleCurving(this.address(), value);
        return this;
    }

    public BNDnodeTheme set(NVGColor nodeSelectedColor, NVGColor wiresColor, NVGColor textSelectedColor, NVGColor activeNodeColor, NVGColor wireSelectColor, NVGColor nodeBackdropColor, int noodleCurving) {
        this.nodeSelectedColor(nodeSelectedColor);
        this.wiresColor(wiresColor);
        this.textSelectedColor(textSelectedColor);
        this.activeNodeColor(activeNodeColor);
        this.wireSelectColor(wireSelectColor);
        this.nodeBackdropColor(nodeBackdropColor);
        this.noodleCurving(noodleCurving);
        return this;
    }

    public BNDnodeTheme set(BNDnodeTheme src) {
        MemoryUtil.memCopy(src.address(), this.address(), SIZEOF);
        return this;
    }

    public static BNDnodeTheme malloc() {
        return new BNDnodeTheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BNDnodeTheme calloc() {
        return new BNDnodeTheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BNDnodeTheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDnodeTheme(MemoryUtil.memAddress(container), container);
    }

    public static BNDnodeTheme create(long address) {
        return new BNDnodeTheme(address, null);
    }

    @Nullable
    public static BNDnodeTheme createSafe(long address) {
        return address == 0L ? null : new BNDnodeTheme(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(BNDnodeTheme.__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = BNDnodeTheme.__create(capacity, SIZEOF);
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
    public static BNDnodeTheme mallocStack() {
        return BNDnodeTheme.malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDnodeTheme callocStack() {
        return BNDnodeTheme.calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDnodeTheme mallocStack(MemoryStack stack) {
        return BNDnodeTheme.malloc(stack);
    }

    @Deprecated
    public static BNDnodeTheme callocStack(MemoryStack stack) {
        return BNDnodeTheme.calloc(stack);
    }

    @Deprecated
    public static Buffer mallocStack(int capacity) {
        return BNDnodeTheme.malloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer callocStack(int capacity) {
        return BNDnodeTheme.calloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return BNDnodeTheme.malloc(capacity, stack);
    }

    @Deprecated
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return BNDnodeTheme.calloc(capacity, stack);
    }

    public static BNDnodeTheme malloc(MemoryStack stack) {
        return new BNDnodeTheme(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BNDnodeTheme calloc(MemoryStack stack) {
        return new BNDnodeTheme(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static NVGColor nnodeSelectedColor(long struct) {
        return NVGColor.create(struct + (long)NODESELECTEDCOLOR);
    }

    public static NVGColor nwiresColor(long struct) {
        return NVGColor.create(struct + (long)WIRESCOLOR);
    }

    public static NVGColor ntextSelectedColor(long struct) {
        return NVGColor.create(struct + (long)TEXTSELECTEDCOLOR);
    }

    public static NVGColor nactiveNodeColor(long struct) {
        return NVGColor.create(struct + (long)ACTIVENODECOLOR);
    }

    public static NVGColor nwireSelectColor(long struct) {
        return NVGColor.create(struct + (long)WIRESELECTCOLOR);
    }

    public static NVGColor nnodeBackdropColor(long struct) {
        return NVGColor.create(struct + (long)NODEBACKDROPCOLOR);
    }

    public static int nnoodleCurving(long struct) {
        return UNSAFE.getInt(null, struct + (long)NOODLECURVING);
    }

    public static void nnodeSelectedColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)NODESELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void nwiresColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)WIRESCOLOR, NVGColor.SIZEOF);
    }

    public static void ntextSelectedColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)TEXTSELECTEDCOLOR, NVGColor.SIZEOF);
    }

    public static void nactiveNodeColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)ACTIVENODECOLOR, NVGColor.SIZEOF);
    }

    public static void nwireSelectColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)WIRESELECTCOLOR, NVGColor.SIZEOF);
    }

    public static void nnodeBackdropColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)NODEBACKDROPCOLOR, NVGColor.SIZEOF);
    }

    public static void nnoodleCurving(long struct, int value) {
        UNSAFE.putInt(null, struct + (long)NOODLECURVING, value);
    }

    static {
        Struct.Layout layout = BNDnodeTheme.__struct(BNDnodeTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDnodeTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDnodeTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDnodeTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDnodeTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDnodeTheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDnodeTheme.__member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NODESELECTEDCOLOR = layout.offsetof(0);
        WIRESCOLOR = layout.offsetof(1);
        TEXTSELECTEDCOLOR = layout.offsetof(2);
        ACTIVENODECOLOR = layout.offsetof(3);
        WIRESELECTCOLOR = layout.offsetof(4);
        NODEBACKDROPCOLOR = layout.offsetof(5);
        NOODLECURVING = layout.offsetof(6);
    }

    public static class Buffer
    extends StructBuffer<BNDnodeTheme, Buffer>
    implements NativeResource {
        private static final BNDnodeTheme ELEMENT_FACTORY = BNDnodeTheme.create(-1L);

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
        protected BNDnodeTheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="NVGcolor")
        public NVGColor nodeSelectedColor() {
            return BNDnodeTheme.nnodeSelectedColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor wiresColor() {
            return BNDnodeTheme.nwiresColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor textSelectedColor() {
            return BNDnodeTheme.ntextSelectedColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor activeNodeColor() {
            return BNDnodeTheme.nactiveNodeColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor wireSelectColor() {
            return BNDnodeTheme.nwireSelectColor(this.address());
        }

        @NativeType(value="NVGcolor")
        public NVGColor nodeBackdropColor() {
            return BNDnodeTheme.nnodeBackdropColor(this.address());
        }

        public int noodleCurving() {
            return BNDnodeTheme.nnoodleCurving(this.address());
        }

        public Buffer nodeSelectedColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDnodeTheme.nnodeSelectedColor(this.address(), value);
            return this;
        }

        public Buffer nodeSelectedColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.nodeSelectedColor());
            return this;
        }

        public Buffer wiresColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDnodeTheme.nwiresColor(this.address(), value);
            return this;
        }

        public Buffer wiresColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.wiresColor());
            return this;
        }

        public Buffer textSelectedColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDnodeTheme.ntextSelectedColor(this.address(), value);
            return this;
        }

        public Buffer textSelectedColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.textSelectedColor());
            return this;
        }

        public Buffer activeNodeColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDnodeTheme.nactiveNodeColor(this.address(), value);
            return this;
        }

        public Buffer activeNodeColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.activeNodeColor());
            return this;
        }

        public Buffer wireSelectColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDnodeTheme.nwireSelectColor(this.address(), value);
            return this;
        }

        public Buffer wireSelectColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.wireSelectColor());
            return this;
        }

        public Buffer nodeBackdropColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDnodeTheme.nnodeBackdropColor(this.address(), value);
            return this;
        }

        public Buffer nodeBackdropColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.nodeBackdropColor());
            return this;
        }

        public Buffer noodleCurving(int value) {
            BNDnodeTheme.nnoodleCurving(this.address(), value);
            return this;
        }
    }
}

