
/**
 * The purpose of this program is to demonstrate the use 
 * of escape sequences when printing literal constants.
 * 
 * Read the instructions in the comments for each block 
 * of code below so that you can experiment on your own.
 * 
 * @author FLVS
 * @version 06/03/16
 */
public class EscapeCharacters
{
	public static void main(String[] args)
	{
	    // Use of the newline escape sequence: \n
	    // What happens if you delete the n after the backslashes?
	    // What happens if you change println to print?
	    System.out.print("This\ndemonstrates\nthe\nnewline\nescape\nsequence\n.");
		//It adds a new line if you switch it.
		System.out.println("This\ndemonstrates\nthe\nnewline\nescape\nsequence\n.");

		//If I remove the n after the \ I get syntax problems
		//System.out.println("This\ndemonstrates\nthe\nnewline\escape\sequence\.");


		// Use of the tab escape sequence: \t
		System.out.print("This\tdemonstrates\tthe\ttab\tescape\tsequence\t.");

	    // What happens if you delete the t after the backslashes?
		//Same thing as removing the n, syntax problems.

	    // What happens if you change print to println?
		//It prints a new line:
		System.out.println("This\tdemonstrates\tthe\ttab\tescape\tsequence\t.");

	    // Try to discover how many tab positions it is practical to print  
	    // across the screen by modifying the following print statement.

	    System.out.print("Tab \tTab \tTab \tTab \tTab \tTab \tTab \tTab \tTab \tTab \tTab \tTab \tTab \tTab " +
				"\tTab \tTab \tTab \tTab \tTab \tTab \tTab \tTab \n");
	    System.out.println();   
		// 22 Tabs is the practical amount of tabs to use

	    // Use the escape sequence for quotation marks: \"
		System.out.println(" \"Quotation marks\" \"Quotation marks\" \"Quotation marks\" \"Quotation marks\"" +
				" \"Quotation marks\" \"Quotation marks\" \"Quotation marks\" ");


	    // The print statement should display the following to the screen: 
	    // Anna said, "Please use escape sequences correctly."
	    System.out.println("\"Please use escape sequences correctly\" ");

		// There should be quotes around what Anna said.
	    // What happens if you remove the \ before the "?
		//System.out.println(""Please use escape sequences correctly" ");
		// We get errors because of syntax

	    /*
	    System.out.println("Anna said, \"Please use escape sequences correctly.\"");
	    System.out.println();   
	    */  

	    // Use the escape sequence for backslashes: \\
	    // The print statement should display the following to the screen: 
	    // The file path is: C:\JavaProjects\LiteralConstants.java
	    // There should be quotes around the file path and there should be backslashes where indicated.
		System.out.println("The file bath is: \"C:\\JavaProjects\\LiteralConstants.java\" ");

	    // What happens if change the \\ to just \?
	    //System.out.println("The file path is: C:\JavaProjects\LiteralConstants.java");
	    //System.out.println();
	    // You get a syntax error

	}//end of main method
}//end of class