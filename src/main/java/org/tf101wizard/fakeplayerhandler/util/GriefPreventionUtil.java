package org.tf101wizard.fakeplayerhandler.util;

import me.ryanhamshire.GriefPrevention.GriefPrevention;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

/**
 * Created by thomas on 24/09/14.
 */
public class GriefPreventionUtil {
    public static boolean checkBlock(Player player, Block block)
    {
        String c = GriefPrevention.instance.allowBreak(player, block.getLocation());
        if (c != null) {
            return false;
        }
        return true;
    }
}
