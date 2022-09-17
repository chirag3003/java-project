import java.io.*;

public class Factorial {

    // calculates the factorial of the number
    int factorial(int var_num) {
        if (var_num < 2) {
            return 1;
        }
        return var_num * factorial(var_num - 1);
    }

    public static void main(String[] args) throws IOException {

        Factorial ob = new Factorial();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int var_num = Integer.parseInt(br.readLine()); // accepts the number from the user
        System.out.println("The factorial of number " + var_num + " is: " + ob.factorial(var_num));
    }
}
