
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.hellscraft.client.particle.PoppyPetalsParticle;
import net.mcreator.hellscraft.client.particle.DandelionPetalsParticle;
import net.mcreator.hellscraft.client.particle.CornflowerPetalsParticle;
import net.mcreator.hellscraft.client.particle.AzurePetalsParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HellscraftModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(HellscraftModParticleTypes.DANDELION_PETALS.get(), DandelionPetalsParticle::provider);
		event.registerSpriteSet(HellscraftModParticleTypes.POPPY_PETALS.get(), PoppyPetalsParticle::provider);
		event.registerSpriteSet(HellscraftModParticleTypes.CORNFLOWER_PETALS.get(), CornflowerPetalsParticle::provider);
		event.registerSpriteSet(HellscraftModParticleTypes.AZURE_PETALS.get(), AzurePetalsParticle::provider);
	}
}
