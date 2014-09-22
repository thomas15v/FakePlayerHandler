package FakePlayerHandler;

import org.bukkit.plugin.java.JavaPlugin;

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
