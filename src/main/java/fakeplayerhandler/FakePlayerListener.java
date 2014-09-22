package fakeplayerhandler;

import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class FakePlayerListener
  implements Listener
{
    private final Main plugin;

    FakePlayerListener(Main plugin) {
        this.plugin = plugin;
        
    }
  @EventHandler(priority=EventPriority.HIGH)
  public void onBlockBreak(BlockBreakEvent event)
  {
    String playername = event.getPlayer().getName();
    Player player = event.getPlayer();
    Location block = player.getLocation();
    
    if (playername.startsWith("[") && playername.endsWith("]"))
    {
      int y = block.getBlockY();
      int x = block.getBlockX();
      int z = block.getBlockZ();
      World world = block.getWorld();
      Block blocktocheck = world.getBlockAt(x, y, z);
      
      boolean check = false;
      if (!checkBlock(player, blocktocheck)) {
        check = true;
      }
      if (check)
      {
        event.setCancelled(true);
      }
    }
  }
  
  private boolean checkBlock(Player player, Block block)
  {
    String c = GriefPrevention.instance.allowBreak(player, block.getLocation());
    if (c != null) {
      return false;
    }
    return true;
  }
}
