package com.dephoegon.delbase.events.register;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.block.entity.menuTypes;
import com.dephoegon.delbase.block.entity.screen.blockCutterScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

@EventBusSubscriber(modid = Delbase.Mod_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class client {
    @SubscribeEvent
    public static void clientMenus(RegisterMenuScreensEvent event) {
        event.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCutterScreen::new);
    }
}
