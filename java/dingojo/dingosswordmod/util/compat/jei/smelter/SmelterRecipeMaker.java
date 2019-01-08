package dingojo.dingosswordmod.util.compat.jei.smelter;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.Lists;
import com.google.common.collect.Table;

import dingojo.dingosswordmod.objects.blocks.machines.smelter.SmeltingForgeRecipes;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;

public class SmelterRecipeMaker
{
	public static List<SmelterRecipe> getRecipes(IJeiHelpers helpers)
	{
		IStackHelper stackHelper = helpers.getStackHelper();
		SmeltingForgeRecipes instance = SmeltingForgeRecipes.getInstance();
		Table<ItemStack, ItemStack, ItemStack> recipes = instance.getDualSmeltingList();
		List<SmelterRecipe> jeiRecipes = Lists.newArrayList();
		
		for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : recipes.columnMap().entrySet())
		{
			for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
			{
				ItemStack input1 = entry.getKey();
				ItemStack input2 = ent.getKey();
				ItemStack output = ent.getValue();
				List<ItemStack> inputs = Lists.newArrayList(input1, input2);
				SmelterRecipe recipe = new SmelterRecipe(inputs, output);
				jeiRecipes.add(recipe);
			}
		}
		
		return jeiRecipes;
	}
}
