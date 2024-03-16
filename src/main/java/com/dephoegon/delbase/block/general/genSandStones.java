package com.dephoegon.delbase.block.general;

import com.dephoegon.delbase.aid.block.colorshift.gen.normSandStone;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;

public class genSandStones {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<Block> BLOOD_SAND_STONE = register("blood_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_RED));
    public static final DeferredBlock<Block> WHITE_SAND_STONE = register("white_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_WHITE));
    public static final DeferredBlock<Block> ORANGE_SAND_STONE = register("orange_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_ORANGE));
    public static final DeferredBlock<Block> MAGENTA_SAND_STONE = register("magenta_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_MAGENTA));
    public static final DeferredBlock<Block> LIGHT_BLUE_SAND_STONE = register("light_blue_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_LIGHT_BLUE));
    public static final DeferredBlock<Block> YELLOW_SAND_STONE = register("yellow_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_YELLOW));
    public static final DeferredBlock<Block> LIME_SAND_STONE = register("lime_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_LIGHT_GREEN));
    public static final DeferredBlock<Block> PINK_SAND_STONE = register("pink_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_PINK));
    public static final DeferredBlock<Block> GRAY_SAND_STONE = register("gray_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_GRAY));
    public static final DeferredBlock<Block> LIGHT_GRAY_SAND_STONE = register("light_gray_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_LIGHT_GRAY));
    public static final DeferredBlock<Block> CYAN_SAND_STONE = register("cyan_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_CYAN));
    public static final DeferredBlock<Block> PURPLE_SAND_STONE = register("purple_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_PURPLE));
    public static final DeferredBlock<Block> BLUE_SAND_STONE = register("blue_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_BLUE));
    public static final DeferredBlock<Block> GREEN_SAND_STONE = register("green_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_GREEN));
    public static final DeferredBlock<Block> BROWN_SAND_STONE = register("brown_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_BROWN));
    public static final DeferredBlock<Block> BLACK_SAND_STONE = register("black_sand_stone",
            () -> new normSandStone(MapColor.TERRACOTTA_BLACK));
    
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