package com.company;
/**
 * Heat Index description:
 *
 * @author:
 * @version:
 *
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
        String location = "";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner("fileNameTemp");
        Scanner inFileHumid = new Scanner("fileNameHumid");

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];


		//INPUT - read in data for temp and humidity from files

		int n = 0;
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            n++;
        }
        inFileTemp.close();


        n = 0;
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                n++;
        }
        inFileHumid.close();



		double T = 0.0;
		double RH = 0.0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0 || humidity[n] < 40.0 )
            {
            	T = temperature[n];
            	RH = humidity[n];

                hI[n] =  -42.379 + 2.04901523*T + 10.14333127*RH - .22475541*T*RH - .00683783*T*T - .05481717*RH*RH + .00122874*T*T*RH + .00085282*T*RH*RH - .00000199*T*T*RH*RH;
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }


        //calculate averages for temperature, humidity and HI

        double tempSum = 0.0;
        int humidSum = 0;
        double hISum = 0.0;

        for(n = 0; n < temperature.length; n++)
        {
        	tempSum += temperature[n];
        }

        double tempAvg = tempSum/temperature.length;


        //OUTPUT - print table. Use enhanced for loops to print the months, temp, humidity and HI

        System.out.printf("     Heat Index: %15s \n ", location);
        System.out.println();


        System.out.println("          Months ");
        System.out.print("            ");
        for(String m : month)
        {
            System.out.printf("   %3.3s", m);
        }


        System.out.println("  Avg");
        System.out.println("******************************************************************************************");


        for(int i = 0; i < temperature.length; i++) {
            System.out.printf("temperature (%5.1f)", temperature[i]);
            System.out.println();
        }

		//print average
        System.out.println();

        for(int i = 0; i < humidity.length; i++) {
            System.out.printf("Humidity (%5f.1)", humidity[i]);
            System.out.println();
        }


        for(int i = 0; i < hI.length; i++) {
            System.out.printf("hI (%5f.1)", hI[i]);
            System.out.println();
        }

        System.out.println();
    } //end main()
}//end HeatIndex
