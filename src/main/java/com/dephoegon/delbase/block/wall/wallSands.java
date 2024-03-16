package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.sandWall;
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

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class wallSands {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> OVERRIDE_SAND_WALL = register("sand_wall",
            () -> new sandWall(SAND));
    public static final DeferredBlock<WallBlock> OVERRIDE_RED_SAND_WALL = register("red_sand_wall",
            () -> new sandWall(RED_SAND));
    public static final DeferredBlock<WallBlock> BLOOD_SAND_WALL = register("blood_sand_wall",
            () -> new sandWall(BLOOD_SAND.get()));
    public static final DeferredBlock<WallBlock> WHITE_SAND_WALL = register("white_sand_wall",
            () -> new sandWall(WHITE_SAND.get()));
    public static final DeferredBlock<WallBlock> ORANGE_SAND_WALL = register("orange_sand_wall",
            () -> new sandWall(ORANGE_SAND.get()));
    public static final DeferredBlock<WallBlock> MAGENTA_SAND_WALL = register("magenta_sand_wall",
            () -> new sandWall(MAGENTA_SAND.get()));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_SAND_WALL = register("light_blue_sand_wall",
            () -> new sandWall(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<WallBlock> YELLOW_SAND_WALL = register("yellow_sand_wall",
            () -> new sandWall(YELLOW_SAND.get()));
    public static final DeferredBlock<WallBlock> LIME_SAND_WALL = register("lime_sand_wall",
            () -> new sandWall(LIME_SAND.get()));
    public static final DeferredBlock<WallBlock> PINK_SAND_WALL = register("pink_sand_wall",
            () -> new sandWall(PINK_SAND.get()));
    public static final DeferredBlock<WallBlock> GRAY_SAND_WALL = register("gray_sand_wall",
            () -> new sandWall(GRAY_SAND.get()));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_SAND_WALL = register("light_gray_sand_wall",
            () -> new sandWall(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<WallBlock> CYAN_SAND_WALL = register("cyan_sand_wall",
            () -> new sandWall(CYAN_SAND.get()));
    public static final DeferredBlock<WallBlock> PURPLE_SAND_WALL = register("purple_sand_wall",
            () -> new sandWall(PURPLE_SAND.get()));
    public static final DeferredBlock<WallBlock> BLUE_SAND_WALL = register("blue_sand_wall",
            () -> new sandWall(BLUE_SAND.get()));
    public static final DeferredBlock<WallBlock> GREEN_SAND_WALL = register("green_sand_wall",
            () -> new sandWall(GREEN_SAND.get()));
    public static final DeferredBlock<WallBlock> BROWN_SAND_WALL = register("brown_sand_wall",
            () -> new sandWall(BROWN_SAND.get()));
    public static final DeferredBlock<WallBlock> BLACK_SAND_WALL = register("black_sand_wall",
            () -> new sandWall(BLACK_SAND.get()));

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