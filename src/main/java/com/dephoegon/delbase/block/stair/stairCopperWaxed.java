package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.modExtensions.copperBulbStair;
import com.dephoegon.delbase.aid.block.modExtensions.copperStair;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.aid.util.weatherState.*;
import static com.dephoegon.delbase.block.stair.stairCoppers.*;
import static net.minecraft.world.level.block.Blocks.*;

public class stairCopperWaxed {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getWaxedStairCopperBLOCKS() { return BLOCKS; }

    public static final DeferredBlock<StairBlock> RAW_WAXED_COPPER_STAIRS = registerAid("raw_waxed_copper_stairs", RAW_COPPER_STAIRS, RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 5);
    public static final DeferredBlock<StairBlock> RAW_WAXED_EXPOSED_COPPER_STAIRS = registerAid("raw_waxed_exposed_copper_stairs", RAW_EXPOSED_COPPER_STAIRS, RAW_COPPER_BLOCK, EXPOSED.getOrder(), 6);
    public static final DeferredBlock<StairBlock> RAW_WAXED_WEATHERED_COPPER_STAIRS = registerAid("raw_waxed_weathered_copper_stairs", RAW_WEATHERED_COPPER_STAIRS, RAW_COPPER_BLOCK, WEATHERED.getOrder(), 7);
    public static final DeferredBlock<StairBlock> RAW_WAXED_OXIDIZED_COPPER_STAIRS = registerAid("raw_waxed_oxidized_copper_stairs", RAW_OXIDIZED_COPPER_STAIRS, RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 8);
    
    public static final DeferredBlock<StairBlock> WAXED_COPPER_STAIRS = registerAid("waxed_copper_stairs", COPPER_STAIRS, RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 15);
    public static final DeferredBlock<StairBlock> WAXED_EXPOSED_COPPER_STAIRS = registerAid("waxed_exposed_copper_stairs", EXPOSED_COPPER_STAIRS, EXPOSED_COPPER, EXPOSED.getOrder(), 16);
    public static final DeferredBlock<StairBlock> WAXED_WEATHERED_COPPER_STAIRS = registerAid("waxed_weathered_copper_stairs", WEATHERED_COPPER_STAIRS, WEATHERED_COPPER, WEATHERED.getOrder(), 17);
    public static final DeferredBlock<StairBlock> WAXED_OXIDIZED_COPPER_STAIRS = registerAid("waxed_oxidized_copper_stairs", OXIDIZED_COPPER_STAIRS, OXIDIZED_COPPER, OXIDIZED.getOrder(), 18);

    public static final DeferredBlock<StairBlock> CHISELED_WAXED_COPPER_STAIRS = registerAid("chiseled_waxed_copper_stairs", CHISELED_COPPER_STAIRS, WAXED_CHISELED_COPPER, UNAFFECTED.getOrder(), 25);
    public static final DeferredBlock<StairBlock> CHISELED_WAXED_EXPOSED_COPPER_STAIRS = registerAid("chiseled_waxed_exposed_copper_stairs", CHISELED_EXPOSED_COPPER_STAIRS, WAXED_EXPOSED_CHISELED_COPPER, EXPOSED.getOrder(), 26);
    public static final DeferredBlock<StairBlock> CHISELED_WAXED_WEATHERED_COPPER_STAIRS = registerAid("chiseled_waxed_weathered_copper_stairs", CHISELED_WEATHERED_COPPER_STAIRS, WAXED_WEATHERED_CHISELED_COPPER, WEATHERED.getOrder(), 27);
    public static final DeferredBlock<StairBlock> CHISELED_WAXED_OXIDIZED_COPPER_STAIRS = registerAid("chiseled_waxed_oxidized_copper_stairs", CHISELED_OXIDIZED_COPPER_STAIRS, WAXED_OXIDIZED_CHISELED_COPPER, OXIDIZED.getOrder(), 28);

    public static final DeferredBlock<StairBlock> WAXED_COPPER_GRATING_STAIRS = registerAid("waxed_copper_grating_stairs", COPPER_GRATING_STAIRS, WAXED_COPPER_GRATE, UNAFFECTED.getOrder(), 35);
    public static final DeferredBlock<StairBlock> WAXED_EXPOSED_COPPER_GRATING_STAIRS = registerAid("waxed_exposed_copper_grating_stairs", EXPOSED_COPPER_GRATING_STAIRS, WAXED_EXPOSED_COPPER_GRATE, EXPOSED.getOrder(), 36);
    public static final DeferredBlock<StairBlock> WAXED_WEATHERED_COPPER_GRATING_STAIRS = registerAid("waxed_weathered_copper_grating_stairs", WEATHERED_COPPER_GRATING_STAIRS, WAXED_WEATHERED_COPPER_GRATE, WEATHERED.getOrder(), 37);
    public static final DeferredBlock<StairBlock> WAXED_OXIDIZED_COPPER_GRATING_STAIRS = registerAid("waxed_oxidized_copper_grating_stairs", OXIDIZED_COPPER_GRATING_STAIRS, WAXED_OXIDIZED_COPPER_GRATE, OXIDIZED.getOrder(), 38);

    public static final DeferredBlock<StairBlock> WAXED_COPPER_BULB_STAIRS = registerBulbAid("waxed_copper_bulb_stairs", COPPER_BULB_STAIRS, WAXED_COPPER_BULB, UNAFFECTED.getOrder(), 45);
    public static final DeferredBlock<StairBlock> WAXED_EXPOSED_COPPER_BULB_STAIRS = registerBulbAid("waxed_exposed_copper_bulb_stairs", EXPOSED_COPPER_BULB_STAIRS, WAXED_EXPOSED_COPPER_BULB, EXPOSED.getOrder(), 46);
    public static final DeferredBlock<StairBlock> WAXED_WEATHERED_COPPER_BULB_STAIRS = registerBulbAid("waxed_weathered_copper_bulb_stairs", WEATHERED_COPPER_BULB_STAIRS, WAXED_WEATHERED_COPPER_BULB, WEATHERED.getOrder(), 47);
    public static final DeferredBlock<StairBlock> WAXED_OXIDIZED_COPPER_BULB_STAIRS = registerBulbAid("waxed_oxidized_copper_bulb_stairs", OXIDIZED_COPPER_BULB_STAIRS, WAXED_OXIDIZED_COPPER_BULB, OXIDIZED.getOrder(), 48);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> @NotNull DeferredBlock<StairBlock> registerBulbAid(String name, DeferredBlock<? extends Block> strippedState, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperBulbStair(copyBlock, BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
    }
    private static <T extends Block> @NotNull DeferredBlock<StairBlock> registerAid(String name, DeferredBlock<? extends Block> strippedState, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperStair(copyBlock, BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
    }
    private static <T extends Block> @NotNull DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().stacksTo(64)));
    }
}