package com.dephoegon.delbase.aid.config;

import com.dephoegon.delbase.Delbase;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Neo's config APIs
@EventBusSubscriber(modid = Delbase.Mod_ID, bus = EventBusSubscriber.Bus.MOD)
public class Config {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;

    public static final ModConfigSpec.IntValue BURN_CHANCE_NUMBER;
    public static final ModConfigSpec.IntValue BURN_CHANCE_NUMBER_CAP;
    public static final ModConfigSpec.IntValue BLOCK_CUTTING_STATION_CRAFT_TIME;
    public static final ModConfigSpec.IntValue WOOD_SALVAGE_ROLLS;
    public static final ModConfigSpec.IntValue STONE_SALVAGE_ROLLS;
    public static final ModConfigSpec.IntValue NETHERRITE_BONUS_ROLLS;

    static {


        BUILDER.push("DelBase Common Configs");

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


        // Client&Server Side Configs
        BUILDER.pop();
        SPEC = BUILDER.build();
    }

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {

    }
}
