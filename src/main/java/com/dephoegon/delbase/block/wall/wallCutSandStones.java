package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.cutSandStoneWall;
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

public class wallCutSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> OVERRIDE_CUT_SAND_STONE_WALL = register("cut_sand_stone_wall",
            () -> new cutSandStoneWall(SANDSTONE));
    public static final DeferredBlock<WallBlock> OVERRIDE_RED_CUT_SAND_STONE_WALL = register("red_cut_sand_stone_wall",
            () -> new cutSandStoneWall(RED_SANDSTONE));
    public static final DeferredBlock<WallBlock> BLOOD_CUT_SAND_STONE_WALL = register("blood_cut_sand_stone_wall",
            () -> new cutSandStoneWall(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> WHITE_CUT_SAND_STONE_WALL = register("white_cut_sand_stone_wall",
            () -> new cutSandStoneWall(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> ORANGE_CUT_SAND_STONE_WALL = register("orange_cut_sand_stone_wall",
            () -> new cutSandStoneWall(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_CUT_SAND_STONE_WALL = register("magenta_cut_sand_stone_wall",
            () -> new cutSandStoneWall(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CUT_SAND_STONE_WALL = register("light_blue_cut_sand_stone_wall",
            () -> new cutSandStoneWall(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> YELLOW_CUT_SAND_STONE_WALL = register("yellow_cut_sand_stone_wall",
            () -> new cutSandStoneWall(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIME_CUT_SAND_STONE_WALL = register("lime_cut_sand_stone_wall",
            () -> new cutSandStoneWall(LIME_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PINK_CUT_SAND_STONE_WALL = register("pink_cut_sand_stone_wall",
            () -> new cutSandStoneWall(PINK_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GRAY_CUT_SAND_STONE_WALL = register("gray_cut_sand_stone_wall",
            () -> new cutSandStoneWall(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CUT_SAND_STONE_WALL = register("light_gray_cut_sand_stone_wall",
            () -> new cutSandStoneWall(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> CYAN_CUT_SAND_STONE_WALL = register("cyan_cut_sand_stone_wall",
            () -> new cutSandStoneWall(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PURPLE_CUT_SAND_STONE_WALL = register("purple_cut_sand_stone_wall",
            () -> new cutSandStoneWall(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLUE_CUT_SAND_STONE_WALL = register("blue_cut_sand_stone_wall",
            () -> new cutSandStoneWall(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GREEN_CUT_SAND_STONE_WALL = register("green_cut_sand_stone_wall",
            () -> new cutSandStoneWall(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BROWN_CUT_SAND_STONE_WALL = register("brown_cut_sand_stone_wall",
            () -> new cutSandStoneWall(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLACK_CUT_SAND_STONE_WALL = register("black_cut_sand_stone_wall",
            () -> new cutSandStoneWall(BLACK_SAND_STONE.get()));

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