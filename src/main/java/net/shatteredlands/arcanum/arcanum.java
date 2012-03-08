package net.shatteredlands.arcanum;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Arcanum extends JavaPlugin {

	@Override
	public void onEnable() {
		/*
		 * TODO: Register Listener
		 */
	}

	@Override
	public void onDisable() {
		/*
		 * Do shutdown crap here
		 */
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (command.getName().equalsIgnoreCase("arcanum")) {

			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED + "Please run this command as a player.");
				return true;
			}
			
			if (sender.hasPermission("arcanum.use")) {
				// Call ArcanumGather Function here
				return true;
			} else {
				sender.sendMessage(ChatColor.RED + "You do not have the required permission to use this command.");
				return true;
			}
		}
		return false;
	}
}
