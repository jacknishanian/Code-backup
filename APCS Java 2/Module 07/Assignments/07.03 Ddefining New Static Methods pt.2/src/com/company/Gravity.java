package com.company;
/**
 * Description for 7.03 Gravity
 *
 * @author (Your Name)
 * @version (The Date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Gravity
{
	// calcGravity returns an array of doubles containing teh gravity values
	//and takes two arrays of doubles as parameters for the radius values and mass


	// printResults will print the table to output screen
	// return type is void because no values are returned
	public static void printResults(String[] name, double[] radius, double[] mass, double gravity[])
	{
			// fill in code here
	}

	//print the gravity values to text file
	public static void printToFile(double[] gravity)throws IOException
	{
		// fill in code here
	}

    public static void main(String[] args)throws IOException
    {
        // Initialize variables
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		double[] radii = {2439.7, 6051.9, 6378, 3402.5, 71492, 60270, 25562, 24774, 1195};
		double[] gravities = {3.7, 8.87, 9.798, 3.71, 24.92, 10.44, 8.87, 11.15, 0.58};
		double [] masses = {3.30E23, 4.87E24, 5.97E24, 6.42E23, 1.90E27, 5.68E26, 8.68E25, 1.02E26, 1.27E22}; // See IMACS double lesson for big E notation




		// Output
		System.out.println(" Planet 			Diameter (km) 			Mass (Kg) 			g(m/s");
		printResults(names, radii, masses, gravities);
		printToFile(gravities);


    } //end main
}//end class