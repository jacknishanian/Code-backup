package com.company;
/**
 * Program to calculate the Total Daily Energy Expenditure
 *
 * Jack Nishanian
 * 10/15/16
 * This program calculates the tdee
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        // Input: Gather information from user
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR:" );
        double basalMR = in.nextDouble();
        System.out.print("Please enter your gender (M/F): ");
        String gender = in.next().toUpperCase();
        System.out.println();

        // Activity Level Menu
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the letter corresponding to your activity level: ");
        String choice = in.next().toUpperCase();
        System.out.println();


        //Processing:
        // Activity Factor
        double activityFactor = 0;

        if(gender.equals("M")){

            if(choice.equals("A")){
                activityFactor = 1.0;
            }

            else if(choice.equals("B")){
                activityFactor = 2.0;
            }

            else if(choice.equals("C")){
                activityFactor = 3.0;
            }

            else if(choice.equals("D")){
                activityFactor = 4.0;
            }

            else if(choice.equals("E")){
                activityFactor = 5.0;
            }

            else if(choice.equals("F")){
                activityFactor = 6.0;
            }

            else
            {
                System.out.println("Enter a correct value A-F");
            }

        }

        else if(gender.equals("F")){

            if(choice.equals("A")){
                activityFactor = 1.5;
            }

            else if(choice.equals("B")){
                activityFactor = 2.5;
            }

            else if(choice.equals("C")){
                activityFactor = 3.5;
            }

            else if(choice.equals("D")){
                activityFactor = 4.5;
            }

            else if(choice.equals("E")){
                activityFactor = 5.5;
            }

            else if(choice.equals("F")){
                activityFactor = 6.7;
            }

            else
            {
                System.out.println("Enter a correct value A-F");
            }
        }

        else
        {
            System.out.println("Enter a correct value M/F");
        }

        // Calculate TDEE
        double tDEE = basalMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + basalMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");

    }
}

