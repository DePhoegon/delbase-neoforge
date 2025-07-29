package com.dephoegon.delbase.block.entity;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.dephoegon.delbase.Delabse.Mod_ID;

public class menuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Mod_ID);

    public static final DeferredBlock<MenuType<blockCuttingStationMenu>> BLOCK_CUTTING_STATION_MENU =
            registerMenuType(blockCuttingStationMenu::new, "block_cutting_station_menu");

    @SuppressWarnings("SameParameterValue")
    private static <T extends AbstractContainerMenu>DeferredBlock<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.registerBlock(name, () -> IForgeMenuType.create(factory));
    }
    public static void registerBlock(IEventBus eventBus) {
        MENUS.registerBlock(eventBus);
    }
}
