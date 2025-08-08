package com.dephoegon.delbase;

import com.dephoegon.delbase.aid.config.Config;
import com.dephoegon.delbase.aid.util.regList;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

import static com.dephoegon.delbase.aid.util.delbaseCreativeTabs.*;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Delbase.Mod_ID)
public class Delbase
{
    // Define mod id in a common place for everything to reference
    public static final String Mod_ID = "delbase";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    // The constructor for the mod class is the first code run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public Delbase(IEventBus modEventBus, ModContainer modContainer) {
        regList.firstList(modEventBus);
        regList.listOrder(modEventBus);
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(modEventBus);
        
        // Register the commonSetup method for mod-loading
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) { }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            getDelItemBlockList().forEach(event::accept);
            getDelItemList().forEach(event::accept);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { getDelBlockList().forEach(event::accept); }
        if(event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) { getDelFunctionalBlockList().forEach(event::accept); }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) { getDelNaturalBlockList().forEach(event::accept); }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent ignoredEvent) {  }
}
