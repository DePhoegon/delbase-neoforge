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
import static com.dephoegon.delbase.aid.util.WeatherState.*;
import static net.minecraft.world.level.block.Blocks.*;

public class slabCopers {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getSlabCopperBLOCKS() { return BLOCKS; }

    public static final DeferredBlock<SlabBlock> RAW_COPPER_SLAB = registerAid("raw_copper_slab", RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), false, 0);
    public static final DeferredBlock<SlabBlock> RAW_EXPOSED_COPPER_SLAB = registerAid("raw_exposed_copper_slab", RAW_COPPER_BLOCK, EXPOSED.getOrder(), false, 1);
    public static final DeferredBlock<SlabBlock> RAW_WEATHERED_COPPER_SLAB = registerAid("raw_weathered_copper_slab", RAW_COPPER_BLOCK, WEATHERED.getOrder(), false, 2);
    public static final DeferredBlock<SlabBlock> RAW_OXIDIZED_COPPER_SLAB = registerAid("raw_oxidized_copper_slab", RAW_COPPER_BLOCK, OXIDIZED.getOrder(), false, 3);

    public static final DeferredBlock<SlabBlock> RAW_WAXED_COPPER_SLAB = registerAid("raw_waxed_copper_slab", RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), true, 5);
    public static final DeferredBlock<SlabBlock> RAW_WAXED_EXPOSED_COPPER_SLAB = registerAid("raw_waxed_exposed_copper_slab", RAW_COPPER_BLOCK, EXPOSED.getOrder(), true, 6);
    public static final DeferredBlock<SlabBlock> RAW_WAXED_WEATHERED_COPPER_SLAB = registerAid("raw_waxed_weathered_copper_slab", RAW_COPPER_BLOCK, WEATHERED.getOrder(), true, 7);
    public static final DeferredBlock<SlabBlock> RAW_WAXED_OXIDIZED_COPPER_SLAB = registerAid("raw_waxed_oxidized_copper_slab", RAW_COPPER_BLOCK, OXIDIZED.getOrder(), true, 8);

    public static final DeferredBlock<SlabBlock> COPPER_SLAB = registerAid("copper_slab", COPPER_BLOCK, UNAFFECTED.getOrder(), false, 10);
    public static final DeferredBlock<SlabBlock> EXPOSED_COPPER_SLAB = registerAid("exposed_copper_slab", EXPOSED_COPPER, EXPOSED.getOrder(), false, 11);
    public static final DeferredBlock<SlabBlock> WEATHERED_COPPER_SLAB = registerAid("weathered_copper_slab", WEATHERED_COPPER, WEATHERED.getOrder(), false, 12);
    public static final DeferredBlock<SlabBlock> OXIDIZED_COPPER_SLAB = registerAid("oxidized_copper_slab", OXIDIZED_COPPER, OXIDIZED.getOrder(), false, 13);

    public static final DeferredBlock<SlabBlock> WAXED_COPPER_SLAB = registerAid("waxed_copper_slab", WAXED_COPPER_BLOCK, UNAFFECTED.getOrder(), true, 15);
    public static final DeferredBlock<SlabBlock> WAXED_EXPOSED_COPPER_SLAB = registerAid("waxed_exposed_copper_slab", WAXED_EXPOSED_COPPER, EXPOSED.getOrder(), true, 16);
    public static final DeferredBlock<SlabBlock> WAXED_WEATHERED_COPPER_SLAB = registerAid("waxed_weathered_copper_slab", WAXED_WEATHERED_COPPER, WEATHERED.getOrder(), true, 17);
    public static final DeferredBlock<SlabBlock> WAXED_OXIDIZED_COPPER_SLAB = registerAid("waxed_oxidized_copper_slab", WAXED_OXIDIZED_COPPER, OXIDIZED.getOrder(), true, 18);

    public static final DeferredBlock<SlabBlock> CHISELED_COPPER_SLAB = registerAid("chiseled_copper_slab", CHISELED_COPPER, UNAFFECTED.getOrder(), false, 20);
    public static final DeferredBlock<SlabBlock> CHISELED_EXPOSED_COPPER_SLAB = registerAid("chiseled_exposed_copper_slab", EXPOSED_CHISELED_COPPER, EXPOSED.getOrder(), false, 21);
    public static final DeferredBlock<SlabBlock> CHISELED_WEATHERED_COPPER_SLAB = registerAid("chiseled_weathered_copper_slab", WEATHERED_CHISELED_COPPER, WEATHERED.getOrder(), false, 22);
    public static final DeferredBlock<SlabBlock> CHISELED_OXIDIZED_COPPER_SLAB = registerAid("chiseled_oxidized_copper_slab", OXIDIZED_CHISELED_COPPER, OXIDIZED.getOrder(), false, 23);

    public static final DeferredBlock<SlabBlock> CHISELED_WAXED_COPPER_SLAB = registerAid("chiseled_waxed_copper_slab", WAXED_CHISELED_COPPER, UNAFFECTED.getOrder(), true, 25);
    public static final DeferredBlock<SlabBlock> CHISELED_WAXED_EXPOSED_COPPER_SLAB = registerAid("chiseled_waxed_exposed_copper_slab", WAXED_EXPOSED_CHISELED_COPPER, EXPOSED.getOrder(), true, 26);
    public static final DeferredBlock<SlabBlock> CHISELED_WAXED_WEATHERED_COPPER_SLAB = registerAid("chiseled_waxed_weathered_copper_slab", WAXED_WEATHERED_CHISELED_COPPER, WEATHERED.getOrder(), true, 27);
    public static final DeferredBlock<SlabBlock> CHISELED_WAXED_OXIDIZED_COPPER_SLAB = registerAid("chiseled_waxed_oxidized_copper_slab", WAXED_OXIDIZED_CHISELED_COPPER, OXIDIZED.getOrder(), true, 28);

    public static final DeferredBlock<SlabBlock> COPPER_GRATING_SLAB = registerAid("copper_grating_slab", COPPER_GRATE, UNAFFECTED.getOrder(), false, 30);
    public static final DeferredBlock<SlabBlock> EXPOSED_COPPER_GRATING_SLAB = registerAid("exposed_copper_grating_slab", EXPOSED_COPPER_GRATE, EXPOSED.getOrder(), false, 31);
    public static final DeferredBlock<SlabBlock> WEATHERED_COPPER_GRATING_SLAB = registerAid("weathered_copper_grating_slab", WEATHERED_COPPER_GRATE, WEATHERED.getOrder(), false, 32);
    public static final DeferredBlock<SlabBlock> OXIDIZED_COPPER_GRATING_SLAB = registerAid("oxidized_copper_grating_slab", OXIDIZED_COPPER_GRATE, OXIDIZED.getOrder(), false, 33);

    public static final DeferredBlock<SlabBlock> WAXED_COPPER_GRATING_SLAB = registerAid("waxed_copper_grating_slab", WAXED_COPPER_GRATE, UNAFFECTED.getOrder(), true, 35);
    public static final DeferredBlock<SlabBlock> WAXED_EXPOSED_COPPER_GRATING_SLAB = registerAid("waxed_exposed_copper_grating_slab", WAXED_EXPOSED_COPPER_GRATE, EXPOSED.getOrder(), true, 36);
    public static final DeferredBlock<SlabBlock> WAXED_WEATHERED_COPPER_GRATING_SLAB = registerAid("waxed_weathered_copper_grating_slab", WAXED_WEATHERED_COPPER_GRATE, WEATHERED.getOrder(), true , 37);
    public static final DeferredBlock<SlabBlock> WAXED_OXIDIZED_COPPER_GRATING_SLAB = registerAid("waxed_oxidized_copper_grating_slab", WAXED_OXIDIZED_COPPER_GRATE, OXIDIZED.getOrder(), true, 38);

    public static final DeferredBlock<SlabBlock> COPPER_BULB_SLAB = registerBulbAid("copper_bulb_slab", COPPER_BULB, UNAFFECTED.getOrder(), false, 40);
    public static final DeferredBlock<SlabBlock> EXPOSED_COPPER_BULB_SLAB = registerBulbAid("exposed_copper_bulb_slab", EXPOSED_COPPER_BULB, EXPOSED.getOrder(), false, 41);
    public static final DeferredBlock<SlabBlock> WEATHERED_COPPER_BULB_SLAB = registerBulbAid("weathered_copper_bulb_slab", WEATHERED_COPPER_BULB, WEATHERED.getOrder(), false, 42);
    public static final DeferredBlock<SlabBlock> OXIDIZED_COPPER_BULB_SLAB = registerBulbAid("oxidized_copper_bulb_slab", OXIDIZED_COPPER_BULB, OXIDIZED.getOrder(), false, 43);

    public static final DeferredBlock<SlabBlock> WAXED_COPPER_BULB_SLAB = registerBulbAid("waxed_copper_bulb_slab", WAXED_COPPER_BULB, UNAFFECTED.getOrder(), true, 45);
    public static final DeferredBlock<SlabBlock> WAXED_EXPOSED_COPPER_BULB_SLAB = registerBulbAid("waxed_exposed_copper_bulb_slab", WAXED_EXPOSED_COPPER_BULB, EXPOSED.getOrder(), true, 46);
    public static final DeferredBlock<SlabBlock> WAXED_WEATHERED_COPPER_BULB_SLAB = registerBulbAid("waxed_weathered_copper_bulb_slab", WAXED_WEATHERED_COPPER_BULB, WEATHERED.getOrder(), true, 47);
    public static final DeferredBlock<SlabBlock> WAXED_OXIDIZED_COPPER_BULB_SLAB = registerBulbAid("waxed_oxidized_copper_bulb_slab", WAXED_OXIDIZED_COPPER_BULB, OXIDIZED.getOrder(), true, 48);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> DeferredBlock<SlabBlock> registerBulbAid(String name, Block copyBlock, int order, boolean isWaxed, int mapOrder) {
        return registerBlock(name, () -> new copperBulbSlab(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), order, isWaxed, mapOrder));
    }
    private static <T extends Block> DeferredBlock<SlabBlock> registerAid(String name, Block copyBlock, int order, boolean isWaxed, int mapOrder) {
        return registerBlock(name, () -> new copperSlab(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), order, isWaxed, mapOrder));
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
