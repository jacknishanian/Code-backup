package com.company;


/**
 * This class instantiates CO2FromWaste(8.11) objects with 8 private instance variables.
 * It contains three mutator methods to calculate the pounds of CO2: in total emissions,
 * emission reductions, and net emissions.  It contains getter methods for each private
 * instance variables.  Private instance variables include myNumPeople, myPaper, myPlastic,
 * myGlass, myCans, myEmissions, myReduction, and myNetEmissions.
 *
 * @author:
 * @version:
 */
import java.util.ArrayList;

public class CO2FromWaste
{
    int myNumPeople = 3;
    boolean myPaper = true, myPlastic = true, myGlass = false, myCans = true;
   double myEmissions, myReduction, myNetEmissions, myNetWasteReduction;

   /**
    * Constructor for objects of type CO2FromWaste
    * @param numPeople number of people in a household
    * @param paper whether or not paper is recycled
    * @param plastic whether or not plastic is recycled
    * @param glass whether or not glass is recycled
    * @param cans whether or not cans are recycled
    */
   public CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
   {

       myNumPeople = numPeople;
       myPaper = paper;
       myPlastic = plastic;
       myGlass = glass;
       myCans = cans;
       myEmissions = 0.0;
       myReduction = 0.0;
       myNetEmissions = 0.0;
       myNetWasteReduction = 0.0;
   }

   /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    */
   public void calcGrossWasteEmission()
   {
       myEmissions = 19.396 / 0.02 * 1.37 * 12;
   }

   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    */
   public void calcWasteReduction()
   {
       if(myPaper)
       {
           myReduction += (184.0 * myNumPeople);
       }

       if (myPlastic ) {
           myReduction += (25.6 * myNumPeople);
       }

       if (myGlass){
           myReduction += (46.6 * myNumPeople);
       }

       if (myCans){
           myReduction += (165.8 * myNumPeople);
       }

   }

   public void calcNetWasteReduction()
   {
       myNetWasteReduction = myReduction;
   }


   public int getNumPeople()
   {
       return myNumPeople;
   }


   public boolean getPaper()
   {
       return myPaper;
   }


   public boolean getGlass()
   {
       return myGlass;
   }


   public boolean getPlastic()
   {
       return myPlastic;
   }


   public boolean getCans()
   {
       return myCans;
   }


   public double getEmissions()
   {
       return myEmissions;
   }


   public double getReduction()
   {
       return myReduction;
   }


   public double getNetEmissions()
   {
       return myNetEmissions;
   }


    public void main(String[] args) {


        System.out.println("\t \t \t \t \t \t \t Household Waste \t \t \t \t \t Pounds of CO2");
        System.out.println("| Index | People | Paper | Plastic | Glass | Cans | Total Emissions | Reduction | Net Emissions |");
        System.out.println("|-------|--------|-------|---------|-------|------|-----------------|-----------|---------------|");
        System.out.println("|   0   |" + myNumPeople   + "  |   " + myPaper + "  |   " + myPlastic  + "   |   " + myGlass + "" +
                "     |    " + myCans + "   |   " + myEmissions + "   |   " + myReduction + "    |    " + myNetEmissions + "   |    " + myReduction + "   |   " + myNetEmissions + "  ");\
        System.out.println("|-------|--------|-------|---------|-------|------|-----------------|-----------|---------------|");
    }


}