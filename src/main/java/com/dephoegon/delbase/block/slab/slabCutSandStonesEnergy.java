package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.cutSandStoneSlabEnergy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class slabCutSandStonesEnergy {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_CUT_SAND_STONE_SLAB_ENERGY = register("cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(SANDSTONE));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_CUT_SAND_STONE_SLAB_ENERGY = register("red_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(RED_SANDSTONE));
    public static final DeferredBlock<SlabBlock> BLOOD_CUT_SAND_STONE_SLAB_ENERGY = register("blood_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_CUT_SAND_STONE_SLAB_ENERGY = register("white_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_CUT_SAND_STONE_SLAB_ENERGY = register("orange_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_CUT_SAND_STONE_SLAB_ENERGY = register("magenta_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CUT_SAND_STONE_SLAB_ENERGY = register("light_blue_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_CUT_SAND_STONE_SLAB_ENERGY = register("yellow_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_CUT_SAND_STONE_SLAB_ENERGY = register("lime_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_CUT_SAND_STONE_SLAB_ENERGY = register("pink_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_CUT_SAND_STONE_SLAB_ENERGY = register("gray_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CUT_SAND_STONE_SLAB_ENERGY = register("light_gray_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_CUT_SAND_STONE_SLAB_ENERGY = register("cyan_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_CUT_SAND_STONE_SLAB_ENERGY = register("purple_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_CUT_SAND_STONE_SLAB_ENERGY = register("blue_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_CUT_SAND_STONE_SLAB_ENERGY = register("green_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_CUT_SAND_STONE_SLAB_ENERGY = register("brown_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_CUT_SAND_STONE_SLAB_ENERGY = register("black_cut_sand_stone_slab_energy",
            () -> new cutSandStoneSlabEnergy(BLACK_SAND_STONE.get()));

    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @javax.annotation.Nullable RecipeType<?> recipeType) {
                if (burn > 0) { return burn; } else return -1;
            }
        });
        return exit;
    }
    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block) { return register(name, block, 0); }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}