package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Car{

    int startMile;
    int endMile;
    double gallons;
    String type = "";

    Car(int start, int end, double gallons, String type)
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

    public void print()
    {
        System.out.printf("%s            %d            %d            %d        " +
                "%f     %f", type, startMile, endMile, calcDistance(), gallons, calcMpg());
    }


}

public class Main {

    public static void main(String[] args) {



        String types[] = {"Jeep    ", "Mercedes", "Cadillac", };
        int startMiles[] = {2432, 2697, 2433};
        int endMiles[] = {2697, 2958, 2704};
        double gallons[] = {15, 11.8, 18};

        List<Car> myCars = new ArrayList<Car>();

        for (int i = 0; i < types.length; i++) {
            myCars.add(new Car(startMiles[i], endMiles[i], gallons[i], types[i]));
        }

        System.out.println("\t\t\t\t\t\t\t Gas Mileage Calculations");
        System.out.printf("%s      %s      %s      %s      %s      %s", "Type of car", "Start Miles",
                "End Miles", "Distance", "Gallons", "Miles/Gal");
        System.out.println();
        System.out.println("======================================================================================");

        for(Car car : myCars)
        {
            car.print();
            System.out.println();
        }



    }
}
