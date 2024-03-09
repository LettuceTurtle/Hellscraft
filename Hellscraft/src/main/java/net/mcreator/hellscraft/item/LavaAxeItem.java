
package net.mcreator.hellscraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;



import net.mcreator.hellscraft.init.HellscraftModItems;
import net.mcreator.hellscraft.init.HellscraftModEntities;


import java.util.List;
import org.joml.Vector3d;

public class LavaAxeItem extends AxeItem {
	//TODO:
	//Implement durability loss on throw
	//Move throw origin to hand
	//Inflict fire damage
	//Figure out how to turn projectile
	public LavaAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.LAVA_BUCKET));
			}
			
		}, 1, -3f, new Item.Properties());
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 1000;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = InteractionResultHolder.success(entity.getItemInHand(hand));
		entity.startUsingItem(hand);
		return ar;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time){
		throwAxe(world, entity.xo, entity.yo, entity.zo, itemstack, entity, time);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		entity.setSecondsOnFire(5);
		return retval;
	}


	private void throwAxe(LevelAccessor world, double x, double y, double z, ItemStack itemstack, Entity entity, int charge) {
		if (entity == null || 1000 - charge <= 5)
			return;
		//setDamage(itemstack, getDamage(itemstack) - 5);
		double yaw = 0;
		double magnitude = 0; 
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == HellscraftModItems.LAVA_AXE.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 5);
			yaw = (entity.getYRot() + 0) * (Math.PI / (-180));
			if ((1000 - charge) >= 50) {
				magnitude = 1.5;
			} else {
				magnitude = (1000 - charge) * (.03f);
			}
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = HellscraftModEntities.LAVA_AXE_PROJECTILE.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					itemstack.setDamageValue(itemstack.getDamageValue() + 2);
					entityToSpawn.setYRot((float) (Math.PI / 2));
					entityToSpawn.setYBodyRot((float) (Math.PI / 2));
					entityToSpawn.setYHeadRot((float) (Math.PI / 2));
					entityToSpawn.setDeltaMovement((entity.getLookAngle().x * magnitude) + (entity.xo - entity.xOld),
					(entity.getLookAngle().y + 0.2) + (entity.yo - entity.yOld),
					(entity.getLookAngle().z * magnitude) + (entity.zo - entity.zOld));
				}
			}
		}
	}
}
