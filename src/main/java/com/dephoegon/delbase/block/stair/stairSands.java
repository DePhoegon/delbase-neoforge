package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.colorShift.stair.sandStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class stairSands {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> SAND_STAIR = registerBlock("sand_stair",
            ()-> new sandStair(SAND));
    public static final DeferredBlock<StairBlock> RED_SAND_STAIR = registerBlock("red_sand_stair",
            ()-> new sandStair(RED_SAND));
    public static final DeferredBlock<StairBlock> BLOOD_SAND_STAIR = registerBlock("blood_sand_stair",
            ()-> new sandStair(BLOOD_SAND.get()));
    public static final DeferredBlock<StairBlock> WHITE_SAND_STAIR = registerBlock("white_sand_stair",
            ()-> new sandStair(WHITE_SAND.get()));
    public static final DeferredBlock<StairBlock> ORANGE_SAND_STAIR = registerBlock("orange_sand_stair",
            ()-> new sandStair(ORANGE_SAND.get()));
    public static final DeferredBlock<StairBlock> MAGENTA_SAND_STAIR = registerBlock("magenta_sand_stair",
            ()-> new sandStair(MAGENTA_SAND.get()));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_SAND_STAIR = registerBlock("light_blue_sand_stair",
            ()-> new sandStair(LIGHT_BLUE_SAND.get()));
    public static final DeferredBlock<StairBlock> YELLOW_SAND_STAIR = registerBlock("yellow_sand_stair",
            ()-> new sandStair(YELLOW_SAND.get()));
    public static final DeferredBlock<StairBlock> LIME_SAND_STAIR = registerBlock("lime_sand_stair",
            ()-> new sandStair(LIME_SAND.get()));
    public static final DeferredBlock<StairBlock> PINK_SAND_STAIR = registerBlock("pink_sand_stair",
            ()-> new sandStair(PINK_SAND.get()));
    public static final DeferredBlock<StairBlock> GREEN_SAND_STAIR = registerBlock("green_sand_stair",
            ()-> new sandStair(GREEN_SAND.get()));
    public static final DeferredBlock<StairBlock> GRAY_SAND_STAIR = registerBlock("gray_sand_stair",
            ()-> new sandStair(GRAY_SAND.get()));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_SAND_STAIR = registerBlock("light_gray_sand_stair",
            ()-> new sandStair(LIGHT_GRAY_SAND.get()));
    public static final DeferredBlock<StairBlock> CYAN_SAND_STAIR = registerBlock("cyan_sand_stair",
            ()-> new sandStair(CYAN_SAND.get()));
    public static final DeferredBlock<StairBlock> PURPLE_SAND_STAIR = registerBlock("purple_sand_stair",
            ()-> new sandStair(PURPLE_SAND.get()));
    public static final DeferredBlock<StairBlock> BLUE_SAND_STAIR = registerBlock("blue_sand_stair",
            ()-> new sandStair(BLUE_SAND.get()));
    public static final DeferredBlock<StairBlock> BROWN_SAND_STAIR = registerBlock("brown_sand_stair",
            ()-> new sandStair(BROWN_SAND.get()));
    public static final DeferredBlock<StairBlock> BLACK_SAND_STAIR = registerBlock("black_sand_stair",
            ()-> new sandStair(BLACK_SAND.get()));

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void  registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }
}