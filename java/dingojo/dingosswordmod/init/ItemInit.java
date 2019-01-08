package dingojo.dingosswordmod.init;

import java.util.ArrayList;
import java.util.List;

import dingojo.dingosswordmod.objects.items.ItemBase;
import dingojo.dingosswordmod.objects.tools.MeteorSword;
import dingojo.dingosswordmod.objects.tools.ToolSword;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials - name, harvestLevel, maxUses, efficiency, damage, enchantability
	//WOOD(0, 59, 2.0F, 0.0F, 15),
	//STONE(1, 131, 4.0F, 1.0F, 5),
	//IRON(2, 250, 6.0F, 2.0F, 14),
	//DIAMOND(3, 1561, 8.0F, 3.0F, 10),
	//GOLD(0, 32, 12.0F, 0.0F, 22);
	
	public static final ToolMaterial TOOL_CRYSTAL_GOLD = EnumHelper.addToolMaterial("tool_crystal_gold", 4, 2242, 10.0F, 6.0F, 30);
	public static final ToolMaterial TOOL_CRYSTAL_OBSIDIAN = EnumHelper.addToolMaterial("tool_crystal_obsidian", 4, 3574, 8.0F, 7.0F, 25);
	public static final ToolMaterial TOOL_WATER_CRYSTAL_GOLD = EnumHelper.addToolMaterial("tool_water_crystal_gold", 5, 3286, 8.0F, 8.0F, 32);
	public static final ToolMaterial TOOL_WATER_CRYSTAL_OBSIDIAN = EnumHelper.addToolMaterial("tool_water_crystal_obsidian", 5, 4143, 9.0F, 9.0F, 40);
	public static final ToolMaterial TOOL_CRYSTAL_BLAZE = EnumHelper.addToolMaterial("tool_crystal_blaze", 6, 4897, 10.0F, 11.5F, 35);
	public static final ToolMaterial TOOL_CRYSTAL_WITHER = EnumHelper.addToolMaterial("tool_crystal_wither", 6, 5839, 11.0F, 21.5F, 48);
	
	public static final ToolMaterial TOOL_HARD_STONE_A = EnumHelper.addToolMaterial("tool_hard_stone_a", 2, 864, 4.5F, 2.0F, 7);
	public static final ToolMaterial TOOL_HARD_STONE_B = EnumHelper.addToolMaterial("tool_hard_stone_b", 3, 1564, 7.0F, 3.0F, 10);
	
	public static final ToolMaterial TOOL_METEOR = EnumHelper.addToolMaterial("tool_meteor", 4, 6330, 7.0F, 4.0F, 10);
	
	//Items
	public static final Item OBSIDIAN_DUST = new ItemBase("obsidian_dust");
	
	public static final Item AMBER = new ItemBase("amber");
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item DEMONIC_CRYSTAL = new ItemBase("demonic_crystal");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item TOPAZ = new ItemBase("topaz");
	public static final Item WATER_CRYSTAL = new ItemBase("water_crystal");
	
	public static final Item GOLD_HANDLE = new ItemBase("gold_handle");
	public static final Item OBSIDIAN_HANDLE = new ItemBase("obsidian_handle");
	public static final Item BLAZE_HANDLE = new ItemBase("blaze_handle");
	public static final Item WITHER_HANDLE = new ItemBase("wither_handle");
	
	public static final Item EMERALD_BLADE = new ItemBase("emerald_blade");
	public static final Item AMBER_BLADE = new ItemBase("amber_blade");
	public static final Item AMETHYST_BLADE = new ItemBase("amethyst_blade");
	public static final Item DEMONIC_BLADE = new ItemBase("demonic_blade");
	public static final Item DIAMOND_BLADE = new ItemBase("diamond_blade");
	public static final Item RUBY_BLADE = new ItemBase("ruby_blade");
	public static final Item SAPPHIRE_BLADE = new ItemBase("sapphire_blade");
	public static final Item TOPAZ_BLADE = new ItemBase("topaz_blade");
	public static final Item WATER_CRYSTAL_BLADE = new ItemBase("water_crystal_blade");
	
	//Tools
	public static final Item AMBER_SWORD_GOLD = new ToolSword("amber_sword_gold", TOOL_CRYSTAL_GOLD);
	public static final Item AMBER_SWORD_OBSIDIAN = new ToolSword("amber_sword_obsidian", TOOL_CRYSTAL_OBSIDIAN);
	public static final Item AMETHYST_SWORD_GOLD = new ToolSword("amethyst_sword_gold", TOOL_CRYSTAL_GOLD);
	public static final Item AMETHYST_SWORD_OBSIDIAN = new ToolSword("amethyst_sword_obsidian", TOOL_CRYSTAL_OBSIDIAN);
	public static final Item DEMONIC_SWORD_BLAZE = new ToolSword("demonic_sword_blaze", TOOL_CRYSTAL_BLAZE);
	public static final Item DEMONIC_SWORD_WITHER = new ToolSword("demonic_sword_wither", TOOL_CRYSTAL_WITHER);
	public static final Item DIAMOND_SWORD_GOLD = new ToolSword("diamond_sword_gold", TOOL_CRYSTAL_GOLD);
	public static final Item DIAMOND_SWORD_OBSIDIAN = new ToolSword("diamond_sword_obsidian", TOOL_CRYSTAL_OBSIDIAN);
	public static final Item EMERALD_SWORD_GOLD = new ToolSword("emerald_sword_gold", TOOL_CRYSTAL_GOLD);
	public static final Item EMERALD_SWORD_OBSIDIAN = new ToolSword("emerald_sword_obsidian", TOOL_CRYSTAL_OBSIDIAN);
	public static final Item RUBY_SWORD_GOLD = new ToolSword("ruby_sword_gold", TOOL_CRYSTAL_GOLD);
	public static final Item RUBY_SWORD_OBSIDIAN = new ToolSword("ruby_sword_obsidian", TOOL_CRYSTAL_OBSIDIAN);
	public static final Item SAPPHIRE_SWORD_GOLD = new ToolSword("sapphire_sword_gold", TOOL_CRYSTAL_GOLD);
	public static final Item SAPPHIRE_SWORD_OBSIDIAN = new ToolSword("sapphire_sword_obsidian", TOOL_CRYSTAL_OBSIDIAN);
	public static final Item TOPAZ_SWORD_GOLD = new ToolSword("topaz_sword_gold", TOOL_CRYSTAL_GOLD);
	public static final Item TOPAZ_SWORD_OBSIDIAN = new ToolSword("topaz_sword_obsidian", TOOL_CRYSTAL_OBSIDIAN);
	public static final Item WATER_CRYSTAL_SWORD_GOLD = new ToolSword("water_crystal_sword_gold", TOOL_WATER_CRYSTAL_GOLD);
	public static final Item WATER_CRYSTAL_SWORD_OBSIDIAN = new ToolSword("water_crystal_sword_obsidian", TOOL_WATER_CRYSTAL_OBSIDIAN);
	
	public static final Item FALLEN_METEOR = new MeteorSword("fallen_meteor", TOOL_METEOR);
}