package com.company;

public class Accordion extends Keyboards{

    public Accordion() {
        MessageCenter.DebugMessage("Creating an Accordion");
    }


    public Accordion(String owner) {

        MessageCenter.DebugMessage("Creating an Accordion with name of owner");
        setOwner(owner);
}

    @Override
    public String toString() {
        return String.format("accordion");
    }

    @Override
    public void Value (double price, String country) {
        MessageCenter.DebugMessage(String.format("I am an accordion %s made in %s", price, country));
    }

}
