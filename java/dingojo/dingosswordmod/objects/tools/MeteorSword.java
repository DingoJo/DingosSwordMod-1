package dingojo.dingosswordmod.objects.tools;

import dingojo.dingosswordmod.Main;
import dingojo.dingosswordmod.init.ItemInit;
import dingojo.dingosswordmod.objects.items.ItemBase;
import dingojo.dingosswordmod.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class MeteorSword extends ItemSword implements IHasModel
{

	public MeteorSword(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntityLargeFireball meteor = new EntityLargeFireball(worldIn, playerIn, 1,1,1);
		
		meteor.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY + aim.y * 1.5D, playerIn.posZ + aim.z * 1.5D);
		meteor.accelerationX = aim.x * 0.1; meteor.accelerationY = aim.y * 0.1; meteor.accelerationZ = aim.z * 0.1;
		worldIn.spawnEntity(meteor);
		
		item.damageItem(5, playerIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
}
