package dingojo.dingosswordmod.util.compat.jei.smelter;

import dingojo.dingosswordmod.util.Reference;
import dingojo.dingosswordmod.util.compat.jei.RecipeCategories;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.client.Minecraft;

public class SmelterRecipeCategory extends AbstractSmelterRecipeCategory<SmelterRecipe>
{
	private final IDrawable background;
	private final String name;
	
	public SmelterRecipeCategory(IGuiHelper helper)
	{
		super(helper);
		background = helper.createDrawable(TEXTURES, 0, 0, 176, 84);
		name = "Smelting Forge";
	}
	
	@Override
	public IDrawable getBackground()
	{
		return background;
	}
	
	@Override
	public void drawExtras(Minecraft minecraft)
	{
		animatedFlame.draw(minecraft, 125, 45);
		animatedArrow.draw(minecraft, 33, 28);
	}
	
	@Override
	public String getTitle()
	{
		return name;
	}
	
	@Override
	public String getModName()
	{
		return Reference.NAME;
	}
	
	@Override
	public String getUid()
	{	
		return RecipeCategories.SMELTER;
	}
	
	public void setRecipe(mezz.jei.api.gui.IRecipeLayout recipeLayout, SmelterRecipe recipeWrapper, IIngredients ingredients)
	{
		IGuiItemStackGroup stacks = recipeLayout.getItemStacks();
		stacks.init(input1, true, 28, 10);
		stacks.init(input2, true, 76, 10);
		stacks.init(output, false, 52, 57);
		stacks.set(ingredients);
	}
}
