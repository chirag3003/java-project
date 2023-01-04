import java.util.Date;

class Date1 {
    public static void main(String[] args) {
        // Create a new Date object
        Date now = new Date();

        // Print the current date and time
        System.out.println("Current date and time:\t\t" + now.toString());

        // Get the current time in milliseconds
        long time = now.getTime();

        // Print the current time in milliseconds
        System.out.println("Current time in milliseconds:\t\t" + time);

        // Create a new Date object with a specific time in milliseconds
        Date past = new Date(time - 86400000L); // subtract 24 hours in milliseconds

        // Print the past date
        System.out.println("Past date:\t\t" + past.toString());

    }
}

// Write a program in java to print current date and time , the current time in
// milliseconds, and the date and time 24 hrs ago

/*
 * Import the java.util.Date class.
 * Define the main method.
 * Create a new Date object representing the current date and time using the default constructor.
 * Print the current date and time using the toString method.
 * Get the current time in milliseconds using the getTime method.
 * Print the current time in milliseconds.
 * Create a new Date object with a specific time in the past (24 hours earlier) using the constructor that takes a long value representing the time in milliseconds.
 * Print the past date using the toString method.
 * End the program.
 */