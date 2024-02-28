
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.hellscraft.client.gui.PressUIScreen;
import net.mcreator.hellscraft.client.gui.AgingBarrelGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HellscraftModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(HellscraftModMenus.PRESS_UI.get(), PressUIScreen::new);
			MenuScreens.register(HellscraftModMenus.AGING_BARREL_GUI.get(), AgingBarrelGuiScreen::new);
		});
	}
}
