
import java.util.*;

public class Encrypter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence to be encrypted of decrypted");
        String var_str = sc.nextLine(); // Accepts a encrypted or decrypted message from the user
        int var_n = var_str.length();
        String var_res = ""; // stores the message after encrytion or decryption
        // for loops to extract every character in the string
        for (int var_i = 0; var_i < var_n; var_i++) {
            char var_ca = var_str.charAt(var_i);
            int var_cv = (int) var_ca;
            // changes ascii value to encrypt or decrypt the character
            if ((var_cv > 64 && var_cv < 78) || (var_cv > 96 && var_cv < 110)) {
                var_ca = (char) (var_cv + 13);
            } else if ((var_cv > 77 && var_cv < 91) || (var_cv > 109 && var_cv < 123)) {
                var_ca = (char) (var_cv - 13);
            }
            // adding the resultant character to the result
            var_res = var_res + var_ca;
        }
        System.out.println(var_res);
    }
}