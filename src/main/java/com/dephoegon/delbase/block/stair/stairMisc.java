package com.dephoegon.delbase.block.stair;

import com.dephoegon.delbase.aid.block.modExtensions.leafStair;
import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.stairBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.function.Supplier;

import static com.dephoegon.delbase.Delbase.Mod_ID;
import static net.minecraft.world.level.block.Blocks.*;

public class stairMisc {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<StairBlock> END_STONE_STAIR = registerBlock("end_stone_stair",
            ()-> new stairBlock(END_STONE, BlockBehaviour.Properties.ofFullCopy(END_STONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> BONE_BLOCK_STAIR = registerBlock("bone_block_stair",
            ()-> new stairBlock(BONE_BLOCK, BlockBehaviour.Properties.ofFullCopy(BONE_BLOCK).sound(SoundType.BONE_BLOCK), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> DRIED_KELP_STAIR = registerBlock("dried_kelp_stair",
            ()-> new leafStair(DRIED_KELP_BLOCK, DRIED_KELP_BLOCK, SoundType.GRASS, true, null),4001);
    public static final DeferredBlock<StairBlock> GLOWSTONE_STAIR = registerBlock("glowstone_stair",
            ()-> new stairBlock(GLOWSTONE, BlockBehaviour.Properties.ofFullCopy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState)-> 15), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> BASALT_STAIR = registerBlock("basalt_stair",
            ()-> new stairBlock(BASALT, BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> POLISHED_BASALT_STAIR = registerBlock("polished_basalt_stair",
            ()-> new stairBlock(POLISHED_BASALT, BlockBehaviour.Properties.ofFullCopy(POLISHED_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> SMOOTH_BASALT_STAIR = registerBlock("smooth_basalt_stair",
            ()-> new stairBlock(SMOOTH_BASALT, BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> COBBLED_BASALT_STAIR = registerBlock("cobbled_basalt_stair",
            ()-> new stairBlock(BASALT, BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> RAW_GOLD_STAIR = registerBlock("raw_gold_stair",
            ()-> new stairBlock(RAW_GOLD_BLOCK, BlockBehaviour.Properties.ofFullCopy(RAW_GOLD_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> RAW_COPPER_STAIR = registerBlock("raw_copper_stair",
            ()-> new stairBlock(RAW_COPPER_BLOCK, BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> RAW_IRON_STAIR = registerBlock("raw_iron_stair",
            ()-> new stairBlock(RAW_IRON_BLOCK, BlockBehaviour.Properties.ofFullCopy(RAW_IRON_BLOCK).sound(SoundType.METAL), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> COAL_BLOCK_STAIR = registerBlock("coal_block_stair",
            ()-> new stairBlock(COAL_BLOCK, BlockBehaviour.Properties.ofFullCopy(COAL_BLOCK).sound(SoundType.WOOD), true, 15, 30, null), 16000);
    public static final DeferredBlock<StairBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_STAIR = registerBlock("cracked_polished_blackstone_brick_stair",
            ()-> new stairBlock(CRACKED_POLISHED_BLACKSTONE_BRICKS, BlockBehaviour.Properties.ofFullCopy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> CHISELED_POLISHED_BLACKSTONE_STAIR = registerBlock("chiseled_polished_blackstone_stair",
            ()-> new stairBlock(CHISELED_POLISHED_BLACKSTONE, BlockBehaviour.Properties.ofFullCopy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> DRIPSTONE_STAIR = registerBlock("dripstone_stair",
            ()-> new stairBlock(DRIPSTONE_BLOCK, BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).sound(SoundType.STONE), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> NETHERRACK_STAIR = registerBlock("netherrack_stair",
            ()-> new stairBlock(NETHERRACK, BlockBehaviour.Properties.ofFullCopy(NETHERRACK).sound(SoundType.NETHERRACK), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> SHROOMLIGHT_STAIR = registerBlock("shroomlight_stair",
            ()-> new stairBlock(SHROOMLIGHT, BlockBehaviour.Properties.ofFullCopy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> MAGMA_BLOCK_STAIR = registerBlock("magma_block_stair",
            ()-> new stairBlock(MAGMA_BLOCK, BlockBehaviour.Properties.ofFullCopy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockstate) -> 3), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> PACKED_MUD_STAIR = registerBlock("packed_mud_stair",
            ()-> new stairBlock(PACKED_MUD, BlockBehaviour.Properties.ofFullCopy(PACKED_MUD).sound(SoundType.PACKED_MUD), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> SCULK_STAIR = registerBlock("sculk_stair",
            ()-> new stairBlock(SCULK, BlockBehaviour.Properties.ofFullCopy(SCULK).sound(SoundType.SCULK), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> MUD_STAIR = registerBlock("mud_stair",
            ()-> new stairBlock(MUD, BlockBehaviour.Properties.ofFullCopy(MUD).sound(SoundType.MUD), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> MUDDY_MANGROVE_ROOT_STAIR = registerBlock("muddy_mangrove_root_stair",
            ()-> new leafStair(MUDDY_MANGROVE_ROOTS, MUDDY_MANGROVE_ROOTS, SoundType.MUDDY_MANGROVE_ROOTS, false, null));
    public static final DeferredBlock<StairBlock> MANGROVE_ROOT_STAIR = registerBlock("mangrove_root_stair",
            ()-> new leafStair(MANGROVE_ROOTS, MANGROVE_ROOTS, SoundType.MANGROVE_ROOTS, true, null));
    public static final DeferredBlock<StairBlock> OCHRE_FROGLIGHT_STAIR = registerBlock("ochre_froglight_stair",
            ()-> new stairBlock(OCHRE_FROGLIGHT, BlockBehaviour.Properties.ofFullCopy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> VERDANT_FROGLIGHT_STAIR = registerBlock("verdant_froglight_stair",
            ()-> new stairBlock(VERDANT_FROGLIGHT, BlockBehaviour.Properties.ofFullCopy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));
    public static final DeferredBlock<StairBlock> PEARLESCENT_FROGLIGHT_STAIR = registerBlock("pearlescent_froglight_stair",
            ()-> new stairBlock(PEARLESCENT_FROGLIGHT, BlockBehaviour.Properties.ofFullCopy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15), false, 0, 0, null));

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