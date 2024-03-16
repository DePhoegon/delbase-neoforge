package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.smoothSandStoneWall;
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
import static net.minecraft.world.level.block.Blocks.RED_SANDSTONE;
import static net.minecraft.world.level.block.Blocks.SANDSTONE;

public class wallSmoothSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> SMOOTH_SAND_STONE_WALL = register("smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(SANDSTONE));
    public static final DeferredBlock<WallBlock> RED_SMOOTH_SAND_STONE_WALL = register("red_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(RED_SANDSTONE));
    public static final DeferredBlock<WallBlock> BLOOD_SMOOTH_SAND_STONE_WALL = register("blood_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> WHITE_SMOOTH_SAND_STONE_WALL = register("white_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> ORANGE_SMOOTH_SAND_STONE_WALL = register("orange_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_SMOOTH_SAND_STONE_WALL = register("magenta_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_SMOOTH_SAND_STONE_WALL = register("light_blue_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> YELLOW_SMOOTH_SAND_STONE_WALL = register("yellow_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIME_SMOOTH_SAND_STONE_WALL = register("lime_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(LIME_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PINK_SMOOTH_SAND_STONE_WALL = register("pink_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(PINK_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GRAY_SMOOTH_SAND_STONE_WALL = register("gray_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_SMOOTH_SAND_STONE_WALL = register("light_gray_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> CYAN_SMOOTH_SAND_STONE_WALL = register("cyan_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PURPLE_SMOOTH_SAND_STONE_WALL = register("purple_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLUE_SMOOTH_SAND_STONE_WALL = register("blue_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GREEN_SMOOTH_SAND_STONE_WALL = register("green_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BROWN_SMOOTH_SAND_STONE_WALL = register("brown_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLACK_SMOOTH_SAND_STONE_WALL = register("black_smooth_sand_stone_wall",
            () -> new smoothSandStoneWall(BLACK_SAND_STONE.get()));

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