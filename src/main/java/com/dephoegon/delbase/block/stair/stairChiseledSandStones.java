package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.chiseledSandStoneStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class stairChiseledSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<StairBlock> CHISELED_SAND_STONE_STAIR = register("chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(SANDSTONE));
    public static final DeferredBlock<StairBlock> RED_CHISELED_SAND_STONE_STAIR = register("red_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(RED_SANDSTONE));
    public static final DeferredBlock<StairBlock> BLOOD_CHISELED_SAND_STONE_STAIR = register("blood_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> WHITE_CHISELED_SAND_STONE_STAIR = register("white_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> ORANGE_CHISELED_SAND_STONE_STAIR = register("orange_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_CHISELED_SAND_STONE_STAIR = register("magenta_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CHISELED_SAND_STONE_STAIR = register("light_blue_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> YELLOW_CHISELED_SAND_STONE_STAIR = register("yellow_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIME_CHISELED_SAND_STONE_STAIR = register("lime_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(LIME_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PINK_CHISELED_SAND_STONE_STAIR = register("pink_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(PINK_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GRAY_CHISELED_SAND_STONE_STAIR = register("gray_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CHISELED_SAND_STONE_STAIR = register("light_gray_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> CYAN_CHISELED_SAND_STONE_STAIR = register("cyan_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PURPLE_CHISELED_SAND_STONE_STAIR = register("purple_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLUE_CHISELED_SAND_STONE_STAIR = register("blue_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GREEN_CHISELED_SAND_STONE_STAIR = register("green_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BROWN_CHISELED_SAND_STONE_STAIR = register("brown_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLACK_CHISELED_SAND_STONE_STAIR = register("black_chiseled_sand_stone_stair",
            () -> new chiseledSandStoneStair(BLACK_SAND_STONE.get()));

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