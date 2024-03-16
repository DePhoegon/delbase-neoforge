package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.colorshift.wall.terracottaWall;
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

public class wallTerracotta {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> WHITE_TERRACOTTA_WALL = register("white_terracotta_wall",
            () -> new terracottaWall(WHITE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall",
            () -> new terracottaWall(ORANGE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall",
            () -> new terracottaWall(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<WallBlock> LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall",
            () -> new terracottaWall(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall",
            () -> new terracottaWall(YELLOW_TERRACOTTA));
    public static final DeferredBlock<WallBlock> LIME_TERRACOTTA_WALL = register("lime_terracotta_wall",
            () -> new terracottaWall(LIME_TERRACOTTA));
    public static final DeferredBlock<WallBlock> PINK_TERRACOTTA_WALL = register("pink_terracotta_wall",
            () -> new terracottaWall(PINK_TERRACOTTA));
    public static final DeferredBlock<WallBlock> GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall",
            () -> new terracottaWall(GRAY_TERRACOTTA));
    public static final DeferredBlock<WallBlock> LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall",
            () -> new terracottaWall(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<WallBlock> CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall",
            () -> new terracottaWall(CYAN_TERRACOTTA));
    public static final DeferredBlock<WallBlock> PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall",
            () -> new terracottaWall(PURPLE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall",
            () -> new terracottaWall(BLUE_TERRACOTTA));
    public static final DeferredBlock<WallBlock> BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall",
            () -> new terracottaWall(BROWN_TERRACOTTA));
    public static final DeferredBlock<WallBlock> GREEN_TERRACOTTA_WALL = register("green_terracotta_wall",
            () -> new terracottaWall(GREEN_TERRACOTTA));
    public static final DeferredBlock<WallBlock> RED_TERRACOTTA_WALL = register("red_terracotta_wall",
            () -> new terracottaWall(RED_TERRACOTTA));
    public static final DeferredBlock<WallBlock> BLACK_TERRACOTTA_WALL = register("black_terracotta_wall",
            () -> new terracottaWall(BLACK_TERRACOTTA));
    public static final DeferredBlock<WallBlock> TERRACOTTA_WALL = register("terracotta_wall",
            () -> new terracottaWall(TERRACOTTA));

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