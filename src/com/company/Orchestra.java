package com.company;

import java.util.ArrayList;

public class Orchestra {
    private ArrayList<Instruments> listOfInstruments = new ArrayList<Instruments>();

    public Orchestra() {

        MessageCenter.DebugMessage("Creating an Orchestra");
    }

    public void OrchInstruments(Instruments instrInOrchestra) {

        listOfInstruments.add(instrInOrchestra);

    }

    public Double CalculateDailySalary() {
        Double charge = 214.50;
        Double totalSalary = 0.0;

        for (Instruments currentMusician : listOfInstruments) {

            MessageCenter.DebugMessage(String.format("Calculating for %s : %s", currentMusician.getOwner()));
            totalSalary += charge;
        }

        return  totalSalary;

    }

    @Override
    public String toString() {

        return String.format("The Orchestra has %d musician and daily salary of %f", listOfInstruments.size(), CalculateDailySalary());
    }

}
