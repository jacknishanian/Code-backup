package com.company;

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;


public class Main {

    public static void main(String[] args)  throws IOException {


        Scanner myScanner = new Scanner (System.in);
        Random rand = new Random();

        PrintWriter outFile = new PrintWriter (new File("BottleCapPrize.txt"));

        double  avg = 0;
        double total = 0;
        double randomNumber = 0;
        double chance = 1;
        int caps = 1;

        System.out.println("How many trials do you to do the trial: ");
        int trialAmount = myScanner.nextInt();


        for (int trialNum = 0; trialAmount > trialNum; ){

            randomNumber = rand.nextInt(10);
            caps++;

            if (randomNumber == chance ){
                outFile.println("it took: " + caps + " caps to get a prize");

                total += caps;

                caps = 0;

                trialNum++;

            }

        }

        avg = ((double) total) / ((double)trialAmount);

        System.out.println("The average number of caps per prize is: " + avg + " caps");
        outFile.println("The average number of caps per prize is: " + avg + " caps");

        outFile.close ();
    }
}

