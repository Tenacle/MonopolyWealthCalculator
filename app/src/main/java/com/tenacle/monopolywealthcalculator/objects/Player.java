package com.tenacle.monopolywealthcalculator.objects;

import java.util.List;

public class Player {
    private String name;
    private int cash;
    private List<Player> ownedProperty;

    Player(List<Player> ownedProperty) {
        this.name = "default";
        this.cash = 0;
        this.ownedProperty = ownedProperty;
    }
    Player(String name, List<Player> ownedProperty) {
        this.name = name;
        this.cash = 0;
        this.ownedProperty = ownedProperty;
    }
    Player(String name, int cash, List<Player> ownedProperty) {
        this.name = name;
        this.cash = cash;
        this.ownedProperty = ownedProperty;
    }

    public String getName() {
        return name;
    }
    public int getCash() {
        return cash;
    }
    public List<Player> getOwnedProperty() {
        return ownedProperty;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCash(int cash) {
        this.cash = cash;
    }
    public void setOwnedProperty(List<Player> ownedProperty) {
        this.ownedProperty = ownedProperty;
    }

    public boolean hasProperty(Player property) {
        return ownedProperty.contains(property);
    }

    @Override
    public boolean equals(Object object) {
        boolean equal = false;
        if (object instanceof Player) {
            Player player = (Player) object;
            equal = this.name.equals(player.getName());
        }
        return equal;
    }
}
