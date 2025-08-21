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

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.aid.util.weatherState.*;
import static net.minecraft.world.level.block.Blocks.*;

public class stairCoppers {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getStairCopperBLOCKS() { return BLOCKS; }

    public static final DeferredBlock<StairBlock> RAW_COPPER_STAIR = registerAid("raw_copper_stair", RAW_COPPER_BLOCK, UNAFFECTED, 0);
    public static final DeferredBlock<StairBlock> RAW_EXPOSED_COPPER_STAIR = registerAid("raw_exposed_copper_stair", RAW_COPPER_BLOCK, EXPOSED, 1);
    public static final DeferredBlock<StairBlock> RAW_WEATHERED_COPPER_STAIR = registerAid("raw_weathered_copper_stair", RAW_COPPER_BLOCK, WEATHERED, 2);
    public static final DeferredBlock<StairBlock> RAW_OXIDIZED_COPPER_STAIR = registerAid("raw_oxidized_copper_stair", RAW_COPPER_BLOCK, OXIDIZED, 3);

    public static final DeferredBlock<StairBlock> COPPER_STAIR = registerAid("copper_stair", RAW_COPPER_BLOCK, UNAFFECTED, 10);
    public static final DeferredBlock<StairBlock> EXPOSED_COPPER_STAIR = registerAid("exposed_copper_stair", EXPOSED_COPPER, EXPOSED, 11);
    public static final DeferredBlock<StairBlock> WEATHERED_COPPER_STAIR = registerAid("weathered_copper_stair", WEATHERED_COPPER, WEATHERED, 12);
    public static final DeferredBlock<StairBlock> OXIDIZED_COPPER_STAIR = registerAid("oxidized_copper_stair", OXIDIZED_COPPER, OXIDIZED, 13);

    public static final DeferredBlock<StairBlock> CHISELED_COPPER_STAIR = registerAid("chiseled_copper_stair", CHISELED_COPPER, UNAFFECTED, 20);
    public static final DeferredBlock<StairBlock> CHISELED_EXPOSED_COPPER_STAIR = registerAid("chiseled_exposed_copper_stair", EXPOSED_CHISELED_COPPER, EXPOSED, 21);
    public static final DeferredBlock<StairBlock> CHISELED_WEATHERED_COPPER_STAIR = registerAid("chiseled_weathered_copper_stair", WEATHERED_CHISELED_COPPER, WEATHERED, 22);
    public static final DeferredBlock<StairBlock> CHISELED_OXIDIZED_COPPER_STAIR = registerAid("chiseled_oxidized_copper_stair", OXIDIZED_CHISELED_COPPER, OXIDIZED, 23);

    public static final DeferredBlock<StairBlock> COPPER_GRATE_STAIR = registerAid("copper_grate_stair", COPPER_GRATE, UNAFFECTED, 30);
    public static final DeferredBlock<StairBlock> EXPOSED_COPPER_GRATE_STAIR = registerAid("exposed_copper_grate_stair", RAW_COPPER_BLOCK, EXPOSED, 31);
    public static final DeferredBlock<StairBlock> WEATHERED_COPPER_GRATE_STAIR = registerAid("weathered_copper_grate_stair", RAW_COPPER_BLOCK, WEATHERED, 32);
    public static final DeferredBlock<StairBlock> OXIDIZED_COPPER_GRATE_STAIR = registerAid("oxidized_copper_grate_stair", RAW_COPPER_BLOCK, OXIDIZED, 33);
/*
    public static final DeferredBlock<StairBlock> COPPER_BULB_STAIR = registerBulbAid("copper_bulb_stair", RAW_COPPER_BLOCK, UNAFFECTED, 40);
    public static final DeferredBlock<StairBlock> EXPOSED_COPPER_BULB_STAIR = registerBulbAid("exposed_copper_bulb_stair", RAW_COPPER_BLOCK, EXPOSED, 41);
    public static final DeferredBlock<StairBlock> WEATHERED_COPPER_BULB_STAIR = registerBulbAid("weathered_copper_bulb_stair", RAW_COPPER_BLOCK, WEATHERED, 42);
    public static final DeferredBlock<StairBlock> OXIDIZED_COPPER_BULB_STAIR = registerBulbAid("oxidized_copper_bulb_stair", RAW_COPPER_BLOCK, OXIDIZED, 43);
*/

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> DeferredBlock<StairBlock> registerBulbAid(String name, Block copyBlock, weatherState order, int mapOrder) {
        BlockBehaviour.Properties properties = order == OXIDIZED ? BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL) : BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL).randomTicks();
        return registerBlock(name, () -> new copperBulbStair(copyBlock, properties, null, order.getOrder(), false, mapOrder));
    }
    private static <T extends Block> DeferredBlock<StairBlock> registerAid(String name, Block copyBlock, weatherState order, int mapOrder) {
        BlockBehaviour.Properties properties = order == OXIDIZED ? BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL) : BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL).randomTicks();
        return registerBlock(name, () -> new copperStair(copyBlock, properties, null, order.getOrder(), false, mapOrder));
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