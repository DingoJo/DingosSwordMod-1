package dingojo.dingosswordmod.util.handlers;

import dingojo.dingosswordmod.objects.blocks.machines.smelter.ContainerSmeltingForge;
import dingojo.dingosswordmod.objects.blocks.machines.smelter.GuiSmeltingForge;
import dingojo.dingosswordmod.objects.blocks.machines.smelter.TileEntitySmeltingForge;
import dingojo.dingosswordmod.util.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == ConfigHandler.GUI_SMELTING_FORGE) return new ContainerSmeltingForge(player.inventory, (TileEntitySmeltingForge)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == ConfigHandler.GUI_SMELTING_FORGE) return new GuiSmeltingForge(player.inventory, (TileEntitySmeltingForge)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}