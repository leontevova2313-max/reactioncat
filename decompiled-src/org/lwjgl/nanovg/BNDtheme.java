/*
 * Decompiled with CFR.
 */
package org.lwjgl.nanovg;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.nanovg.BNDnodeTheme;
import org.lwjgl.nanovg.BNDwidgetTheme;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

public class BNDtheme
extends Struct<BNDtheme>
implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BACKGROUNDCOLOR;
    public static final int REGULARTHEME;
    public static final int TOOLTHEME;
    public static final int RADIOTHEME;
    public static final int TEXTFIELDTHEME;
    public static final int OPTIONTHEME;
    public static final int CHOICETHEME;
    public static final int NUMBERFIELDTHEME;
    public static final int SLIDERTHEME;
    public static final int SCROLLBARTHEME;
    public static final int TOOLTIPTHEME;
    public static final int MENUTHEME;
    public static final int MENUITEMTHEME;
    public static final int NODETHEME;

    protected BNDtheme(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected BNDtheme create(long address, @Nullable ByteBuffer container) {
        return new BNDtheme(address, container);
    }

    public BNDtheme(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), BNDtheme.__checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType(value="NVGcolor")
    public NVGColor backgroundColor() {
        return BNDtheme.nbackgroundColor(this.address());
    }

    public BNDwidgetTheme regularTheme() {
        return BNDtheme.nregularTheme(this.address());
    }

    public BNDwidgetTheme toolTheme() {
        return BNDtheme.ntoolTheme(this.address());
    }

    public BNDwidgetTheme radioTheme() {
        return BNDtheme.nradioTheme(this.address());
    }

    public BNDwidgetTheme textFieldTheme() {
        return BNDtheme.ntextFieldTheme(this.address());
    }

    public BNDwidgetTheme optionTheme() {
        return BNDtheme.noptionTheme(this.address());
    }

    public BNDwidgetTheme choiceTheme() {
        return BNDtheme.nchoiceTheme(this.address());
    }

    public BNDwidgetTheme numberFieldTheme() {
        return BNDtheme.nnumberFieldTheme(this.address());
    }

    public BNDwidgetTheme sliderTheme() {
        return BNDtheme.nsliderTheme(this.address());
    }

    public BNDwidgetTheme scrollBarTheme() {
        return BNDtheme.nscrollBarTheme(this.address());
    }

    public BNDwidgetTheme tooltipTheme() {
        return BNDtheme.ntooltipTheme(this.address());
    }

    public BNDwidgetTheme menuTheme() {
        return BNDtheme.nmenuTheme(this.address());
    }

    public BNDwidgetTheme menuItemTheme() {
        return BNDtheme.nmenuItemTheme(this.address());
    }

    public BNDnodeTheme nodeTheme() {
        return BNDtheme.nnodeTheme(this.address());
    }

    public BNDtheme backgroundColor(@NativeType(value="NVGcolor") NVGColor value) {
        BNDtheme.nbackgroundColor(this.address(), value);
        return this;
    }

    public BNDtheme backgroundColor(Consumer<NVGColor> consumer) {
        consumer.accept(this.backgroundColor());
        return this;
    }

    public BNDtheme regularTheme(BNDwidgetTheme value) {
        BNDtheme.nregularTheme(this.address(), value);
        return this;
    }

    public BNDtheme regularTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.regularTheme());
        return this;
    }

    public BNDtheme toolTheme(BNDwidgetTheme value) {
        BNDtheme.ntoolTheme(this.address(), value);
        return this;
    }

    public BNDtheme toolTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.toolTheme());
        return this;
    }

    public BNDtheme radioTheme(BNDwidgetTheme value) {
        BNDtheme.nradioTheme(this.address(), value);
        return this;
    }

    public BNDtheme radioTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.radioTheme());
        return this;
    }

    public BNDtheme textFieldTheme(BNDwidgetTheme value) {
        BNDtheme.ntextFieldTheme(this.address(), value);
        return this;
    }

    public BNDtheme textFieldTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.textFieldTheme());
        return this;
    }

    public BNDtheme optionTheme(BNDwidgetTheme value) {
        BNDtheme.noptionTheme(this.address(), value);
        return this;
    }

    public BNDtheme optionTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.optionTheme());
        return this;
    }

    public BNDtheme choiceTheme(BNDwidgetTheme value) {
        BNDtheme.nchoiceTheme(this.address(), value);
        return this;
    }

    public BNDtheme choiceTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.choiceTheme());
        return this;
    }

    public BNDtheme numberFieldTheme(BNDwidgetTheme value) {
        BNDtheme.nnumberFieldTheme(this.address(), value);
        return this;
    }

    public BNDtheme numberFieldTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.numberFieldTheme());
        return this;
    }

    public BNDtheme sliderTheme(BNDwidgetTheme value) {
        BNDtheme.nsliderTheme(this.address(), value);
        return this;
    }

    public BNDtheme sliderTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.sliderTheme());
        return this;
    }

    public BNDtheme scrollBarTheme(BNDwidgetTheme value) {
        BNDtheme.nscrollBarTheme(this.address(), value);
        return this;
    }

    public BNDtheme scrollBarTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.scrollBarTheme());
        return this;
    }

    public BNDtheme tooltipTheme(BNDwidgetTheme value) {
        BNDtheme.ntooltipTheme(this.address(), value);
        return this;
    }

    public BNDtheme tooltipTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.tooltipTheme());
        return this;
    }

    public BNDtheme menuTheme(BNDwidgetTheme value) {
        BNDtheme.nmenuTheme(this.address(), value);
        return this;
    }

    public BNDtheme menuTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.menuTheme());
        return this;
    }

    public BNDtheme menuItemTheme(BNDwidgetTheme value) {
        BNDtheme.nmenuItemTheme(this.address(), value);
        return this;
    }

    public BNDtheme menuItemTheme(Consumer<BNDwidgetTheme> consumer) {
        consumer.accept(this.menuItemTheme());
        return this;
    }

    public BNDtheme nodeTheme(BNDnodeTheme value) {
        BNDtheme.nnodeTheme(this.address(), value);
        return this;
    }

    public BNDtheme nodeTheme(Consumer<BNDnodeTheme> consumer) {
        consumer.accept(this.nodeTheme());
        return this;
    }

    public BNDtheme set(NVGColor backgroundColor, BNDwidgetTheme regularTheme, BNDwidgetTheme toolTheme, BNDwidgetTheme radioTheme, BNDwidgetTheme textFieldTheme, BNDwidgetTheme optionTheme, BNDwidgetTheme choiceTheme, BNDwidgetTheme numberFieldTheme, BNDwidgetTheme sliderTheme, BNDwidgetTheme scrollBarTheme, BNDwidgetTheme tooltipTheme, BNDwidgetTheme menuTheme, BNDwidgetTheme menuItemTheme, BNDnodeTheme nodeTheme) {
        this.backgroundColor(backgroundColor);
        this.regularTheme(regularTheme);
        this.toolTheme(toolTheme);
        this.radioTheme(radioTheme);
        this.textFieldTheme(textFieldTheme);
        this.optionTheme(optionTheme);
        this.choiceTheme(choiceTheme);
        this.numberFieldTheme(numberFieldTheme);
        this.sliderTheme(sliderTheme);
        this.scrollBarTheme(scrollBarTheme);
        this.tooltipTheme(tooltipTheme);
        this.menuTheme(menuTheme);
        this.menuItemTheme(menuItemTheme);
        this.nodeTheme(nodeTheme);
        return this;
    }

    public BNDtheme set(BNDtheme src) {
        MemoryUtil.memCopy(src.address(), this.address(), SIZEOF);
        return this;
    }

    public static BNDtheme malloc() {
        return new BNDtheme(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static BNDtheme calloc() {
        return new BNDtheme(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static BNDtheme create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new BNDtheme(MemoryUtil.memAddress(container), container);
    }

    public static BNDtheme create(long address) {
        return new BNDtheme(address, null);
    }

    @Nullable
    public static BNDtheme createSafe(long address) {
        return address == 0L ? null : new BNDtheme(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(BNDtheme.__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = BNDtheme.__create(capacity, SIZEOF);
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
    public static BNDtheme mallocStack() {
        return BNDtheme.malloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDtheme callocStack() {
        return BNDtheme.calloc(MemoryStack.stackGet());
    }

    @Deprecated
    public static BNDtheme mallocStack(MemoryStack stack) {
        return BNDtheme.malloc(stack);
    }

    @Deprecated
    public static BNDtheme callocStack(MemoryStack stack) {
        return BNDtheme.calloc(stack);
    }

    @Deprecated
    public static Buffer mallocStack(int capacity) {
        return BNDtheme.malloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer callocStack(int capacity) {
        return BNDtheme.calloc(capacity, MemoryStack.stackGet());
    }

    @Deprecated
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return BNDtheme.malloc(capacity, stack);
    }

    @Deprecated
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return BNDtheme.calloc(capacity, stack);
    }

    public static BNDtheme malloc(MemoryStack stack) {
        return new BNDtheme(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static BNDtheme calloc(MemoryStack stack) {
        return new BNDtheme(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static NVGColor nbackgroundColor(long struct) {
        return NVGColor.create(struct + (long)BACKGROUNDCOLOR);
    }

    public static BNDwidgetTheme nregularTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)REGULARTHEME);
    }

    public static BNDwidgetTheme ntoolTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)TOOLTHEME);
    }

    public static BNDwidgetTheme nradioTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)RADIOTHEME);
    }

    public static BNDwidgetTheme ntextFieldTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)TEXTFIELDTHEME);
    }

    public static BNDwidgetTheme noptionTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)OPTIONTHEME);
    }

    public static BNDwidgetTheme nchoiceTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)CHOICETHEME);
    }

    public static BNDwidgetTheme nnumberFieldTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)NUMBERFIELDTHEME);
    }

    public static BNDwidgetTheme nsliderTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)SLIDERTHEME);
    }

    public static BNDwidgetTheme nscrollBarTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)SCROLLBARTHEME);
    }

    public static BNDwidgetTheme ntooltipTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)TOOLTIPTHEME);
    }

    public static BNDwidgetTheme nmenuTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)MENUTHEME);
    }

    public static BNDwidgetTheme nmenuItemTheme(long struct) {
        return BNDwidgetTheme.create(struct + (long)MENUITEMTHEME);
    }

    public static BNDnodeTheme nnodeTheme(long struct) {
        return BNDnodeTheme.create(struct + (long)NODETHEME);
    }

    public static void nbackgroundColor(long struct, NVGColor value) {
        MemoryUtil.memCopy(value.address(), struct + (long)BACKGROUNDCOLOR, NVGColor.SIZEOF);
    }

    public static void nregularTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)REGULARTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void ntoolTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)TOOLTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nradioTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)RADIOTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void ntextFieldTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)TEXTFIELDTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void noptionTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)OPTIONTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nchoiceTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)CHOICETHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nnumberFieldTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)NUMBERFIELDTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nsliderTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)SLIDERTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nscrollBarTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)SCROLLBARTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void ntooltipTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)TOOLTIPTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nmenuTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)MENUTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nmenuItemTheme(long struct, BNDwidgetTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)MENUITEMTHEME, BNDwidgetTheme.SIZEOF);
    }

    public static void nnodeTheme(long struct, BNDnodeTheme value) {
        MemoryUtil.memCopy(value.address(), struct + (long)NODETHEME, BNDnodeTheme.SIZEOF);
    }

    static {
        Struct.Layout layout = BNDtheme.__struct(BNDtheme.__member(NVGColor.SIZEOF, NVGColor.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDwidgetTheme.SIZEOF, BNDwidgetTheme.ALIGNOF), BNDtheme.__member(BNDnodeTheme.SIZEOF, BNDnodeTheme.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BACKGROUNDCOLOR = layout.offsetof(0);
        REGULARTHEME = layout.offsetof(1);
        TOOLTHEME = layout.offsetof(2);
        RADIOTHEME = layout.offsetof(3);
        TEXTFIELDTHEME = layout.offsetof(4);
        OPTIONTHEME = layout.offsetof(5);
        CHOICETHEME = layout.offsetof(6);
        NUMBERFIELDTHEME = layout.offsetof(7);
        SLIDERTHEME = layout.offsetof(8);
        SCROLLBARTHEME = layout.offsetof(9);
        TOOLTIPTHEME = layout.offsetof(10);
        MENUTHEME = layout.offsetof(11);
        MENUITEMTHEME = layout.offsetof(12);
        NODETHEME = layout.offsetof(13);
    }

    public static class Buffer
    extends StructBuffer<BNDtheme, Buffer>
    implements NativeResource {
        private static final BNDtheme ELEMENT_FACTORY = BNDtheme.create(-1L);

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
        protected BNDtheme getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType(value="NVGcolor")
        public NVGColor backgroundColor() {
            return BNDtheme.nbackgroundColor(this.address());
        }

        public BNDwidgetTheme regularTheme() {
            return BNDtheme.nregularTheme(this.address());
        }

        public BNDwidgetTheme toolTheme() {
            return BNDtheme.ntoolTheme(this.address());
        }

        public BNDwidgetTheme radioTheme() {
            return BNDtheme.nradioTheme(this.address());
        }

        public BNDwidgetTheme textFieldTheme() {
            return BNDtheme.ntextFieldTheme(this.address());
        }

        public BNDwidgetTheme optionTheme() {
            return BNDtheme.noptionTheme(this.address());
        }

        public BNDwidgetTheme choiceTheme() {
            return BNDtheme.nchoiceTheme(this.address());
        }

        public BNDwidgetTheme numberFieldTheme() {
            return BNDtheme.nnumberFieldTheme(this.address());
        }

        public BNDwidgetTheme sliderTheme() {
            return BNDtheme.nsliderTheme(this.address());
        }

        public BNDwidgetTheme scrollBarTheme() {
            return BNDtheme.nscrollBarTheme(this.address());
        }

        public BNDwidgetTheme tooltipTheme() {
            return BNDtheme.ntooltipTheme(this.address());
        }

        public BNDwidgetTheme menuTheme() {
            return BNDtheme.nmenuTheme(this.address());
        }

        public BNDwidgetTheme menuItemTheme() {
            return BNDtheme.nmenuItemTheme(this.address());
        }

        public BNDnodeTheme nodeTheme() {
            return BNDtheme.nnodeTheme(this.address());
        }

        public Buffer backgroundColor(@NativeType(value="NVGcolor") NVGColor value) {
            BNDtheme.nbackgroundColor(this.address(), value);
            return this;
        }

        public Buffer backgroundColor(Consumer<NVGColor> consumer) {
            consumer.accept(this.backgroundColor());
            return this;
        }

        public Buffer regularTheme(BNDwidgetTheme value) {
            BNDtheme.nregularTheme(this.address(), value);
            return this;
        }

        public Buffer regularTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.regularTheme());
            return this;
        }

        public Buffer toolTheme(BNDwidgetTheme value) {
            BNDtheme.ntoolTheme(this.address(), value);
            return this;
        }

        public Buffer toolTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.toolTheme());
            return this;
        }

        public Buffer radioTheme(BNDwidgetTheme value) {
            BNDtheme.nradioTheme(this.address(), value);
            return this;
        }

        public Buffer radioTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.radioTheme());
            return this;
        }

        public Buffer textFieldTheme(BNDwidgetTheme value) {
            BNDtheme.ntextFieldTheme(this.address(), value);
            return this;
        }

        public Buffer textFieldTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.textFieldTheme());
            return this;
        }

        public Buffer optionTheme(BNDwidgetTheme value) {
            BNDtheme.noptionTheme(this.address(), value);
            return this;
        }

        public Buffer optionTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.optionTheme());
            return this;
        }

        public Buffer choiceTheme(BNDwidgetTheme value) {
            BNDtheme.nchoiceTheme(this.address(), value);
            return this;
        }

        public Buffer choiceTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.choiceTheme());
            return this;
        }

        public Buffer numberFieldTheme(BNDwidgetTheme value) {
            BNDtheme.nnumberFieldTheme(this.address(), value);
            return this;
        }

        public Buffer numberFieldTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.numberFieldTheme());
            return this;
        }

        public Buffer sliderTheme(BNDwidgetTheme value) {
            BNDtheme.nsliderTheme(this.address(), value);
            return this;
        }

        public Buffer sliderTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.sliderTheme());
            return this;
        }

        public Buffer scrollBarTheme(BNDwidgetTheme value) {
            BNDtheme.nscrollBarTheme(this.address(), value);
            return this;
        }

        public Buffer scrollBarTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.scrollBarTheme());
            return this;
        }

        public Buffer tooltipTheme(BNDwidgetTheme value) {
            BNDtheme.ntooltipTheme(this.address(), value);
            return this;
        }

        public Buffer tooltipTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.tooltipTheme());
            return this;
        }

        public Buffer menuTheme(BNDwidgetTheme value) {
            BNDtheme.nmenuTheme(this.address(), value);
            return this;
        }

        public Buffer menuTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.menuTheme());
            return this;
        }

        public Buffer menuItemTheme(BNDwidgetTheme value) {
            BNDtheme.nmenuItemTheme(this.address(), value);
            return this;
        }

        public Buffer menuItemTheme(Consumer<BNDwidgetTheme> consumer) {
            consumer.accept(this.menuItemTheme());
            return this;
        }

        public Buffer nodeTheme(BNDnodeTheme value) {
            BNDtheme.nnodeTheme(this.address(), value);
            return this;
        }

        public Buffer nodeTheme(Consumer<BNDnodeTheme> consumer) {
            consumer.accept(this.nodeTheme());
            return this;
        }
    }
}

