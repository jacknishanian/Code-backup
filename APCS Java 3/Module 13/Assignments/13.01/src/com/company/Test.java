package com.company;


public class Test
{
	public static void main (String []args)
	{
	    Rectangle one = new Rectangle(2, 4);
	    Box two = new Box(4, 4, 4);
		Triangle three = new Triangle(3, 3, 3);
		Equilateral four = new Equilateral(3, 3, 3);
	    
	    System.out.println("For Rectangle:" );
	    System.out.println("The length is  " + one.getLength() );
	    System.out.println("The width is " + one.getWidth()); 
	    System.out.println("For Box : ");
	    System.out.println("The length is  " + two.getLength() );
	    System.out.println("The width is " + two.getWidth());
		System.out.println("For Triangle: ");
		System.out.println("The side A is " + three.getSideA());
		System.out.println("The side B is " + three.getSideB());
		System.out.println("The side C is " + three.getSideC());
		System.out.println("For Equilateral: ");
		System.out.println("The sides are " + four.getSideA());
	}
	
}
