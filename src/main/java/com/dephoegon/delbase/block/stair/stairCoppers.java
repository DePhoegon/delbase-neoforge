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

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.aid.util.weatherState.*;
import static net.minecraft.world.level.block.Blocks.*;

public class stairCoppers {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getStairCopperBLOCKS() { return BLOCKS; }

    public static final DeferredBlock<StairBlock> RAW_COPPER_STAIRS = registerAid("raw_copper_stairs", RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 0);
    public static final DeferredBlock<StairBlock> RAW_EXPOSED_COPPER_STAIRS = registerAid("raw_exposed_copper_stairs", RAW_COPPER_BLOCK, EXPOSED.getOrder(), 1);
    public static final DeferredBlock<StairBlock> RAW_WEATHERED_COPPER_STAIRS = registerAid("raw_weathered_copper_stairs", RAW_COPPER_BLOCK, WEATHERED.getOrder(), 2);
    public static final DeferredBlock<StairBlock> RAW_OXIDIZED_COPPER_STAIRS = registerAid("raw_oxidized_copper_stairs", RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 3);

    public static final DeferredBlock<StairBlock> COPPER_STAIRS = registerAid("copper_stairs", RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 10);
    public static final DeferredBlock<StairBlock> EXPOSED_COPPER_STAIRS = registerAid("exposed_copper_stairs", EXPOSED_COPPER, EXPOSED.getOrder(), 11);
    public static final DeferredBlock<StairBlock> WEATHERED_COPPER_STAIRS = registerAid("weathered_copper_stairs", WEATHERED_COPPER, WEATHERED.getOrder(), 12);
    public static final DeferredBlock<StairBlock> OXIDIZED_COPPER_STAIRS = registerAid("oxidized_copper_stairs", OXIDIZED_COPPER, OXIDIZED.getOrder(), 13);

    public static final DeferredBlock<StairBlock> CHISELED_COPPER_STAIRS = registerAid("chiseled_copper_stairs", CHISELED_COPPER, UNAFFECTED.getOrder(), 20);
    public static final DeferredBlock<StairBlock> CHISELED_EXPOSED_COPPER_STAIRS = registerAid("chiseled_exposed_copper_stairs", EXPOSED_CHISELED_COPPER, EXPOSED.getOrder(), 21);
    public static final DeferredBlock<StairBlock> CHISELED_WEATHERED_COPPER_STAIRS = registerAid("chiseled_weathered_copper_stairs", WEATHERED_CHISELED_COPPER, WEATHERED.getOrder(), 22);
    public static final DeferredBlock<StairBlock> CHISELED_OXIDIZED_COPPER_STAIRS = registerAid("chiseled_oxidized_copper_stairs", OXIDIZED_CHISELED_COPPER, OXIDIZED.getOrder(), 23);

    public static final DeferredBlock<StairBlock> COPPER_GRATING_STAIRS = registerAid("copper_grating_stairs", COPPER_GRATE, UNAFFECTED.getOrder(), 30);
    public static final DeferredBlock<StairBlock> EXPOSED_COPPER_GRATING_STAIRS = registerAid("exposed_copper_grating_stairs", RAW_COPPER_BLOCK, EXPOSED.getOrder(), 31);
    public static final DeferredBlock<StairBlock> WEATHERED_COPPER_GRATING_STAIRS = registerAid("weathered_copper_grating_stairs", RAW_COPPER_BLOCK, WEATHERED.getOrder(), 32);
    public static final DeferredBlock<StairBlock> OXIDIZED_COPPER_GRATING_STAIRS = registerAid("oxidized_copper_grating_stairs", RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 33);

    public static final DeferredBlock<StairBlock> COPPER_BULB_STAIRS = registerBulbAid("copper_bulb_stairs", RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 40);
    public static final DeferredBlock<StairBlock> EXPOSED_COPPER_BULB_STAIRS = registerBulbAid("exposed_copper_bulb_stairs", RAW_COPPER_BLOCK, EXPOSED.getOrder(), 41);
    public static final DeferredBlock<StairBlock> WEATHERED_COPPER_BULB_STAIRS = registerBulbAid("weathered_copper_bulb_stairs", RAW_COPPER_BLOCK, WEATHERED.getOrder(), 42);
    public static final DeferredBlock<StairBlock> OXIDIZED_COPPER_BULB_STAIRS = registerBulbAid("oxidized_copper_bulb_stairs", RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 43);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> DeferredBlock<StairBlock> registerBulbAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperBulbStair(copyBlock, BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
    }
    private static <T extends Block> DeferredBlock<StairBlock> registerAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperStair(copyBlock, BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
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