
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.hellscraft.fluid.types.EndFluidFluidType;
import net.mcreator.hellscraft.HellscraftMod;

public class HellscraftModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, HellscraftMod.MODID);
	public static final RegistryObject<FluidType> END_FLUID_TYPE = REGISTRY.register("end_fluid", () -> new EndFluidFluidType());
}
