package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.sandStoneStair;
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

public class stairSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<StairBlock> BLOOD_SAND_STONE_STAIR = register("blood_sand_stone_stair",
            () -> new sandStoneStair(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> WHITE_SAND_STONE_STAIR = register("white_sand_stone_stair",
            () -> new sandStoneStair(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> ORANGE_SAND_STONE_STAIR = register("orange_sand_stone_stair",
            () -> new sandStoneStair(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_SAND_STONE_STAIR = register("magenta_sand_stone_stair",
            () -> new sandStoneStair(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_SAND_STONE_STAIR = register("light_blue_sand_stone_stair",
            () -> new sandStoneStair(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> YELLOW_SAND_STONE_STAIR = register("yellow_sand_stone_stair",
            () -> new sandStoneStair(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIME_SAND_STONE_STAIR = register("lime_sand_stone_stair",
            () -> new sandStoneStair(LIME_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PINK_SAND_STONE_STAIR = register("pink_sand_stone_stair",
            () -> new sandStoneStair(PINK_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GRAY_SAND_STONE_STAIR = register("gray_sand_stone_stair",
            () -> new sandStoneStair(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_SAND_STONE_STAIR = register("light_gray_sand_stone_stair",
            () -> new sandStoneStair(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> CYAN_SAND_STONE_STAIR = register("cyan_sand_stone_stair",
            () -> new sandStoneStair(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> PURPLE_SAND_STONE_STAIR = register("purple_sand_stone_stair",
            () -> new sandStoneStair(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLUE_SAND_STONE_STAIR = register("blue_sand_stone_stair",
            () -> new sandStoneStair(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> GREEN_SAND_STONE_STAIR = register("green_sand_stone_stair",
            () -> new sandStoneStair(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BROWN_SAND_STONE_STAIR = register("brown_sand_stone_stair",
            () -> new sandStoneStair(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<StairBlock> BLACK_SAND_STONE_STAIR = register("black_sand_stone_stair",
            () -> new sandStoneStair(BLACK_SAND_STONE.get()));

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