
package net.mcreator.hellscraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.hellscraft.init.HellscraftModItems;
import net.mcreator.hellscraft.init.HellscraftModFluids;
import net.mcreator.hellscraft.init.HellscraftModFluidTypes;
import net.mcreator.hellscraft.init.HellscraftModBlocks;

public abstract class EndFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> HellscraftModFluidTypes.END_FLUID_TYPE.get(), () -> HellscraftModFluids.END_FLUID.get(), () -> HellscraftModFluids.FLOWING_END_FLUID.get())
			.explosionResistance(100f).tickRate(48).slopeFindDistance(2).bucket(() -> HellscraftModItems.END_FLUID_BUCKET.get()).block(() -> (LiquidBlock) HellscraftModBlocks.END_FLUID.get());

	private EndFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends EndFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends EndFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
