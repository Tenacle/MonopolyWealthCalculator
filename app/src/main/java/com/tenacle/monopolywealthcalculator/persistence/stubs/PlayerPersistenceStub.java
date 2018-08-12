package com.tenacle.monopolywealthcalculator.persistence.stubs;

import com.tenacle.monopolywealthcalculator.objects.Player;
import com.tenacle.monopolywealthcalculator.persistence.PlayerPersistence;

import java.util.List;

public class PlayerPersistenceStub implements PlayerPersistence {
    private List<Player> playerList;

    PlayerPersistenceStub(List<Player> playerList) {
        this.playerList = playerList;
    }

    @Override
    public List getAllPlayers() {
        return this.playerList;
    }

    @Override
    public Player getPlayer(Player player) {
        return this.getPlayer(player.getName());
    }

    @Override
    public Player getPlayer(String name) {
        return null;
    }

    @Override
    public boolean storePlayer(Player player) {
        return false;
    }

    @Override
    public boolean updatePlayer(Player player) {
        return false;
    }

    @Override
    public boolean deletePlayer(Player player) {
        return this.deletePlayer(player.getName());
    }

    @Override
    public boolean deletePlayer(String name) {
        return false;
    }
}
