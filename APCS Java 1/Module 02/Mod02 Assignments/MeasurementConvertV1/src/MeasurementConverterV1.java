/*
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: (Jack Nishanian)
 * Date: (9/15/16)
 *
 * The PMR is not included in this project because it has proved to be no challenge.
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles, km, feet, pounds, kg, gallons, liters, inches;
        double feetPerMile = 5280;                     //number of feet per 1 mile
        double kmPerMile = 1.60934;                   //number of km per mile
        double kgPerPound = 0.453592;                //number of kg per mile
        double litersPerGallon = 3.78541;           //number of liters per gallon
        double inchesPerFoot = 12;                 //number of inches per foot
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");

        miles = 54;
        feet = miles*feetPerMile;
        //Know this from C#
        System.out.println(String.format("The number of feet in %1$.2f miles is %2$.2f", miles, feet)); // converting and outputting

        km = miles * kmPerMile;
        System.out.println(String.format("The number of kilometers in %1$.2f miles is %2$.2f", miles, km)); // converting and outputting

        miles = km / kmPerMile;
        System.out.println(String.format("The number of miles in %1$.2f km is %2$.2f", km, miles)); // converting and outputting

        pounds = 10;

        kg = pounds * kgPerPound;
        System.out.println(String.format("The number of kilometers in %1$.2f pounds is %2$.2f", pounds, kg)); // converting and outputting

        pounds = kg / kgPerPound;
        System.out.println(String.format("The number of pounds in %1$.2f kg is %2$.2f", kg, pounds)); // converting and outputting

        gallons = 12;

        liters = gallons * litersPerGallon;
        System.out.println(String.format("The number of kilometers in %1$.2f gallons is %2$.2f", gallons, liters)); // converting and outputting

        gallons = liters / litersPerGallon;
        System.out.println(String.format("The number of gallons in %1$.2f liters is %2$.2f", liters, gallons)); // converting and outputting

        inches = 120;

        feet = inches / inchesPerFoot;
        System.out.println(String.format("The number of feet in %1$.2f inches is %2$.2f", inches, feet)); // converting and outputting

        inches = feet * inchesPerFoot;
        System.out.println(String.format("The number of inches in %1$.2f feet is %2$.2f", feet, inches)); // converting and outputting

        
    }//end of main method
}//end of class

