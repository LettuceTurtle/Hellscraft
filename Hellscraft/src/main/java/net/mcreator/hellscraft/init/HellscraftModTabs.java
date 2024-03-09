
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.hellscraft.HellscraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class HellscraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HellscraftMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {

		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(HellscraftModBlocks.FISHMETAL_BLOCK.get().asItem());
			tabData.accept(HellscraftModBlocks.HARDSPICE.get().asItem());
			tabData.accept(HellscraftModBlocks.HARDSPICE_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.HARDSPICE_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.HARDSPICE_BRICKS.get().asItem());
			tabData.accept(HellscraftModBlocks.HARDSPICE_BRICK_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.HARDSPICE_BRICK_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.HARDSPICE_BRICK_WALL.get().asItem());
			tabData.accept(HellscraftModBlocks.SMOOTH_HARDSPICE.get().asItem());
			tabData.accept(HellscraftModBlocks.SMOOTH_HARDSPICE_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKSTEEL_BLOCK.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_PLANKS.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_PLANK_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_PLANK_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_PLANK_FENCE.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_PLANK_TRAPDOOR.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_PLANK_DOOR.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_BUTTON.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_PRESSURE_PLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_PLANK_FENCE_GATE.get().asItem());
			tabData.accept(HellscraftModBlocks.STRIPPED_DARKWOOD_LOG.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_LEAVES.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_PLANKS.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_FENCE.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_FENCE_GATE.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_TRAPDOOR.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_BUTTON.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.BLOCK_OF_CORN.get().asItem());
			tabData.accept(HellscraftModBlocks.WAXED_BLOCK_OF_CORN.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_BLOCK_OF_CORN.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_CORN_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_CORN_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_CORN_WALL.get().asItem());
			tabData.accept(HellscraftModBlocks.BLOCK_OF_POPCORN.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_BLOCK_OF_POPCORN.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_POPCORN_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_POPCORN_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_POPCORN_WALL.get().asItem());
			tabData.accept(HellscraftModBlocks.BLOCK_OF_SALT.get().asItem());
			tabData.accept(HellscraftModBlocks.BLOCK_OF_BUTTER.get().asItem());
			tabData.accept(HellscraftModBlocks.BLOCK_OF_PINK_SALT.get().asItem());
			tabData.accept(HellscraftModBlocks.SALT_LAMP.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_DEEPERSLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.DEEPERSLATE_BRICKS.get().asItem());
			tabData.accept(HellscraftModBlocks.CHISELED_DEEPERSLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.DEEPERSLATE_BRICK_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.DEEPERSLATE_BRICK_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.DEEPERSLATE_BRICK_WALL.get().asItem());
			tabData.accept(HellscraftModBlocks.JEWELED_DEEPERSLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.JEWELED_DEEPERSLATE_BRICKS.get().asItem());
			tabData.accept(HellscraftModBlocks.CHISELED_JEWELED_DEEPERSLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.GILDED_DEEPERSLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.GILDED_DEEPERSLATE_BRICKS.get().asItem());
			tabData.accept(HellscraftModBlocks.CHISELED_GILDED_DEEPERSLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.GALVANIC_DEEPERSLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.GALVANIC_DEEPERSLATE_BRICKS.get().asItem());
			tabData.accept(HellscraftModBlocks.CHISLED_GALVANIC_DEEPERSLATE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(HellscraftModBlocks.PRESS.get().asItem());
			tabData.accept(HellscraftModBlocks.AGING_BARREL.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(HellscraftModItems.CHEESED_SWORD.get());
			tabData.accept(HellscraftModItems.CHEESED_ARMOR_HELMET.get());
			tabData.accept(HellscraftModItems.CHEESED_ARMOR_CHESTPLATE.get());
			tabData.accept(HellscraftModItems.CHEESED_ARMOR_LEGGINGS.get());
			tabData.accept(HellscraftModItems.CHEESED_ARMOR_BOOTS.get());
			tabData.accept(HellscraftModItems.FISHMETAL_SWORD.get());
			tabData.accept(HellscraftModItems.FISHMETAL_ARMOR_HELMET.get());
			tabData.accept(HellscraftModItems.FISHMETAL_ARMOR_CHESTPLATE.get());
			tabData.accept(HellscraftModItems.FISHMETAL_ARMOR_LEGGINGS.get());
			tabData.accept(HellscraftModItems.FISHMETAL_ARMOR_BOOTS.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_SWORD.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_ARMOR_HELMET.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_ARMOR_CHESTPLATE.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_ARMOR_LEGGINGS.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_ARMOR_BOOTS.get());
			tabData.accept(HellscraftModItems.WOODEN_JAVELIN.get());
			tabData.accept(HellscraftModItems.STONE_JAVELIN.get());
			tabData.accept(HellscraftModItems.IRON_JAVELIN.get());
			tabData.accept(HellscraftModItems.GOLD_JAVELIN.get());
			tabData.accept(HellscraftModItems.DIAMOND_JAVELIN.get());
			tabData.accept(HellscraftModItems.NETHERITE_JAVELIN.get());
			tabData.accept(HellscraftModItems.CHEESE_JAVELIN.get());
			tabData.accept(HellscraftModItems.FISHMETAL_JAVELIN.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_JAVELIN.get());
			tabData.accept(HellscraftModItems.FIREBALL_WAND.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_SHIELD.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(HellscraftModItems.FISHMETAL_INGOT.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_INGOT.get());
			tabData.accept(HellscraftModItems.RAW_DARKSTEEL.get());
			tabData.accept(HellscraftModItems.SALT.get());
			tabData.accept(HellscraftModItems.PINK_SALT.get());
			tabData.accept(HellscraftModItems.END_FLUID_BUCKET.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(HellscraftModItems.CHEESE.get());
			tabData.accept(HellscraftModBlocks.BLOCK_OF_CHEESE.get().asItem());
			tabData.accept(HellscraftModBlocks.CHEESE_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.CHEESE_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.CHEESE_FENCE.get().asItem());
			tabData.accept(HellscraftModItems.CHOCOLATE_MILK.get());
			tabData.accept(HellscraftModItems.VILLAGER_MEAT.get());
			tabData.accept(HellscraftModItems.SEASONED_PORKCHOP.get());
			tabData.accept(HellscraftModItems.STICK_OF_BUTTER.get());
			tabData.accept(HellscraftModItems.CORN.get());
			tabData.accept(HellscraftModItems.POPCORN.get());
			tabData.accept(HellscraftModItems.BUCKET_OF_POPCORN.get());
			tabData.accept(HellscraftModItems.BUTTERED_BUCKET_OF_POPCORN.get());
			tabData.accept(HellscraftModItems.SALTED_BUCKET_OF_POPCORN.get());
			tabData.accept(HellscraftModItems.POPCORN_WITH_BUTTER_AND_SALT.get());
			tabData.accept(HellscraftModItems.CARBONATED_WATER_BOTTLE.get());
			tabData.accept(HellscraftModItems.BOTTLE_OF_PEPSI.get());
			tabData.accept(HellscraftModItems.BUCKET_OF_PILK.get());
			tabData.accept(HellscraftModItems.SALTED_BEEF.get());
			tabData.accept(HellscraftModItems.BEEF_JERKEY.get());
			tabData.accept(HellscraftModBlocks.BLOCK_OF_BREAD.get().asItem());
			tabData.accept(HellscraftModItems.BREAD_SLICE.get());
		}

		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(HellscraftModBlocks.BLOCK_OF_ROTTEN_FLESH.get().asItem());
			tabData.accept(HellscraftModBlocks.BLOCK_OF_VILLAGER.get().asItem());
			tabData.accept(HellscraftModBlocks.QUICKSAND.get().asItem());
			tabData.accept(HellscraftModBlocks.NETHERSPICE_BLOCK.get().asItem());
			tabData.accept(HellscraftModBlocks.GUNK.get().asItem());
			tabData.accept(HellscraftModBlocks.CORN_ORE.get().asItem());
			tabData.accept(HellscraftModBlocks.DEEPERSLATE.get().asItem());
			tabData.accept(HellscraftModBlocks.DEEPERSLATE_DIAMOND_ORE.get().asItem());
			tabData.accept(HellscraftModBlocks.DEEPERSLATE_IRON_ORE.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKSTEEL_ORE.get().asItem());
			tabData.accept(HellscraftModBlocks.GREENSTONE.get().asItem());
			tabData.accept(HellscraftModBlocks.GREENSTONE_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.GREENSTONE_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.GREENSTONE_BRICKS.get().asItem());
			tabData.accept(HellscraftModBlocks.GREENSTONE_BRICK_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.GREENSTONE_BRICK_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.GREENSTONE_BRICK_WALL.get().asItem());
			tabData.accept(HellscraftModBlocks.SMOOTH_GREENSTONE.get().asItem());
			tabData.accept(HellscraftModBlocks.SMOOTH_GREENSTONE_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.CHISELED_GREENSTONE_BRICKS.get().asItem());
			tabData.accept(HellscraftModBlocks.COOLER_GREENSTONE.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_NYLIUM.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_STEM.get().asItem());
			tabData.accept(HellscraftModBlocks.STRIPPED_PISS_STEM.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_WART_BLOCK.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_ROOTS.get().asItem());
			tabData.accept(HellscraftModBlocks.PISS_MUSHROOM.get().asItem());
			tabData.accept(HellscraftModBlocks.KIDNEYSTONE.get().asItem());
			tabData.accept(HellscraftModBlocks.DARKWOOD_LOG.get().asItem());
			tabData.accept(HellscraftModBlocks.SPAWN_EGG_ORE.get().asItem());
			tabData.accept(HellscraftModBlocks.DEEPSLATE_SPAWN_EGG_ORE.get().asItem());
			tabData.accept(HellscraftModBlocks.ROCK_SALT.get().asItem());
			tabData.accept(HellscraftModBlocks.ROCK_BUTTER.get().asItem());
			tabData.accept(HellscraftModBlocks.BISMUTH.get().asItem());
			tabData.accept(HellscraftModBlocks.CHUCKITE.get().asItem());
			tabData.accept(HellscraftModBlocks.CHUCKITE_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.CHUCKITE_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_CHUCKITE.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_CHUCKITE_SLAB.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_CHUCKITE_STAIRS.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_KIDNEYSTONE.get().asItem());
			tabData.accept(HellscraftModBlocks.KIDNEYSTONE_BRICKS.get().asItem());
			tabData.accept(HellscraftModBlocks.CRACKED_KIDNEYSTONE_BRICKS.get().asItem());
			tabData.accept(HellscraftModBlocks.CHISELED_KIDNEYSTONE.get().asItem());
			tabData.accept(HellscraftModBlocks.ENDGRANITE.get().asItem());
			tabData.accept(HellscraftModBlocks.ENDIORITE.get().asItem());
			tabData.accept(HellscraftModBlocks.ENDERSITE.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_ENDGRANITE.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_ENDIORITE.get().asItem());
			tabData.accept(HellscraftModBlocks.POLISHED_ENDERSITE.get().asItem());
		}

		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(HellscraftModItems.CHEESED_PICKAXE.get());
			tabData.accept(HellscraftModItems.CHEESED_AXE.get());
			tabData.accept(HellscraftModItems.CHEESED_SHOVEL.get());
			tabData.accept(HellscraftModItems.CHEESED_HOE.get());
			tabData.accept(HellscraftModItems.FISHMETAL_PICKAXE.get());
			tabData.accept(HellscraftModItems.FISHMETAL_AXE.get());
			tabData.accept(HellscraftModItems.FISHMETAL_SHOVEL.get());
			tabData.accept(HellscraftModItems.FISHMETAL_HOE.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_PICKAXE.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_AXE.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_SHOVEL.get());
			tabData.accept(HellscraftModItems.DARKSTEEL_HOE.get());
			tabData.accept(HellscraftModItems.TOTEM_OF_DYING.get());
			tabData.accept(HellscraftModItems.BREAD_KNIFE.get());
			tabData.accept(HellscraftModItems.LAVA_AXE.get());
		}
	}
}
