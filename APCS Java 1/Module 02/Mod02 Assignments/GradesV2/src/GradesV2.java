import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* Made by Jack Nishanian
* 9/17/16
*calculates a average evey time you add a number
 */


public class GradesV2 {

    public static void main(String[] args) {
        List<Integer> testGrades = new ArrayList<Integer>();
        boolean exit = false; // Used to decide when to exit
        Scanner myScanner = new Scanner(System.in); // Gets input

        //Start from bottom
        for (int i = 0; i < 100; ++i) System.out.println();

        while(!exit)
        {
            System.out.println("Please enter a number or \"exit\" to exit");
            String input = myScanner.nextLine(); // Gets input

            //Clear screen:
            for (int i = 0; i < 100; ++i) System.out.println();

            if(isInteger(input)) // Runs if input is a int
            {
                testGrades.add(Integer.parseInt(input)); // Converts the string to a int

                // This is a cooler way to do average
                double average = testGrades
                        .stream() //Get streamable from list.
                        .mapToDouble(a -> a) // Getting all of the integers as doubles
                        .average() //Get average of those numbers
                        .getAsDouble(); //Get as simple double

                int total = 0, count = 0;
                double averageSoFar = 0;
                for(Integer grade : testGrades) // Calculates average
                {
                    count++;
                    total+= grade;
                    averageSoFar = (double) total / (double) count; // Calculating average
                    System.out.println("n = " + count + "  New Test Grade: " + grade + "  Total Points: " + total + "  Average Score: " + averageSoFar); // Output
                }

                System.out.println("The total average is " + average); // Output average
            }
            else if(input.equalsIgnoreCase("exit")) // exit statement
                exit = true;
            else
                System.out.println("Enter a valid number."); // tells user to enter a valid number


        }

    }

    public static boolean isInteger(String input) // Tells you if it is a int or not
    {
        try
        {
            if(input.isEmpty()) // If it is empty it will return false
                return false;
            Integer.parseInt(input); // If it is a int will return true
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
}
