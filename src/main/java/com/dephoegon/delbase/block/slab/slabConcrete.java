package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.alt.concreteSlab;
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

public class slabConcrete {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> RED_CONCRETE_SLAB = register("red_concrete_slab",
            () -> new concreteSlab(RED_CONCRETE));
    public static final DeferredBlock<SlabBlock> WHITE_CONCRETE_SLAB = register("white_concrete_slab",
            () -> new concreteSlab(WHITE_CONCRETE));
    public static final DeferredBlock<SlabBlock> ORANGE_CONCRETE_SLAB = register("orange_concrete_slab",
            () -> new concreteSlab(ORANGE_CONCRETE));
    public static final DeferredBlock<SlabBlock> MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab",
            () -> new concreteSlab(MAGENTA_CONCRETE));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab",
            () -> new concreteSlab(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<SlabBlock> YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab",
            () -> new concreteSlab(YELLOW_CONCRETE));
    public static final DeferredBlock<SlabBlock> LIME_CONCRETE_SLAB = register("lime_concrete_slab",
            () -> new concreteSlab(LIME_CONCRETE));
    public static final DeferredBlock<SlabBlock> PINK_CONCRETE_SLAB = register("pink_concrete_slab",
            () -> new concreteSlab(PINK_CONCRETE));
    public static final DeferredBlock<SlabBlock> GRAY_CONCRETE_SLAB = register("gray_concrete_slab",
            () -> new concreteSlab(GRAY_CONCRETE));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab",
            () -> new concreteSlab(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<SlabBlock> CYAN_CONCRETE_SLAB = register("cyan_concrete_slab",
            () -> new concreteSlab(CYAN_CONCRETE));
    public static final DeferredBlock<SlabBlock> PURPLE_CONCRETE_SLAB = register("purple_concrete_slab",
            () -> new concreteSlab(PURPLE_CONCRETE));
    public static final DeferredBlock<SlabBlock> BLUE_CONCRETE_SLAB = register("blue_concrete_slab",
            () -> new concreteSlab(BLUE_CONCRETE));
    public static final DeferredBlock<SlabBlock> GREEN_CONCRETE_SLAB = register("green_concrete_slab",
            () -> new concreteSlab(GREEN_CONCRETE));
    public static final DeferredBlock<SlabBlock> BROWN_CONCRETE_SLAB = register("brown_concrete_slab",
            () -> new concreteSlab(BROWN_CONCRETE));
    public static final DeferredBlock<SlabBlock> BLACK_CONCRETE_SLAB = register("black_concrete_slab",
            () -> new concreteSlab(BLACK_CONCRETE));

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