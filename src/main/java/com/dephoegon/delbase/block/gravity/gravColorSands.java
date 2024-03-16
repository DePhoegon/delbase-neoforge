package com.dephoegon.delbase.block.gravity;

import com.dephoegon.delbase.aid.block.colorshift.grav.sandBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ColoredFallingBlock;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

import static com.dephoegon.delbase.delbase.MODID;

@SuppressWarnings("unused")
public class gravColorSands {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);
    private static final DeferredRegister.Blocks OVERRIDE_BLOCK = DeferredRegister.createBlocks("minecraft");
    private static final DeferredRegister<Item> OVERRIDE_ITEM = DeferredRegister.createItems("minecraft");

    public static final DeferredBlock<ColoredFallingBlock> OVERRIDE_SAND = overrideRegister("sand",
            () -> new sandBlock(14406560, MapColor.SAND, "tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true),0);
    public static final DeferredBlock<ColoredFallingBlock> OVERRIDE_RED_SAND = overrideRegister("red_sand",
            () -> new sandBlock(11098145, MapColor.COLOR_ORANGE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true), 0);
    public static final DeferredBlock<ColoredFallingBlock> BLOOD_SAND = register("blood_sand",
            () -> new sandBlock(0xff0000, MapColor.TERRACOTTA_RED,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> WHITE_SAND = register("white_sand",
            () -> new sandBlock(0xffffff, MapColor.TERRACOTTA_WHITE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> ORANGE_SAND = register("orange_sand",
            () -> new sandBlock(0xffa500, MapColor.TERRACOTTA_ORANGE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> MAGENTA_SAND = register("magenta_sand",
            () -> new sandBlock(0xff00ff, MapColor.TERRACOTTA_MAGENTA,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> LIGHT_BLUE_SAND = register("light_blue_sand",
            () -> new sandBlock(0xadd8e6, MapColor.TERRACOTTA_LIGHT_BLUE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> YELLOW_SAND = register("yellow_sand",
            () -> new sandBlock(0xffff00, MapColor.TERRACOTTA_YELLOW,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> LIME_SAND = register("lime_sand",
            () -> new sandBlock(0x00ff00, MapColor.TERRACOTTA_LIGHT_GREEN,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> PINK_SAND = register("pink_sand",
            () -> new sandBlock(0xffc0cb, MapColor.TERRACOTTA_PINK,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> GRAY_SAND = register("gray_sand",
            () -> new sandBlock(0x808080, MapColor.TERRACOTTA_GRAY,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> LIGHT_GRAY_SAND = register("light_gray_sand",
            () -> new sandBlock(0xd3d3d3, MapColor.TERRACOTTA_LIGHT_GRAY,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> CYAN_SAND = register("cyan_sand",
            () -> new sandBlock(0x00ffff, MapColor.TERRACOTTA_CYAN,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> PURPLE_SAND = register("purple_sand",
            () -> new sandBlock(0x800080, MapColor.TERRACOTTA_PURPLE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> BLUE_SAND = register("blue_sand",
            () -> new sandBlock(0x0000ff, MapColor.TERRACOTTA_BLUE,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> GREEN_SAND = register("green_sand",
            () -> new sandBlock(0x008000, MapColor.TERRACOTTA_GREEN,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> BROWN_SAND = register("brown_sand",
            () -> new sandBlock(0x714e32, MapColor.TERRACOTTA_BROWN,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));
    public static final DeferredBlock<ColoredFallingBlock> BLACK_SAND = register("black_sand",
            () -> new sandBlock(0x000000, MapColor.TERRACOTTA_BLACK,"tooltip.delbase.info.more","tooltip.delbase.sand.hold.info","tooltip.delbase.sand.hold.flavor",true));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        OVERRIDE_BLOCK.register(eventBus);
        OVERRIDE_ITEM.register(eventBus);
    }
    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @javax.annotation.Nullable RecipeType<?> recipeType) {
                if (burn > 0) { return burn; } else return -1;
            }
        });
        return exit;
    }
    private static <T extends Block> @NotNull DeferredBlock<T> overrideRegister(String name, Supplier<T> block, int burn) {
        DeferredBlock<T> exit = OVERRIDE_BLOCK.register(name, block);
        OVERRIDE_ITEM.register(name, () -> new BlockItem(exit.get(), new Item.Properties().stacksTo(64)){
            public int getBurnTime(@NotNull ItemStack stack, @javax.annotation.Nullable RecipeType<?> recipeType) {
                if (burn > 0) { return burn; } else return -1;
            }
        });
        return exit;
    }
    private static <T extends Block> @NotNull DeferredBlock<T> register(String name, Supplier<T> block) { return register(name, block, 0); }
}