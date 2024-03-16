package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.terracottaStair;
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

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairTerracotta {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<StairBlock> WHITE_TERRACOTTA_STAIR = register("white_terracotta_stair",
            ()-> new terracottaStair(WHITE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> ORANGE_TERRACOTTA_STAIR = register("orange_terracotta_stair",
            ()-> new terracottaStair(ORANGE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> MAGENTA_TERRACOTTA_STAIR = register("magenta_terracotta_stair",
            ()-> new terracottaStair(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_TERRACOTTA_STAIR = register("light_blue_terracotta_stair",
            ()-> new terracottaStair(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> YELLOW_TERRACOTTA_STAIR = register("yellow_terracotta_stair",
            ()-> new terracottaStair(YELLOW_TERRACOTTA));
    public static final DeferredBlock<StairBlock> LIME_TERRACOTTA_STAIR = register("lime_terracotta_stair",
            ()-> new terracottaStair(LIME_TERRACOTTA));
    public static final DeferredBlock<StairBlock> PINK_TERRACOTTA_STAIR = register("pink_terracotta_stair",
            ()-> new terracottaStair(PINK_TERRACOTTA));
    public static final DeferredBlock<StairBlock> GRAY_TERRACOTTA_STAIR = register("gray_terracotta_stair",
            ()-> new terracottaStair(GRAY_TERRACOTTA));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_TERRACOTTA_STAIR = register("light_gray_terracotta_stair",
            ()-> new terracottaStair(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<StairBlock> CYAN_TERRACOTTA_STAIR = register("cyan_terracotta_stair",
            ()-> new terracottaStair(CYAN_TERRACOTTA));
    public static final DeferredBlock<StairBlock> PURPLE_TERRACOTTA_STAIR = register("purple_terracotta_stair",
            ()-> new terracottaStair(PURPLE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> BLUE_TERRACOTTA_STAIR = register("blue_terracotta_stair",
            ()-> new terracottaStair(BLUE_TERRACOTTA));
    public static final DeferredBlock<StairBlock> BROWN_TERRACOTTA_STAIR = register("brown_terracotta_stair",
            ()-> new terracottaStair(BROWN_TERRACOTTA));
    public static final DeferredBlock<StairBlock> GREEN_TERRACOTTA_STAIR = register("green_terracotta_stair",
            ()-> new terracottaStair(GREEN_TERRACOTTA));
    public static final DeferredBlock<StairBlock> RED_TERRACOTTA_STAIR = register("red_terracotta_stair",
            ()-> new terracottaStair(RED_TERRACOTTA));
    public static final DeferredBlock<StairBlock> BLACK_TERRACOTTA_STAIR = register("black_terracotta_stair",
            ()-> new terracottaStair(BLACK_TERRACOTTA));
    public static final DeferredBlock<StairBlock> TERRACOTTA_STAIR = register("terracotta_stair",
            ()-> new terracottaStair(TERRACOTTA));

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