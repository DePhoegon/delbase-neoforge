package com.dephoegon.delbase.aid.event;

import com.dephoegon.delbase.delbase;
import net.minecraft.client.color.block.BlockColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import org.jetbrains.annotations.NotNull;

import static com.dephoegon.delbase.aid.util.creativeTabsArrayLists.*;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = delbase.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class eventBusEvents {
    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void clientSetup(final FMLCommonSetupEvent event) {
        // MenuScreens.register(menuTypes.BLOCK_CUTTING_STATION_MENU.get(), blockCuttingStationScreen::new);
    }
    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.@NotNull Block event) {
        BlockColor DEFAULT_LEAVES = (state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageFoliageColor(reader, pos) : FoliageColor.getDefaultColor();
        BlockColor BIRCH_LEAVES = (state, reader, pos, color) -> FoliageColor.getBirchColor();
        BlockColor SPRUCE_LEAVES = (state, reader, pos, color) -> FoliageColor.getEvergreenColor();
        DefaultColoredLeaves().forEach((block) -> event.register(DEFAULT_LEAVES, block.get()));
        BirchColoredLeaves().forEach((block) -> event.register(BIRCH_LEAVES, block.get()));
        SpruceColoredLeaves().forEach((block) -> event.register(SPRUCE_LEAVES, block.get()));
        MangroveColoredLeaves().forEach((block) -> event.register(DEFAULT_LEAVES, block.get()));
    }
    @SuppressWarnings("unused")
    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.@NotNull Item event) {
        ColoredLeaves().forEach((block) -> event.register((stack, color) -> event.getBlockColors().getColor(((BlockItem) stack.getItem()).getBlock().defaultBlockState(), null, null, color), block.get()));
        MangroveColoredLeaves().forEach((block) -> event.register((itemColor, itemLike) -> FoliageColor.getMangroveColor(), block.get().asItem()));
    }
}