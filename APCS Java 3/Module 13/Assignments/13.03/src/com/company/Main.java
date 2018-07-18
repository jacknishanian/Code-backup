package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle one = new Circle(5, 6, 2);
        Cylinder two = new Cylinder(5, 8, 6, 7);
        Oval three = new Oval(2, 5, 10, 4);
        OvalCylinder four = new OvalCylinder(4, 5, 6, 8, 12);



        System.out.println("For Circle " + one.center());
        System.out.println("For Cylinder " + two.center());
        System.out.println("For Oval " + three.center());
        System.out.println("For OvalCylinder " + four.center());
    }
}
