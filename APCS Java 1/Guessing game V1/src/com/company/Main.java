package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random rand = new Random();

        int max = 999;
        int min = 100;

        int range = max - min;


        int choice = 0;
        int randInt = min + rand.nextInt(range);


        System.out.println("I will think of a number between "+ min + " and "+ max +", try to guess it");


        boolean guessed = false;


        while(guessed == false ){

            System.out.print("Input your number here: ");
            choice = myScanner.nextInt(); //here

            if(choice > max || choice < min){
                System.out.println("You are out of bounds you have not stayed" +
                        " in the range of minimum " + min + ", maximum " + max);
            }


            if(randInt > choice){
                System.out.println("Nope, that was to low Try again");
            }


            else if(randInt < choice){
                System.out.println("Nope, that was to high Try again");
            }


            else if(randInt == choice){
                System.out.println("Yep that was it, the number was: " + randInt );
                guessed = true;
            }

        }

    }

}
