package dingojo.dingosswordmod.init;

import java.util.ArrayList;
import java.util.List;

import dingojo.dingosswordmod.objects.blocks.BlockOres;
import dingojo.dingosswordmod.objects.blocks.machines.smelter.BlockSmeltingForge;
import net.minecraft.block.Block;

public class BlockInit
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block SMELTING_FORGE = new BlockSmeltingForge("smelting_forge");
	
	public static final Block ORE_NETHER = new BlockOres("ore_nether", "nether");
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
}
