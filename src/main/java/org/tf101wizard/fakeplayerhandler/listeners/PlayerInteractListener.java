package org.tf101wizard.fakeplayerhandler.listeners;

import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.tf101wizard.fakeplayerhandler.FakePlayerHandler;
import org.tf101wizard.fakeplayerhandler.util.FakePlayerUtil;
import org.tf101wizard.fakeplayerhandler.util.GriefPreventionUtil;

public class PlayerInteractListener
  implements Listener
{
    private final FakePlayerHandler plugin;

    public PlayerInteractListener(FakePlayerHandler plugin) {
        this.plugin = plugin;
        
    }
  @EventHandler(priority=EventPriority.HIGH)
  public void onPlayerInteract(PlayerInteractEvent event)
  {
      if (FakePlayerUtil.isFakePlayer(event.getPlayer()) &&
              !GriefPreventionUtil.checkBlock(event.getPlayer(),
                      event.hasBlock() ? event.getClickedBlock() : event.getPlayer().getLocation().getBlock()))
      {
          event.setCancelled(true);
      }
  }
}
