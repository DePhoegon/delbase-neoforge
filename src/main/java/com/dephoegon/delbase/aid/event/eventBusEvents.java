package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.aid.util.composable;
import com.dephoegon.delbase.aid.util.compostable;
import com.dephoegon.delbase.block.entity.screen.blockCuttingStationScreen;
import com.dephoegon.delbase.block.entity.screen.menuTypes;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.event.server.ServerStartedEvent;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.Delabse.MOD_ID;
import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.*;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class eventBusEvents {
    @SuppressWarnings("unused")
    @net.neoforged.bus.api.SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {
        MenuScreens.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCuttingStationScreen::new);
    }
    @SuppressWarnings("unused")
    @net.neoforged.bus.api.SubscribeEvent
    public static void registerBlockColors(net.neoforged.neoforge.client.event.RegisterColorHandlersEvent.@NotNull Block event) {
        BlockColor DEFAULT_LEAVES = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColor.getDefaultColor();
        BlockColor BIRCH_LEAVES = (state, reader, pos, color) -> FoliageColor.getBirchColor();
        BlockColor SPRUCE_LEAVES = (state, reader, pos, color) -> FoliageColor.getEvergreenColor();
        DefaultColoredLeaves().forEach((block) -> event.register(DEFAULT_LEAVES, block.get()));
        BirchColoredLeaves().forEach((block) -> event.register(BIRCH_LEAVES, block.get()));
        SpruceColoredLeaves().forEach((block) -> event.register(SPRUCE_LEAVES, block.get()));
        MangroveColoredLeaves().forEach((block) -> event.register(DEFAULT_LEAVES, block.get()));
    }
    @SuppressWarnings("unused")
    @net.neoforged.bus.api.SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.@NotNull Item event) {
        ColoredLeaves().forEach((block) -> event.register((stack, color) -> event.getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, color), block.get()));
        MangroveColoredLeaves().forEach((block) -> event.register((itemColor, itemLike) -> FoliageColor.getMangroveColor(), block.get().asItem()));
    }
    public static void onServerStartAddCompostItems(ServerStartedEvent ignoredEvent) { compostable.addToList(); }
}