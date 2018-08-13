package com.tenacle.monopolywealthcalculator.objects;

public class Property {
    private String name;
    private int value;
    private boolean mortgaged;

    public Property(String name, int value, boolean mortgaged) {
        this.name = name;
        this.value = value;
        this.mortgaged = mortgaged;
    }

    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public boolean isMortgaged() {
        return mortgaged;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setMortgaged(boolean mortgaged) {
        this.mortgaged = mortgaged;
    }
}
