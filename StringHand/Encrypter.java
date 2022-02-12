package StringHand;

import java.util.*;

public class Encrypter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence to be encrypted of decrypted");
        String str = sc.nextLine(); // Accepts a encrypted or decrypted message from the user
        int n = str.length();
        String res = ""; // stores the message after encrytion or decryption
        // for loops to extract every character in the string
        for (int i = 0; i < n; i++) {
            char ca = str.charAt(i);
            int cv = (int) ca;
            // changes ascii value to encrypt or decrypt the character
            if ((cv > 64 && cv < 78) || (cv > 96 && cv < 110)) {
                ca = (char) (cv + 13);
            } else if ((cv > 77 && cv < 91) || (cv > 109 && cv < 123)) {
                ca = (char) (cv - 13);
            }
            // adding the resultant character to the result
            res = res + ca;
        }
        System.out.println(res);
    }
}