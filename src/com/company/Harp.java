package com.company;

public class Harp extends Stringed {
    public Harp() {
        MessageCenter.DebugMessage("Creating a Harp");

    }

    public Harp (String owner) {

        MessageCenter.DebugMessage("Creating a Harp with name of owner");
        setOwner(owner);
    }

    @Override
    public String toString() {
        return String.format("harp");
    }




    @Override
    public void Value (double price, String country) {
        MessageCenter.DebugMessage(String.format("I a harp %s made in %s", price, country));
    }
}
