package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.alt.concreteSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabConcrete {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<SlabBlock> RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            () -> new concreteSlab(RED_CONCRETE));
    public static final DeferredBlock<SlabBlock> WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            () -> new concreteSlab(WHITE_CONCRETE));
    public static final DeferredBlock<SlabBlock> ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            () -> new concreteSlab(ORANGE_CONCRETE));
    public static final DeferredBlock<SlabBlock> MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            () -> new concreteSlab(MAGENTA_CONCRETE));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            () -> new concreteSlab(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<SlabBlock> YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            () -> new concreteSlab(YELLOW_CONCRETE));
    public static final DeferredBlock<SlabBlock> LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            () -> new concreteSlab(LIME_CONCRETE));
    public static final DeferredBlock<SlabBlock> PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            () -> new concreteSlab(PINK_CONCRETE));
    public static final DeferredBlock<SlabBlock> GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            () -> new concreteSlab(GRAY_CONCRETE));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            () -> new concreteSlab(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<SlabBlock> CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            () -> new concreteSlab(CYAN_CONCRETE));
    public static final DeferredBlock<SlabBlock> PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            () -> new concreteSlab(PURPLE_CONCRETE));
    public static final DeferredBlock<SlabBlock> BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            () -> new concreteSlab(BLUE_CONCRETE));
    public static final DeferredBlock<SlabBlock> GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            () -> new concreteSlab(GREEN_CONCRETE));
    public static final DeferredBlock<SlabBlock> BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            () -> new concreteSlab(BROWN_CONCRETE));
    public static final DeferredBlock<SlabBlock> BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            () -> new concreteSlab(BLACK_CONCRETE));

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void  registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }
}