package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.chiseledSandStoneWall;
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

public class wallChiseledSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> OVERRIDE_CHISELED_SAND_STONE_WALL = register("chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(SANDSTONE));
    public static final DeferredBlock<WallBlock> OVERRIDE_RED_CHISELED_SAND_STONE_WALL = register("red_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(RED_SANDSTONE));
    public static final DeferredBlock<WallBlock> BLOOD_CHISELED_SAND_STONE_WALL = register("blood_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> WHITE_CHISELED_SAND_STONE_WALL = register("white_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> ORANGE_CHISELED_SAND_STONE_WALL = register("orange_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_CHISELED_SAND_STONE_WALL = register("magenta_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CHISELED_SAND_STONE_WALL = register("light_blue_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> YELLOW_CHISELED_SAND_STONE_WALL = register("yellow_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIME_CHISELED_SAND_STONE_WALL = register("lime_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(LIME_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PINK_CHISELED_SAND_STONE_WALL = register("pink_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(PINK_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GRAY_CHISELED_SAND_STONE_WALL = register("gray_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CHISELED_SAND_STONE_WALL = register("light_gray_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> CYAN_CHISELED_SAND_STONE_WALL = register("cyan_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> PURPLE_CHISELED_SAND_STONE_WALL = register("purple_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLUE_CHISELED_SAND_STONE_WALL = register("blue_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> GREEN_CHISELED_SAND_STONE_WALL = register("green_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BROWN_CHISELED_SAND_STONE_WALL = register("brown_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<WallBlock> BLACK_CHISELED_SAND_STONE_WALL = register("black_chiseled_sand_stone_wall",
            () -> new chiseledSandStoneWall(BLACK_SAND_STONE.get()));

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