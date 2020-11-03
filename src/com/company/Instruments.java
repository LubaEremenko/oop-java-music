package com.company;

public abstract class Instruments {
    private String name;
    private String owner;


    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getOwner() {

        return owner;
    }

    public void setOwner(String owner) {

        this.owner = owner;
    }

    public abstract void Value (double price, String country);

    @Override
    public String toString() {
        return  String.format("ToString() => C2 owner: %s, name %s", getOwner(), getName());

    }

}
