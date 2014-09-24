package org.tf101wizard.fakeplayerhandler;

import org.bukkit.plugin.java.JavaPlugin;
import org.tf101wizard.fakeplayerhandler.listeners.BlockBreakListener;
import org.tf101wizard.fakeplayerhandler.listeners.BlockPlaceListener;
import org.tf101wizard.fakeplayerhandler.listeners.PlayerInteractListener;

public final class FakePlayerHandler
  extends JavaPlugin
{
  
  @Override
  public void onEnable()
  {
    System.out.println("[FakePlayer] Listening for fake player events.");
    getConfig().options().copyDefaults(true);
    getServer().getPluginManager().registerEvents(new PlayerInteractListener(this), this);
    getServer().getPluginManager().registerEvents(new BlockPlaceListener(this), this);
    getServer().getPluginManager().registerEvents(new BlockBreakListener(this), this);
    
  }
}
