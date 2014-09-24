package org.tf101wizard.fakeplayerhandler.listeners;

import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.tf101wizard.fakeplayerhandler.FakePlayerHandler;
import org.tf101wizard.fakeplayerhandler.util.FakePlayerUtil;
import org.tf101wizard.fakeplayerhandler.util.GriefPreventionUtil;

public class BlockListener implements Listener
{
    @EventHandler(priority=EventPriority.HIGH)
    public void onBlockBreak(BlockBreakEvent event)
    {
        if (FakePlayerUtil.isFakePlayer(event.getPlayer()) &&
                !GriefPreventionUtil.checkBlock(event.getPlayer(), event.getBlock()))
        {
            event.setCancelled(true);
        }
    }

    @EventHandler(priority=EventPriority.HIGH)
    public void onBlockPlace(BlockPlaceEvent event)
    {
        if (FakePlayerUtil.isFakePlayer(event.getPlayer()) &&
                !GriefPreventionUtil.checkBlock(event.getPlayer(), event.getBlock())){
            event.setCancelled(true);
        }
    }
}
