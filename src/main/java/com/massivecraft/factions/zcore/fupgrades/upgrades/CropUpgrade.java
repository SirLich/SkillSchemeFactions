package com.massivecraft.factions.zcore.fupgrades.upgrades;

import com.massivecraft.factions.Faction;
import com.massivecraft.factions.zcore.fupgrades.FactionUpgrade;
import com.massivecraft.factions.zcore.fupgrades.UpgradeListener;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

import java.util.HashSet;
import java.util.Set;

public class CropUpgrade extends FactionUpgrade {

    public CropUpgrade() {
        super("crop");
    }

    @Override
    public Set<Listener> listenersToRegister() {
        return null;
    }

    @Override
    public void onLevelUp(Faction faction) {

    }

}
