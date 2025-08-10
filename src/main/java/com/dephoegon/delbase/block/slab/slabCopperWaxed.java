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
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.aid.util.weatherState.*;
import static com.dephoegon.delbase.block.slab.slabCoppers.*;
import static net.minecraft.world.level.block.Blocks.*;

public class slabCopperWaxed {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getWaxedSlabCopperBLOCKS() { return BLOCKS; }

    public static final DeferredBlock<SlabBlock> RAW_WAXED_COPPER_SLAB = registerAid("raw_waxed_copper_slab", RAW_COPPER_SLAB, RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 5);
    public static final DeferredBlock<SlabBlock> RAW_WAXED_EXPOSED_COPPER_SLAB = registerAid("raw_waxed_exposed_copper_slab", RAW_EXPOSED_COPPER_SLAB, RAW_COPPER_BLOCK, EXPOSED.getOrder(), 6);
    public static final DeferredBlock<SlabBlock> RAW_WAXED_WEATHERED_COPPER_SLAB = registerAid("raw_waxed_weathered_copper_slab", RAW_WEATHERED_COPPER_SLAB, RAW_COPPER_BLOCK, WEATHERED.getOrder(), 7);
    public static final DeferredBlock<SlabBlock> RAW_WAXED_OXIDIZED_COPPER_SLAB = registerAid("raw_waxed_oxidized_copper_slab", RAW_OXIDIZED_COPPER_SLAB, RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 8);

    public static final DeferredBlock<SlabBlock> WAXED_COPPER_SLAB = registerAid("waxed_copper_slab", COPPER_SLAB, WAXED_COPPER_BLOCK, UNAFFECTED.getOrder(), 15);
    public static final DeferredBlock<SlabBlock> WAXED_EXPOSED_COPPER_SLAB = registerAid("waxed_exposed_copper_slab", EXPOSED_COPPER_SLAB, WAXED_EXPOSED_COPPER, EXPOSED.getOrder(), 16);
    public static final DeferredBlock<SlabBlock> WAXED_WEATHERED_COPPER_SLAB = registerAid("waxed_weathered_copper_slab", WEATHERED_COPPER_SLAB, WAXED_WEATHERED_COPPER, WEATHERED.getOrder(), 17);
    public static final DeferredBlock<SlabBlock> WAXED_OXIDIZED_COPPER_SLAB = registerAid("waxed_oxidized_copper_slab", OXIDIZED_COPPER_SLAB, WAXED_OXIDIZED_COPPER, OXIDIZED.getOrder(), 18);

    public static final DeferredBlock<SlabBlock> CHISELED_WAXED_COPPER_SLAB = registerAid("chiseled_waxed_copper_slab", CHISELED_COPPER_SLAB, WAXED_CHISELED_COPPER, UNAFFECTED.getOrder(), 25);
    public static final DeferredBlock<SlabBlock> CHISELED_WAXED_EXPOSED_COPPER_SLAB = registerAid("chiseled_waxed_exposed_copper_slab", CHISELED_EXPOSED_COPPER_SLAB, WAXED_EXPOSED_CHISELED_COPPER, EXPOSED.getOrder(), 26);
    public static final DeferredBlock<SlabBlock> CHISELED_WAXED_WEATHERED_COPPER_SLAB = registerAid("chiseled_waxed_weathered_copper_slab", CHISELED_WEATHERED_COPPER_SLAB, WAXED_WEATHERED_CHISELED_COPPER, WEATHERED.getOrder(), 27);
    public static final DeferredBlock<SlabBlock> CHISELED_WAXED_OXIDIZED_COPPER_SLAB = registerAid("chiseled_waxed_oxidized_copper_slab", CHISELED_OXIDIZED_COPPER_SLAB, WAXED_OXIDIZED_CHISELED_COPPER, OXIDIZED.getOrder(), 28);

    public static final DeferredBlock<SlabBlock> WAXED_COPPER_GRATING_SLAB = registerAid("waxed_copper_grating_slab", COPPER_GRATING_SLAB, WAXED_COPPER_GRATE, UNAFFECTED.getOrder(), 35);
    public static final DeferredBlock<SlabBlock> WAXED_EXPOSED_COPPER_GRATING_SLAB = registerAid("waxed_exposed_copper_grating_slab", EXPOSED_COPPER_GRATING_SLAB, WAXED_EXPOSED_COPPER_GRATE, EXPOSED.getOrder(), 36);
    public static final DeferredBlock<SlabBlock> WAXED_WEATHERED_COPPER_GRATING_SLAB = registerAid("waxed_weathered_copper_grating_slab", WEATHERED_COPPER_GRATING_SLAB, WAXED_WEATHERED_COPPER_GRATE, WEATHERED.getOrder(), 37);
    public static final DeferredBlock<SlabBlock> WAXED_OXIDIZED_COPPER_GRATING_SLAB = registerAid("waxed_oxidized_copper_grating_slab", OXIDIZED_COPPER_GRATING_SLAB, WAXED_OXIDIZED_COPPER_GRATE, OXIDIZED.getOrder(), 38);

    public static final DeferredBlock<SlabBlock> WAXED_COPPER_BULB_SLAB = registerBulbAid("waxed_copper_bulb_slab", COPPER_BULB_SLAB, WAXED_COPPER_BULB, UNAFFECTED.getOrder(), 45);
    public static final DeferredBlock<SlabBlock> WAXED_EXPOSED_COPPER_BULB_SLAB = registerBulbAid("waxed_exposed_copper_bulb_slab", EXPOSED_COPPER_BULB_SLAB, WAXED_EXPOSED_COPPER_BULB, EXPOSED.getOrder(), 46);
    public static final DeferredBlock<SlabBlock> WAXED_WEATHERED_COPPER_BULB_SLAB = registerBulbAid("waxed_weathered_copper_bulb_slab", WEATHERED_COPPER_BULB_SLAB, WAXED_WEATHERED_COPPER_BULB, WEATHERED.getOrder(), 47);
    public static final DeferredBlock<SlabBlock> WAXED_OXIDIZED_COPPER_BULB_SLAB = registerBulbAid("waxed_oxidized_copper_bulb_slab", OXIDIZED_COPPER_BULB_SLAB, WAXED_OXIDIZED_COPPER_BULB, OXIDIZED.getOrder(), 48);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> @NotNull DeferredBlock<SlabBlock> registerBulbAid(String name, DeferredBlock<? extends Block> strippedState, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperBulbSlab(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
    }
    private static <T extends Block> @NotNull DeferredBlock<SlabBlock> registerAid(String name, DeferredBlock<? extends Block> strippedState, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperSlab(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
    }
    private static <T extends Block> @NotNull DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void  registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }
}