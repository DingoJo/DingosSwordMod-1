package dingojo.dingosswordmod.world.gen;

import java.util.Random;

import dingojo.dingosswordmod.init.BlockInit;
import dingojo.dingosswordmod.objects.blocks.BlockOres;
import dingojo.dingosswordmod.util.handlers.EnumHandler;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	private WorldGenerator ore_overworld_amethyst;
	private WorldGenerator ore_overworld_ruby;
	private WorldGenerator ore_overworld_sapphire;
	private WorldGenerator ore_overworld_topaz;
	private WorldGenerator ore_overworld_water_crystal;
	private WorldGenerator ore_overworld_amber;
	private WorldGenerator ore_nether_demonic_crystal;
	
	public WorldGenCustomOres()
	{
		ore_overworld_amethyst = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.AMETHYST), 6, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_ruby = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.RUBY), 6, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_sapphire = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.SAPPHIRE), 6, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_topaz = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.TOPAZ), 6, BlockMatcher.forBlock(Blocks.STONE));
		ore_overworld_water_crystal = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.WATER_CRYSTAL), 3, BlockMatcher.forBlock(Blocks.SAND));
		ore_overworld_amber = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.AMBER), 2, BlockMatcher.forBlock(Blocks.LOG2));
		ore_nether_demonic_crystal = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOres.VARIANT, EnumHandler.EnumType.DEMONIC_CRYSTAL), 3, BlockMatcher.forBlock(Blocks.SOUL_SAND));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimension())
		{
		case -1:
			
			runGenerator(ore_nether_demonic_crystal, world, random, chunkX, chunkZ, 5, 0, 256);
			
			break;
			
		case 0:
			
			runGenerator(ore_overworld_amethyst, world, random, chunkX, chunkZ, 2, 0, 22);
			runGenerator(ore_overworld_ruby, world, random, chunkX, chunkZ, 2, 0, 22);
			runGenerator(ore_overworld_sapphire, world, random, chunkX, chunkZ, 2, 0, 22);
			runGenerator(ore_overworld_topaz, world, random, chunkX, chunkZ, 2, 0, 22);
			runGenerator(ore_overworld_water_crystal, world, random, chunkX, chunkZ, 4, 0, 100);
			runGenerator(ore_overworld_amber, world, random, chunkX, chunkZ, 5, 0, 256);
		}
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
	}
}
