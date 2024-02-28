
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
}
