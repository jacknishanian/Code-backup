package com.company; /**
 * Description for 5.05 Dice Probability project
 *
 * @author (Jack Nishanian)
 * @version (10/20/2016)
 * <p>
 *
 */

import java.util.Random;
import java.util.Scanner;

class DiceProbability {
    public static void main(String[] args) {

        int sum = 0;
        int numSides = 0;
        int numRolls = 0;
        int match = 0; //Number of times sum of dice matches the current sum
        int die2 = 0;
        int die1 = 0;
        double probability = 0.0;


        Scanner in = new Scanner(System.in);
        Random randNum = new Random();


        System.out.print("Please enter the number of sides on a die: ");
        numSides = in.nextInt();

        System.out.print("Please enter the number of rolls: ");
        numRolls = in.nextInt();

        System.out.print("\n Sum of dice \t Probability \n");


        for( int roll  = 0; roll < numRolls; roll++ )
        {
            die2 = randNum.nextInt( numSides ) +1;
            die1 = randNum.nextInt( numSides ) +1;
            sum = die1 + die2;

            if ( die1 + die2 == sum )
            {
                match++;

            } // end if

            probability = (double)match / numRolls * 100;
            System.out.println( sum + "S: \t\t\t  " + probability );

        }

    }
}

