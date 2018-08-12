package com.tenacle.monopolywealthcalculator.persistence;

import com.tenacle.monopolywealthcalculator.objects.Player;

import java.util.List;

public interface PlayerPersistence {
    List getAllPlayers();

    Player getPlayer(Player player);
    Player getPlayer(String name);

    boolean storePlayer(Player player);

    boolean updatePlayer(Player player);

    boolean deletePlayer(Player player);
    boolean deletePlayer(String name);
}
