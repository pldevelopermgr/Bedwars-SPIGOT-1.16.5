package bwmain;

import org.bukkit.plugin.java.JavaPlugin;

import bw.cup.PluginCupHandler;

public class Main extends JavaPlugin 
{
	
	private static PluginCupHandler default_cuphandler = new PluginCupHandler();
	
	@Override
	public void onEnable()
	{
		bwinit();
	}
	
	@Override
	public void onDisable()
	{
		bwsave();
	}
	
	/*
	 * Creates and loads all needed files to start the plugin.
	 */
	
	private void bwinit()
	{
		
	}
	
	/*
	 * saves all next time needed files to files.
	 */
	
	private void bwsave()
	{
		
	}
	
	private PluginCupHandler getDefaultCupHandler()
	{
		return this.default_cuphandler;
	}

}
