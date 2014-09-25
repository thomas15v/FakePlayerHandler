package org.tf101wizard.fakeplayerhandler.util;

import org.bukkit.entity.Player;

/**
 * Created by thomas on 24/09/14.
 */
public class FakePlayerUtil {

    public static boolean isFakePlayer(Player player){
        return player.getName().startsWith("[") && player.getName().endsWith("]");
    }
}
