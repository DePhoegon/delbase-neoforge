package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.terracottaSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabTerracotta {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    
    public static final DeferredBlock<SlabBlock> WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab",
            ()-> new terracottaSlab(WHITE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab",
            ()-> new terracottaSlab(ORANGE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab",
            ()-> new terracottaSlab(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab",
            ()-> new terracottaSlab(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab",
            ()-> new terracottaSlab(YELLOW_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab",
            ()-> new terracottaSlab(LIME_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab",
            ()-> new terracottaSlab(PINK_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab",
            ()-> new terracottaSlab(GRAY_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab",
            ()-> new terracottaSlab(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab",
            ()-> new terracottaSlab(CYAN_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab",
            ()-> new terracottaSlab(PURPLE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab",
            ()-> new terracottaSlab(BLUE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab",
            ()-> new terracottaSlab(BROWN_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab",
            ()-> new terracottaSlab(GREEN_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> RED_TERRACOTTA_SLAB = register("red_terracotta_slab",
            ()-> new terracottaSlab(RED_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab",
            ()-> new terracottaSlab(BLACK_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> TERRACOTTA_SLAB = register("terracotta_slab",
            ()-> new terracottaSlab(TERRACOTTA));

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