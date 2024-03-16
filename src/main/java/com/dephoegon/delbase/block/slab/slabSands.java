package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorshift.slab.sandSlab;
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

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class slabSands {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<SlabBlock> OVERRIDE_SAND_SLAB = register("sand_slab",
            () -> new sandSlab(SAND));
    public static final DeferredBlock<SlabBlock> OVERRIDE_RED_SAND_SLAB = register("red_sand_slab",
            () -> new sandSlab(RED_SAND));
    public static final DeferredBlock<SlabBlock> BLOOD_SAND_SLAB = register("blood_sand_slab",
            () -> new sandSlab(BLOOD_SAND.get()));
    public static final DeferredBlock<SlabBlock> WHITE_SAND_SLAB = register("white_sand_slab",
            () -> new sandSlab(WHITE_SAND.get()));
    public static final DeferredBlock<SlabBlock> ORANGE_SAND_SLAB = register("orange_sand_slab",
            () -> new sandSlab(ORANGE_SAND.get()));
    public static final DeferredBlock<SlabBlock> MAGENTA_SAND_SLAB = register("magenta_sand_slab",
            () -> new sandSlab(MAGENTA_SAND.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_SAND_SLAB = register("light_blue_sand_slab",
            () -> new sandSlab(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<SlabBlock> YELLOW_SAND_SLAB = register("yellow_sand_slab",
            () -> new sandSlab(YELLOW_SAND.get()));
    public static final DeferredBlock<SlabBlock> LIME_SAND_SLAB = register("lime_sand_slab",
            () -> new sandSlab(LIME_SAND.get()));
    public static final DeferredBlock<SlabBlock> PINK_SAND_SLAB = register("pink_sand_slab",
            () -> new sandSlab(PINK_SAND.get()));
    public static final DeferredBlock<SlabBlock> GRAY_SAND_SLAB = register("gray_sand_slab",
            () -> new sandSlab(GRAY_SAND.get()));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_SAND_SLAB = register("light_gray_sand_slab",
            () -> new sandSlab(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<SlabBlock> CYAN_SAND_SLAB = register("cyan_sand_slab",
            () -> new sandSlab(CYAN_SAND.get()));
    public static final DeferredBlock<SlabBlock> PURPLE_SAND_SLAB = register("purple_sand_slab",
            () -> new sandSlab(PURPLE_SAND.get()));
    public static final DeferredBlock<SlabBlock> BLUE_SAND_SLAB = register("blue_sand_slab",
            () -> new sandSlab(BLUE_SAND.get()));
    public static final DeferredBlock<SlabBlock> GREEN_SAND_SLAB = register("green_sand_slab",
            () -> new sandSlab(GREEN_SAND.get()));
    public static final DeferredBlock<SlabBlock> BROWN_SAND_SLAB = register("brown_sand_slab",
            () -> new sandSlab(BROWN_SAND.get()));
    public static final DeferredBlock<SlabBlock> BLACK_SAND_SLAB = register("black_sand_slab",
            () -> new sandSlab(BLACK_SAND.get()));

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