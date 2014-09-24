package org.tf101wizard.fakeplayerhandler;

import org.bukkit.plugin.java.JavaPlugin;
import org.tf101wizard.fakeplayerhandler.listeners.BlockListener;
import org.tf101wizard.fakeplayerhandler.listeners.PlayerInteractListener;

public final class FakePlayerHandler  extends JavaPlugin
{
  @Override
  public void onEnable()
  {
    System.out.println("[FakePlayer] Listening for fake player events.");
    getServer().getPluginManager().registerEvents(new PlayerInteractListener(), this);
    getServer().getPluginManager().registerEvents(new BlockListener(), this);
  }
}
