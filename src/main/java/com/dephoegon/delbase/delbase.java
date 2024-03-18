package com.dephoegon.delbase;

import com.dephoegon.delbase.aid.config.commonConfig;
import com.dephoegon.delbase.aid.util.regList;
import com.dephoegon.delbase.block.entity.blockEntities;
import com.dephoegon.delbase.block.entity.screen.blockCuttingStationScreen;
import com.dephoegon.delbase.block.entity.screen.menuTypes;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import static com.dephoegon.delbase.aid.util.creativeTabs.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(delbase.MODID)
public class delbase {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "delbase";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();


    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public delbase(@NotNull IEventBus modEventBus)
    {
        regList.firstList(modEventBus);
        regList.listOrder(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);
        CREATIVE_MODE_TABS.register(modEventBus);
        modEventBus.addListener(this::addCreative);
        modEventBus.addListener(this::registerCapabilities);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, commonConfig.SPEC);
        // NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }
    private void addCreative(@NotNull BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == DELBASE_ITEM.getKey()) {
            getDelItemList().forEach(event::accept);
            getDelItemBlockList().forEach(event::accept);
        }
        if (event.getTabKey() == DELBASE_BLOCK.getKey()) { getDelFullBlockList().forEach(event::accept); }
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) { getDelItemList().forEach(event::accept); }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { getDelBlockList().forEach(event::accept); }
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) { getDelFunctionalBlockList().forEach(event::accept); }
        if (event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) { getDelNaturalBlockList().forEach(event::accept); }
    }
    private void registerCapabilities(RegisterCapabilitiesEvent event) {
        blockEntities.registerCapabilities(event);
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onRegisterMenuScreens(@NotNull RegisterMenuScreensEvent event) {
            event.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCuttingStationScreen::new);
        }
    }
}
