package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.chiseledSandStoneSlab;
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

public class slabChiseledSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_CHISELED_SAND_STONE_SLAB = register("chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(SANDSTONE));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_CHISELED_SAND_STONE_SLAB = register("red_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(RED_SANDSTONE));
    public static final DeferredBlock<SlabBlock> BLOOD_CHISELED_SAND_STONE_SLAB = register("blood_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> WHITE_CHISELED_SAND_STONE_SLAB = register("white_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_CHISELED_SAND_STONE_SLAB = register("orange_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_CHISELED_SAND_STONE_SLAB = register("magenta_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CHISELED_SAND_STONE_SLAB = register("light_blue_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_CHISELED_SAND_STONE_SLAB = register("yellow_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIME_CHISELED_SAND_STONE_SLAB = register("lime_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(LIME_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PINK_CHISELED_SAND_STONE_SLAB = register("pink_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(PINK_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GRAY_CHISELED_SAND_STONE_SLAB = register("gray_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CHISELED_SAND_STONE_SLAB = register("light_gray_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> CYAN_CHISELED_SAND_STONE_SLAB = register("cyan_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_CHISELED_SAND_STONE_SLAB = register("purple_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLUE_CHISELED_SAND_STONE_SLAB = register("blue_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> GREEN_CHISELED_SAND_STONE_SLAB = register("green_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BROWN_CHISELED_SAND_STONE_SLAB = register("brown_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<SlabBlock> BLACK_CHISELED_SAND_STONE_SLAB = register("black_chiseled_sand_stone_slab",
            () -> new chiseledSandStoneSlab(BLACK_SAND_STONE.get()));

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