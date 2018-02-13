package com.zjf.RMDB;

import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	public void onEnable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		
		logger.info(pdfFile.getName() + " has been enabled! (Version " + pdfFile.getVersion() + ")");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	public void onDisable(){
		PluginDescriptionFile pdfFile = getDescription();
		Logger logger = Logger.getLogger("Minecraft");
		
		logger.info(pdfFile.getName() + " has been disabled! (Version " + pdfFile.getVersion() + ")");
	}
	
	@EventHandler
	
	public void onDrop(PlayerDropItemEvent event) {
		
		if(event.getItemDrop().getItemStack().getType() == Material.GLASS_BOTTLE) {
			
			event.getItemDrop().remove();		
		}
	}
	
	}
	
	
