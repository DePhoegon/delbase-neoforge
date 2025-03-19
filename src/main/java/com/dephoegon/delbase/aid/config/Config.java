package com.dephoegon.delbase.aid.config;

import com.dephoegon.delbase.Delabse;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
@EventBusSubscriber(modid = Delabse.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.IntValue BURN_CHANCE_NUMBER;
    public static final ModConfigSpec.IntValue BURN_CHANCE_NUMBER_CAP;
    public static final ModConfigSpec.IntValue BLOCK_CUTTING_STATION_CRAFT_TIME;
    public static final ModConfigSpec.IntValue WOOD_SALVAGE_ROLLS;
    public static final ModConfigSpec.IntValue STONE_SALVAGE_ROLLS;
    public static final ModConfigSpec.IntValue NETHERRITE_BONUS_ROLLS;
    public static final ModConfigSpec.IntValue NETHERRITE_CHEST_DIAMOND_BONUS;
    public static final ModConfigSpec.IntValue NETHERRITE_HELMET_DIAMOND_BONUS;
    public static final ModConfigSpec.IntValue NETHERRITE_LEGGINGS_DIAMOND_BONUS;
    public static final ModConfigSpec.IntValue NETHERRITE_BOOTS_DIAMOND_BONUS;
    public static final ModConfigSpec.IntValue NETHERRITE_SWORD_BONUS;
    public static final ModConfigSpec.IntValue NETHERRITE_AXE_BONUS;
    public static final ModConfigSpec.IntValue NETHERRITE_PICKAXE_BONUS;

    static {


        BUILDER.push("Delbase Common Configs");

        BURN_CHANCE_NUMBER = BUILDER.comment("Threshold number for replacing a wood block with an Ash one. Set to -1 for instant replacement of enabled blocks, & a # greater than the Upper Limit to 'effectively disable' it.")
                .defineInRange("Threshold Number", 3, -1, 25);
        BURN_CHANCE_NUMBER_CAP = BUILDER.comment("RNG [0 - #], Used in defining the range. Will replace with an Ash version if Number is higher than the Threshold Number")
                .defineInRange("RNG Upper Limit", 8, 4, 30);
        BLOCK_CUTTING_STATION_CRAFT_TIME = BUILDER.comment("Crafting Time in Ticks(20Tick/Second) for the Block Cutting Station.  Upper limit absurd in cases of self hate.")
                .defineInRange("Cutting Station Crafting Ticks", 52, 5, 1000000);
        WOOD_SALVAGE_ROLLS = BUILDER.comment("Number of Rolls of drops for Wood Tier Tools")
                .defineInRange("Wood Rolls", 2, 1, 4);
        STONE_SALVAGE_ROLLS = BUILDER.comment("Number of Rolls of drops of Stone Tier Tools")
                .defineInRange("Stone Rolls", 2, 1, 4);
        NETHERRITE_BONUS_ROLLS = BUILDER.comment("Bonus Amounts of sticks (1-4) with tools.")
                .defineInRange("Tools Stick rolls", 2, 1, 4);
        NETHERRITE_BOOTS_DIAMOND_BONUS = BUILDER.comment("Number of Diamond Returned with The singular Netherrite Ingot")
                .defineInRange("Netherrite Boots Bonus",1, 1, 4);
        NETHERRITE_CHEST_DIAMOND_BONUS = BUILDER.defineInRange("Netherrite Chestplate Bonus",1, 1, 8);
        NETHERRITE_LEGGINGS_DIAMOND_BONUS = BUILDER.defineInRange("Netherrite Leggings Bonus", 1, 1,7);
        NETHERRITE_HELMET_DIAMOND_BONUS = BUILDER.defineInRange("Netherrite Helmet Bonus", 1, 1, 5);
        NETHERRITE_SWORD_BONUS = BUILDER.comment("Tool Bonuses for netherrite. Shovel is set to 1")
                .defineInRange("Nether Sword Bonus",1,1,2);
        NETHERRITE_AXE_BONUS = BUILDER.defineInRange("Nether Axe Bonus", 1, 1, 3);
        NETHERRITE_PICKAXE_BONUS = BUILDER.defineInRange("Nether Pickaxe Bonus", 1,1,3);


        // Client&Server Side Configs
        BUILDER.pop();
        SPEC = BUILDER.build();
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {

    }
}
