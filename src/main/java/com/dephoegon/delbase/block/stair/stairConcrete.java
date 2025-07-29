package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.alt.concreteStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairConcrete {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> RED_CONCRETE_STAIR = registerBlock("red_concrete_stair",
            () -> new concreteStair(RED_CONCRETE));
    public static final DeferredBlock<StairBlock> WHITE_CONCRETE_STAIR = registerBlock("white_concrete_stair",
            () -> new concreteStair(WHITE_CONCRETE));
    public static final DeferredBlock<StairBlock> ORANGE_CONCRETE_STAIR = registerBlock("orange_concrete_stair",
            () -> new concreteStair(ORANGE_CONCRETE));
    public static final DeferredBlock<StairBlock> MAGENTA_CONCRETE_STAIR = registerBlock("magenta_concrete_stair",
            () -> new concreteStair(MAGENTA_CONCRETE));
    public static final DeferredBlock<StairBlock> LIGHT_BLUE_CONCRETE_STAIR = registerBlock("light_blue_concrete_stair",
            () -> new concreteStair(LIGHT_BLUE_CONCRETE));
    public static final DeferredBlock<StairBlock> YELLOW_CONCRETE_STAIR = registerBlock("yellow_concrete_stair",
            () -> new concreteStair(YELLOW_CONCRETE));
    public static final DeferredBlock<StairBlock> LIME_CONCRETE_STAIR = registerBlock("lime_concrete_stair",
            () -> new concreteStair(LIME_CONCRETE));
    public static final DeferredBlock<StairBlock> PINK_CONCRETE_STAIR = registerBlock("pink_concrete_stair",
            () -> new concreteStair(PINK_CONCRETE));
    public static final DeferredBlock<StairBlock> GRAY_CONCRETE_STAIR = registerBlock("gray_concrete_stair",
            () -> new concreteStair(GRAY_CONCRETE));
    public static final DeferredBlock<StairBlock> LIGHT_GRAY_CONCRETE_STAIR = registerBlock("light_gray_concrete_stair",
            () -> new concreteStair(LIGHT_GRAY_CONCRETE));
    public static final DeferredBlock<StairBlock> CYAN_CONCRETE_STAIR = registerBlock("cyan_concrete_stair",
            () -> new concreteStair(CYAN_CONCRETE));
    public static final DeferredBlock<StairBlock> PURPLE_CONCRETE_STAIR = registerBlock("purple_concrete_stair",
            () -> new concreteStair(PURPLE_CONCRETE));
    public static final DeferredBlock<StairBlock> BLUE_CONCRETE_STAIR = registerBlock("blue_concrete_stair",
            () -> new concreteStair(BLUE_CONCRETE));
    public static final DeferredBlock<StairBlock> GREEN_CONCRETE_STAIR = registerBlock("green_concrete_stair",
            () -> new concreteStair(GREEN_CONCRETE));
    public static final DeferredBlock<StairBlock> BROWN_CONCRETE_STAIR = registerBlock("brown_concrete_stair",
            () -> new concreteStair(BROWN_CONCRETE));
    public static final DeferredBlock<StairBlock> BLACK_CONCRETE_STAIR = registerBlock("black_concrete_stair",
            () -> new concreteStair(BLACK_CONCRETE));
    
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