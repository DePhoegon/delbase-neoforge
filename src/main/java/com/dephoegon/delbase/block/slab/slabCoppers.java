package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.modExtensions.copperBulbSlab;
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
import static com.dephoegon.delbase.aid.util.weatherState.*;
import static net.minecraft.world.level.block.Blocks.*;

public class slabCoppers {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getSlabCopperBLOCKS() { return BLOCKS; }

    public static final DeferredBlock<SlabBlock> RAW_COPPER_SLAB = registerAid("raw_copper_slab", RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 0);
    public static final DeferredBlock<SlabBlock> RAW_EXPOSED_COPPER_SLAB = registerAid("raw_exposed_copper_slab", RAW_COPPER_BLOCK, EXPOSED.getOrder(), 1);
    public static final DeferredBlock<SlabBlock> RAW_WEATHERED_COPPER_SLAB = registerAid("raw_weathered_copper_slab", RAW_COPPER_BLOCK, WEATHERED.getOrder(), 2);
    public static final DeferredBlock<SlabBlock> RAW_OXIDIZED_COPPER_SLAB = registerAid("raw_oxidized_copper_slab", RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 3);

    public static final DeferredBlock<SlabBlock> COPPER_SLAB = registerAid("copper_slab", COPPER_BLOCK, UNAFFECTED.getOrder(), 10);
    public static final DeferredBlock<SlabBlock> EXPOSED_COPPER_SLAB = registerAid("exposed_copper_slab", EXPOSED_COPPER, EXPOSED.getOrder(), 11);
    public static final DeferredBlock<SlabBlock> WEATHERED_COPPER_SLAB = registerAid("weathered_copper_slab", WEATHERED_COPPER, WEATHERED.getOrder(), 12);
    public static final DeferredBlock<SlabBlock> OXIDIZED_COPPER_SLAB = registerAid("oxidized_copper_slab", OXIDIZED_COPPER, OXIDIZED.getOrder(), 13);

    public static final DeferredBlock<SlabBlock> CHISELED_COPPER_SLAB = registerAid("chiseled_copper_slab", CHISELED_COPPER, UNAFFECTED.getOrder(), 20);
    public static final DeferredBlock<SlabBlock> CHISELED_EXPOSED_COPPER_SLAB = registerAid("chiseled_exposed_copper_slab", EXPOSED_CHISELED_COPPER, EXPOSED.getOrder(), 21);
    public static final DeferredBlock<SlabBlock> CHISELED_WEATHERED_COPPER_SLAB = registerAid("chiseled_weathered_copper_slab", WEATHERED_CHISELED_COPPER, WEATHERED.getOrder(), 22);
    public static final DeferredBlock<SlabBlock> CHISELED_OXIDIZED_COPPER_SLAB = registerAid("chiseled_oxidized_copper_slab", OXIDIZED_CHISELED_COPPER, OXIDIZED.getOrder(), 23);

    public static final DeferredBlock<SlabBlock> COPPER_GRATING_SLAB = registerAid("copper_grating_slab", COPPER_GRATE, UNAFFECTED.getOrder(), 30);
    public static final DeferredBlock<SlabBlock> EXPOSED_COPPER_GRATING_SLAB = registerAid("exposed_copper_grating_slab", EXPOSED_COPPER_GRATE, EXPOSED.getOrder(), 31);
    public static final DeferredBlock<SlabBlock> WEATHERED_COPPER_GRATING_SLAB = registerAid("weathered_copper_grating_slab", WEATHERED_COPPER_GRATE, WEATHERED.getOrder(), 32);
    public static final DeferredBlock<SlabBlock> OXIDIZED_COPPER_GRATING_SLAB = registerAid("oxidized_copper_grating_slab", OXIDIZED_COPPER_GRATE, OXIDIZED.getOrder(), 33);
/*
    public static final DeferredBlock<SlabBlock> COPPER_BULB_SLAB = registerBulbAid("copper_bulb_slab", COPPER_BULB, UNAFFECTED.getOrder(), 40);
    public static final DeferredBlock<SlabBlock> EXPOSED_COPPER_BULB_SLAB = registerBulbAid("exposed_copper_bulb_slab", EXPOSED_COPPER_BULB, EXPOSED.getOrder(), 41);
    public static final DeferredBlock<SlabBlock> WEATHERED_COPPER_BULB_SLAB = registerBulbAid("weathered_copper_bulb_slab", WEATHERED_COPPER_BULB, WEATHERED.getOrder(), 42);
    public static final DeferredBlock<SlabBlock> OXIDIZED_COPPER_BULB_SLAB = registerBulbAid("oxidized_copper_bulb_slab", OXIDIZED_COPPER_BULB, OXIDIZED.getOrder(), 43);
*/

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> DeferredBlock<SlabBlock> registerBulbAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperBulbSlab(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
    }
    private static <T extends Block> DeferredBlock<SlabBlock> registerAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperSlab(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
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