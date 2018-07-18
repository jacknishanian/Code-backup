package com.company;




public class Main {
    public static int f1(int x){
        if (x <= 10)
            return -7;
        else
            return f1(x-4) + 2;
    }

    public static int f2(int x){
        if (x <= 25)
            return 20;
        else
            return f2(x/12+5) + 3;
    }

    public static int f4(int x){
        if (x > 20)
            return -100;
        else
            return f4(x*2) - 4;
    }



    public static void main(String[] args) {
        System.out.println(f1(25));
        System.out.println(f2(30));
        System.out.println(f4(500));
    }
}
