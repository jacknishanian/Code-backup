package com.company;

import java.util.Scanner;

public class Main {

    public static boolean Palindrome(String first){
        String a[] = {" ", "/", ",", ".", "-"};
        for(String b : a)
        {
            first = first.replaceAll(b, "");
        }
        if (first.length() == 0 || first.length() == 1 )
            return true;

        if(first.charAt(0) == first.charAt(first.length() -1))
            return Palindrome(first.substring(1, first.length() -1));

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type a word to check if its a palindrome or not");
        String x = sc.nextLine();
        if(Palindrome(x))
            System.out.println(x + " is a palindrome");
        else
            System.out.println(x + " is not a palindrome");
    }
}
