package com.company;

public class Maracas extends Percussion {
    public Maracas() {
        MessageCenter.DebugMessage("Creating a Maracas");

    }
    public Maracas (String owner) {

        MessageCenter.DebugMessage("Creating a Maracas with name of owner");
        setOwner(owner);
    }





    @Override
    public String toString() {
        return String.format("maracas");
    }


    @Override
    public void Value (double price, String country) {
        MessageCenter.DebugMessage(String.format("I am a maracas %s made in %s", price, country));
    }

}
