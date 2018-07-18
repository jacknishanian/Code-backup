/*
* @auth Jack Nishanian
* @Date 1/5/17
*/
package com.company;


import static java.lang.Math.sin;

public class Main {

    public static void main(String[] args) {
        double grav = 9.8;
        float speed = 50;
        double angle = 30;
        double distance = 0;

        System.out.println("speed \t \t \t 50 m/s^2");
        System.out.println("______________________________________");
        for (int i = 0; i < 5; i++) {

            distance = ((speed * speed) * sin(angle * 2)) / grav;

                System.out.println("      \t \t \t " + distance );

            angle += 5;


        }

    }
}
