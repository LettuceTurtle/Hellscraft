
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.hellscraft.fluid.EndFluidFluid;
import net.mcreator.hellscraft.HellscraftMod;

public class HellscraftModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, HellscraftMod.MODID);
	public static final RegistryObject<FlowingFluid> END_FLUID = REGISTRY.register("end_fluid", () -> new EndFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_END_FLUID = REGISTRY.register("flowing_end_fluid", () -> new EndFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(END_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_END_FLUID.get(), RenderType.translucent());
		}
	}
}
