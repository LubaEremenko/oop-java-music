package com.company;

public class Xylophone extends Percussion {

    public Xylophone() {
        MessageCenter.DebugMessage("Creating a Xylophone");
    }

    public Xylophone (String owner) {

        MessageCenter.DebugMessage("Creating a Xylophone with name of owner");
        setOwner(owner);
    }

    @Override
    public String toString() {
        return String.format("xylophone");
    }


    @Override
    public void Value (double price, String country) {
        MessageCenter.DebugMessage(String.format("I am a xylophone %s made in %s", price, country));
    }
}
