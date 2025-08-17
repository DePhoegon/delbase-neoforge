package com.dephoegon.delbase.block.fence;

import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.fenceBlock;
import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.fenceGateBlock;
import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.genBlock;
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

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class fenceMisc {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<FenceBlock> GLOWSTONE_FENCE = registerBlock("glowstone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> GLOWSTONE_FENCE_GATE = registerBlock("glowstone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> COBBLED_BASALT_FENCE = registerBlock("cobbled_basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> COBBLED_BASALT_FENCE_GATE = registerBlock("cobbled_basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> BASALT_FENCE = registerBlock("basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> BASALT_FENCE_GATE = registerBlock("basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> SMOOTH_BASALT_FENCE = registerBlock("smooth_basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> SMOOTH_BASALT_FENCE_GATE = registerBlock("smooth_basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> END_STONE_FENCE = registerBlock("end_stone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> END_STONE_FENCE_GATE = registerBlock("end_stone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DRIPSTONE_FENCE = registerBlock("dripstone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DRIPSTONE_FENCE_GATE = registerBlock("dripstone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE = registerBlock("cracked_polished_blackstone_brick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_FENCE_GATE = registerBlock("cracked_polished_blackstone_brick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> RAW_GOLD_FENCE = registerBlock("raw_gold_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(RAW_GOLD_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> RAW_GOLD_FENCE_GATE = registerBlock("raw_gold_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(RAW_GOLD_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> RAW_IRON_FENCE = registerBlock("raw_iron_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(RAW_IRON_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> RAW_IRON_FENCE_GATE = registerBlock("raw_iron_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(RAW_IRON_BLOCK).sound(SoundType.METAL),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> PURPUR_BLOCK_FENCE = registerBlock("purpur_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(PURPUR_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> PURPUR_BLOCK_FENCE_GATE = registerBlock("purpur_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(PURPUR_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> COAL_BLOCK_FENCE = registerBlock("coal_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(COAL_BLOCK),
                    "","","", false, 0, 0, null),5001);
    public static final DeferredBlock<FenceGateBlock> COAL_BLOCK_FENCE_GATE = registerBlock("coal_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(COAL_BLOCK),
                    "","","", false, 0, 0, null), 5000);
    public static final DeferredBlock<FenceBlock> CHISELED_POLISHED_BLACKSTONE_FENCE = registerBlock("chiseled_polished_blackstone_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> CHISELED_POLISHED_BLACKSTONE_FENCE_GATE = registerBlock("chiseled_polished_blackstone_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> POLISHED_BASALT_FENCE = registerBlock("polished_basalt_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> POLISHED_BASALT_FENCE_GATE = registerBlock("polished_basalt_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BASALT).sound(SoundType.BASALT),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> BONE_BLOCK_FENCE = registerBlock("bone_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(BONE_BLOCK).sound(SoundType.BONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> BONE_BLOCK_FENCE_GATE = registerBlock("bone_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(BONE_BLOCK).sound(SoundType.BONE_BLOCK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> DRIED_KELP_FENCE = registerBlock("dried_kelp_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(DRIED_KELP_BLOCK).sound(SoundType.GRASS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> DRIED_KELP_FENCE_GATE = registerBlock("dried_kelp_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(DRIED_KELP_BLOCK).sound(SoundType.GRASS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> NETHERRACK_FENCE = registerBlock("netherrack_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(NETHERRACK).sound(SoundType.NETHERRACK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> NETHERRACK_FENCE_GATE = registerBlock("netherrack_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(NETHERRACK).sound(SoundType.NETHERRACK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> SHROOMLIGHT_FENCE = registerBlock("shroomlight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> SHROOMLIGHT_FENCE_GATE = registerBlock("shroomlight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MAGMA_BLOCK_FENCE = registerBlock("magma_block_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockState) -> 3),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MAGMA_BLOCK_FENCE_GATE = registerBlock("magma_block_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockState) -> 3),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> NETHER_BRICK_FENCE_GATE = registerBlock("netherbrick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(NETHER_BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> RED_NETHER_BRICK_FENCE = registerBlock("red_netherbrick_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> RED_NETHER_BRICK_FENCE_GATE = registerBlock("red_netherbrick_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(RED_NETHER_BRICKS).sound(SoundType.NETHER_BRICKS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> SCULK_FENCE = registerBlock("sculk_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(SCULK).sound(SoundType.SCULK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> SCULK_FENCE_GATE = registerBlock("sculk_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(SCULK).sound(SoundType.SCULK),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MUD_FENCE = registerBlock("mud_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MUD).sound(SoundType.MUD),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MUD_FENCE_GATE = registerBlock("mud_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MUD).sound(SoundType.MUD),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MUDDY_MANGROVE_ROOT_FENCE = registerBlock("muddy_mangrove_root_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MUDDY_MANGROVE_ROOTS).sound(SoundType.MUDDY_MANGROVE_ROOTS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MUDDY_MANGROVE_ROOT_FENCE_GATE = registerBlock("muddy_mangrove_root_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MUDDY_MANGROVE_ROOTS).sound(SoundType.MUDDY_MANGROVE_ROOTS),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> MANGROVE_ROOT_FENCE = registerBlock("mangrove_root_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(MANGROVE_ROOTS).sound(SoundType.MANGROVE_ROOTS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> MANGROVE_ROOT_FENCE_GATE = registerBlock("mangrove_root_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(MANGROVE_ROOTS).sound(SoundType.MANGROVE_ROOTS).noOcclusion().isSuffocating(genBlock::never).isViewBlocking(genBlock::never).noOcclusion(),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> OCHRE_FROGLIGHT_FENCE = registerBlock("ochre_froglight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> OCHRE_FROGLIGHT_FENCE_GATE = registerBlock("ochre_froglight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> VERDANT_FROGLIGHT_FENCE = registerBlock("verdant_froglight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> VERDANT_FROGLIGHT_FENCE_GATE = registerBlock("verdant_froglight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceBlock> PEARLESCENT_FROGLIGHT_FENCE = registerBlock("pearlescent_froglight_fence",
            () -> new fenceBlock(BlockBehaviour.Properties.ofFullCopy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));
    public static final DeferredBlock<FenceGateBlock> PEARLESCENT_FROGLIGHT_FENCE_GATE = registerBlock("pearlescent_froglight_fence_gate",
            () -> new fenceGateBlock(BlockBehaviour.Properties.ofFullCopy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockState) -> 15),
                    "","","", false, 0, 0, null));


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
