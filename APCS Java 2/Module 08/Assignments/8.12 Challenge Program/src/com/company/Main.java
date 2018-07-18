package com.company;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Double> obj = new ArrayList<>();

    public static double usedGas(){


        double amountGas = 3996.75;
        return amountGas;
    }

    public static double avgElectricety(){


        double electricity = 972.75;
        return electricity;
    }

    public static double wasteProduced(){


        double amountWaste = 1509;

        return amountWaste;
    }

    public static double wasteRecycled(){


        double amountWasteRecycled = 526;
        return amountWasteRecycled;
    }

    public static double replaceBulbs(){

        double energySaved;
        double amountReplaced = 102;

        energySaved = amountReplaced * 1.37 *73;
        return energySaved;
    }


    public static void main(String[] args) {
        obj.add(avgElectricety());
        obj.add(wasteProduced());
        obj.add(wasteRecycled());
        obj.add(replaceBulbs());
        obj.add(usedGas());


        System.out.println("\t Gas Used Annually \t \t \t  Avg Annual Electricity \t \t \t Annual Waste Produced \t \t \t " +
             " Annual Waste Recycled \t \t \t  Energy Saved Annually ");
        System.out.println("________________________________________________________________________________________" +
                "___________________________________________________________________________");
        System.out.println("\t \t " + obj.get(0) + "\t \t \t \t \t \t \t" + obj.get(1) + "\t \t \t \t \t \t \t " + obj.get(2) + "\t \t \t \t \t \t \t" +
                "  " + obj.get(3) + "\t \t \t \t \t \t \t \t" + obj.get(4));

    }
}
