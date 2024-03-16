package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorshift.gen.chiseledSandStone;
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

public class genChiseledSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<Block> BLOOD_CHISELED_SAND_STONE = register("blood_chiseled_sand_stone",
            () -> new chiseledSandStone(BLOOD_SAND_STONE.get()));
    public static final DeferredBlock<Block> WHITE_CHISELED_SAND_STONE = register("white_chiseled_sand_stone",
            () -> new chiseledSandStone(WHITE_SAND_STONE.get()));
    public static final DeferredBlock<Block> ORANGE_CHISELED_SAND_STONE = register("orange_chiseled_sand_stone",
            () -> new chiseledSandStone(ORANGE_SAND_STONE.get()));
    public static final DeferredBlock<Block> MAGENTA_CHISELED_SAND_STONE = register("magenta_chiseled_sand_stone",
            () -> new chiseledSandStone(MAGENTA_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIGHT_BLUE_CHISELED_SAND_STONE = register("light_blue_chiseled_sand_stone",
            () -> new chiseledSandStone(LIGHT_BLUE_SAND_STONE.get()));
    public static final DeferredBlock<Block> YELLOW_CHISELED_SAND_STONE = register("yellow_chiseled_sand_stone",
            () -> new chiseledSandStone(YELLOW_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIME_CHISELED_SAND_STONE = register("lime_chiseled_sand_stone",
            () -> new chiseledSandStone(LIME_SAND_STONE.get()));
    public static final DeferredBlock<Block> PINK_CHISELED_SAND_STONE = register("pink_chiseled_sand_stone",
            () -> new chiseledSandStone(PINK_SAND_STONE.get()));
    public static final DeferredBlock<Block> GRAY_CHISELED_SAND_STONE = register("gray_chiseled_sand_stone",
            () -> new chiseledSandStone(GRAY_SAND_STONE.get()));
    public static final DeferredBlock<Block> LIGHT_GRAY_CHISELED_SAND_STONE = register("light_gray_chiseled_sand_stone",
            () -> new chiseledSandStone(LIGHT_GRAY_SAND_STONE.get()));
    public static final DeferredBlock<Block> CYAN_CHISELED_SAND_STONE = register("cyan_chiseled_sand_stone",
            () -> new chiseledSandStone(CYAN_SAND_STONE.get()));
    public static final DeferredBlock<Block> PURPLE_CHISELED_SAND_STONE = register("purple_chiseled_sand_stone",
            () -> new chiseledSandStone(PURPLE_SAND_STONE.get()));
    public static final DeferredBlock<Block> BLUE_CHISELED_SAND_STONE = register("blue_chiseled_sand_stone",
            () -> new chiseledSandStone(BLUE_SAND_STONE.get()));
    public static final DeferredBlock<Block> GREEN_CHISELED_SAND_STONE = register("green_chiseled_sand_stone",
            () -> new chiseledSandStone(GREEN_SAND_STONE.get()));
    public static final DeferredBlock<Block> BROWN_CHISELED_SAND_STONE = register("brown_chiseled_sand_stone",
            () -> new chiseledSandStone(BROWN_SAND_STONE.get()));
    public static final DeferredBlock<Block> BLACK_CHISELED_SAND_STONE = register("black_chiseled_sand_stone",
            () -> new chiseledSandStone(BLACK_SAND_STONE.get()));

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