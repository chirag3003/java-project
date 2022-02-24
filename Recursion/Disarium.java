
/**
 * A disarium number is a number in which the sum of the digits to the power of
 * their respective position is equal to the number itself.
 * Example: 135 = 1^1+ 3^2 + 5^3
 * Hence, 135 is a disarium number.
 * 
 * Design a class Disarium to check if a given number is a disarium number or
 * not. Some of the members of the class are given below:
 * 
 * Class name : Disarium
 * 
 * Data members/instance variables:
 * int num : stores the number
 * int size : stores the size of the number
 * 
 * Methods/Member functions:
 * Disarium(int nn) : parameterized constructor to initialize the data members n
 * = nn and size = 0
 * void countDigit( ) : counts the total number of digits and assigns it to size
 * int sumofDigits(int n, int p) : returns the sum of the digits of the
 * number(n) to the power of their respective positions(p) using recursive
 * technique
 * void check( ) : checks whether the number is a disarium number and displays
 * the result with an appropriate message.
 * 
 * Specify the class Disarium giving the details of the constructor( ), void
 * countDigit( ), int sumofDigits(int, int) and void check( ). Define the main(
 * ) function to create an object and call the functions accordingly to enable
 * the task.
 * 
 * 
 */

import java.io.*;

public class Disarium {
    int num;
    int size;

    Disarium(int nn) {
        num = nn;
        size = 0;
    }

    void countDigit() {
        size = String.valueOf(num).length();
    }

    int sumofDigits(int n, int p) {
        if (n == 0)
            return 0;
        return ((int) Math.pow(n % 10, p)) + sumofDigits(n / 10, p - 1);
    }

    void check() {
        if (num == sumofDigits(num, size)) {
            System.out.println("disarium");
        } else
            System.out.println("not a disarium");

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        Disarium obj = new Disarium(Integer.parseInt(br.readLine()));

        obj.countDigit();
        obj.check();
    }
}
