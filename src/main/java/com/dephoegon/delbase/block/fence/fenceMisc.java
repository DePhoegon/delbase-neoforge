package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.stock.fenceBlock;
import com.dephoegon.delbase.aid.block.stock.fenceGateBlock;
import com.dephoegon.delbase.aid.block.stock.genBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;
import static net.minecraft.world.level.block.Blocks.*;

public class fenceMisc {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<FenceBlock> GLOWSTONE_FENCE = register("glowstone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> GLOWSTONE_FENCE_GATE = register("glowstone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> COBBLED_BASALT_FENCE = register("cobbled_basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> COBBLED_BASALT_FENCE_GATE = register("cobbled_basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> BASALT_FENCE = register("basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> BASALT_FENCE_GATE = register("basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> SMOOTH_BASALT_FENCE = register("smooth_basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> SMOOTH_BASALT_FENCE_GATE = register("smooth_basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> END_STONE_FENCE = register("end_stone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> END_STONE_FENCE_GATE = register("end_stone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DRIPSTONE_FENCE = register("dripstone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DRIPSTONE_FENCE_GATE = register("dripstone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE = register("cracked_polished_blackstone_brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE = register("cracked_polished_blackstone_brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> RAW_GOLD_FENCE = register("raw_gold_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(RAW_GOLD_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> RAW_GOLD_FENCE_GATE = register("raw_gold_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(RAW_GOLD_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> RAW_COPPER_FENCE = register("raw_copper_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> RAW_COPPER_FENCE_GATE = register("raw_copper_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> RAW_IRON_FENCE = register("raw_iron_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(RAW_IRON_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> RAW_IRON_FENCE_GATE = register("raw_iron_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(RAW_IRON_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> PURPUR_BLOCK_FENCE = register("purpur_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(PURPUR_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> PURPUR_BLOCK_FENCE_GATE = register("purpur_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(PURPUR_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> COAL_BLOCK_FENCE = register("coal_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(COAL_BLOCK),
                    "","","", false, 0, 0, null),5001);
    public static final DeferredBlock<FenceGateBlock> COAL_BLOCK_FENCE_GATE = register("coal_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(COAL_BLOCK),
                    "","","", false, 0, 0, null), 5000);
    public static final DeferredBlock<FenceBlock> CHISELED_POLISHED_BLACKSTONE_FENCE = register("chiseled_polished_blackstone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> CHISELED_POLISHED_BLACKSTONE_FENCE_GATE = register("chiseled_polished_blackstone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> POLISHED_BASALT_FENCE = register("polished_basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> POLISHED_BASALT_FENCE_GATE = register("polished_basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> BONE_BLOCK_FENCE = register("bone_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(BONE_BLOCK).sound(SoundType.BONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> BONE_BLOCK_FENCE_GATE = register("bone_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(BONE_BLOCK).sound(SoundType.BONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DRIED_KELP_FENCE = register("dried_kelp_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DRIED_KELP_BLOCK).sound(SoundType.GRASS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DRIED_KELP_FENCE_GATE = register("dried_kelp_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DRIED_KELP_BLOCK).sound(SoundType.GRASS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> NETHERRACK_FENCE = register("netherrack_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(NETHERRACK).sound(SoundType.NETHERRACK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> NETHERRACK_FENCE_GATE = register("netherrack_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(NETHERRACK).sound(SoundType.NETHERRACK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> SHROOMLIGHT_FENCE = register("shroomlight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> SHROOMLIGHT_FENCE_GATE = register("shroomlight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MAGMA_BLOCK_FENCE = register("magma_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockState) -> 3),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MAGMA_BLOCK_FENCE_GATE = register("magma_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockState) -> 3),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> NETHER_BRICK_FENCE_GATE = register("netherbrick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(NETHER_BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> RED_NETHER_BRICK_FENCE = register("red_netherbrick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> RED_NETHER_BRICK_FENCE_GATE = register("red_netherbrick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> SCULK_FENCE = register("sculk_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(SCULK).sound(SoundType.SCULK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> SCULK_FENCE_GATE = register("sculk_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(SCULK).sound(SoundType.SCULK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MUD_FENCE = register("mud_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MUD).sound(SoundType.MUD),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MUD_FENCE_GATE = register("mud_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MUD).sound(SoundType.MUD),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MUDDY_MANGROVE_ROOT_FENCE = register("muddy_mangrove_root_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MUDDY_MANGROVE_ROOTS).sound(SoundType.MUDDY_MANGROVE_ROOTS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MUDDY_MANGROVE_ROOT_FENCE_GATE = register("muddy_mangrove_root_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MUDDY_MANGROVE_ROOTS).sound(SoundType.MUDDY_MANGROVE_ROOTS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MANGROVE_ROOT_FENCE = register("mangrove_root_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MANGROVE_ROOTS).sound(SoundType.MANGROVE_ROOTS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MANGROVE_ROOT_FENCE_GATE = register("mangrove_root_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MANGROVE_ROOTS).sound(SoundType.MANGROVE_ROOTS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> OCHRE_FROGLIGHT_FENCE = register("ochre_froglight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> OCHRE_FROGLIGHT_FENCE_GATE = register("ochre_froglight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> VERDANT_FROGLIGHT_FENCE = register("verdant_froglight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> VERDANT_FROGLIGHT_FENCE_GATE = register("verdant_froglight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> PEARLESCENT_FROGLIGHT_FENCE = register("pearlescent_froglight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> PEARLESCENT_FROGLIGHT_FENCE_GATE = register("pearlescent_froglight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));


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
