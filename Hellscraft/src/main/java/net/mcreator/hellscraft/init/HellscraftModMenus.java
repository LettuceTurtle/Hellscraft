
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.hellscraft.world.inventory.PressUIMenu;
import net.mcreator.hellscraft.world.inventory.AgingBarrelGuiMenu;
import net.mcreator.hellscraft.HellscraftMod;

public class HellscraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, HellscraftMod.MODID);
	public static final RegistryObject<MenuType<PressUIMenu>> PRESS_UI = REGISTRY.register("press_ui", () -> IForgeMenuType.create(PressUIMenu::new));
	public static final RegistryObject<MenuType<AgingBarrelGuiMenu>> AGING_BARREL_GUI = REGISTRY.register("aging_barrel_gui", () -> IForgeMenuType.create(AgingBarrelGuiMenu::new));
}
