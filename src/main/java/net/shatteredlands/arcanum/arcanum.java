package net.shatteredlands.arcanum;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

public class arcanum extends JavaPlugin
{
	
	@Override
	public void onEnable() {
	/*
	 * Do Init crap here
	 */
	}
	
	@Override
	public void onDisable() {
		/*
		 * Do shutdown crap here
		 */
	}
	

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("arcanum")) {
			//Permission Check
		}
		//Do stuff on this command entry
		return false;
	}
}
