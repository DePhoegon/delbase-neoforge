package com.dephoegon.delbase.aid.event;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.jarjar.nio.util.Lazy;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import org.jetbrains.annotations.NotNull;

public class KeyBindManager {
    public static final Lazy<KeyMapping> tooltipShift = Lazy.of(() -> new KeyMapping("tooltip.key.shift", InputConstants.KEY_LSHIFT, "tooltip.key.category"));
    public static final Lazy<KeyMapping> tooltipCtrl = Lazy.of(() -> new KeyMapping("tooltip.key.ctrl", InputConstants.KEY_LCONTROL, "tooltip.key.category"));

    @SubscribeEvent
    public static void registerKeyBinding(@NotNull RegisterKeyMappingsEvent event) {
        event.register(tooltipCtrl.get());
        event.register(tooltipShift.get());
    }
}