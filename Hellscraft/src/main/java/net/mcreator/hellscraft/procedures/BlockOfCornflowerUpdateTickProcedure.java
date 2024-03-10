package net.mcreator.hellscraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.hellscraft.init.HellscraftModParticleTypes;

public class BlockOfCornflowerUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 25) == 25) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (HellscraftModParticleTypes.CORNFLOWER_PETALS.get()), x, y, z, 1, 0.8, 0.8, 0.8, 0);
		}
	}
}
