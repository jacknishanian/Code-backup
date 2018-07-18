package com.company;

import java.util.Arrays;
import java.util.Scanner;

class AnnualClimate
{

    public static void main (String [ ] args)
    {

        //Declare and intialize variables - programmer to provide initial values
        Scanner in = new Scanner(System.in);

        String city = "Fort Myers";
        String state = "Florda";
        String month [] ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double temperature [] ={64.9, 66.0, 69.9, 73.6, 78.8, 82.2, 83.0, 83.1, 82.1, 77.5, 71.7, 66.4}; 		//initialize with Fahrenheit values
        double precipitation [] ={2.2, 2.1, 2.7, 1.7, 3.4, 9.8, 9.0, 9.5, 7.9, 2.6, 1.7, 1.6}; 	//initialize with inches values

        String tempLabel = "F";   //initialize to F
        String precipLabel = "cm"; //initialize to cm


        //INPUT - ask user for temp and preciptation scale choice
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String tempChoice = in.next();
        System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
        String precipChoice = in.next();


        //PROCESSING - convert from F to C and in to cm based on user's choices
        // remember 5/9 = 0, 5.0/9 = .5555

        if(tempChoice.equalsIgnoreCase("C"))
        {
            tempLabel.equals("c");
            for( int i = 0; i < temperature.length; i++)
            {
                temperature[i] = (temperature[i] -32 ) / 1.8 ;
            }

        }

        //Convert in values to cm; replace the current values in precipitation
        if(precipChoice.equalsIgnoreCase("C"))
        {
            precipLabel.equals("cm");
            for( int i = 0; i < precipitation.length; i++ )
            {
                precipitation[i] = precipitation[i] * 2.54;
            }
        }



        System.out.println();
        System.out.println("Climate Data");
        System.out.println("Location: " + city +", " + state);
        System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
        System.out.println();
        System.out.printf("*************************************************** \n");
        for(int i = 0; i < month.length; i++)
        {
            System.out.printf("%5s %18.1f %18.1f", month[i], temperature[i], precipitation[i] );
            System.out.println();
        }

        System.out.printf("Average Temperature: %.1f \t\t Average Precipitation: %.1f", Arrays.stream(temperature).average().getAsDouble(), Arrays.stream(precipitation).average().getAsDouble());




    }//end main
}//end Annual Climate
