package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.cutSandStoneSlab;
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

public class slabCutSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> BLOOD_CUT_SAND_STONE_SLAB = register("blood_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_CUT_SAND_STONE_SLAB = register("white_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_CUT_SAND_STONE_SLAB = register("orange_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_CUT_SAND_STONE_SLAB = register("magenta_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CUT_SAND_STONE_SLAB = register("light_blue_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_CUT_SAND_STONE_SLAB = register("yellow_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_CUT_SAND_STONE_SLAB = register("lime_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_CUT_SAND_STONE_SLAB = register("pink_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_CUT_SAND_STONE_SLAB = register("gray_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CUT_SAND_STONE_SLAB = register("light_gray_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_CUT_SAND_STONE_SLAB = register("cyan_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_CUT_SAND_STONE_SLAB = register("purple_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_CUT_SAND_STONE_SLAB = register("blue_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_CUT_SAND_STONE_SLAB = register("green_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_CUT_SAND_STONE_SLAB = register("brown_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_CUT_SAND_STONE_SLAB = register("black_cut_sand_stone_slab",
            () -> new cutSandStoneSlab(BLACK_SAND_STONE.get()));

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