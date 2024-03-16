package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.smoothSandStoneSlabEnergy;
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

public class slabSmoothSandStonesEnergy {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(SANDSTONE));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_SMOOTH_SAND_STONE_SLAB_ENERGY = register("red_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(RED_SANDSTONE));
    public static final DeferredBlock<SlabBlock> BLOOD_SMOOTH_SAND_STONE_SLAB_ENERGY = register("blood_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("white_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("orange_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SMOOTH_SAND_STONE_SLAB_ENERGY = register("magenta_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("light_blue_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SMOOTH_SAND_STONE_SLAB_ENERGY = register("yellow_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_SMOOTH_SAND_STONE_SLAB_ENERGY = register("lime_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_SMOOTH_SAND_STONE_SLAB_ENERGY = register("pink_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY = register("gray_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB_ENERGY = register("light_gray_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SMOOTH_SAND_STONE_SLAB_ENERGY = register("cyan_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("purple_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SMOOTH_SAND_STONE_SLAB_ENERGY = register("blue_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SMOOTH_SAND_STONE_SLAB_ENERGY = register("green_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SMOOTH_SAND_STONE_SLAB_ENERGY = register("brown_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SMOOTH_SAND_STONE_SLAB_ENERGY = register("black_smooth_sand_stone_slab_energy",
            () -> new smoothSandStoneSlabEnergy(BLACK_SAND_STONE.get()));

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