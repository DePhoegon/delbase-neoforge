package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.sandSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class slabSands {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_SAND_SLAB = registerBlock("sand_slab",
            () -> new sandSlab(SAND));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_SAND_SLAB = registerBlock("red_sand_slab",
            () -> new sandSlab(RED_SAND));
    public static final DeferredBlock<SlabBlock> BLOOD_SAND_SLAB = registerBlock("blood_sand_slab",
            () -> new sandSlab(BLOOD_SAND.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SAND_SLAB = registerBlock("white_sand_slab",
            () -> new sandSlab(WHITE_SAND.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SAND_SLAB = registerBlock("orange_sand_slab",
            () -> new sandSlab(ORANGE_SAND.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SAND_SLAB = registerBlock("magenta_sand_slab",
            () -> new sandSlab(MAGENTA_SAND.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SAND_SLAB = registerBlock("light_blue_sand_slab",
            () -> new sandSlab(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SAND_SLAB = registerBlock("yellow_sand_slab",
            () -> new sandSlab(YELLOW_SAND.get()));
    public static final DeferredBlock<SlabBlock> LIME_SAND_SLAB = registerBlock("lime_sand_slab",
            () -> new sandSlab(LIME_SAND.get()));
    public static final DeferredBlock<SlabBlock> PINK_SAND_SLAB = registerBlock("pink_sand_slab",
            () -> new sandSlab(PINK_SAND.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SAND_SLAB = registerBlock("gray_sand_slab",
            () -> new sandSlab(GRAY_SAND.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SAND_SLAB = registerBlock("light_gray_sand_slab",
            () -> new sandSlab(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SAND_SLAB = registerBlock("cyan_sand_slab",
            () -> new sandSlab(CYAN_SAND.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SAND_SLAB = registerBlock("purple_sand_slab",
            () -> new sandSlab(PURPLE_SAND.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SAND_SLAB = registerBlock("blue_sand_slab",
            () -> new sandSlab(BLUE_SAND.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SAND_SLAB = registerBlock("green_sand_slab",
            () -> new sandSlab(GREEN_SAND.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SAND_SLAB = registerBlock("brown_sand_slab",
            () -> new sandSlab(BROWN_SAND.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SAND_SLAB = registerBlock("black_sand_slab",
            () -> new sandSlab(BLACK_SAND.get()));

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