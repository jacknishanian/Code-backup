package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Car1{

    int startMile;
    int endMile;
    double gallons;
    String type = "";

    Car1(int start, int end, double gallons, String type)
    {
        startMile = start;
        endMile = end;
        this.gallons = gallons;
        this.type = type;
    }

    public int calcDistance(){
        return endMile - startMile;
    }

    public double calcMpg(){
        return calcDistance()/gallons;
    }

    public double calcGpm()
    {
        return gallons/calcDistance();
    }

    public double totalCost()
    {
        return gallons * 2.112 * calcMpg();
    }

    public void print()
    {
        System.out.printf("%s            %d            %d            %d        " +
                "%f     %f      %f     %f", type, startMile, endMile, calcDistance(), gallons, calcMpg(), calcGpm(), totalCost() );
    }


}

public class Main {

    public static void main(String[] args) {



        String types[] = {"Jeep    ", "Mercedes", "Cadillac", };
        int startMiles1[] = {2432, 2697, 2433};
        int endMiles1[] = {2697, 2958, 2704};
        double gallons1[] = {15, 11.8, 18};

        List<Car1> myCars = new ArrayList<Car1>();

        for (int i = 0; i < types.length; i++) {
            myCars.add(new Car1(startMiles1[i], endMiles1[i], gallons1[i], types[i]));
        }

        System.out.println("\t\t\t\t\t\t\t Gas Mileage Calculations");
        System.out.printf("%s      %s      %s      %s      %s      %s      %s    %s", "Type of car", "Start Miles",
                "End Miles", "Distance", "gallons1", "Miles/Gal", "Gal/Miles", "Total Cost");
        System.out.println();
        System.out.println("=========================================================================" +
                "==========================================");

        for(Car1 car : myCars)
        {
            car.print();
            System.out.println();
        }



    }
}
