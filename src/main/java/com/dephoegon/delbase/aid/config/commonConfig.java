package com.dephoegon.delbase.aid.config;

import com.dephoegon.delbase.delbase;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@Mod.EventBusSubscriber(modid = delbase.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class commonConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    /*
    private static final ModConfigSpec.BooleanValue LOG_DIRT_BLOCK = BUILDER
            .comment("Whether to log the dirt block on common setup")
            .define("logDirtBlock", true);

    private static final ModConfigSpec.IntValue MAGIC_NUMBER = BUILDER
            .comment("A magic number")
            .defineInRange("magicNumber", 42, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec.ConfigValue<String> MAGIC_NUMBER_INTRODUCTION = BUILDER
            .comment("What you want the introduction message to be for the magic number")
            .define("magicNumberIntroduction", "The magic number is... ");
    */
    private static final ModConfigSpec.IntValue BURN_CHANCE_NUMBER = BUILDER.comment("Threshold number for replacing a wood block with an Ash one. Set to -1 for instant replacement of enabled blocks, & a # greater than the Upper Limit to 'effectively disable' it.")
            .defineInRange("Threshold Number", 3, -1, 25);

    private static final ModConfigSpec.IntValue BURN_CHANCE_CAP = BUILDER.comment("RNG [0 - #], Used in defining the range. Will replace with an Ash version if Number is higher than the Threshold Number")
            .defineInRange("RNG Upper Limit", 8, 4, 30);
    private static final ModConfigSpec.IntValue BLOCK_CUTTING_STATION_CRAFT_TIME = BUILDER.comment("Crafting Time in Ticks(20Tick/Second) for the Block Cutting Station.  Upper limit absurd in cases of self hate.")
            .defineInRange("Cutting Station Crafting Ticks", 52, 5, 1000000);
    private static final ModConfigSpec.IntValue WOOD_SALVAGE_ROLLS = BUILDER.comment("Number of Rolls of drops for Wood Tier Tools")
            .defineInRange("Wood Rolls", 2, 1, 4);
    private static final ModConfigSpec.IntValue STONE_SALVAGE_ROLLS = BUILDER.comment("Number of Rolls of drops of Stone Tier Tools")
            .defineInRange("Stone Rolls", 2, 1, 4);
    private static final ModConfigSpec.IntValue NETHERRITE_BONUS_ROLLS = BUILDER.comment("Bonus Amounts of sticks (1-4) with tools.")
            .defineInRange("Tools Stick rolls", 2, 1, 4);
    private static final ModConfigSpec.IntValue NETHERRITE_BOOTS_DIAMOND_BONUS = BUILDER.comment("Number of Diamond Returned with The singular Netherrite Ingot")
            .defineInRange("Netherrite Boots Bonus",1, 1, 4);
    private static final ModConfigSpec.IntValue NETHERRITE_CHEST_DIAMOND_BONUS = BUILDER.defineInRange("Netherrite Chest plate Bonus",1, 1, 8);
    private static final ModConfigSpec.IntValue NETHERRITE_LEGGINGS_DIAMOND_BONUS = BUILDER.defineInRange("Netherrite Leggings Bonus", 1, 1,7);
    private static final ModConfigSpec.IntValue NETHERRITE_HELMET_DIAMOND_BONUS = BUILDER.defineInRange("Netherrite Helmet Bonus", 1, 1, 5);
    private static final ModConfigSpec.IntValue NETHERRITE_SWORD_DIAMOND_BONUS = BUILDER.comment("Tool Bonuses for netherrite. Shovel is set to 1")
            .defineInRange("Nether Sword Bonus",1,1,2);
    private static final ModConfigSpec.IntValue NETHERRITE_AXE_DIAMOND_BONUS = BUILDER.defineInRange("Nether Axe Bonus", 1, 1, 3);
    private static final ModConfigSpec.IntValue NETHERRITE_PICKAXE_DIAMOND_BONUS = BUILDER.defineInRange("Nether Pickaxe Bonus", 1,1,3);

    public static final ModConfigSpec SPEC = BUILDER.build();

    public static int burnChanceNumber;
    public static int burnChanceNumberCap;
    public static int blockCuttingStationCraftTime;
    public static int woodSalvageRolls;
    public static int stoneSalvageRolls;
    public static int netherriteBonusRolls;
    public static int netherriteBootsRoll;
    public static int netherriteChestRoll;
    public static int netherriteLeggingsRoll;
    public static int netherriteHelmetRoll;
    public static int netherriteSwordRoll;
    public static int netherriteAxeRoll;
    public static int netherritePickAxeRoll;
    /*
    public static boolean logDirtBlock;
    public static int magicNumber;
    public static String magicNumberIntroduction;
    public static Set<Item> items;
    */

    private static boolean validateItemName(final Object obj)
    {
        return obj instanceof String itemName && BuiltInRegistries.ITEM.containsKey(new ResourceLocation(itemName));
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        burnChanceNumber = BURN_CHANCE_NUMBER.get();
        burnChanceNumberCap = BURN_CHANCE_CAP.get();
        blockCuttingStationCraftTime = BLOCK_CUTTING_STATION_CRAFT_TIME.get();
        woodSalvageRolls = WOOD_SALVAGE_ROLLS.get();
        stoneSalvageRolls = STONE_SALVAGE_ROLLS.get();
        netherriteBonusRolls = NETHERRITE_BONUS_ROLLS.get();
        netherriteBootsRoll = NETHERRITE_BOOTS_DIAMOND_BONUS.get();
        netherriteChestRoll = NETHERRITE_CHEST_DIAMOND_BONUS.get();
        netherriteLeggingsRoll = NETHERRITE_LEGGINGS_DIAMOND_BONUS.get();
        netherriteHelmetRoll = NETHERRITE_HELMET_DIAMOND_BONUS.get();
        netherriteSwordRoll = NETHERRITE_SWORD_DIAMOND_BONUS.get();
        netherriteAxeRoll = NETHERRITE_AXE_DIAMOND_BONUS.get();
        netherritePickAxeRoll = NETHERRITE_PICKAXE_DIAMOND_BONUS.get();
        /*
        // convert the list of strings into a set of items
        items = ITEM_STRINGS.get().stream()
                .map(itemName -> BuiltInRegistries.ITEM.get(new ResourceLocation(itemName)))
                .collect(Collectors.toSet());
        */
    }
}