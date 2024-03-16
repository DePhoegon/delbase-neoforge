package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorshift.stair.sandStair;
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

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class stairSands {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<StairBlock> SAND_STAIR = register("sand_stair",
            ()-> new sandStair(SAND));
    public static final DeferredBlock<StairBlock> RED_SAND_STAIR = register("red_sand_stair",
            ()-> new sandStair(RED_SAND));
    public static final DeferredBlock<StairBlock> BLOOD_SAND_STAIR = register("blood_sand_stair",
            ()-> new sandStair(BLOOD_SAND.get()));
    public static final DeferredBlock<StairBlock> WHITE_SAND_STAIR = register("white_sand_stair",
            ()-> new sandStair(WHITE_SAND.get()));
    public static final DeferredBlock<StairBlock> ORANGE_SAND_STAIR = register("orange_sand_stair",
            ()-> new sandStair(ORANGE_SAND.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_SAND_STAIR = register("magenta_sand_stair",
            ()-> new sandStair(MAGENTA_SAND.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_SAND_STAIR = register("light_blue_sand_stair",
            ()-> new sandStair(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<StairBlock> YELLOW_SAND_STAIR = register("yellow_sand_stair",
            ()-> new sandStair(YELLOW_SAND.get()));
    public static final DeferredBlock<StairBlock> LIME_SAND_STAIR = register("lime_sand_stair",
            ()-> new sandStair(LIME_SAND.get()));
    public static final DeferredBlock<StairBlock> PINK_SAND_STAIR = register("pink_sand_stair",
            ()-> new sandStair(PINK_SAND.get()));
    public static final DeferredBlock<StairBlock> GREEN_SAND_STAIR = register("green_sand_stair",
            ()-> new sandStair(GREEN_SAND.get()));
    public static final DeferredBlock<StairBlock> GRAY_SAND_STAIR = register("gray_sand_stair",
            ()-> new sandStair(GRAY_SAND.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_SAND_STAIR = register("light_gray_sand_stair",
            ()-> new sandStair(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<StairBlock> CYAN_SAND_STAIR = register("cyan_sand_stair",
            ()-> new sandStair(CYAN_SAND.get()));
    public static final DeferredBlock<StairBlock> PURPLE_SAND_STAIR = register("purple_sand_stair",
            ()-> new sandStair(PURPLE_SAND.get()));
    public static final DeferredBlock<StairBlock> BLUE_SAND_STAIR = register("blue_sand_stair",
            ()-> new sandStair(BLUE_SAND.get()));
    public static final DeferredBlock<StairBlock> BROWN_SAND_STAIR = register("brown_sand_stair",
            ()-> new sandStair(BROWN_SAND.get()));
    public static final DeferredBlock<StairBlock> BLACK_SAND_STAIR = register("black_sand_stair",
            ()-> new sandStair(BLACK_SAND.get()));

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