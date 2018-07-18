package com.company;
/*
* Jack Nishanian
* 11/10/16
* this program finds the points on a circle
* no pmr included
 */

public class PointsOnACircleV1 {

    public static void main(String[] args) {

        double radius = 5;
        double pointX = radius;
        double pointY = 0;

        if (radius > 0 ) {
            while (pointX >= -radius) {
                pointY = (radius * radius) - (pointX * pointX);
                System.out.println("Point X       Point Y/Y2       Radius");
                System.out.println("==========================================================");
                System.out.printf("%5.2f %12.2f %5.2f %12.2f" , pointX,   pointY,  (-pointY),  radius);
                System.out.println();
                System.out.println();
                System.out.println();
                pointX-= 0.1;
            }
        }




    }
}
