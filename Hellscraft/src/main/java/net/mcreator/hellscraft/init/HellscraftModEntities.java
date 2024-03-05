
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.hellscraft.entity.WoodenJavelinProjectileEntity;
import net.mcreator.hellscraft.entity.StoneJavelinProjectileEntity;
import net.mcreator.hellscraft.entity.NetheriteJavelinProjectileEntity;
import net.mcreator.hellscraft.entity.LavaAxeProjectileEntity;
import net.mcreator.hellscraft.entity.IronJavelinProjectileEntity;
import net.mcreator.hellscraft.entity.GoldJavelinProjectileEntity;
import net.mcreator.hellscraft.entity.FishmetalJavelinProjectileEntity;
import net.mcreator.hellscraft.entity.DiamondJavelinProjectileEntity;
import net.mcreator.hellscraft.entity.DarksteelJavelinProjectileEntity;
import net.mcreator.hellscraft.entity.CheeseJavelinProjectileEntity;
import net.mcreator.hellscraft.HellscraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HellscraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, HellscraftMod.MODID);
	public static final RegistryObject<EntityType<CheeseJavelinProjectileEntity>> CHEESE_JAVELIN_PROJECTILE = register("projectile_cheese_javelin_projectile",
			EntityType.Builder.<CheeseJavelinProjectileEntity>of(CheeseJavelinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(CheeseJavelinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FishmetalJavelinProjectileEntity>> FISHMETAL_JAVELIN_PROJECTILE = register("projectile_fishmetal_javelin_projectile",
			EntityType.Builder.<FishmetalJavelinProjectileEntity>of(FishmetalJavelinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(FishmetalJavelinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DarksteelJavelinProjectileEntity>> DARKSTEEL_JAVELIN_PROJECTILE = register("projectile_darksteel_javelin_projectile",
			EntityType.Builder.<DarksteelJavelinProjectileEntity>of(DarksteelJavelinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DarksteelJavelinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WoodenJavelinProjectileEntity>> WOODEN_JAVELIN_PROJECTILE = register("projectile_wooden_javelin_projectile",
			EntityType.Builder.<WoodenJavelinProjectileEntity>of(WoodenJavelinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(WoodenJavelinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StoneJavelinProjectileEntity>> STONE_JAVELIN_PROJECTILE = register("projectile_stone_javelin_projectile",
			EntityType.Builder.<StoneJavelinProjectileEntity>of(StoneJavelinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(StoneJavelinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronJavelinProjectileEntity>> IRON_JAVELIN_PROJECTILE = register("projectile_iron_javelin_projectile",
			EntityType.Builder.<IronJavelinProjectileEntity>of(IronJavelinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(IronJavelinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldJavelinProjectileEntity>> GOLD_JAVELIN_PROJECTILE = register("projectile_gold_javelin_projectile",
			EntityType.Builder.<GoldJavelinProjectileEntity>of(GoldJavelinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(GoldJavelinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiamondJavelinProjectileEntity>> DIAMOND_JAVELIN_PROJECTILE = register("projectile_diamond_javelin_projectile",
			EntityType.Builder.<DiamondJavelinProjectileEntity>of(DiamondJavelinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(DiamondJavelinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NetheriteJavelinProjectileEntity>> NETHERITE_JAVELIN_PROJECTILE = register("projectile_netherite_javelin_projectile",
			EntityType.Builder.<NetheriteJavelinProjectileEntity>of(NetheriteJavelinProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(NetheriteJavelinProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LavaAxeProjectileEntity>> LAVA_AXE_PROJECTILE = register("projectile_lava_axe_projectile", EntityType.Builder.<LavaAxeProjectileEntity>of(LavaAxeProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(LavaAxeProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
