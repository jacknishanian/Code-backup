package com.company;
import java.util.Scanner;
public class Main {

    public static int fib(int n) {
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return (fib(n-1) + fib(n-2));
    }
    public static void main(String[] args) {

        boolean goodNums = false;
        int rep = 0;

        while (goodNums == false) {
            System.out.println("Enter the number of times you want the Fibonacci sequence to run (Warning: no numbers over 100):");
            Scanner myScanner = new Scanner(System.in);

            rep = myScanner.nextInt();

            if (rep <= 100)
                goodNums = true;
        }
        System.out.println(fib(rep));
    }
}
