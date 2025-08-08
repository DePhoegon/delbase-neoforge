package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.modExtensions.copperSlab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.aid.util.WeatherState.*;
import static net.minecraft.world.level.block.Blocks.RAW_COPPER_BLOCK;

public class slabCopers {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> RAW_COPPER_SLAB = registerBlock("raw_copper_slab", ()-> new copperSlab(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),false, 0, 0, UNAFFECTED.getOrder(), false,0));
    public static final DeferredBlock<SlabBlock> RAW_EXPOSED_COPPER_SLAB = registerBlock("raw_exposed_copper_slab", ()-> new copperSlab(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),false, 0, 0, EXPOSED.getOrder(), false,1));
    public static final DeferredBlock<SlabBlock> RAW_WEATHERED_COPPER_SLAB = registerBlock("raw_weathered_copper_slab", ()-> new copperSlab(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),false, 0, 0, WEATHERED.getOrder(), false,2));
    public static final DeferredBlock<SlabBlock> RAW_OXIDIZED_COPPER_SLAB = registerBlock("raw_oxidized_copper_slab", ()-> new copperSlab(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),false, 0, 0, OXIDIZED.getOrder(), false, 3));

    public static final DeferredBlock<SlabBlock> RAW_WAXED_COPPER_SLAB = registerBlock("raw_waxed_copper_slab", ()-> new copperSlab(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),false, 0, 0, UNAFFECTED.getOrder(), true, 5));
    public static final DeferredBlock<SlabBlock> RAW_WAXED_EXPOSED_COPPER_SLAB = registerBlock("raw_waxed_exposed_copper_slab", ()-> new copperSlab(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),false, 0, 0, EXPOSED.getOrder(), true, 6));
    public static final DeferredBlock<SlabBlock> RAW_WAXED_WEATHERED_COPPER_SLAB = registerBlock("raw_waxed_weathered_copper_slab", ()-> new copperSlab(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),false, 0, 0, WEATHERED.getOrder(), true, 7));
    public static final DeferredBlock<SlabBlock> RAW_WAXED_OXIDIZED_COPPER_SLAB = registerBlock("raw_waxed_oxidized_copper_slab", ()-> new copperSlab(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),false, 0, 0, OXIDIZED.getOrder(), true, 8));

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