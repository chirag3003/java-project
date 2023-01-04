
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

class Date2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first date
        System.out.print("Enter the first date (DD MM YYYY): ");
        int day1 = scanner.nextInt();
        int month1 = scanner.nextInt();
        int year1 = scanner.nextInt();

        // Input the second date
        System.out.print("Enter the second date (DD MM YYYY): ");
        int day2 = scanner.nextInt();
        int month2 = scanner.nextInt();
        int year2 = scanner.nextInt();

        // Create Calendar objects for the two dates
        Calendar date1 = new GregorianCalendar(year1, month1 - 1, day1);
        Calendar date2 = new GregorianCalendar(year2, month2 - 1, day2);

        // Calculate the difference in days
        long diffInMilliseconds = Math.abs(date1.getTimeInMillis() - date2.getTimeInMillis());
        long diffInDays = diffInMilliseconds / (24 * 60 * 60 * 1000);

        // Print the result
        System.out.println("Number of days elapsed between the two dates: " + diffInDays);
    }
}

/*
 * chiragbhalotia0412@gmail.com
 * Write a program to input two valid dates, each comprising of Day (2 digits),
 * Month (2 digits) and Year (4 digits) and calculate the days elapsed between
 * both the dates.
 */

/*
 * Import the java.util.Scanner, java.util.Calendar, and java.util.GregorianCalendar classes.
 * Define the main method.
 * Create a Scanner object to read input from the user.
 * Prompt the user to input the first date and read the day, month, and year values using the nextInt method.
 * Prompt the user to input the second date and read the day, month, and year values using the nextInt method.
 * Create Calendar objects for the two dates using the GregorianCalendar  constructor and the input values.
 * Calculate the difference in milliseconds between the two dates using the  getTimeInMillis method and the abs function.
 * Convert the difference in milliseconds to days by dividing it by the number  of milliseconds in a day.
 * Print the result.
 * End the program.
 */