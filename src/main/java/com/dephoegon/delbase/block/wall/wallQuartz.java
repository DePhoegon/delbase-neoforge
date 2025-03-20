package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.quartzWall;
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

import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallQuartz {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<WallBlock> QUARTZ_WALL = registerBlock("quartz_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> SMOOTH_QUARTZ_WALL = registerBlock("smooth_quartz_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(SMOOTH_QUARTZ).sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> CHISELED_QUARTZ_WALL = registerBlock("chiseled_quartz_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(CHISELED_QUARTZ_BLOCK).sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> QUARTZ_BRICK_WALL = registerBlock("quartz_brick_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(QUARTZ_BRICKS).sound(SoundType.STONE)));
    public static final DeferredBlock<WallBlock> QUARTZ_PILLAR_WALL = registerBlock("quartz_pillar_wall",
            () -> new quartzWall(BlockBehaviour.Properties.ofFullCopy(QUARTZ_PILLAR).sound(SoundType.STONE)));

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