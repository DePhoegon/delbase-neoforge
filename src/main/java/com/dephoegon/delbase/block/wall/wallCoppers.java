package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.modExtensions.copperBulbWall;
import com.dephoegon.delbase.aid.block.modExtensions.copperWall;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.aid.util.weatherState.*;
import static net.minecraft.world.level.block.Blocks.*;

public class wallCoppers {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getWallCopperBLOCKS() { return BLOCKS; }

    public static final DeferredBlock<WallBlock> RAW_COPPER_WALL = registerAid("raw_copper_wall", RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 0);
    public static final DeferredBlock<WallBlock> RAW_EXPOSED_COPPER_WALL = registerAid("raw_exposed_copper_wall", RAW_COPPER_BLOCK, EXPOSED.getOrder(), 1);
    public static final DeferredBlock<WallBlock> RAW_WEATHERED_COPPER_WALL = registerAid("raw_weathered_copper_wall", RAW_COPPER_BLOCK, WEATHERED.getOrder(), 2);
    public static final DeferredBlock<WallBlock> RAW_OXIDIZED_COPPER_WALL = registerAid("raw_oxidized_copper_wall", RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 3);

    public static final DeferredBlock<WallBlock> COPPER_WALL = registerAid("copper_wall", COPPER_BLOCK, UNAFFECTED.getOrder(), 10);
    public static final DeferredBlock<WallBlock> EXPOSED_COPPER_WALL = registerAid("exposed_copper_wall", COPPER_BLOCK, EXPOSED.getOrder(), 11);
    public static final DeferredBlock<WallBlock> WEATHERED_COPPER_WALL = registerAid("weathered_copper_wall", COPPER_BLOCK, WEATHERED.getOrder(), 12);
    public static final DeferredBlock<WallBlock> OXIDIZED_COPPER_WALL = registerAid("oxidized_copper_wall", COPPER_BLOCK, OXIDIZED.getOrder(), 13);

    public static final DeferredBlock<WallBlock> CHISELED_COPPER_WALL = registerAid("chiseled_copper_wall", CHISELED_COPPER, UNAFFECTED.getOrder(), 20);
    public static final DeferredBlock<WallBlock> CHISELED_EXPOSED_COPPER_WALL = registerAid("chiseled_exposed_copper_wall", CHISELED_COPPER, EXPOSED.getOrder(), 21);
    public static final DeferredBlock<WallBlock> CHISELED_WEATHERED_COPPER_WALL = registerAid("chiseled_weathered_copper_wall", CHISELED_COPPER, WEATHERED.getOrder(), 22);
    public static final DeferredBlock<WallBlock> CHISELED_OXIDIZED_COPPER_WALL = registerAid("chiseled_oxidized_copper_wall", CHISELED_COPPER, OXIDIZED.getOrder(), 23);

    public static final DeferredBlock<WallBlock> COPPER_GRATE_WALL = registerAid("copper_grate_wall", COPPER_GRATE, UNAFFECTED.getOrder(), 30);
    public static final DeferredBlock<WallBlock> EXPOSED_COPPER_GRATE_WALL = registerAid("exposed_copper_grate_wall", COPPER_GRATE, EXPOSED.getOrder(), 31);
    public static final DeferredBlock<WallBlock> WEATHERED_COPPER_GRATE_WALL = registerAid("weathered_copper_grate_wall", COPPER_GRATE, WEATHERED.getOrder(), 32);
    public static final DeferredBlock<WallBlock> OXIDIZED_COPPER_GRATE_WALL = registerAid("oxidized_copper_grate_wall", COPPER_GRATE, OXIDIZED.getOrder(), 33);

    public static final DeferredBlock<WallBlock> CUT_COPPER_WALL = registerAid("cut_copper_wall", CUT_COPPER, UNAFFECTED.getOrder(), 40);
    public static final DeferredBlock<WallBlock> EXPOSED_CUT_COPPER_WALL = registerAid("exposed_cut_copper_wall", CUT_COPPER, EXPOSED.getOrder(), 41);
    public static final DeferredBlock<WallBlock> WEATHERED_CUT_COPPER_WALL = registerAid("weathered_cut_copper_wall", CUT_COPPER, WEATHERED.getOrder(), 42);
    public static final DeferredBlock<WallBlock> OXIDIZED_CUT_COPPER_WALL = registerAid("oxidized_cut_copper_wall", CUT_COPPER, OXIDIZED.getOrder(), 43);

    public static final DeferredBlock<WallBlock> BULB_COPPER_WALL = registerBulbAid("bulb_copper_wall", COPPER_BULB, UNAFFECTED.getOrder(), 50);
    public static final DeferredBlock<WallBlock> BULB_EXPOSED_COPPER_WALL = registerBulbAid("bulb_exposed_copper_wall", COPPER_BULB, EXPOSED.getOrder(), 51);
    public static final DeferredBlock<WallBlock> BULB_WEATHERED_COPPER_WALL = registerBulbAid("bulb_weathered_copper_wall", COPPER_BULB, WEATHERED.getOrder(), 52);
    public static final DeferredBlock<WallBlock> BULB_OXIDIZED_COPPER_WALL = registerBulbAid("bulb_oxidized_copper_wall", COPPER_BULB, OXIDIZED.getOrder(), 53);

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> DeferredBlock<WallBlock> registerBulbAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperBulbWall(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
    }
    private static <T extends Block> DeferredBlock<WallBlock> registerAid(String name, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperWall(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), null, order, false, mapOrder));
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