package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.sandStoneSlabEnergy;
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

public class slabSandStonesEnergy {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_SAND_STONE_SLAB_ENERGY = register("sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(SANDSTONE));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_SAND_STONE_SLAB_ENERGY = register("red_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(RED_SANDSTONE));
    public static final DeferredBlock<SlabBlock> BLOOD_SAND_STONE_SLAB_ENERGY = register("blood_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SAND_STONE_SLAB_ENERGY = register("white_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SAND_STONE_SLAB_ENERGY = register("orange_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SAND_STONE_SLAB_ENERGY = register("magenta_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SAND_STONE_SLAB_ENERGY = register("light_blue_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SAND_STONE_SLAB_ENERGY = register("yellow_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_SAND_STONE_SLAB_ENERGY = register("lime_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_SAND_STONE_SLAB_ENERGY = register("pink_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SAND_STONE_SLAB_ENERGY = register("gray_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SAND_STONE_SLAB_ENERGY = register("light_gray_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SAND_STONE_SLAB_ENERGY = register("cyan_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SAND_STONE_SLAB_ENERGY = register("purple_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SAND_STONE_SLAB_ENERGY = register("blue_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SAND_STONE_SLAB_ENERGY = register("green_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SAND_STONE_SLAB_ENERGY = register("brown_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SAND_STONE_SLAB_ENERGY = register("black_sand_stone_slab_energy",
            () -> new sandStoneSlabEnergy(BLACK_SAND_STONE.get()));

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