package fakeplayerhandler;

import fakeplayerhandler.*;
import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main
  extends JavaPlugin
{
  public static Logger LOG;
  private Main plugin;
  
  public void onEnable()
  {
    this.plugin = this;
    System.out.println("[FakePlayer] Initalized");
    getConfig().options().copyDefaults(true);
    
    getServer().getPluginManager().registerEvents(new FakePlayerListener(this), this);
    
  }
  
  public void onDisable()
  {
    System.out.println("[FakePlayer] Initalized");
  }
}
