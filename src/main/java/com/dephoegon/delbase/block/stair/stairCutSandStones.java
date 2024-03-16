package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.cutSandStoneStair;
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

public class stairCutSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<StairBlock> CUT_SAND_STONE_STAIR = register("cut_sand_stone_stair",
            () -> new cutSandStoneStair(SANDSTONE));
    public static final DeferredBlock<StairBlock> RED_CUT_SAND_STONE_STAIR = register("red_cut_sand_stone_stair",
            () -> new cutSandStoneStair(RED_SANDSTONE));
    public static final DeferredBlock<StairBlock> BLOOD_CUT_SAND_STONE_STAIR = register("blood_cut_sand_stone_stair",
            () -> new cutSandStoneStair(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> WHITE_CUT_SAND_STONE_STAIR = register("white_cut_sand_stone_stair",
            () -> new cutSandStoneStair(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> ORANGE_CUT_SAND_STONE_STAIR = register("orange_cut_sand_stone_stair",
            () -> new cutSandStoneStair(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_CUT_SAND_STONE_STAIR = register("magenta_cut_sand_stone_stair",
            () -> new cutSandStoneStair(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CUT_SAND_STONE_STAIR = register("light_blue_cut_sand_stone_stair",
            () -> new cutSandStoneStair(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> YELLOW_CUT_SAND_STONE_STAIR = register("yellow_cut_sand_stone_stair",
            () -> new cutSandStoneStair(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIME_CUT_SAND_STONE_STAIR = register("lime_cut_sand_stone_stair",
            () -> new cutSandStoneStair(LIME_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PINK_CUT_SAND_STONE_STAIR = register("pink_cut_sand_stone_stair",
            () -> new cutSandStoneStair(PINK_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GRAY_CUT_SAND_STONE_STAIR = register("gray_cut_sand_stone_stair",
            () -> new cutSandStoneStair(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CUT_SAND_STONE_STAIR = register("light_gray_cut_sand_stone_stair",
            () -> new cutSandStoneStair(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> CYAN_CUT_SAND_STONE_STAIR = register("cyan_cut_sand_stone_stair",
            () -> new cutSandStoneStair(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PURPLE_CUT_SAND_STONE_STAIR = register("purple_cut_sand_stone_stair",
            () -> new cutSandStoneStair(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLUE_CUT_SAND_STONE_STAIR = register("blue_cut_sand_stone_stair",
            () -> new cutSandStoneStair(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GREEN_CUT_SAND_STONE_STAIR = register("green_cut_sand_stone_stair",
            () -> new cutSandStoneStair(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BROWN_CUT_SAND_STONE_STAIR = register("brown_cut_sand_stone_stair",
            () -> new cutSandStoneStair(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLACK_CUT_SAND_STONE_STAIR = register("black_cut_sand_stone_stair",
            () -> new cutSandStoneStair(BLACK_SAND_STONE.get()));

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