
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hellscraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.hellscraft.item.WoodenJavelinItem;
import net.mcreator.hellscraft.item.VillagerMeatItem;
import net.mcreator.hellscraft.item.TridentShardItem;
import net.mcreator.hellscraft.item.TotemOfDyingItem;
import net.mcreator.hellscraft.item.StoneJavelinItem;
import net.mcreator.hellscraft.item.StickOfButterItem;
import net.mcreator.hellscraft.item.SeasonedPorkchopItem;
import net.mcreator.hellscraft.item.SaltedBucketOfPopcornItem;
import net.mcreator.hellscraft.item.SaltedBeefItem;
import net.mcreator.hellscraft.item.SaltItem;
import net.mcreator.hellscraft.item.RawUraniumItem;
import net.mcreator.hellscraft.item.RawDarksteelItem;
import net.mcreator.hellscraft.item.PopcornWithButterAndSaltItem;
import net.mcreator.hellscraft.item.PopcornItem;
import net.mcreator.hellscraft.item.PinkSaltItem;
import net.mcreator.hellscraft.item.NetherspiceItem;
import net.mcreator.hellscraft.item.NetherpulpItem;
import net.mcreator.hellscraft.item.NetheriteJavelinItem;
import net.mcreator.hellscraft.item.LavaAxeItem;
import net.mcreator.hellscraft.item.IronJavelinItem;
import net.mcreator.hellscraft.item.GoldJavelinItem;
import net.mcreator.hellscraft.item.FishmetalSwordItem;
import net.mcreator.hellscraft.item.FishmetalShovelItem;
import net.mcreator.hellscraft.item.FishmetalPickaxeItem;
import net.mcreator.hellscraft.item.FishmetalJavelinItem;
import net.mcreator.hellscraft.item.FishmetalIngotItem;
import net.mcreator.hellscraft.item.FishmetalHoeItem;
import net.mcreator.hellscraft.item.FishmetalAxeItem;
import net.mcreator.hellscraft.item.FishmetalArmorItem;
import net.mcreator.hellscraft.item.FireballWandItem;
import net.mcreator.hellscraft.item.EndFluidItem;
import net.mcreator.hellscraft.item.DiamondJavelinItem;
import net.mcreator.hellscraft.item.DarksteelSwordItem;
import net.mcreator.hellscraft.item.DarksteelShovelItem;
import net.mcreator.hellscraft.item.DarksteelShieldItem;
import net.mcreator.hellscraft.item.DarksteelPickaxeItem;
import net.mcreator.hellscraft.item.DarksteelJavelinItem;
import net.mcreator.hellscraft.item.DarksteelIngotItem;
import net.mcreator.hellscraft.item.DarksteelHoeItem;
import net.mcreator.hellscraft.item.DarksteelAxeItem;
import net.mcreator.hellscraft.item.DarksteelArmorItem;
import net.mcreator.hellscraft.item.CornItem;
import net.mcreator.hellscraft.item.ChocolateMilkItem;
import net.mcreator.hellscraft.item.CheesedSwordItem;
import net.mcreator.hellscraft.item.CheesedShovelItem;
import net.mcreator.hellscraft.item.CheesedPickaxeItem;
import net.mcreator.hellscraft.item.CheesedHoeItem;
import net.mcreator.hellscraft.item.CheesedAxeItem;
import net.mcreator.hellscraft.item.CheesedArmorItem;
import net.mcreator.hellscraft.item.CheeseJavelinItem;
import net.mcreator.hellscraft.item.CheeseItem;
import net.mcreator.hellscraft.item.CarbonatedWaterBottleItem;
import net.mcreator.hellscraft.item.ButteredBucketOfPopcornItem;
import net.mcreator.hellscraft.item.BucketOfPopcornItem;
import net.mcreator.hellscraft.item.BucketOfPilkItem;
import net.mcreator.hellscraft.item.BreadSliceItem;
import net.mcreator.hellscraft.item.BreadKnifeItem;
import net.mcreator.hellscraft.item.BottleOfPepsiItem;
import net.mcreator.hellscraft.item.BeefSandwhichItem;
import net.mcreator.hellscraft.item.BeefJerkeyItem;
import net.mcreator.hellscraft.HellscraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class HellscraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HellscraftMod.MODID);
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> BLOCK_OF_CHEESE = block(HellscraftModBlocks.BLOCK_OF_CHEESE);
	public static final RegistryObject<Item> CHEESE_SLAB = block(HellscraftModBlocks.CHEESE_SLAB);
	public static final RegistryObject<Item> CHEESE_STAIRS = block(HellscraftModBlocks.CHEESE_STAIRS);
	public static final RegistryObject<Item> CHEESE_FENCE = block(HellscraftModBlocks.CHEESE_FENCE);
	public static final RegistryObject<Item> CHOCOLATE_MILK = REGISTRY.register("chocolate_milk", () -> new ChocolateMilkItem());
	public static final RegistryObject<Item> VILLAGER_MEAT = REGISTRY.register("villager_meat", () -> new VillagerMeatItem());
	public static final RegistryObject<Item> SEASONED_PORKCHOP = REGISTRY.register("seasoned_porkchop", () -> new SeasonedPorkchopItem());
	public static final RegistryObject<Item> STICK_OF_BUTTER = REGISTRY.register("stick_of_butter", () -> new StickOfButterItem());
	public static final RegistryObject<Item> CORN = REGISTRY.register("corn", () -> new CornItem());
	public static final RegistryObject<Item> POPCORN = REGISTRY.register("popcorn", () -> new PopcornItem());
	public static final RegistryObject<Item> BUCKET_OF_POPCORN = REGISTRY.register("bucket_of_popcorn", () -> new BucketOfPopcornItem());
	public static final RegistryObject<Item> BUTTERED_BUCKET_OF_POPCORN = REGISTRY.register("buttered_bucket_of_popcorn", () -> new ButteredBucketOfPopcornItem());
	public static final RegistryObject<Item> SALTED_BUCKET_OF_POPCORN = REGISTRY.register("salted_bucket_of_popcorn", () -> new SaltedBucketOfPopcornItem());
	public static final RegistryObject<Item> POPCORN_WITH_BUTTER_AND_SALT = REGISTRY.register("popcorn_with_butter_and_salt", () -> new PopcornWithButterAndSaltItem());
	public static final RegistryObject<Item> CARBONATED_WATER_BOTTLE = REGISTRY.register("carbonated_water_bottle", () -> new CarbonatedWaterBottleItem());
	public static final RegistryObject<Item> BOTTLE_OF_PEPSI = REGISTRY.register("bottle_of_pepsi", () -> new BottleOfPepsiItem());
	public static final RegistryObject<Item> BUCKET_OF_PILK = REGISTRY.register("bucket_of_pilk", () -> new BucketOfPilkItem());
	public static final RegistryObject<Item> PRESS = block(HellscraftModBlocks.PRESS);
	public static final RegistryObject<Item> AGING_BARREL = block(HellscraftModBlocks.AGING_BARREL);
	public static final RegistryObject<Item> BLOCK_OF_ROTTEN_FLESH = block(HellscraftModBlocks.BLOCK_OF_ROTTEN_FLESH);
	public static final RegistryObject<Item> BLOCK_OF_VILLAGER = block(HellscraftModBlocks.BLOCK_OF_VILLAGER);
	public static final RegistryObject<Item> QUICKSAND = block(HellscraftModBlocks.QUICKSAND);
	public static final RegistryObject<Item> NETHERSPICE_BLOCK = block(HellscraftModBlocks.NETHERSPICE_BLOCK);
	public static final RegistryObject<Item> GUNK = block(HellscraftModBlocks.GUNK);
	public static final RegistryObject<Item> CORN_ORE = block(HellscraftModBlocks.CORN_ORE);
	public static final RegistryObject<Item> DEEPERSLATE = block(HellscraftModBlocks.DEEPERSLATE);
	public static final RegistryObject<Item> DEEPERSLATE_DIAMOND_ORE = block(HellscraftModBlocks.DEEPERSLATE_DIAMOND_ORE);
	public static final RegistryObject<Item> DEEPERSLATE_IRON_ORE = block(HellscraftModBlocks.DEEPERSLATE_IRON_ORE);
	public static final RegistryObject<Item> DARKSTEEL_ORE = block(HellscraftModBlocks.DARKSTEEL_ORE);
	public static final RegistryObject<Item> GREENSTONE = block(HellscraftModBlocks.GREENSTONE);
	public static final RegistryObject<Item> GREENSTONE_SLAB = block(HellscraftModBlocks.GREENSTONE_SLAB);
	public static final RegistryObject<Item> GREENSTONE_STAIRS = block(HellscraftModBlocks.GREENSTONE_STAIRS);
	public static final RegistryObject<Item> GREENSTONE_BRICKS = block(HellscraftModBlocks.GREENSTONE_BRICKS);
	public static final RegistryObject<Item> GREENSTONE_BRICK_SLAB = block(HellscraftModBlocks.GREENSTONE_BRICK_SLAB);
	public static final RegistryObject<Item> GREENSTONE_BRICK_STAIRS = block(HellscraftModBlocks.GREENSTONE_BRICK_STAIRS);
	public static final RegistryObject<Item> GREENSTONE_BRICK_WALL = block(HellscraftModBlocks.GREENSTONE_BRICK_WALL);
	public static final RegistryObject<Item> SMOOTH_GREENSTONE = block(HellscraftModBlocks.SMOOTH_GREENSTONE);
	public static final RegistryObject<Item> SMOOTH_GREENSTONE_SLAB = block(HellscraftModBlocks.SMOOTH_GREENSTONE_SLAB);
	public static final RegistryObject<Item> CHISELED_GREENSTONE_BRICKS = block(HellscraftModBlocks.CHISELED_GREENSTONE_BRICKS);
	public static final RegistryObject<Item> COOLER_GREENSTONE = block(HellscraftModBlocks.COOLER_GREENSTONE);
	public static final RegistryObject<Item> PISS_NYLIUM = block(HellscraftModBlocks.PISS_NYLIUM);
	public static final RegistryObject<Item> PISS_STEM = block(HellscraftModBlocks.PISS_STEM);
	public static final RegistryObject<Item> STRIPPED_PISS_STEM = block(HellscraftModBlocks.STRIPPED_PISS_STEM);
	public static final RegistryObject<Item> PISS_WART_BLOCK = block(HellscraftModBlocks.PISS_WART_BLOCK);
	public static final RegistryObject<Item> PISS_ROOTS = block(HellscraftModBlocks.PISS_ROOTS);
	public static final RegistryObject<Item> PISS_MUSHROOM = block(HellscraftModBlocks.PISS_MUSHROOM);
	public static final RegistryObject<Item> KIDNEYSTONE = block(HellscraftModBlocks.KIDNEYSTONE);
	public static final RegistryObject<Item> DARKWOOD_LOG = block(HellscraftModBlocks.DARKWOOD_LOG);
	public static final RegistryObject<Item> SPAWN_EGG_ORE = block(HellscraftModBlocks.SPAWN_EGG_ORE);
	public static final RegistryObject<Item> DEEPSLATE_SPAWN_EGG_ORE = block(HellscraftModBlocks.DEEPSLATE_SPAWN_EGG_ORE);
	public static final RegistryObject<Item> ROCK_SALT = block(HellscraftModBlocks.ROCK_SALT);
	public static final RegistryObject<Item> ROCK_BUTTER = block(HellscraftModBlocks.ROCK_BUTTER);
	public static final RegistryObject<Item> CHEESED_PICKAXE = REGISTRY.register("cheesed_pickaxe", () -> new CheesedPickaxeItem());
	public static final RegistryObject<Item> CHEESED_AXE = REGISTRY.register("cheesed_axe", () -> new CheesedAxeItem());
	public static final RegistryObject<Item> CHEESED_SHOVEL = REGISTRY.register("cheesed_shovel", () -> new CheesedShovelItem());
	public static final RegistryObject<Item> CHEESED_HOE = REGISTRY.register("cheesed_hoe", () -> new CheesedHoeItem());
	public static final RegistryObject<Item> FISHMETAL_PICKAXE = REGISTRY.register("fishmetal_pickaxe", () -> new FishmetalPickaxeItem());
	public static final RegistryObject<Item> FISHMETAL_AXE = REGISTRY.register("fishmetal_axe", () -> new FishmetalAxeItem());
	public static final RegistryObject<Item> FISHMETAL_SHOVEL = REGISTRY.register("fishmetal_shovel", () -> new FishmetalShovelItem());
	public static final RegistryObject<Item> FISHMETAL_HOE = REGISTRY.register("fishmetal_hoe", () -> new FishmetalHoeItem());
	public static final RegistryObject<Item> DARKSTEEL_PICKAXE = REGISTRY.register("darksteel_pickaxe", () -> new DarksteelPickaxeItem());
	public static final RegistryObject<Item> DARKSTEEL_AXE = REGISTRY.register("darksteel_axe", () -> new DarksteelAxeItem());
	public static final RegistryObject<Item> DARKSTEEL_SHOVEL = REGISTRY.register("darksteel_shovel", () -> new DarksteelShovelItem());
	public static final RegistryObject<Item> DARKSTEEL_HOE = REGISTRY.register("darksteel_hoe", () -> new DarksteelHoeItem());
	public static final RegistryObject<Item> TOTEM_OF_DYING = REGISTRY.register("totem_of_dying", () -> new TotemOfDyingItem());
	public static final RegistryObject<Item> CHEESED_SWORD = REGISTRY.register("cheesed_sword", () -> new CheesedSwordItem());
	public static final RegistryObject<Item> CHEESED_ARMOR_HELMET = REGISTRY.register("cheesed_armor_helmet", () -> new CheesedArmorItem.Helmet());
	public static final RegistryObject<Item> CHEESED_ARMOR_CHESTPLATE = REGISTRY.register("cheesed_armor_chestplate", () -> new CheesedArmorItem.Chestplate());
	public static final RegistryObject<Item> CHEESED_ARMOR_LEGGINGS = REGISTRY.register("cheesed_armor_leggings", () -> new CheesedArmorItem.Leggings());
	public static final RegistryObject<Item> CHEESED_ARMOR_BOOTS = REGISTRY.register("cheesed_armor_boots", () -> new CheesedArmorItem.Boots());
	public static final RegistryObject<Item> FISHMETAL_SWORD = REGISTRY.register("fishmetal_sword", () -> new FishmetalSwordItem());
	public static final RegistryObject<Item> FISHMETAL_ARMOR_HELMET = REGISTRY.register("fishmetal_armor_helmet", () -> new FishmetalArmorItem.Helmet());
	public static final RegistryObject<Item> FISHMETAL_ARMOR_CHESTPLATE = REGISTRY.register("fishmetal_armor_chestplate", () -> new FishmetalArmorItem.Chestplate());
	public static final RegistryObject<Item> FISHMETAL_ARMOR_LEGGINGS = REGISTRY.register("fishmetal_armor_leggings", () -> new FishmetalArmorItem.Leggings());
	public static final RegistryObject<Item> FISHMETAL_ARMOR_BOOTS = REGISTRY.register("fishmetal_armor_boots", () -> new FishmetalArmorItem.Boots());
	public static final RegistryObject<Item> DARKSTEEL_SWORD = REGISTRY.register("darksteel_sword", () -> new DarksteelSwordItem());
	public static final RegistryObject<Item> DARKSTEEL_ARMOR_HELMET = REGISTRY.register("darksteel_armor_helmet", () -> new DarksteelArmorItem.Helmet());
	public static final RegistryObject<Item> DARKSTEEL_ARMOR_CHESTPLATE = REGISTRY.register("darksteel_armor_chestplate", () -> new DarksteelArmorItem.Chestplate());
	public static final RegistryObject<Item> DARKSTEEL_ARMOR_LEGGINGS = REGISTRY.register("darksteel_armor_leggings", () -> new DarksteelArmorItem.Leggings());
	public static final RegistryObject<Item> DARKSTEEL_ARMOR_BOOTS = REGISTRY.register("darksteel_armor_boots", () -> new DarksteelArmorItem.Boots());
	public static final RegistryObject<Item> WOODEN_JAVELIN = REGISTRY.register("wooden_javelin", () -> new WoodenJavelinItem());
	public static final RegistryObject<Item> STONE_JAVELIN = REGISTRY.register("stone_javelin", () -> new StoneJavelinItem());
	public static final RegistryObject<Item> IRON_JAVELIN = REGISTRY.register("iron_javelin", () -> new IronJavelinItem());
	public static final RegistryObject<Item> GOLD_JAVELIN = REGISTRY.register("gold_javelin", () -> new GoldJavelinItem());
	public static final RegistryObject<Item> DIAMOND_JAVELIN = REGISTRY.register("diamond_javelin", () -> new DiamondJavelinItem());
	public static final RegistryObject<Item> NETHERITE_JAVELIN = REGISTRY.register("netherite_javelin", () -> new NetheriteJavelinItem());
	public static final RegistryObject<Item> CHEESE_JAVELIN = REGISTRY.register("cheese_javelin", () -> new CheeseJavelinItem());
	public static final RegistryObject<Item> FISHMETAL_JAVELIN = REGISTRY.register("fishmetal_javelin", () -> new FishmetalJavelinItem());
	public static final RegistryObject<Item> DARKSTEEL_JAVELIN = REGISTRY.register("darksteel_javelin", () -> new DarksteelJavelinItem());
	public static final RegistryObject<Item> FISHMETAL_INGOT = REGISTRY.register("fishmetal_ingot", () -> new FishmetalIngotItem());
	public static final RegistryObject<Item> DARKSTEEL_INGOT = REGISTRY.register("darksteel_ingot", () -> new DarksteelIngotItem());
	public static final RegistryObject<Item> RAW_DARKSTEEL = REGISTRY.register("raw_darksteel", () -> new RawDarksteelItem());
	public static final RegistryObject<Item> SALT = REGISTRY.register("salt", () -> new SaltItem());
	public static final RegistryObject<Item> PINK_SALT = REGISTRY.register("pink_salt", () -> new PinkSaltItem());
	public static final RegistryObject<Item> FISHMETAL_BLOCK = block(HellscraftModBlocks.FISHMETAL_BLOCK);
	public static final RegistryObject<Item> HARDSPICE = block(HellscraftModBlocks.HARDSPICE);
	public static final RegistryObject<Item> HARDSPICE_SLAB = block(HellscraftModBlocks.HARDSPICE_SLAB);
	public static final RegistryObject<Item> HARDSPICE_STAIRS = block(HellscraftModBlocks.HARDSPICE_STAIRS);
	public static final RegistryObject<Item> HARDSPICE_BRICKS = block(HellscraftModBlocks.HARDSPICE_BRICKS);
	public static final RegistryObject<Item> HARDSPICE_BRICK_SLAB = block(HellscraftModBlocks.HARDSPICE_BRICK_SLAB);
	public static final RegistryObject<Item> HARDSPICE_BRICK_STAIRS = block(HellscraftModBlocks.HARDSPICE_BRICK_STAIRS);
	public static final RegistryObject<Item> HARDSPICE_BRICK_WALL = block(HellscraftModBlocks.HARDSPICE_BRICK_WALL);
	public static final RegistryObject<Item> SMOOTH_HARDSPICE = block(HellscraftModBlocks.SMOOTH_HARDSPICE);
	public static final RegistryObject<Item> SMOOTH_HARDSPICE_SLAB = block(HellscraftModBlocks.SMOOTH_HARDSPICE_SLAB);
	public static final RegistryObject<Item> DARKSTEEL_BLOCK = block(HellscraftModBlocks.DARKSTEEL_BLOCK);
	public static final RegistryObject<Item> PISS_PLANKS = block(HellscraftModBlocks.PISS_PLANKS);
	public static final RegistryObject<Item> PISS_PLANK_SLAB = block(HellscraftModBlocks.PISS_PLANK_SLAB);
	public static final RegistryObject<Item> PISS_PLANK_STAIRS = block(HellscraftModBlocks.PISS_PLANK_STAIRS);
	public static final RegistryObject<Item> PISS_PLANK_FENCE = block(HellscraftModBlocks.PISS_PLANK_FENCE);
	public static final RegistryObject<Item> PISS_PLANK_TRAPDOOR = block(HellscraftModBlocks.PISS_PLANK_TRAPDOOR);
	public static final RegistryObject<Item> PISS_PLANK_DOOR = doubleBlock(HellscraftModBlocks.PISS_PLANK_DOOR);
	public static final RegistryObject<Item> PISS_BUTTON = block(HellscraftModBlocks.PISS_BUTTON);
	public static final RegistryObject<Item> PISS_PRESSURE_PLATE = block(HellscraftModBlocks.PISS_PRESSURE_PLATE);
	public static final RegistryObject<Item> PISS_PLANK_FENCE_GATE = block(HellscraftModBlocks.PISS_PLANK_FENCE_GATE);
	public static final RegistryObject<Item> STRIPPED_DARKWOOD_LOG = block(HellscraftModBlocks.STRIPPED_DARKWOOD_LOG);
	public static final RegistryObject<Item> DARKWOOD_LEAVES = block(HellscraftModBlocks.DARKWOOD_LEAVES);
	public static final RegistryObject<Item> DARKWOOD_PLANKS = block(HellscraftModBlocks.DARKWOOD_PLANKS);
	public static final RegistryObject<Item> DARKWOOD_SLAB = block(HellscraftModBlocks.DARKWOOD_SLAB);
	public static final RegistryObject<Item> DARKWOOD_STAIRS = block(HellscraftModBlocks.DARKWOOD_STAIRS);
	public static final RegistryObject<Item> DARKWOOD_FENCE = block(HellscraftModBlocks.DARKWOOD_FENCE);
	public static final RegistryObject<Item> DARKWOOD_FENCE_GATE = block(HellscraftModBlocks.DARKWOOD_FENCE_GATE);
	public static final RegistryObject<Item> DARKWOOD_TRAPDOOR = block(HellscraftModBlocks.DARKWOOD_TRAPDOOR);
	public static final RegistryObject<Item> DARKWOOD_BUTTON = block(HellscraftModBlocks.DARKWOOD_BUTTON);
	public static final RegistryObject<Item> DARKWOOD_PRESSURE_PLATE = block(HellscraftModBlocks.DARKWOOD_PRESSURE_PLATE);
	public static final RegistryObject<Item> BLOCK_OF_CORN = block(HellscraftModBlocks.BLOCK_OF_CORN);
	public static final RegistryObject<Item> WAXED_BLOCK_OF_CORN = block(HellscraftModBlocks.WAXED_BLOCK_OF_CORN);
	public static final RegistryObject<Item> POLISHED_BLOCK_OF_CORN = block(HellscraftModBlocks.POLISHED_BLOCK_OF_CORN);
	public static final RegistryObject<Item> POLISHED_CORN_SLAB = block(HellscraftModBlocks.POLISHED_CORN_SLAB);
	public static final RegistryObject<Item> POLISHED_CORN_STAIRS = block(HellscraftModBlocks.POLISHED_CORN_STAIRS);
	public static final RegistryObject<Item> POLISHED_CORN_WALL = block(HellscraftModBlocks.POLISHED_CORN_WALL);
	public static final RegistryObject<Item> BLOCK_OF_POPCORN = block(HellscraftModBlocks.BLOCK_OF_POPCORN);
	public static final RegistryObject<Item> POLISHED_BLOCK_OF_POPCORN = block(HellscraftModBlocks.POLISHED_BLOCK_OF_POPCORN);
	public static final RegistryObject<Item> POLISHED_POPCORN_SLAB = block(HellscraftModBlocks.POLISHED_POPCORN_SLAB);
	public static final RegistryObject<Item> POLISHED_POPCORN_STAIRS = block(HellscraftModBlocks.POLISHED_POPCORN_STAIRS);
	public static final RegistryObject<Item> POLISHED_POPCORN_WALL = block(HellscraftModBlocks.POLISHED_POPCORN_WALL);
	public static final RegistryObject<Item> BLOCK_OF_SALT = block(HellscraftModBlocks.BLOCK_OF_SALT);
	public static final RegistryObject<Item> BLOCK_OF_BUTTER = block(HellscraftModBlocks.BLOCK_OF_BUTTER);
	public static final RegistryObject<Item> BLOCK_OF_PINK_SALT = block(HellscraftModBlocks.BLOCK_OF_PINK_SALT);
	public static final RegistryObject<Item> SALT_LAMP = block(HellscraftModBlocks.SALT_LAMP);
	public static final RegistryObject<Item> PRESS_A = block(HellscraftModBlocks.PRESS_A);
	public static final RegistryObject<Item> NETHERSPICE = REGISTRY.register("netherspice", () -> new NetherspiceItem());
	public static final RegistryObject<Item> STONE_BLOCK = block(HellscraftModBlocks.STONE_BLOCK);
	public static final RegistryObject<Item> SALTED_BEEF = REGISTRY.register("salted_beef", () -> new SaltedBeefItem());
	public static final RegistryObject<Item> BEEF_JERKEY = REGISTRY.register("beef_jerkey", () -> new BeefJerkeyItem());
	public static final RegistryObject<Item> BLOCK_OF_BREAD = block(HellscraftModBlocks.BLOCK_OF_BREAD);
	public static final RegistryObject<Item> BREAD_SLICE = REGISTRY.register("bread_slice", () -> new BreadSliceItem());
	public static final RegistryObject<Item> BREAD_KNIFE = REGISTRY.register("bread_knife", () -> new BreadKnifeItem());
	public static final RegistryObject<Item> FIREBALL_WAND = REGISTRY.register("fireball_wand", () -> new FireballWandItem());
	public static final RegistryObject<Item> LAVA_AXE = REGISTRY.register("lava_axe", () -> new LavaAxeItem());
	public static final RegistryObject<Item> BISMUTH = block(HellscraftModBlocks.BISMUTH);
	public static final RegistryObject<Item> CHUCKITE = block(HellscraftModBlocks.CHUCKITE);
	public static final RegistryObject<Item> CHUCKITE_SLAB = block(HellscraftModBlocks.CHUCKITE_SLAB);
	public static final RegistryObject<Item> CHUCKITE_STAIRS = block(HellscraftModBlocks.CHUCKITE_STAIRS);
	public static final RegistryObject<Item> POLISHED_CHUCKITE = block(HellscraftModBlocks.POLISHED_CHUCKITE);
	public static final RegistryObject<Item> POLISHED_CHUCKITE_SLAB = block(HellscraftModBlocks.POLISHED_CHUCKITE_SLAB);
	public static final RegistryObject<Item> POLISHED_CHUCKITE_STAIRS = block(HellscraftModBlocks.POLISHED_CHUCKITE_STAIRS);
	public static final RegistryObject<Item> POLISHED_DEEPERSLATE = block(HellscraftModBlocks.POLISHED_DEEPERSLATE);
	public static final RegistryObject<Item> DEEPERSLATE_BRICKS = block(HellscraftModBlocks.DEEPERSLATE_BRICKS);
	public static final RegistryObject<Item> CHISELED_DEEPERSLATE = block(HellscraftModBlocks.CHISELED_DEEPERSLATE);
	public static final RegistryObject<Item> DEEPERSLATE_BRICK_SLAB = block(HellscraftModBlocks.DEEPERSLATE_BRICK_SLAB);
	public static final RegistryObject<Item> DEEPERSLATE_BRICK_STAIRS = block(HellscraftModBlocks.DEEPERSLATE_BRICK_STAIRS);
	public static final RegistryObject<Item> DEEPERSLATE_BRICK_WALL = block(HellscraftModBlocks.DEEPERSLATE_BRICK_WALL);
	public static final RegistryObject<Item> JEWELED_DEEPERSLATE = block(HellscraftModBlocks.JEWELED_DEEPERSLATE);
	public static final RegistryObject<Item> JEWELED_DEEPERSLATE_BRICKS = block(HellscraftModBlocks.JEWELED_DEEPERSLATE_BRICKS);
	public static final RegistryObject<Item> CHISELED_JEWELED_DEEPERSLATE = block(HellscraftModBlocks.CHISELED_JEWELED_DEEPERSLATE);
	public static final RegistryObject<Item> GILDED_DEEPERSLATE = block(HellscraftModBlocks.GILDED_DEEPERSLATE);
	public static final RegistryObject<Item> GILDED_DEEPERSLATE_BRICKS = block(HellscraftModBlocks.GILDED_DEEPERSLATE_BRICKS);
	public static final RegistryObject<Item> CHISELED_GILDED_DEEPERSLATE = block(HellscraftModBlocks.CHISELED_GILDED_DEEPERSLATE);
	public static final RegistryObject<Item> GALVANIC_DEEPERSLATE = block(HellscraftModBlocks.GALVANIC_DEEPERSLATE);
	public static final RegistryObject<Item> GALVANIC_DEEPERSLATE_BRICKS = block(HellscraftModBlocks.GALVANIC_DEEPERSLATE_BRICKS);
	public static final RegistryObject<Item> CHISLED_GALVANIC_DEEPERSLATE = block(HellscraftModBlocks.CHISLED_GALVANIC_DEEPERSLATE);
	public static final RegistryObject<Item> POLISHED_KIDNEYSTONE = block(HellscraftModBlocks.POLISHED_KIDNEYSTONE);
	public static final RegistryObject<Item> KIDNEYSTONE_BRICKS = block(HellscraftModBlocks.KIDNEYSTONE_BRICKS);
	public static final RegistryObject<Item> CRACKED_KIDNEYSTONE_BRICKS = block(HellscraftModBlocks.CRACKED_KIDNEYSTONE_BRICKS);
	public static final RegistryObject<Item> CHISELED_KIDNEYSTONE = block(HellscraftModBlocks.CHISELED_KIDNEYSTONE);
	public static final RegistryObject<Item> ENDGRANITE = block(HellscraftModBlocks.ENDGRANITE);
	public static final RegistryObject<Item> ENDIORITE = block(HellscraftModBlocks.ENDIORITE);
	public static final RegistryObject<Item> ENDERSITE = block(HellscraftModBlocks.ENDERSITE);
	public static final RegistryObject<Item> END_FLUID_BUCKET = REGISTRY.register("end_fluid_bucket", () -> new EndFluidItem());
	public static final RegistryObject<Item> POLISHED_ENDGRANITE = block(HellscraftModBlocks.POLISHED_ENDGRANITE);
	public static final RegistryObject<Item> POLISHED_ENDIORITE = block(HellscraftModBlocks.POLISHED_ENDIORITE);
	public static final RegistryObject<Item> POLISHED_ENDERSITE = block(HellscraftModBlocks.POLISHED_ENDERSITE);
	public static final RegistryObject<Item> DARKSTEEL_SHIELD = REGISTRY.register("darksteel_shield", () -> new DarksteelShieldItem());
	public static final RegistryObject<Item> TRIDENT_SHARD = REGISTRY.register("trident_shard", () -> new TridentShardItem());
	public static final RegistryObject<Item> GREASE = block(HellscraftModBlocks.GREASE);
	public static final RegistryObject<Item> BEEF_SANDWHICH = REGISTRY.register("beef_sandwhich", () -> new BeefSandwhichItem());
	public static final RegistryObject<Item> RAW_URANIUM = REGISTRY.register("raw_uranium", () -> new RawUraniumItem());
	public static final RegistryObject<Item> URANIUM_ORE = block(HellscraftModBlocks.URANIUM_ORE);
	public static final RegistryObject<Item> DEEPSLATE_URANIUM_ORE = block(HellscraftModBlocks.DEEPSLATE_URANIUM_ORE);
<<<<<<< HEAD
	public static final RegistryObject<Item> BLOCK_OF_CARROT = block(HellscraftModBlocks.BLOCK_OF_CARROT);
	public static final RegistryObject<Item> CARROT_BRICKS = block(HellscraftModBlocks.CARROT_BRICKS);
	public static final RegistryObject<Item> CARROT_BRICK_SLAB = block(HellscraftModBlocks.CARROT_BRICK_SLAB);
	public static final RegistryObject<Item> CARROT_BRICK_STAIRS = block(HellscraftModBlocks.CARROT_BRICK_STAIRS);
	public static final RegistryObject<Item> CARROT_BRICK_WALL = block(HellscraftModBlocks.CARROT_BRICK_WALL);
	public static final RegistryObject<Item> BLOCK_OF_DANDELION = block(HellscraftModBlocks.BLOCK_OF_DANDELION);
	public static final RegistryObject<Item> GRUD = block(HellscraftModBlocks.GRUD);
	public static final RegistryObject<Item> VANTABLOCK = block(HellscraftModBlocks.VANTABLOCK);
	public static final RegistryObject<Item> BLOCK_OF_POPPY = block(HellscraftModBlocks.BLOCK_OF_POPPY);
	public static final RegistryObject<Item> BLOCK_OF_CORNFLOWER = block(HellscraftModBlocks.BLOCK_OF_CORNFLOWER);
	public static final RegistryObject<Item> BLOCK_OF_AZURE_BLUET = block(HellscraftModBlocks.BLOCK_OF_AZURE_BLUET);
	public static final RegistryObject<Item> MUSHRACK = block(HellscraftModBlocks.MUSHRACK);
	public static final RegistryObject<Item> NETHERPULP = REGISTRY.register("netherpulp", () -> new NetherpulpItem());
=======
>>>>>>> faed26da250d48ad7373a19ad2318d6eee44f10e

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(DARKSTEEL_SHIELD.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
