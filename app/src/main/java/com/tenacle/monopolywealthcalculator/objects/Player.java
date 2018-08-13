package com.tenacle.monopolywealthcalculator.objects;

import com.tenacle.monopolywealthcalculator.persistence.PropertyPersistence;

import java.util.List;

public class Player {
    private String name;
    private int cash;
    private List<Property> ownedProperty;

    public Player(String name, int cash, List<Property> ownedProperty) {
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

    public List<Property> getOwnedProperty() {
        return ownedProperty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setOwnedProperty(List<Property> ownedProperty) {
        this.ownedProperty = ownedProperty;
    }

    public void addProperty(Property property) {
        this.ownedProperty.add(property);
    }

    public void delProperty(Property property) {
        this.ownedProperty.remove(property);
    }

    public boolean containsProperty(Property property) {
        return ownedProperty.contains(property);
    }

    @Override
    public boolean equals(Object object) {
        boolean equal = false;
        if( object instanceof Player ) {
            Player player = (Player) object;
            equal = this.name.equals(player.getName());
        }
        return equal;
    }
}
