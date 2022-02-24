import java.io.*;

public class Factorial {

    // calculates the factorial of the number
    int factorial(int num) {
        if (num < 2) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) throws IOException {

        Factorial ob = new Factorial();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int num = Integer.parseInt(br.readLine()); // accepts the number from the user
        System.out.println("The factorial of number " + num + " is: " + ob.factorial(num));
    }
}
