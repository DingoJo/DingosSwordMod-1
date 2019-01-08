package dingojo.dingosswordmod.util.handlers;

import java.io.File;

import dingojo.dingosswordmod.Main;
import dingojo.dingosswordmod.util.Reference;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler
{
	public static Configuration config;
	
	public static int GUI_SMELTING_FORGE = 0;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "IDs";
		config.addCustomCategoryComment(category, "Set ID for gui");
		GUI_SMELTING_FORGE = config.getInt("Smelting Forge GUI ID", category, 0, 0, 100, "ID for the Smelting Forge GUI");
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		Main.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
		Main.config.mkdirs();
		init(new File(Main.config.getPath(), Reference.MODID + ".cfg"));
	}
}
