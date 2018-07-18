/*
* Jack Nishanian
*10/6/16
* No PMR included
* This program calculates your BMI
*
*
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    Scanner myScanner = new Scanner(System.in);


        double weight;
        double height;
        double BMI;


        System.out.println("Enter your weight");
        weight = myScanner.nextDouble();

        System.out.println("Enter your height");
        height = myScanner.nextDouble();


        height = height * height;
        BMI = weight / height * 703;


        if (BMI < 18.5 ){
            System.out.println("You have a BMI of: " + BMI + " This makes you underweight");
        }

        if (BMI > 18.5 && BMI < 24.9){
            System.out.println("You have a BMI of: " + BMI + " This says you have a healthy weight");
        }

        if (BMI > 25 && BMI < 29.9){
            System.out.println("You have a BMI of: " + BMI + " This makes you overweight");
        }

        if (BMI > 30){
            System.out.println("You have a BMI of: " + BMI + " This makes you obese");
        }
    }
}
