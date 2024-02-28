
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.hellscraft.block.entity.PressBlockEntity;
import net.mcreator.hellscraft.block.entity.PressABlockEntity;
import net.mcreator.hellscraft.block.entity.AgingBarrelBlockEntity;
import net.mcreator.hellscraft.HellscraftMod;

public class HellscraftModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, HellscraftMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PRESS = register("press", HellscraftModBlocks.PRESS, PressBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> AGING_BARREL = register("aging_barrel", HellscraftModBlocks.AGING_BARREL, AgingBarrelBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> PRESS_A = register("press_a", HellscraftModBlocks.PRESS_A, PressABlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
