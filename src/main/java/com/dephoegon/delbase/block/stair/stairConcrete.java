package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.concreteStair;
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

public class stairConcrete {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<StairBlock> RED_CONCRETE_STAIR = register("red_concrete_stair",
            () -> new concreteStair(RED_CONCRETE));
    public static final DeferredBlock<StairBlock> WHITE_CONCRETE_STAIR = register("white_concrete_stair",
            () -> new concreteStair(WHITE_CONCRETE));
    public static final DeferredBlock<StairBlock> ORANGE_CONCRETE_STAIR = register("orange_concrete_stair",
            () -> new concreteStair(ORANGE_CONCRETE));
    public static final DeferredBlock<StairBlock> MAGENTA_CONCRETE_STAIR = register("magenta_concrete_stair",
            () -> new concreteStair(MAGENTA_CONCRETE));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CONCRETE_STAIR = register("light_blue_concrete_stair",
            () -> new concreteStair(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<StairBlock> YELLOW_CONCRETE_STAIR = register("yellow_concrete_stair",
            () -> new concreteStair(YELLOW_CONCRETE));
    public static final DeferredBlock<StairBlock> LIME_CONCRETE_STAIR = register("lime_concrete_stair",
            () -> new concreteStair(LIME_CONCRETE));
    public static final DeferredBlock<StairBlock> PINK_CONCRETE_STAIR = register("pink_concrete_stair",
            () -> new concreteStair(PINK_CONCRETE));
    public static final DeferredBlock<StairBlock> GRAY_CONCRETE_STAIR = register("gray_concrete_stair",
            () -> new concreteStair(GRAY_CONCRETE));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CONCRETE_STAIR = register("light_gray_concrete_stair",
            () -> new concreteStair(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<StairBlock> CYAN_CONCRETE_STAIR = register("cyan_concrete_stair",
            () -> new concreteStair(CYAN_CONCRETE));
    public static final DeferredBlock<StairBlock> PURPLE_CONCRETE_STAIR = register("purple_concrete_stair",
            () -> new concreteStair(PURPLE_CONCRETE));
    public static final DeferredBlock<StairBlock> BLUE_CONCRETE_STAIR = register("blue_concrete_stair",
            () -> new concreteStair(BLUE_CONCRETE));
    public static final DeferredBlock<StairBlock> GREEN_CONCRETE_STAIR = register("green_concrete_stair",
            () -> new concreteStair(GREEN_CONCRETE));
    public static final DeferredBlock<StairBlock> BROWN_CONCRETE_STAIR = register("brown_concrete_stair",
            () -> new concreteStair(BROWN_CONCRETE));
    public static final DeferredBlock<StairBlock> BLACK_CONCRETE_STAIR = register("black_concrete_stair",
            () -> new concreteStair(BLACK_CONCRETE));

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