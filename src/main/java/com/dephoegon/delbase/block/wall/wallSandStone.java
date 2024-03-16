package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.sandStoneWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.delbase.MODID;

public class wallSandStone {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> BLOOD_SAND_STONE_WALL = register("blood_sand_stone_wall",
            () -> new sandStoneWall(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> WHITE_SAND_STONE_WALL = register("white_sand_stone_wall",
            () -> new sandStoneWall(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> ORANGE_SAND_STONE_WALL = register("orange_sand_stone_wall",
            () -> new sandStoneWall(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_SAND_STONE_WALL = register("magenta_sand_stone_wall",
            () -> new sandStoneWall(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_SAND_STONE_WALL = register("light_blue_sand_stone_wall",
            () -> new sandStoneWall(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> YELLOW_SAND_STONE_WALL = register("yellow_sand_stone_wall",
            () -> new sandStoneWall(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIME_SAND_STONE_WALL = register("lime_sand_stone_wall",
            () -> new sandStoneWall(LIME_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PINK_SAND_STONE_WALL = register("pink_sand_stone_wall",
            () -> new sandStoneWall(PINK_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GRAY_SAND_STONE_WALL = register("gray_sand_stone_wall",
            () -> new sandStoneWall(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_SAND_STONE_WALL = register("light_gray_sand_stone_wall",
            () -> new sandStoneWall(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> CYAN_SAND_STONE_WALL = register("cyan_sand_stone_wall",
            () -> new sandStoneWall(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PURPLE_SAND_STONE_WALL = register("purple_sand_stone_wall",
            () -> new sandStoneWall(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLUE_SAND_STONE_WALL = register("blue_sand_stone_wall",
            () -> new sandStoneWall(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GREEN_SAND_STONE_WALL = register("green_sand_stone_wall",
            () -> new sandStoneWall(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BROWN_SAND_STONE_WALL = register("brown_sand_stone_wall",
            () -> new sandStoneWall(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLACK_SAND_STONE_WALL = register("black_sand_stone_wall",
            () -> new sandStoneWall(BLACK_SAND_STONE.get()));

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