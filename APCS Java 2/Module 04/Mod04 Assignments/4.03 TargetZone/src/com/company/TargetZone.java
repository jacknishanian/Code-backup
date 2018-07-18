package com.company;
/**
 * Description for 4.03 Target Zone project
 *
 * @author (Jack Nishanian)
 * @version (10/6/16)
 * no pmr included
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        //Initialize and declare variables

        Scanner myScanner = new Scanner(System.in);
        String zone;
        int target;
        int restingHR;
        int age;
        int maxHR;
        int reserveHR;
        int zones[] = new int[3];


        //Prompt user for input
        System.out.println("Enter your resting heart rate");
        restingHR = myScanner.nextInt();

        System.out.println("Enter your age");
        age = myScanner.nextInt();

        System.out.println("What is your target zone (1, 2, 3)");
        target = myScanner.nextInt();

        maxHR =  220 - age;







        System.out.println("");
        //Calculate heart rate target zone min and max
        zones[0] = (int) 0.6*maxHR;
        zones[1] = (int) 0.7*maxHR;
        zones[2] = (int) 0.8*maxHR;

        //Determine if heart rate after exercise is not within the target zone's min and max.
        switch(target)
        {
            case 1:
                if(restingHR > zones[0] && restingHR < zones[1])
                    zone = "lower zone";
            case 2:
                if(restingHR > zones[1] && restingHR < zones[2])
                    zone = "middle zone";

            case 3:
                if(restingHR > zones[2])
                    zone = "upper zone";
            default:
                zone = "invalid target zone entered";

        }
        //If heart rate is below, change value of zone variable to "below".


        //If heart rate is above, change value of zone variable to "above".


        //Print two output statements
        //The first stating the heart rate target zone values.
        System.out.println("Lower zone is between " + zones[0] + " and " + zones[1]);
        System.out.println("Middlle zone is between " + zones[1] + " and " + zones[2]);
        System.out.println("Upper zone is greater than " + zones[2]);



        //The second stating if the heart rate after exercise  was within, above or below
        //the target zone. Use the variable "zone" to display the correct status.
        System.out.println("Current zone: " + zone);


    } //end main
}//end class TargetZone