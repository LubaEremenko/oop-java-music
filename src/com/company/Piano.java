package com.company;

public class Piano extends Keyboards{
    public Piano() {
        MessageCenter.DebugMessage("Creating a Piano");

    }

    public Piano (String owner) {

        MessageCenter.DebugMessage("Creating a Piano with name of owner");
        setOwner(owner);
    }






    @Override
    public String toString() {
        return String.format("piano");
    }


    @Override
    public void Value (double price, String country) {
        MessageCenter.DebugMessage(String.format("I am a piano %s made in %s", price, country));
    }

}
