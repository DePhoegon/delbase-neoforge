package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.concreteWall;
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

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallConcrete {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> RED_CONCRETE_WALL = register("red_concrete_wall",
            () -> new concreteWall(RED_CONCRETE));
    public static final DeferredBlock<WallBlock> WHITE_CONCRETE_WALL = register("white_concrete_wall",
            () -> new concreteWall(WHITE_CONCRETE));
    public static final DeferredBlock<WallBlock> ORANGE_CONCRETE_WALL = register("orange_concrete_wall",
            () -> new concreteWall(ORANGE_CONCRETE));
    public static final DeferredBlock<WallBlock> MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall",
            () -> new concreteWall(MAGENTA_CONCRETE));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall",
            () -> new concreteWall(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<WallBlock> YELLOW_CONCRETE_WALL = register("yellow_concrete_wall",
            () -> new concreteWall(YELLOW_CONCRETE));
    public static final DeferredBlock<WallBlock> LIME_CONCRETE_WALL = register("lime_concrete_wall",
            () -> new concreteWall(LIME_CONCRETE));
    public static final DeferredBlock<WallBlock> PINK_CONCRETE_WALL = register("pink_concrete_wall",
            () -> new concreteWall(PINK_CONCRETE));
    public static final DeferredBlock<WallBlock> GRAY_CONCRETE_WALL = register("gray_concrete_wall",
            () -> new concreteWall(GRAY_CONCRETE));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall",
            () -> new concreteWall(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<WallBlock> CYAN_CONCRETE_WALL = register("cyan_concrete_wall",
            () -> new concreteWall(CYAN_CONCRETE));
    public static final DeferredBlock<WallBlock> PURPLE_CONCRETE_WALL = register("purple_concrete_wall",
            () -> new concreteWall(PURPLE_CONCRETE));
    public static final DeferredBlock<WallBlock> BLUE_CONCRETE_WALL = register("blue_concrete_wall",
            () -> new concreteWall(BLUE_CONCRETE));
    public static final DeferredBlock<WallBlock> GREEN_CONCRETE_WALL = register("green_concrete_wall",
            () -> new concreteWall(GREEN_CONCRETE));
    public static final DeferredBlock<WallBlock> BROWN_CONCRETE_WALL = register("brown_concrete_wall",
            () -> new concreteWall(BROWN_CONCRETE));
    public static final DeferredBlock<WallBlock> BLACK_CONCRETE_WALL = register("black_concrete_wall",
            () -> new concreteWall(BLACK_CONCRETE));

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