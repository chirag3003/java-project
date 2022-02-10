
/* 
    Wap in java to accept a number from the user and print the sum of the factors of the number except the number itself using recursion
    Example:
    Input : 6 
    Calculation : 1 + 2 + 3
    Output : 6
    Example 2: 
    Input: 8
    Calculation: 1 + 2 + 4
    Output: 7 
*/
import java.io.*;

class sum {
    // calculates the sum of the factors
    int add(int num, int r) {
        if (r > num / 2) {
            // returns 0 if r is out of range
            return 0;
        }
        if (num % r == 0) { // checks if r is a factor of num or not
            // adds r if it is a factor and then moves on to the next number
            return r + add(num, r + 1);
        } else {
            // directly moves on to the next number if r is not factor
            return add(num, r + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sum ob = new sum();
        System.out.print("Enter a Number: ");
        int num = Integer.parseInt(br.readLine()); // accepts the number from the user
        // prints the sum of the factors
        System.out.println("The sum of the factors is: " + ob.add(num, 1));

    }
}