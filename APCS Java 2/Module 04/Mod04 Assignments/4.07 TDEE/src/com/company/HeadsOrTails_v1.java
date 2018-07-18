package com.company;
/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 * 
 * @author B. Jordan 
 * @version 04/01/08
 */
import java.util.Scanner;
public class HeadsOrTails_v1
{
	public static void main(String[] args)
	{
	    int heads = 0;
	    int tails = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    int totalHeads = 0;
		int totalTails = 0;

	    System.out.println("How many times will the coin be flipped? ");
	    int flips = in.nextInt();
	    int Rounds = 0;
		while(Rounds < 5)
		{
			heads = 0;
			tails = 0;
			counter = 1;
			while(counter <= flips)
			{
				randNum = Math.random();

				if(randNum < .49)
				{
					heads++;
				}
				else
				{
					tails++;
				}
				counter++;
			}
			System.out.println();
			System.out.println("Round: " + (Rounds + 1));
			System.out.println("Number of Heads = " + heads);
			System.out.println("Number of Tails = " + tails);
			totalTails += tails;
			totalHeads += heads;
			Rounds++;
		}
		double averageHeads = 0;
		double averageTails = 0;

		averageHeads = (double) totalHeads/(Rounds);
		averageTails = (double) totalTails/(Rounds);

		System.out.println("Average heads: " + averageHeads);
		System.out.println("Average tails: " + averageTails);



	    
	    
	    
	}
}
