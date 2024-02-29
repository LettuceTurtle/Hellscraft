
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HellscraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HellscraftModEntities.CHEESE_JAVELIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HellscraftModEntities.FISHMETAL_JAVELIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HellscraftModEntities.DARKSTEEL_JAVELIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HellscraftModEntities.WOODEN_JAVELIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HellscraftModEntities.STONE_JAVELIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HellscraftModEntities.IRON_JAVELIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HellscraftModEntities.GOLD_JAVELIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HellscraftModEntities.DIAMOND_JAVELIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HellscraftModEntities.NETHERITE_JAVELIN_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(HellscraftModEntities.LAVA_AXE_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
