import java.util.Scanner;

public class Reverse {
    static String reverse(String var_input, String var_reversed) {
        int var_len = var_input.length();
        int var_len2 = var_reversed.length();
        // Comparing length of both the strings to check if the reverse process is
        // completed
        if (var_len == var_len2)
            return var_reversed;
        // Moving on to the next character
        String reverse = var_reversed + var_input.charAt(var_len - 1 - var_len2);
        return reverse(var_input, reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter a sentence: ");
        String st = sc.nextLine();
        // Printing the reversed sentence
        System.out.println("The string after reverse is: " + reverse(st, ""));
    }
}
