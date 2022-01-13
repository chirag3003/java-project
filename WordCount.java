
/**
 * Define a class WordCount to count the number of words in a given sentence
 */

import java.io.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence :=");
        String sen = br.readLine().trim();
        int count = sen.length() > 0 ? 1 : 0;
        for (int i = 1; i < sen.length(); i++) {
            if (sen.charAt(i) == ' ' && sen.charAt(i - 1) != ' ') {
                count++;
            }
        }
        System.out.println("Number of words: " + count);
    }
}
