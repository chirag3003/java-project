
/**
 * Define a class WordCount to count the number of words in a given sentence
 */

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence :=");
        String var_sen = sc.nextLine(); // accepts a sentence from the user
        int var_count = var_sen.length() > 0 ? 1 : 0;
        // loops over every character in the senetence to find the words
        for (int var_i = 1; var_i < var_sen.length(); var_i++) {
            if (var_sen.charAt(var_i) == ' ' && var_sen.charAt(var_i - 1) != ' ') {
                var_count++;
            }
        }
        // prints the number of words
        System.out.println("Number of words: " + var_count);
    }
}
