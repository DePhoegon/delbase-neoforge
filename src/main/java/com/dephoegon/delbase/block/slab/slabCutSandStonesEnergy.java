package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.cutSandStoneSlabEnergy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class slabCutSandStonesEnergy {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(SANDSTONE));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("red_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(RED_SANDSTONE));
    public static final DeferredBlock<SlabBlock> BLOOD_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("blood_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("white_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("orange_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("magenta_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("light_blue_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("yellow_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("lime_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("pink_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("gray_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("light_gray_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("cyan_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("purple_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("blue_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("green_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("brown_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_CUT_SAND_STONE_SLAB_ENERGY = registerBlock("black_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BLACK_SAND_STONE.get()));

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