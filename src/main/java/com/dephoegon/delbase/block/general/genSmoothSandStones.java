package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorshift.gen.smoothSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.general.genSandStones.*;
import static com.dephoegon.delbase.block.general.genSandStones.BLACK_SAND_STONE;
import static com.dephoegon.delbase.delbase.MODID;

public class genSmoothSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<Block> BLOOD_SMOOTH_SAND_STONE = register("blood_smooth_sand_stone",
            () -> new smoothSandStone(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<Block> WHITE_SMOOTH_SAND_STONE = register("white_smooth_sand_stone",
            () -> new smoothSandStone(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<Block> ORANGE_SMOOTH_SAND_STONE = register("orange_smooth_sand_stone",
            () -> new smoothSandStone(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<Block> MAGENTA_SMOOTH_SAND_STONE = register("magenta_smooth_sand_stone",
            () -> new smoothSandStone(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIGHT_BLUE_SMOOTH_SAND_STONE = register("light_blue_smooth_sand_stone",
            () -> new smoothSandStone(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<Block> YELLOW_SMOOTH_SAND_STONE = register("yellow_smooth_sand_stone",
            () -> new smoothSandStone(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIME_SMOOTH_SAND_STONE = register("lime_smooth_sand_stone",
            () -> new smoothSandStone(LIME_SAND_STONE.get()));
    public static final DeferredBlock<Block> PINK_SMOOTH_SAND_STONE = register("pink_smooth_sand_stone",
            () -> new smoothSandStone(PINK_SAND_STONE.get()));
    public static final DeferredBlock<Block> GRAY_SMOOTH_SAND_STONE = register("gray_smooth_sand_stone",
            () -> new smoothSandStone(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIGHT_GRAY_SMOOTH_SAND_STONE = register("light_gray_smooth_sand_stone",
            () -> new smoothSandStone(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<Block> CYAN_SMOOTH_SAND_STONE = register("cyan_smooth_sand_stone",
            () -> new smoothSandStone(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<Block> PURPLE_SMOOTH_SAND_STONE = register("purple_smooth_sand_stone",
            () -> new smoothSandStone(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<Block> BLUE_SMOOTH_SAND_STONE = register("blue_smooth_sand_stone",
            () -> new smoothSandStone(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<Block> GREEN_SMOOTH_SAND_STONE = register("green_smooth_sand_stone",
            () -> new smoothSandStone(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<Block> BROWN_SMOOTH_SAND_STONE = register("brown_smooth_sand_stone",
            () -> new smoothSandStone(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<Block> BLACK_SMOOTH_SAND_STONE = register("black_smooth_sand_stone",
            () -> new smoothSandStone(BLACK_SAND_STONE.get()));
    
    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64)));
        return exit;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}