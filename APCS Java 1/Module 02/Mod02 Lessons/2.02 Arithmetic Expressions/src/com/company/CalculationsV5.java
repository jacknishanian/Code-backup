package com.company;

/**
 *
 *
 * Jack Nishanian
 * 9/15/16
 *
 * The program preforms operations on variables. =/
 *
 */
public class CalculationsV5 {
    public static void main(String[] args) {
        //Initialization
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 0;
        int iNum4 = 0;
        int iNum5 = 0;
        int iNum6 = 0;

        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 5.0;

        // Addition
        System.out.println("Addition"); //Prints addition
        System.out.print(iNum1 + " plus " + iNum2 + "= "); //Print 34
        System.out.println(iNum1 + iNum2);
        System.out.println(dNum1 + " plus " + dNum2 + " plus " + dNum3 + " = " + (dNum1 + dNum2 + dNum3));
        System.out.println();

        // Creating new values
        iNum1 = 16;
        iNum2 = 9;
        iNum3 = 25;
        dNum1 = 3.14;
        dNum2 = 5.0;

        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum1 + " minus" + iNum2 + " minus " + iNum3 + " = " + (iNum1 - iNum2 - iNum3));
        System.out.println(dNum1 + " minus " + dNum2 + " = " + (dNum1 - dNum2));
        System.out.println();

        // Creating new values
        iNum1 = 25;
        iNum2 = 9;
        dNum1 = 3.14;
        dNum2 = 5.0;
        dNum3 = 5.0;

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " multiplied by " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println(dNum1 + " multiplied by " + dNum2 + " multiplied by " + dNum3 + " = " + (dNum1 * dNum2 * dNum3));
        System.out.println();

        // Creating new values
        iNum1 = 9;
        iNum2 = 25;
        dNum1 = 43.21;
        dNum2 = 5.0;

        // Division
        System.out.println("Division");
        System.out.println(iNum1 + " devided by " + iNum2 + " = " + (iNum1 / iNum2));
        System.out.println(dNum1 + " divided by " + dNum2 + " = " + (dNum1 / dNum2));
        System.out.println();

        // Creating new values
        iNum1 = 16;
        iNum2 = 9;
        dNum1 = 5.0;
        dNum2 = 3.14;

        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum1 + " modulus " + iNum2 + " = " + (iNum1 % iNum2));
        System.out.println(dNum1 + " modulus " + dNum2 + " = " + (dNum1 % dNum2));
        System.out.println();

        // Creating new values
        iNum1 = 15;
        iNum2 = 2;
        iNum3 = 10;
        iNum4 = 5;
        dNum1 = 2.5;

        // Mixed operations
        System.out.println("Mixed");
        System.out.println(iNum1 + " divided by " + dNum1 + "multiplied by " + iNum2 +
                " plus " + iNum3 + " divided by " + iNum4 + " = " +
                (iNum1 / dNum1 * (-iNum2) + iNum3 / iNum4));

        // Creating new values
        iNum1 = 234;
        iNum2 = 6;
        iNum3 = 12;
        iNum4 = 3;

        System.out.println(iNum1 + " minus ( " + iNum1 + "divided by" + iNum2 +
                "modules" + iNum3 + " ) plus " + iNum4 + " = " +
                (iNum1 - (iNum1 / iNum2 % iNum3) + iNum4));


        // Creating new values
        iNum1 = 11;
        iNum2 = 3;
        iNum3 = 24;
        iNum4 = 17;
        iNum5 = 2;
        iNum6 = 3;
        dNum1 = 46.2;

        System.out.println(dNum1 + " divided by " + iNum1 + " minus " + iNum2 + " plus " +
                iNum3 + "moduls" + iNum4 + " minus " + iNum5 + " multiplied by " + iNum6 + " = " +
                ((dNum1 / iNum1) - iNum2 + iNum3 % (iNum4 - iNum5 * iNum6)));

        // Creating new values
        iNum1 = 480;
        iNum2 = 10;
        iNum3 = 12;
        iNum4 = 200;
        iNum5 = 20;
        iNum6 = 8;

        dNum1 = .5;
        System.out.println(iNum1 + " devided by " + iNum2 + "divided by" + iNum3 + " plus " +
                iNum4 + " multiplied by " + dNum1 + " minus " + iNum5 + " moduls " + iNum6 +
                " = " + (iNum1 / iNum2 / iNum3 + iNum4 * dNum1 - iNum5 % iNum6));
        System.out.println();


    } // end of main method
} // end of class
