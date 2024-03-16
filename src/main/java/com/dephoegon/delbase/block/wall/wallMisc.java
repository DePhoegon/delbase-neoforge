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

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class wallMisc {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<WallBlock> END_STONE_WALL = register("end_stone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> BONE_BLOCK_WALL = register("bone_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(BONE_BLOCK).sound(SoundType.BONE_BLOCK), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> DRIED_KELP_WALL = register("dried_kelp_wall",
            () -> new leafWall(DRIED_KELP_BLOCK, SoundType.GRASS, true, null),4001);
    public static final DeferredBlock<WallBlock> GLOWSTONE_WALL = register("glowstone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState)-> 15), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> BASALT_WALL = register("basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> COBBLED_BASALT_WALL = register("cobbled_basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> POLISHED_BASALT_WALL = register("polished_basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> SMOOTH_BASALT_WALL = register("smooth_basalt_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> RAW_GOLD_WALL = register("raw_gold_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(RAW_GOLD_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> RAW_COPPER_WALL = register("raw_copper_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> RAW_IRON_WALL = register("raw_iron_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(RAW_IRON_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> COAL_BLOCK_WALL = register("coal_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(COAL_BLOCK).sound(SoundType.WOOD), true, 15, 30, null),16000);
    public static final DeferredBlock<WallBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> CHISELED_POLISHED_BLACKSTONE_WALL = register("chiseled_polished_blackstone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> DRIPSTONE_WALL = register("dripstone_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> PURPUR_BLOCK_WALL = register("purpur_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(PURPUR_BLOCK).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> NETHERRACK_WALL = register("netherrack_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(NETHERRACK).sound(SoundType.NETHERRACK), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> SHROOMLIGHT_WALL = register("shroomlight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> MAGMA_BLOCK_WALL = register("magma_block_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockstate) -> 3), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> PACKED_MUD_WALL = register("packed_mud_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(PACKED_MUD).sound(SoundType.PACKED_MUD), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> SCULK_WALL = register("sculk_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(SCULK).sound(SoundType.SCULK), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> MUD_WALL = register("mud_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(MUD).sound(SoundType.MUD), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> MUDDY_MANGROVE_ROOT_WALL = register("muddy_mangrove_root_wall",
            () -> new leafWall(MUDDY_MANGROVE_ROOTS, SoundType.MUDDY_MANGROVE_ROOTS, false, null));
    public static final DeferredBlock<WallBlock> MANGROVE_ROOT_WALL = register("mangrove_root_wall",
            () -> new leafWall(MANGROVE_ROOTS, SoundType.MANGROVE_ROOTS, false, null));
    public static final DeferredBlock<WallBlock> OCHRE_FROGLIGHT_WALL = register("ochre_froglight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> VERDANT_FROGLIGHT_WALL = register("verdant_froglight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final DeferredBlock<WallBlock> PEARLESCENT_FROGLIGHT_WALL = register("pearlescent_froglight_wall",
            () -> new wallBlock(BlockBehaviour.Properties.ofFullCopy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));

    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @javax.annotation.Nullable RecipeType<?> recipeType) {
                if (burn > 0) { return burn; } else return -1;
            }
        });
        return exit;
    }
    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block) { return register(name, block, 0); }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
    }
}