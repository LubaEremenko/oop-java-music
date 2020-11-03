package com.company;

public class Tuba extends Wind {
    public Tuba() {
        MessageCenter.DebugMessage("Creating a Tuba");

    }

    public Tuba (String owner) {

        MessageCenter.DebugMessage("Creating a Tuba with name of owner");
        setOwner(owner);
    }

    @Override
    public String toString() {
        return String.format("tuba");
    }


    @Override
    public void Value (double price, String country) {
        MessageCenter.DebugMessage(String.format("I am an tuba %s made in %s", price, country));
    }

}
