package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.colorShift.slab.terracottaSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class slabTerracotta {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);
    
    public static final DeferredBlock<SlabBlock> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            ()-> new terracottaSlab(WHITE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            ()-> new terracottaSlab(ORANGE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            ()-> new terracottaSlab(MAGENTA_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            ()-> new terracottaSlab(LIGHT_BLUE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            ()-> new terracottaSlab(YELLOW_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            ()-> new terracottaSlab(LIME_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            ()-> new terracottaSlab(PINK_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            ()-> new terracottaSlab(GRAY_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            ()-> new terracottaSlab(LIGHT_GRAY_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            ()-> new terracottaSlab(CYAN_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            ()-> new terracottaSlab(PURPLE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            ()-> new terracottaSlab(BLUE_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            ()-> new terracottaSlab(BROWN_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            ()-> new terracottaSlab(GREEN_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            ()-> new terracottaSlab(RED_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            ()-> new terracottaSlab(BLACK_TERRACOTTA));
    public static final DeferredBlock<SlabBlock> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            ()-> new terracottaSlab(TERRACOTTA));

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