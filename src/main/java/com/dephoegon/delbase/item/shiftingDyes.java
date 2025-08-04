package com.dephoegon.delbase.item;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.aid.block.item.blockDye;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class shiftingDyes {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Delbase.Mod_ID);
    
    public static final DeferredItem<Item> CLEANSE_SHIFT_DYE = ITEMS.register("cleanse_shift_dye",
            () -> new blockDye(DyeColor.WHITE, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.suction",""));
    public static final DeferredItem<Item> RED_SHIFT_DYE = ITEMS.register("red_shift_dye",
            () -> new blockDye(DyeColor.RED, new Item.Properties().stacksTo(64)
                    ,"tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> BLOOD_SHIFT_DYE = ITEMS.register("blood_shift_dye",
            () -> new blockDye(DyeColor.RED, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> WHITE_SHIFT_DYE = ITEMS.register("white_shift_dye",
            () -> new blockDye(DyeColor.WHITE, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> ORANGE_SHIFT_DYE = ITEMS.register("orange_shift_dye",
            () -> new blockDye(DyeColor.ORANGE, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> MAGENTA_SHIFT_DYE = ITEMS.register("magenta_shift_dye",
            () -> new blockDye(DyeColor.MAGENTA, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> LIGHT_BLUE_SHIFT_DYE = ITEMS.register("light_blue_shift_dye",
            () -> new blockDye(DyeColor.LIGHT_BLUE, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> YELLOW_SHIFT_DYE = ITEMS.register("yellow_shift_dye",
            () -> new blockDye(DyeColor.YELLOW, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> LIME_SHIFT_DYE = ITEMS.register("lime_shift_dye",
            () -> new blockDye(DyeColor.LIME, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> PINK_SHIFT_DYE = ITEMS.register("pink_shift_dye",
            () -> new blockDye(DyeColor.PINK, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> GRAY_SHIFT_DYE = ITEMS.register("gray_shift_dye",
            () -> new blockDye(DyeColor.GRAY, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> LIGHT_GRAY_SHIFT_DYE = ITEMS.register("light_gray_shift_dye",
            () -> new blockDye(DyeColor.LIGHT_GRAY, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> CYAN_SHIFT_DYE = ITEMS.register("cyan_shift_dye",
            () -> new blockDye(DyeColor.CYAN, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> PURPLE_SHIFT_DYE = ITEMS.register("purple_shift_dye",
            () -> new blockDye(DyeColor.PURPLE, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> BLUE_SHIFT_DYE = ITEMS.register("blue_shift_dye",
            () -> new blockDye(DyeColor.BLUE, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> GREEN_SHIFT_DYE = ITEMS.register("green_shift_dye",
            () -> new blockDye(DyeColor.GREEN, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> BROWN_SHIFT_DYE = ITEMS.register("brown_shift_dye",
            () -> new blockDye(DyeColor.BROWN, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));
    public static final DeferredItem<Item> BLACK_SHIFT_DYE = ITEMS.register("black_shift_dye",
            () -> new blockDye(DyeColor.BLACK, new Item.Properties().stacksTo(64),
                    "tooltip.delbase.info.shift.more","tooltip.delbase.color.shifter",""));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}