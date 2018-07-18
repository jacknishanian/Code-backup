package com.company;


public class Triangle
{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double s1, double s2, double s3)
    {
        // initialise instance variables
        sideA = s1;
        sideB = s2;
        sideC = s3;
    }

    public double getSideA()
    {
        return sideA;
    }

    public double getSideB()
    {
        return sideB;
    }

    public double getSideC()
    {
        return sideC;
    }
}
