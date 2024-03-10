package net.mcreator.hellscraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.hellscraft.init.HellscraftModItems;
import net.mcreator.hellscraft.init.HellscraftModBlocks;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

public class PressProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean check = false;
		double itemcheck = 0;
		ItemStack itemcheck0 = ItemStack.EMPTY;
		ItemStack itemcheck1 = ItemStack.EMPTY;
		if (!world.isClientSide()) {
			if (new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 0) > 0 && new Object() {
				public double getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getPersistentData().getDouble(tag);
					return -1;
				}
			}.getValue(world, BlockPos.containing(x, y, z), "wait") == 0 && (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getItem() == Items.WATER_BUCKET && ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == Items.BUCKET || new Object() {
				public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicInteger _retval = new AtomicInteger(0);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
					return _retval.get();
				}
			}.getAmount(world, BlockPos.containing(x, y, z), 3) == 0)) {
				check = false;
				itemcheck = new Object() {
					public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicInteger _retval = new AtomicInteger(0);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
						return _retval.get();
					}
				}.getAmount(world, BlockPos.containing(x, y, z), 1);
				itemcheck0 = (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0));
				itemcheck1 = (new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 1));
				if (itemcheck < 64 && itemcheck0.getItem() == Items.IRON_INGOT && (itemcheck1.getItem() == Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE.asItem() || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if ((itemcheck0.getItem() == Blocks.OBSIDIAN.asItem() || itemcheck0.getItem() == Blocks.RESPAWN_ANCHOR.asItem() || itemcheck0.getItem() == Items.END_CRYSTAL || itemcheck0.getItem() == Blocks.TNT.asItem()
						|| itemcheck0.getItem() == Items.TNT_MINECART || itemcheck0.getItem() == Blocks.CRYING_OBSIDIAN.asItem() || itemcheck0.getItem() == Blocks.BEACON.asItem() || itemcheck0.getItem() == Blocks.ENDER_CHEST.asItem()
						|| itemcheck0.getItem() == Blocks.ENCHANTING_TABLE.asItem()) && itemcheck == 0) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.BLOCK);
				} else if (itemcheck0.getItem() == Blocks.MELON.asItem() && itemcheck == 0) {
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.MELON.defaultBlockState()));
					check = true;
				} else if (itemcheck0.getItem() == HellscraftModBlocks.PRESS.get().asItem() && itemcheck == 0) {
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 12, Level.ExplosionInteraction.BLOCK);
				} else if (itemcheck0.getItem() == Blocks.SLIME_BLOCK.asItem() && itemcheck == 0) {
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.SLIME_BLOCK.defaultBlockState()));
					check = true;
				} else if ((itemcheck0.getItem() == Blocks.PUMPKIN.asItem() || itemcheck0.getItem() == Blocks.CARVED_PUMPKIN.asItem() || itemcheck0.getItem() == Blocks.JACK_O_LANTERN.asItem()) && itemcheck == 0) {
					world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.PUMPKIN.defaultBlockState()));
					check = true;
				} else if (itemcheck < 64 && (itemcheck0.getItem() == Blocks.OAK_PLANKS.asItem() || itemcheck0.getItem() == Blocks.JUNGLE_PLANKS.asItem() || itemcheck0.getItem() == Blocks.SPRUCE_PLANKS.asItem()
						|| itemcheck0.getItem() == Blocks.BIRCH_PLANKS.asItem() || itemcheck0.getItem() == Blocks.ACACIA_PLANKS.asItem() || itemcheck0.getItem() == Blocks.DARK_OAK_PLANKS.asItem()
						|| itemcheck0.getItem() == Blocks.CRIMSON_PLANKS.asItem() || itemcheck0.getItem() == Blocks.WARPED_PLANKS.asItem() || itemcheck0.getItem() == Blocks.MANGROVE_PLANKS.asItem()
						|| itemcheck0.getItem() == Blocks.CHERRY_PLANKS.asItem() || itemcheck0.getItem() == Blocks.BAMBOO_PLANKS.asItem()) && (itemcheck1.getItem() == Items.STICK || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.STICK);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 3));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 64 && (itemcheck0.getItem() == Blocks.SANDSTONE.asItem() || itemcheck0.getItem() == Blocks.CHISELED_SANDSTONE.asItem() || itemcheck0.getItem() == Blocks.CUT_SANDSTONE.asItem()
						|| itemcheck0.getItem() == Blocks.SANDSTONE_STAIRS.asItem() || itemcheck0.getItem() == Blocks.SMOOTH_SANDSTONE.asItem() || itemcheck0.getItem() == Blocks.SMOOTH_SANDSTONE_STAIRS.asItem()
						|| itemcheck0.getItem() == Blocks.SMOOTH_SANDSTONE_SLAB.asItem() || itemcheck0.getItem() == Blocks.CUT_SANDSTONE_SLAB.asItem() || itemcheck0.getItem() == Blocks.SANDSTONE_WALL.asItem()
						|| itemcheck0.getItem() == Blocks.SANDSTONE_SLAB.asItem()) && (itemcheck1.getItem() == Blocks.SAND.asItem() || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Blocks.SAND);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 64 && (itemcheck0.getItem() == Blocks.RED_SANDSTONE.asItem() || itemcheck0.getItem() == Blocks.CHISELED_RED_SANDSTONE.asItem() || itemcheck0.getItem() == Blocks.CUT_RED_SANDSTONE.asItem()
						|| itemcheck0.getItem() == Blocks.RED_SANDSTONE_STAIRS.asItem() || itemcheck0.getItem() == Blocks.SMOOTH_RED_SANDSTONE.asItem() || itemcheck0.getItem() == Blocks.SMOOTH_RED_SANDSTONE_STAIRS.asItem()
						|| itemcheck0.getItem() == Blocks.SMOOTH_RED_SANDSTONE_SLAB.asItem() || itemcheck0.getItem() == Blocks.CUT_RED_SANDSTONE_SLAB.asItem() || itemcheck0.getItem() == Blocks.RED_SANDSTONE_WALL.asItem()
						|| itemcheck0.getItem() == Blocks.RED_SANDSTONE_SLAB.asItem()) && (itemcheck1.getItem() == Blocks.RED_SAND.asItem() || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Blocks.RED_SAND);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 64 && itemcheck0.getItem() == Items.GOLD_INGOT && (itemcheck1.getItem() == Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE.asItem() || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 64 && itemcheck0.getItem() == Blocks.STONE.asItem() && (itemcheck1.getItem() == Blocks.STONE_PRESSURE_PLATE.asItem() || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Blocks.STONE_PRESSURE_PLATE);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 64 && itemcheck0.getItem() == Blocks.POLISHED_BLACKSTONE.asItem() && (itemcheck1.getItem() == Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE.asItem() || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 62 && itemcheck0.getItem() == Items.BONE && (itemcheck1.getItem() == Items.BONE_MEAL || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.BONE_MEAL);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 3));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 56 && itemcheck0.getItem() == Blocks.BONE_BLOCK.asItem() && (itemcheck1.getItem() == Items.BONE_MEAL || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.BONE_MEAL);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 9));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 64 && itemcheck < 64 && (itemcheck0.getItem() == Items.COD || itemcheck0.getItem() == Items.SALMON || itemcheck0.getItem() == Items.TROPICAL_FISH)
						&& (itemcheck1.getItem() == Items.BONE_MEAL || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.BONE_MEAL);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 64 && itemcheck0.getItem() == Blocks.GRAVEL.asItem() && (itemcheck1.getItem() == Items.FLINT || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.FLINT);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 61 && itemcheck0.getItem() == Blocks.MAGMA_BLOCK.asItem() && (itemcheck1.getItem() == Items.MAGMA_CREAM || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.MAGMA_CREAM);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 4));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 61 && itemcheck0.getItem() == Blocks.PRISMARINE.asItem() && (itemcheck1.getItem() == Items.PRISMARINE_SHARD || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.PRISMARINE_SHARD);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 4));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 56 && itemcheck0.getItem() == Blocks.PRISMARINE_BRICKS.asItem() && (itemcheck1.getItem() == Items.PRISMARINE_SHARD || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.PRISMARINE_SHARD);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 9));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 57 && itemcheck0.getItem() == Blocks.DARK_PRISMARINE.asItem() && (itemcheck1.getItem() == Items.PRISMARINE_SHARD || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.PRISMARINE_SHARD);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 8));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 60 && itemcheck0.getItem() == Blocks.SEA_LANTERN.asItem() && (itemcheck1.getItem() == Items.PRISMARINE_CRYSTALS || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.PRISMARINE_CRYSTALS);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 5));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 64 && itemcheck0.getItem() == Items.BUCKET && (itemcheck1.getItem() == Items.IRON_INGOT || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 61 && itemcheck0.getItem() == Blocks.GLOWSTONE.asItem() && (itemcheck1.getItem() == Items.GLOWSTONE_DUST || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.GLOWSTONE_DUST);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 4));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 62 && (itemcheck0.getItem() == Items.REPEATER || itemcheck0.getItem() == Items.COMPARATOR) && (itemcheck1.getItem() == Items.REDSTONE || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(Items.REDSTONE);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 3));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 61 && itemcheck0.getItem() == HellscraftModBlocks.ROCK_SALT.get().asItem() && (itemcheck1.getItem() == HellscraftModItems.SALT.get() || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(HellscraftModItems.SALT.get());
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 3));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				} else if (itemcheck < 56 && itemcheck0.getItem() == HellscraftModBlocks.MUSHRACK.get().asItem() && (itemcheck1.getItem() == HellscraftModItems.NETHERPULP.get() || itemcheck == 0)) {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 1;
							final ItemStack _setstack = new ItemStack(HellscraftModItems.NETHERPULP.get());
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 1) + 8));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					check = true;
				}
				if (check) {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = HellscraftModBlocks.PRESS_A.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 0;
							final int _amount = 1;
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 2;
							final int _amount = 1;
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable) {
									ItemStack _stk = capability.getStackInSlot(_slotid).copy();
									_stk.shrink(_amount);
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _stk);
								}
							});
						}
					}
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 3;
							final ItemStack _setstack = new ItemStack(Items.BUCKET);
							_setstack.setCount((int) (new Object() {
								public int getAmount(LevelAccessor world, BlockPos pos, int slotid) {
									AtomicInteger _retval = new AtomicInteger(0);
									BlockEntity _ent = world.getBlockEntity(pos);
									if (_ent != null)
										_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).getCount()));
									return _retval.get();
								}
							}.getAmount(world, BlockPos.containing(x, y, z), 3) + 1));
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, (float) 0.15, (float) (0.8 + Math.random() * 0.2));
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, (float) 0.15, (float) (0.8 + Math.random() * 0.2), false);
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("wait", 20);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = HellscraftModBlocks.PRESS_A.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
							Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
							if (_property != null && _bs.getValue(_property) != null)
								try {
									_bs = _bs.setValue(_property, (Comparable) entry.getValue());
								} catch (Exception e) {
								}
						}
						BlockEntity _be = world.getBlockEntity(_bp);
						CompoundTag _bnbt = null;
						if (_be != null) {
							_bnbt = _be.saveWithFullMetadata();
							_be.setRemoved();
						}
						world.setBlock(_bp, _bs, 3);
						if (_bnbt != null) {
							_be = world.getBlockEntity(_bp);
							if (_be != null) {
								try {
									_be.load(_bnbt);
								} catch (Exception ignored) {
								}
							}
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.fall")), SoundSource.NEUTRAL, 1, (float) (0.8 + Math.random() * 0.2));
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.fall")), SoundSource.NEUTRAL, 1, (float) (0.8 + Math.random() * 0.2), false);
						}
					}
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getPersistentData().putDouble("wait", 20);
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
		}
	}
}
