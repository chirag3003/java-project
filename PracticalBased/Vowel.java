import java.util.Scanner;

public class Vowel {
    static int countVowel(String var_word) {
        int c = 0;
        var_word = var_word.toLowerCase();
        char[] var_vowels = { 'a', 'e', 'i', 'o', 'u' };
        // Looping over every character of the word to find the vowels
        for (int var_i = 0; var_i < var_word.length(); var_i++) {
            // looping through every vowel to find a match
            for (int var_j = 0; var_j < var_vowels.length; var_j++) {
                if (var_word.charAt(var_i) == var_vowels[var_j]) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // accepting the senetence
        System.out.println("Enter a sentence:");
        String var_str = sc.nextLine();
        int var_max = 0;
        String var_maxWord = "";
        String var_word = "";
        for (int var_i = 0; var_i < var_str.length(); var_i++) {
            // finding words
            if (var_str.charAt(var_i) == ' ' || var_i == var_str.length() - 1) {
                // counting the vowels in the word and checking if it has the max number of
                // vowels
                if (var_i == var_str.length() - 1) {
                    var_word += var_str.charAt(var_i);
                }
                if (countVowel(var_word) > var_max) {
                    var_max = countVowel(var_word);
                    var_maxWord = var_word;
                }
                var_word = "";
            } else {
                var_word += var_str.charAt(var_i);
            }

        }
        if (var_max == 0)
            System.out.println("No words with vowels found");
        else
            System.out.println(var_maxWord);

    }
}
