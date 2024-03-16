package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.smoothSandStoneStair;
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

public class stairSmoothSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<StairBlock> BLOOD_SMOOTH_SAND_STONE_STAIR = register("blood_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> WHITE_SMOOTH_SAND_STONE_STAIR = register("white_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> ORANGE_SMOOTH_SAND_STONE_STAIR = register("orange_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_SMOOTH_SAND_STONE_STAIR = register("magenta_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_STAIR = register("light_blue_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> YELLOW_SMOOTH_SAND_STONE_STAIR = register("yellow_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIME_SMOOTH_SAND_STONE_STAIR = register("lime_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(LIME_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PINK_SMOOTH_SAND_STONE_STAIR = register("pink_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(PINK_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GRAY_SMOOTH_SAND_STONE_STAIR = register("gray_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_STAIR = register("light_gray_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> CYAN_SMOOTH_SAND_STONE_STAIR = register("cyan_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PURPLE_SMOOTH_SAND_STONE_STAIR = register("purple_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLUE_SMOOTH_SAND_STONE_STAIR = register("blue_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GREEN_SMOOTH_SAND_STONE_STAIR = register("green_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BROWN_SMOOTH_SAND_STONE_STAIR = register("brown_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLACK_SMOOTH_SAND_STONE_STAIR = register("black_smooth_sand_stone_stair",
            () -> new smoothSandStoneStair(BLACK_SAND_STONE.get()));

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