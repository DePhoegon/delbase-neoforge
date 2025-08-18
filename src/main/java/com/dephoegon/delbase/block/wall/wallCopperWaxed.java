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
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static com.dephoegon.delbase.aid.util.weatherState.*;
import static com.dephoegon.delbase.block.wall.wallCoppers.*;
import static net.minecraft.world.level.block.Blocks.*;

public class wallCopperWaxed {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static DeferredRegister.Blocks getWaxedWallCopperBLOCKS() { return BLOCKS; }

    public static final DeferredBlock<WallBlock> RAW_WAXED_COPPER_WALL = registerAid("raw_waxed_copper_wall", RAW_COPPER_WALL, RAW_COPPER_BLOCK, UNAFFECTED.getOrder(), 5);
    public static final DeferredBlock<WallBlock> RAW_EXPOSED_WAXED_COPPER_WALL = registerAid("raw_exposed_waxed_copper_wall", RAW_EXPOSED_COPPER_WALL, RAW_COPPER_BLOCK, EXPOSED.getOrder(), 6);
    public static final DeferredBlock<WallBlock> RAW_WEATHERED_WAXED_COPPER_WALL = registerAid("raw_weathered_waxed_copper_wall", RAW_WEATHERED_COPPER_WALL, RAW_COPPER_BLOCK, WEATHERED.getOrder(), 7);
    public static final DeferredBlock<WallBlock> RAW_OXIDIZED_WAXED_COPPER_WALL = registerAid("raw_oxidized_waxed_copper_wall", RAW_OXIDIZED_COPPER_WALL, RAW_COPPER_BLOCK, OXIDIZED.getOrder(), 8);

    public static final DeferredBlock<WallBlock> WAXED_COPPER_WALL = registerAid("waxed_copper_wall", COPPER_WALL, COPPER_BLOCK, UNAFFECTED.getOrder(), 15);
    public static final DeferredBlock<WallBlock> WAXED_EXPOSED_COPPER_WALL = registerAid("waxed_exposed_copper_wall", EXPOSED_COPPER_WALL, EXPOSED_COPPER, EXPOSED.getOrder(), 16);
    public static final DeferredBlock<WallBlock> WAXED_WEATHERED_COPPER_WALL = registerAid("waxed_weathered_copper_wall", WEATHERED_COPPER_WALL, WEATHERED_COPPER, WEATHERED.getOrder(), 17);
    public static final DeferredBlock<WallBlock> WAXED_OXIDIZED_COPPER_WALL = registerAid("waxed_oxidized_copper_wall", OXIDIZED_COPPER_WALL, OXIDIZED_COPPER, OXIDIZED.getOrder(), 18);

    public static final DeferredBlock<WallBlock> WAXED_CHISELED_COPPER_WALL = registerAid("waxed_chiseled_copper_wall", CHISELED_COPPER_WALL, CHISELED_COPPER, UNAFFECTED.getOrder(), 25);
    public static final DeferredBlock<WallBlock> WAXED_CHISELED_EXPOSED_COPPER_WALL = registerAid("waxed_chiseled_exposed_copper_wall", CHISELED_EXPOSED_COPPER_WALL, EXPOSED_CHISELED_COPPER, EXPOSED.getOrder(), 26);
    public static final DeferredBlock<WallBlock> WAXED_CHISELED_WEATHERED_COPPER_WALL = registerAid("waxed_chiseled_weathered_copper_wall", CHISELED_WEATHERED_COPPER_WALL, WEATHERED_CHISELED_COPPER, WEATHERED.getOrder(), 27);
    public static final DeferredBlock<WallBlock> WAXED_CHISELED_OXIDIZED_COPPER_WALL = registerAid("waxed_chiseled_oxidized_copper_wall", CHISELED_OXIDIZED_COPPER_WALL, OXIDIZED_CHISELED_COPPER, OXIDIZED.getOrder(), 28);

    public static final DeferredBlock<WallBlock> WAXED_COPPER_GRATE_WALL = registerAid("waxed_copper_grate_wall", COPPER_GRATE_WALL, COPPER_GRATE, UNAFFECTED.getOrder(), 35);
    public static final DeferredBlock<WallBlock> WAXED_EXPOSED_COPPER_GRATE_WALL = registerAid("waxed_exposed_copper_grate_wall", EXPOSED_COPPER_GRATE_WALL, EXPOSED_COPPER_GRATE, EXPOSED.getOrder(), 36);
    public static final DeferredBlock<WallBlock> WAXED_WEATHERED_COPPER_GRATE_WALL = registerAid("waxed_weathered_copper_grate_wall", WEATHERED_COPPER_GRATE_WALL, WEATHERED_COPPER_GRATE, WEATHERED.getOrder(), 37);
    public static final DeferredBlock<WallBlock> WAXED_OXIDIZED_COPPER_GRATE_WALL = registerAid("waxed_oxidized_copper_grate_wall", OXIDIZED_COPPER_GRATE_WALL, OXIDIZED_COPPER_GRATE, OXIDIZED.getOrder(), 38);

    public static final DeferredBlock<WallBlock> WAXED_CUT_COPPER_WALL = registerAid("waxed_cut_copper_wall", CUT_COPPER_WALL, CUT_COPPER, UNAFFECTED.getOrder(), 45);
    public static final DeferredBlock<WallBlock> WAXED_EXPOSED_CUT_COPPER_WALL = registerAid("waxed_exposed_cut_copper_wall", EXPOSED_CUT_COPPER_WALL, EXPOSED_CUT_COPPER, EXPOSED.getOrder(), 46);
    public static final DeferredBlock<WallBlock> WAXED_WEATHERED_CUT_COPPER_WALL = registerAid("waxed_weathered_cut_copper_wall", WEATHERED_CUT_COPPER_WALL, WEATHERED_CUT_COPPER, WEATHERED.getOrder(), 47);
    public static final DeferredBlock<WallBlock> WAXED_OXIDIZED_CUT_COPPER_WALL = registerAid("waxed_oxidized_cut_copper_wall", OXIDIZED_CUT_COPPER_WALL, OXIDIZED_CUT_COPPER, OXIDIZED.getOrder(), 48);
/*
    public static final DeferredBlock<WallBlock> WAXED_BULB_COPPER_WALL = registerBulbAid("waxed_bulb_copper_wall", BULB_COPPER_WALL, COPPER_BULB, UNAFFECTED.getOrder(), 55);
    public static final DeferredBlock<WallBlock> WAXED_BULB_EXPOSED_COPPER_WALL = registerBulbAid("waxed_bulb_exposed_copper_wall", BULB_EXPOSED_COPPER_WALL, EXPOSED_COPPER_BULB, EXPOSED.getOrder(), 56);
    public static final DeferredBlock<WallBlock> WAXED_BULB_WEATHERED_COPPER_WALL = registerBulbAid("waxed_bulb_weathered_copper_wall", BULB_WEATHERED_COPPER_WALL, WEATHERED_COPPER_BULB, WEATHERED.getOrder(), 57);
    public static final DeferredBlock<WallBlock> WAXED_BULB_OXIDIZED_COPPER_WALL = registerBulbAid("waxed_bulb_oxidized_copper_wall", BULB_OXIDIZED_COPPER_WALL, OXIDIZED_COPPER_BULB, OXIDIZED.getOrder(), 58);
*/

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    public static <T extends Block> @NotNull DeferredBlock<WallBlock> registerBulbAid(String name, DeferredBlock<? extends Block> strippedState, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperBulbWall(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
    }
    private static <T extends Block> @NotNull DeferredBlock<WallBlock> registerAid(String name, DeferredBlock<? extends Block> strippedState, Block copyBlock, int order, int mapOrder) {
        return registerBlock(name, () -> new copperWall(BlockBehaviour.Properties.ofFullCopy(copyBlock).sound(SoundType.METAL), strippedState.get().defaultBlockState(), order, true, mapOrder));
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