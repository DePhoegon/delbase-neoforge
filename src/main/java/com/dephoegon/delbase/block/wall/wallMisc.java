package com.dephoegon.delbase.block.wall;

import com.dephoegon.delbase.aid.block.alt.leafWall;
import com.dephoegon.delbase.aid.block.stock.wallBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.Delabse.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallMisc {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<WallBlock> END_STONE_WALL = registerBlock("end_stone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> BONE_BLOCK_WALL = registerBlock("bone_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(BONE_BLOCK).sound(SoundType.BONE_BLOCK), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> DRIED_KELP_WALL = registerBlock("dried_kelp_wall",
            () -> new leafWall(DRIED_KELP_BLOCK, SoundType.GRASS, true, null),4001);
    public static final DeferredBlock<WallBlock> GLOWSTONE_WALL = registerBlock("glowstone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState)-> 15), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> BASALT_WALL = registerBlock("basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> COBBLED_BASALT_WALL = registerBlock("cobbled_basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> POLISHED_BASALT_WALL = registerBlock("polished_basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> RAW_GOLD_WALL = registerBlock("raw_gold_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(RAW_GOLD_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> RAW_COPPER_WALL = registerBlock("raw_copper_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> RAW_IRON_WALL = registerBlock("raw_iron_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(RAW_IRON_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> COAL_BLOCK_WALL = registerBlock("coal_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(COAL_BLOCK).sound(SoundType.WOOD), true, 15, 30, null),16000);
    public static final DeferredBlock<WallBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock("cracked_polished_blackstone_brick_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> CHISELED_POLISHED_BLACKSTONE_WALL = registerBlock("chiseled_polished_blackstone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> DRIPSTONE_WALL = registerBlock("dripstone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> PURPUR_BLOCK_WALL = registerBlock("purpur_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(PURPUR_BLOCK).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> NETHERRACK_WALL = registerBlock("netherrack_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(NETHERRACK).sound(SoundType.NETHERRACK), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> SHROOMLIGHT_WALL = registerBlock("shroomlight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> MAGMA_BLOCK_WALL = registerBlock("magma_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockstate) -> 3), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(PACKED_MUD).sound(SoundType.PACKED_MUD), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> SCULK_WALL = registerBlock("sculk_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(SCULK).sound(SoundType.SCULK), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> MUD_WALL = registerBlock("mud_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(MUD).sound(SoundType.MUD), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> MUDDY_MANGROVE_ROOT_WALL = registerBlock("muddy_mangrove_root_wall",
            () -> new leafWall(MUDDY_MANGROVE_ROOTS, SoundType.MUDDY_MANGROVE_ROOTS, false, null));
    public static final DeferredBlock<WallBlock> MANGROVE_ROOT_WALL = registerBlock("mangrove_root_wall",
            () -> new leafWall(MANGROVE_ROOTS, SoundType.MANGROVE_ROOTS, false, null));
    public static final DeferredBlock<WallBlock> OCHRE_FROGLIGHT_WALL = registerBlock("ochre_froglight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> VERDANT_FROGLIGHT_WALL = registerBlock("verdant_froglight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> PEARLESCENT_FROGLIGHT_WALL = registerBlock("pearlescent_froglight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));

    public static void registerBlock(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @Nullable RecipeType<?> recipeType) {
                return burn;
            }
        });
        return exit;
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(),
                new Item.Properties().stacksTo(64)));
        return exit;
    }
}