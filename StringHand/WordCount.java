package StringHand;

/**
 * Define a class WordCount to count the number of words in a given sentence
 */

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :=");
        String sen = sc.nextLine(); // accepts a sentence from the user
        int count = sen.length() > 0 ? 1 : 0;
        // loops over every character in the senetence to find the words
        for (int i = 1; i < sen.length(); i++) {
            if (sen.charAt(i) == ' ' && sen.charAt(i - 1) != ' ') {
                count++;
            }
        }
        // prints the number of words
        System.out.println("Number of words: " + count);
    }
}
