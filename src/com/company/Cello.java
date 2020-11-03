package com.company;

public class Cello extends Stringed {
    public Cello(){
        MessageCenter.DebugMessage("Creating a Cello");
    }

    public Cello (String owner) {

        MessageCenter.DebugMessage("Creating a Cello with name of owner");
        setOwner(owner);
    }

    @Override
    public String toString () {
        return String.format("cello");
    }


    @Override
    public void Value (double price, String country) {
        MessageCenter.DebugMessage(String.format("I am a cello %s made in %s", price, country));
    }

}
