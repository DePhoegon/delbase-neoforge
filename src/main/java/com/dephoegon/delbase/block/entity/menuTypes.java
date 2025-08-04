package com.dephoegon.delbase.block.entity;

import com.dephoegon.delbase.Delbase;
import com.dephoegon.delbase.block.entity.screen.blockCuttingMenu;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.network.IContainerFactory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class menuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, Delbase.Mod_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<blockCuttingMenu>> BLOCK_CUTTING_STATION_MENU =
            registerMenu("block_cutting_station_menu", blockCuttingMenu::new);

    @SuppressWarnings("SameParameterValue")
    private static <T extends AbstractContainerMenu>DeferredHolder<MenuType<?>, MenuType<T>> registerMenu(String name, IContainerFactory<T> factory) {
        return MENUS.register(name, () -> IMenuTypeExtension.create(factory));
    }

    public static void registerMenus(IEventBus eventBus) { MENUS.register(eventBus); }
}