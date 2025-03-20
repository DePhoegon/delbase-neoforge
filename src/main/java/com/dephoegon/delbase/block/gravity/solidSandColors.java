package com.dephoegon.delbase.block.gravity;

import com.dephoegon.delbase.aid.block.colorShift.grav.solidSandBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.dephoegon.delbase.block.gravity.gravColorSands.*;
import static com.dephoegon.delbase.Delabse.MOD_ID;
import static net.minecraft.world.level.block.Blocks.RED_SAND;
import static net.minecraft.world.level.block.Blocks.SAND;

public class solidSandColors {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MOD_ID);

    public static final DeferredBlock<ColoredFallingBlock> OVERRIDE_SOLID_SAND = registerBlock("solid_sand",
            () -> new solidSandBlock(14406560, SAND, "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> OVERRIDE_RED_SOLID_SAND = registerBlock("red_solid_sand",
            () -> new solidSandBlock(11098145, RED_SAND, "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> BLOOD_SOLID_SAND = registerBlock("blood_solid_sand",
            () -> new solidSandBlock(0xff0000, BLOOD_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> WHITE_SOLID_SAND = registerBlock("white_solid_sand",
            () -> new solidSandBlock(0xffffff, WHITE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> ORANGE_SOLID_SAND = registerBlock("orange_solid_sand",
            () -> new solidSandBlock(0xffa500, ORANGE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> MAGENTA_SOLID_SAND = registerBlock("magenta_solid_sand",
            () -> new solidSandBlock(0xff00ff, MAGENTA_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> LIGHT_BLUE_SOLID_SAND = registerBlock("light_blue_solid_sand",
            () -> new solidSandBlock(0xadd8e6, LIGHT_BLUE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> YELLOW_SOLID_SAND = registerBlock("yellow_solid_sand",
            () -> new solidSandBlock(0xffff00, YELLOW_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> LIME_SOLID_SAND = registerBlock("lime_solid_sand",
            () -> new solidSandBlock(0x00ff00, LIME_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> PINK_SOLID_SAND = registerBlock("pink_solid_sand",
            () -> new solidSandBlock(0xffc0cb, PINK_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> GRAY_SOLID_SAND = registerBlock("gray_solid_sand",
            () -> new solidSandBlock(0x808080, GRAY_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> LIGHT_GRAY_SOLID_SAND = registerBlock("light_gray_solid_sand",
            () -> new solidSandBlock(0xd3d3d3, LIGHT_GRAY_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> CYAN_SOLID_SAND = registerBlock("cyan_solid_sand",
            () -> new solidSandBlock(0x00ffff, CYAN_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> PURPLE_SOLID_SAND = registerBlock("purple_solid_sand",
            () -> new solidSandBlock(0x800080, PURPLE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> BLUE_SOLID_SAND = registerBlock("blue_solid_sand",
            () -> new solidSandBlock(0x0000ff, BLUE_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> GREEN_SOLID_SAND = registerBlock("green_solid_sand",
            () -> new solidSandBlock(0x008000, GREEN_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> BROWN_SOLID_SAND = registerBlock("brown_solid_sand",
            () -> new solidSandBlock(0x714e32, BROWN_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));
    public static final DeferredBlock<ColoredFallingBlock> BLACK_SOLID_SAND = registerBlock("black_solid_sand",
            () -> new solidSandBlock(0x000000, BLACK_SAND.get(), "tooltip.delbase.info.more","tooltip.delbase.sand.solid.info","tooltip.delbase.sand.solid.flavor"));

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