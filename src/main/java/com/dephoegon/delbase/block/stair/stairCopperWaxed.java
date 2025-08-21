package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.modExtensions.copperBulbStair;
import com.dephoegon.delbase.aid.block.modExtensions.copperStair;
import com.dephoegon.delbase.aid.util.weatherState;
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

    public static final DeferredBlock<StairBlock> RAW_WAXED_COPPER_STAIR = registerAid("raw_waxed_copper_stair", RAW_COPPER_STAIR, RAW_COPPER_BLOCK, UNAFFECTED, 5);
    public static final DeferredBlock<StairBlock> RAW_WAXED_EXPOSED_COPPER_STAIR = registerAid("raw_waxed_exposed_copper_stair", RAW_EXPOSED_COPPER_STAIR, RAW_COPPER_BLOCK, EXPOSED, 6);
    public static final DeferredBlock<StairBlock> RAW_WAXED_WEATHERED_COPPER_STAIR = registerAid("raw_waxed_weathered_copper_stair", RAW_WEATHERED_COPPER_STAIR, RAW_COPPER_BLOCK, WEATHERED, 7);
    public static final DeferredBlock<StairBlock> RAW_WAXED_OXIDIZED_COPPER_STAIR = registerAid("raw_waxed_oxidized_copper_stair", RAW_OXIDIZED_COPPER_STAIR, RAW_COPPER_BLOCK, OXIDIZED, 8);
    
    public static final DeferredBlock<StairBlock> WAXED_COPPER_STAIR = registerAid("waxed_copper_stair", COPPER_STAIR, RAW_COPPER_BLOCK, UNAFFECTED, 15);
    public static final DeferredBlock<StairBlock> WAXED_EXPOSED_COPPER_STAIR = registerAid("waxed_exposed_copper_stair", EXPOSED_COPPER_STAIR, EXPOSED_COPPER, EXPOSED, 16);
    public static final DeferredBlock<StairBlock> WAXED_WEATHERED_COPPER_STAIR = registerAid("waxed_weathered_copper_stair", WEATHERED_COPPER_STAIR, WEATHERED_COPPER, WEATHERED, 17);
    public static final DeferredBlock<StairBlock> WAXED_OXIDIZED_COPPER_STAIR = registerAid("waxed_oxidized_copper_stair", OXIDIZED_COPPER_STAIR, OXIDIZED_COPPER, OXIDIZED, 18);

    public static final DeferredBlock<StairBlock> WAXED_CHISELED_COPPER_STAIR = registerAid("waxed_chiseled_copper_stair", CHISELED_COPPER_STAIR, WAXED_CHISELED_COPPER, UNAFFECTED, 25);
    public static final DeferredBlock<StairBlock> WAXED_CHISELED_EXPOSED_COPPER_STAIR = registerAid("waxed_chiseled_exposed_copper_stair", CHISELED_EXPOSED_COPPER_STAIR, WAXED_EXPOSED_CHISELED_COPPER, EXPOSED, 26);
    public static final DeferredBlock<StairBlock> WAXED_CHISELED_WEATHERED_COPPER_STAIR = registerAid("waxed_chiseled_weathered_copper_stair", CHISELED_WEATHERED_COPPER_STAIR, WAXED_WEATHERED_CHISELED_COPPER, WEATHERED, 27);
    public static final DeferredBlock<StairBlock> WAXED_CHISELED_OXIDIZED_COPPER_STAIR = registerAid("waxed_chiseled_oxidized_copper_stair", CHISELED_OXIDIZED_COPPER_STAIR, WAXED_OXIDIZED_CHISELED_COPPER, OXIDIZED, 28);

    public static final DeferredBlock<StairBlock> WAXED_COPPER_GRATE_STAIR = registerAid("waxed_copper_grate_stair", COPPER_GRATE_STAIR, WAXED_COPPER_GRATE, UNAFFECTED, 35);
    public static final DeferredBlock<StairBlock> WAXED_EXPOSED_COPPER_GRATE_STAIR = registerAid("waxed_exposed_copper_grate_stair", EXPOSED_COPPER_GRATE_STAIR, WAXED_EXPOSED_COPPER_GRATE, EXPOSED, 36);
    public static final DeferredBlock<StairBlock> WAXED_WEATHERED_COPPER_GRATE_STAIR = registerAid("waxed_weathered_copper_grate_stair", WEATHERED_COPPER_GRATE_STAIR, WAXED_WEATHERED_COPPER_GRATE, WEATHERED, 37);
    public static final DeferredBlock<StairBlock> WAXED_OXIDIZED_COPPER_GRATE_STAIR = registerAid("waxed_oxidized_copper_grate_stair", OXIDIZED_COPPER_GRATE_STAIR, WAXED_OXIDIZED_COPPER_GRATE, OXIDIZED, 38);
/*
    public static final DeferredBlock<StairBlock> WAXED_COPPER_BULB_STAIR = registerBulbAid("waxed_copper_bulb_stair", COPPER_BULB_STAIR, WAXED_COPPER_BULB, UNAFFECTED, 45);
    public static final DeferredBlock<StairBlock> WAXED_EXPOSED_COPPER_BULB_STAIR = registerBulbAid("waxed_exposed_copper_bulb_stair", EXPOSED_COPPER_BULB_STAIR, WAXED_EXPOSED_COPPER_BULB, EXPOSED, 46);
    public static final DeferredBlock<StairBlock> WAXED_WEATHERED_COPPER_BULB_STAIR = registerBulbAid("waxed_weathered_copper_bulb_stair", WEATHERED_COPPER_BULB_STAIR, WAXED_WEATHERED_COPPER_BULB, WEATHERED, 47);
    public static final DeferredBlock<StairBlock> WAXED_OXIDIZED_COPPER_BULB_STAIR = registerBulbAid("waxed_oxidized_copper_bulb_stair", OXIDIZED_COPPER_BULB_STAIR, WAXED_OXIDIZED_COPPER_BULB, OXIDIZED, 48);
*/

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> @NotNull DeferredBlock<StairBlock> registerBulbAid(String name, DeferredBlock<T> strippedState, Block copyBlock, weatherState order, int mapOrder) {
        return registerBlock(name, () -> new copperBulbStair(copyBlock, BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order.getOrder(), true, mapOrder));
    }
    private static <T extends Block> @NotNull DeferredBlock<StairBlock> registerAid(String name, DeferredBlock<T> strippedState, Block copyBlock, weatherState order, int mapOrder) {
        return registerBlock(name, () -> new copperStair(copyBlock, BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order.getOrder(), true, mapOrder));
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