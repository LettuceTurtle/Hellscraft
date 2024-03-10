
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.hellscraft.HellscraftMod;

public class HellscraftModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, HellscraftMod.MODID);
	public static final RegistryObject<SimpleParticleType> DANDELION_PETALS = REGISTRY.register("dandelion_petals", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> POPPY_PETALS = REGISTRY.register("poppy_petals", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> CORNFLOWER_PETALS = REGISTRY.register("cornflower_petals", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> AZURE_PETALS = REGISTRY.register("azure_petals", () -> new SimpleParticleType(false));
}
