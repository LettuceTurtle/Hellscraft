
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.hellscraft.HellscraftMod;

public class HellscraftModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, HellscraftMod.MODID);
	public static final RegistryObject<Potion> NAUSEA = REGISTRY.register("nausea", () -> new Potion(new MobEffectInstance(MobEffects.CONFUSION, 2400, 0, false, true)));
	public static final RegistryObject<Potion> LEVITATION = REGISTRY.register("levitation", () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 3600, 0, false, true)));
	public static final RegistryObject<Potion> ENHANCED_LEVITATION = REGISTRY.register("enhanced_levitation", () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 3600, 0, false, true)));
	public static final RegistryObject<Potion> EXTENDED_LEVITATION = REGISTRY.register("extended_levitation", () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 7200, 1, false, true)));
	public static final RegistryObject<Potion> HASTE = REGISTRY.register("haste", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true)));
	public static final RegistryObject<Potion> ENHANCED_HASTE = REGISTRY.register("enhanced_haste", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 1, false, true)));
	public static final RegistryObject<Potion> EXTENDED_HASTE = REGISTRY.register("extended_haste", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 7200, 0, false, true)));
}
