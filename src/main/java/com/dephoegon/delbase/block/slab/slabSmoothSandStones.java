package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.smoothSandStoneSlab;
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

public class slabSmoothSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> BLOOD_SMOOTH_SAND_STONE_SLAB = register("blood_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SMOOTH_SAND_STONE_SLAB = register("white_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SMOOTH_SAND_STONE_SLAB = register("orange_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SMOOTH_SAND_STONE_SLAB = register("magenta_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_SLAB = register("light_blue_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SMOOTH_SAND_STONE_SLAB = register("yellow_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_SMOOTH_SAND_STONE_SLAB = register("lime_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_SMOOTH_SAND_STONE_SLAB = register("pink_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SMOOTH_SAND_STONE_SLAB = register("gray_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_SLAB = register("light_gray_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SMOOTH_SAND_STONE_SLAB = register("cyan_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SMOOTH_SAND_STONE_SLAB = register("purple_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SMOOTH_SAND_STONE_SLAB = register("blue_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SMOOTH_SAND_STONE_SLAB = register("green_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SMOOTH_SAND_STONE_SLAB = register("brown_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SMOOTH_SAND_STONE_SLAB = register("black_smooth_sand_stone_slab",
            () -> new smoothSandStoneSlab(BLACK_SAND_STONE.get()));

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