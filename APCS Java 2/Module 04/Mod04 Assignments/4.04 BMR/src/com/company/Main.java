/*
* Jack Nishanian
* 10/6/16
* No pmr included
* This program calculates your BMR
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        String gender;
        double  height;
        double weight;
        int age;
        double BMR;

        Scanner myScanner = new Scanner(System.in);

	    System.out.println("Enter your name");
        name = myScanner.nextLine();

        System.out.println("Enter your gender M/F");
        gender = myScanner.nextLine();

        System.out.println("Enter your age");
        age = myScanner.nextInt();

        System.out.println("Enter your Height");
        height = myScanner.nextInt();

        System.out.println("Enter your weight");
        weight = myScanner.nextInt();


        weight = weight * 0.453592;

        height = height * 2.54;


        if (gender == "M"){
            BMR = (13.397 * weight / 1 + 4.799 * height / 1 - 5.677 * age / 1 + 88.362);
        }
        else{
            BMR = (9.247 * weight / 1 + 3.098 * height / 1 - 4.330 * age / 1 +447.593);
        }

        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Basal Metabolic Rate: " + BMR + "calories per day ");

    }
}
