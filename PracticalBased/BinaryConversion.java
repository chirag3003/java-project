import java.util.Scanner;

public class BinaryConversion {
    static String numberToBinary(int var_number) {
        //Ending the recursion if the number is 1 or 0
        if (var_number == 0)
            return "0";
        if (var_number == 1)
            return "1";
        int var_rem = var_number % 2;
        return numberToBinary(var_number / 2) + var_rem;
    }

    public static void main(String[] args) {
        //Accepting the number from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int var_number = sc.nextInt();
        //Printing the binary number
        System.out.println("Its binary equivalent: " + numberToBinary(var_number));
    }
}
