package com.company;

public class Saxophone extends Wind {
    public Saxophone() {
        MessageCenter.DebugMessage("Creating a Saxophone");

    }

    public Saxophone (String owner) {

        MessageCenter.DebugMessage("Creating a Saxophone with name of owner");
        setOwner(owner);
    }



    @Override
    public String toString() {
        return String.format("saxophone");
    }



    @Override
    public void Value (double price, String country) {
        MessageCenter.DebugMessage(String.format("I am a saxophone %s made in %s", price, country));
    }

}
