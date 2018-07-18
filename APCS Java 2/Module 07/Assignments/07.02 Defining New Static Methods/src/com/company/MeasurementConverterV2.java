package com.company;

/**
 * Write a description of class MeasurementConverterV2_Key here.
 * 
 * @author (Jack Nishanian)
 * @version (11-10-16)
 */
public class MeasurementConverterV2 {
    //Purpose of program
    public static void printPurpose()  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }


    public static double convertFeetToMiles(double ft) {
        return ft / 5280;
    }
    {

    }
    public static double convertMilesToFeet(double mi) {
        return mi * 5280;
    }
    {

    }
    public static double convertMilesToKilometers(double mi){return mi * 1.60934;}
    {

    }

    public static double convertKilometersToMiles(double km){return km * 0.621371;}
    {

    }

    public static double convertPoundsToKilograms(double lbs){return lbs * 0.453592;}
    {

    } 
    
    public static double convertKilogramsToLbs(double kilograms){return kilograms * 2.20462;}
    {

    } 
    
    public static double convertGallonsToLiters(double gallons){return gallons * 3.78541;}
    {

    }

    public static double convertLitersToGallons(double liters){return liters * 0.264172;}
    {

    }
    

    public static void main(String[ ] args)
    {
        printPurpose();
        double feet = 6230;
        double miles = convertFeetToMiles(feet);
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convertKilometersToMiles(kilometers);
        System.out.printf("%8.1f mi. = %7.1f km. %n", kilometers, miles);
        
        double pounds = 204;
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.printf("%8.1f mi. = %7.1f km. %n", pounds, kilograms);

        kilograms = 552;
        pounds = convertKilogramsToLbs(kilograms);
        System.out.printf("%8.1f mi. = %7.1f km. %n", kilograms, pounds);

        double gallons = 1225;
        double liters = convertGallonsToLiters(gallons);
        System.out.printf("%8.1f mi. = %7.1f km. %n", gallons, liters);

        
        liters = 225;
        gallons = convertLitersToGallons(liters);
        System.out.printf("%8.1f mi. = %7.1f km. %n", liters, gallons);
           
    }
}


