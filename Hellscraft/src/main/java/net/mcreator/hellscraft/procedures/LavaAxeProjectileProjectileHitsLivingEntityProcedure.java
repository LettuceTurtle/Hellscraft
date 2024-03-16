package net.mcreator.hellscraft.procedures;

import net.minecraft.world.entity.Entity;

public class LavaAxeProjectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(5);
	}
}
