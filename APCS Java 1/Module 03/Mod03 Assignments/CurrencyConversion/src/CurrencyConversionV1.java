import java.util.Scanner;
/**
 * The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 *
 * �CSA/FLVS 2011
 * @author Maria Vieta Jacquard
 * @version 09/01/11
 *
 * Jack Nishanian
 * 9/17/16
 * This program transfers currency from
 * one type to a other type
 */
public class CurrencyConversionV1
{
    public static void main(String [ ] args)
    {
        double startingUsDollars = 5000.00;		// local variable for US Dollars
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent
        double pesoExchangeRage = 0.0;          // local variable for exchange rate of US Dollars to Pesos
        double dollarsSpentInMexico = 0.0;      // local variable for dollars spent in Mexico
        double remainingUsDollars = 0.0;        // local variable for US Dollars remaining

		double usToMexico = 19.23730;
		double usToYen = 102.2205;
		double usToEuro = 0.888840;

		int amount = 0;
		double amountAfter = 0;

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

		Scanner myScanner = new Scanner(System.in);

		System.out.println("How many USD would you like to convert to Pesos? ");
		amount = myScanner.nextInt();
		amountAfter = amount * usToMexico;
		System.out.println("The amount of Pesos you will have is: $" + amountAfter);


		System.out.println("How many USD would you like to convert to Yen? ");
		amount = myScanner.nextInt();
		amountAfter = amount * usToYen;
		System.out.println("The amount of Yen you will have is: ¥" + amountAfter);


		System.out.println("How many USD would you like to convert to Euros? ");
		amount = myScanner.nextInt();
		amountAfter = amount * usToEuro;
		System.out.println("The amount of Euros you will have is: €" + amountAfter);


        //print output to the screen
        // code goes below here


        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		double costItem1 = 4;  						//cost per item of first souvenir
		double budget1 = 50;   						//budget for first item
		double totalItem1 = 0; 		//how many items can be purchased
		double fundsRemaining1 = 0.0;  //how much of the budget is left
		fundsRemaining1 = budget1 % costItem1;

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		double budget2 = 713;   							//budget for second item
		double totalItem2 = 0; 	//how many items can be purchased
		double fundsRemaining2 = 0.0;  	//how much of the budget is left
		totalItem2 = budget2 / costItem2;
		fundsRemaining2 = budget2 % costItem2;

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

