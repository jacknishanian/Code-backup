package com.company; /**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author  Jack Nishanian
 * @version V1
 * 10/6/16
 * no pmr included
 * this program shows a choice menu
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner myScanner = new Scanner(System.in);

        String choice;

        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");

        System.out.println("If you would like your BMR select A \n If you would like a apple select B \n " +
                "If you would like a food pyramid select C \n If you would like Fitness training select D \n");
        choice = myScanner.nextLine();
        System.out.println();
        
        if(choice.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("Testing: You chose A for BMI");
        }
        else if(choice.equalsIgnoreCase("B"))  //condition for choice B goes in the parentheses
        {
            System.out.println("You selected choice B for an Apple");
        }
        else if (choice.equalsIgnoreCase("C"))  //condition for choice C goes in the parentheses
        {
            System.out.println("You selected choice C for a food pyramid");
        }
        else if (choice.equalsIgnoreCase("D"))  //condition for choice D goes in the parentheses
        {
            System.out.println("You selected choice D for fitness training");
        }
        else //default choice for an invalid entry
        {
            System.out.println("You selected an invalid choice");
        }
    }
}
