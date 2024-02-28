
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.hellscraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HellscraftModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == HellscraftModVillagerProfessions.NECROMANCER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(Items.BONE, 8), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(HellscraftModBlocks.BLOCK_OF_ROTTEN_FLESH.get(), 3),

					new ItemStack(Items.EMERALD), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.SALMON), new ItemStack(Items.SALMON_BUCKET), 10, 7, 0.075f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Items.COD), new ItemStack(Items.COD_BUCKET), 2, 7, 0.075f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(Items.SPIDER_EYE), 20, 6, 0.025f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(HellscraftModItems.VILLAGER_MEAT.get()),

					new ItemStack(Items.EMERALD, 6), 8, 10, 0.075f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.BONE, 64), new ItemStack(Items.EMERALD, 20), new ItemStack(Items.SKELETON_SPAWN_EGG), 1, 10, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.ROTTEN_FLESH, 64), new ItemStack(Items.EMERALD, 20), new ItemStack(Items.ZOMBIE_SPAWN_EGG), 1, 10, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(HellscraftModBlocks.BLOCK_OF_ROTTEN_FLESH.get()), new ItemStack(Items.EMERALD, 6), new ItemStack(Blocks.ZOMBIE_HEAD), 2, 8, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(HellscraftModBlocks.BLOCK_OF_ROTTEN_FLESH.get()), new ItemStack(Items.EMERALD, 6), new ItemStack(Blocks.SKELETON_SKULL), 2, 85, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(HellscraftModBlocks.BLOCK_OF_ROTTEN_FLESH.get()), new ItemStack(Items.EMERALD, 6), new ItemStack(Blocks.CREEPER_HEAD), 2, 8, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(HellscraftModBlocks.BLOCK_OF_ROTTEN_FLESH.get()), new ItemStack(Items.EMERALD, 6), new ItemStack(Blocks.PIGLIN_HEAD), 2, 8, 0.1f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.IRON_BLOCK), new ItemStack(Items.EMERALD, 40), new ItemStack(Blocks.SPAWNER), 1, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64),

					new ItemStack(Items.TOTEM_OF_UNDYING), 1, 5, 0.05f));
		}
	}
}
