package com.dephoegon.delbase.block.slab;

import com.dephoegon.delbase.aid.block.modExtensions.leafSlab;
import com.dephoegon.delbase.aid.block.fromBaseGameExtensions.slabBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
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

public class slabMisc {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Mod_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Mod_ID);

    public static final DeferredBlock<SlabBlock> END_STONE_SLAB = registerBlock("end_stone_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(END_STONE).sound(SoundType.STONE)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> BONE_BLOCK_SLAB = registerBlock("bone_block_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(BONE_BLOCK).sound(SoundType.BONE_BLOCK)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> DRIED_KELP_SLAB = registerBlock("dried_kelp_slab",
            ()-> new leafSlab(DRIED_KELP_BLOCK, SoundType.GRASS, true, null),4001);
    public static final DeferredBlock<SlabBlock> GLOWSTONE_SLAB = registerBlock("glowstone_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(GLOWSTONE).sound(SoundType.GLASS).lightLevel((blockState)-> 15)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> BASALT_SLAB = registerBlock("basalt_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(BASALT).sound(SoundType.STONE)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> POLISHED_BASALT_SLAB = registerBlock("polished_basalt_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(POLISHED_BASALT).sound(SoundType.STONE)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(SMOOTH_BASALT).sound(SoundType.STONE)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> RAW_GOLD_SLAB = registerBlock("raw_gold_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(RAW_GOLD_BLOCK).sound(SoundType.METAL)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> RAW_COPPER_SLAB = registerBlock("raw_copper_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(RAW_COPPER_BLOCK).sound(SoundType.METAL)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> RAW_IRON_SLAB = registerBlock("raw_iron_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(RAW_IRON_BLOCK).sound(SoundType.METAL)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> COAL_BLOCK_SLAB = registerBlock("coal_block_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(COAL_BLOCK).sound(SoundType.WOOD), true, 15, 30, null),16000);
    public static final DeferredBlock<SlabBlock> CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock("cracked_polished_blackstone_brick_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(CRACKED_POLISHED_BLACKSTONE_BRICKS).sound(SoundType.STONE)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> CHISELED_POLISHED_BLACKSTONE_SLAB = registerBlock("chiseled_polished_blackstone_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(CHISELED_POLISHED_BLACKSTONE).sound(SoundType.STONE)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> DRIPSTONE_SLAB = registerBlock("dripstone_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(DRIPSTONE_BLOCK).sound(SoundType.STONE)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> NETHERRACK_SLAB = registerBlock("netherrack_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(NETHERRACK).sound(SoundType.NETHERRACK)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> SHROOMLIGHT_SLAB = registerBlock("shroomlight_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(SHROOMLIGHT).sound(SoundType.SHROOMLIGHT).lightLevel((blockstate) -> 15)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> MAGMA_BLOCK_SLAB = registerBlock("magma_block_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(MAGMA_BLOCK).sound(SoundType.MOSS).lightLevel((blockstate) -> 3)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(PACKED_MUD).sound(SoundType.PACKED_MUD)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> SCULK_SLAB = registerBlock("sculk_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(SCULK).sound(SoundType.SCULK)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> MUD_SLAB = registerBlock("mud_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(MUD).sound(SoundType.MUD)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> MUDDY_MANGROVE_ROOT_SLAB = registerBlock("muddy_mangrove_root_slab",
            ()-> new leafSlab(MUDDY_MANGROVE_ROOTS, SoundType.MUDDY_MANGROVE_ROOTS, false, null));
    public static final DeferredBlock<SlabBlock> MANGROVE_ROOT_SLAB = registerBlock("mangrove_root_slab",
            ()-> new leafSlab(MANGROVE_ROOTS, SoundType.MANGROVE_ROOTS, false, null));
    public static final DeferredBlock<SlabBlock> OCHRE_FROGLIGHT_SLAB = registerBlock("ochre_froglight_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(OCHRE_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> VERDANT_FROGLIGHT_SLAB = registerBlock("verdant_froglight_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(VERDANT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15)
                    ,"","","", false, 0, 0, null));
    public static final DeferredBlock<SlabBlock> PEARLESCENT_FROGLIGHT_SLAB = registerBlock("pearlescent_froglight_slab",
            ()-> new slabBlock(BlockBehaviour.Properties.ofFullCopy(PEARLESCENT_FROGLIGHT).sound(SoundType.FROGLIGHT).lightLevel((blockstate) -> 15)
                    ,"","","", false, 0, 0, null));

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