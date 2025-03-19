package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.Delabse;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.common.util.Lazy;
import org.jetbrains.annotations.NotNull;

import static net.neoforged.api.distmarker.Dist.CLIENT;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = Delabse.MOD_ID, value = CLIENT)
public class KeyBindManager {
    public static final Lazy<KeyMapping> tooltipShift = Lazy.of(() -> new KeyMapping("tooltip.key.shift", InputConstants.KEY_LSHIFT, "tooltip.key.category"));
    public static final Lazy<KeyMapping> tooltipCtrl = Lazy.of(() -> new KeyMapping("tooltip.key.ctrl", InputConstants.KEY_LCONTROL, "tooltip.key.category"));

    @SubscribeEvent
    public static void registerKeyBinding(@NotNull RegisterKeyMappingsEvent event) {
        event.register(tooltipCtrl.get());
        event.register(tooltipShift.get());
    }
}