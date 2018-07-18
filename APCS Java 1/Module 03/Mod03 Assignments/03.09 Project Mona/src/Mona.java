//Jack Nishanian
//9/27/16
//
// this program sees if you have a overdue book
// no rma included
//
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class Mona {

    public static void main(String[] args) {

        double daileyFine = .25;
        double amountDue = 0;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your first name here: ");
        String firstName = myScanner.nextLine(); // Takes your first name in a variable

        System.out.println("Enter your last name here: ");
        String lastName = myScanner.nextLine();// Takes your last name in a variable

        System.out.println("Enter your phone number here (###) ###-##### :");
        String phoneNumber = myScanner.nextLine();// Takes your phone number in a variable

        System.out.println("Enter the title of the book: ");
        String title = myScanner.nextLine();// Takes title of the book in a variable

        System.out.println("Enter the date checked out mm/dd/yyyy: ");
        String date = myScanner.nextLine();// Takes your date of checkout in a variable

        String dateDue = "10/25/16"; // sets the due date

        String[] parts = dateDue.split("/"); // splits the due date
        String monthDue = parts[0];
        String dayDue = parts[1];// holds the values of the split due date
        String yearDue = parts[2];


        parts = date.split("/");// splits the due date
        String month = parts[0];
        String day = parts[1];// holds the values of the split due date
        String year = parts[2];

        int iMonth = Integer.parseInt(month);
        int iDay = Integer.parseInt(day);// converts the string to a int
        int iYear = Integer.parseInt(year);

        int iMonthDue = Integer.parseInt(monthDue);
        int iDayDue = Integer.parseInt(dayDue);// converts the string to a int
        int iYearDue = Integer.parseInt(yearDue);

        int daysOverdue = 0;

        Date due = new Date(iYearDue, iMonthDue, iDayDue);//sets a date
        Date currentDate = new  Date(iYear, iMonth, iDay);

        int days = (int)( (due.getTime() - currentDate.getTime()) / (1000 * 60 * 60 * 24));//does the math for the date overdue

        if(days > 0 )
            daysOverdue = days; // sets the days overdue
        else
            System.out.println("Not overdue"); // tells you it is not overdue

        amountDue = daysOverdue * daileyFine;

        System.out.println("The amount due for your overdue book is: " + amountDue);
        if (daysOverdue > 0)
        {
            System.out.println("----------------------------------------Text in email format--------------------" +
                    "--------------------");
            char first = lastName.charAt(0);
            char second = phoneNumber.charAt(0);// makes the email message
            System.out.println("To " + firstName + first + second + "@gmail.com");
            System.out.println("From mona@gmail.com");
            System.out.println("Subject: Overdue book");

            System.out.println("Hello " + firstName + " " + lastName + ",\nYou are currently in the possession of the book "
                    + title + " it is " + daysOverdue + " days late and you are being charged: $" +
                    amountDue + "\nThank you.");
        }
    }
}
