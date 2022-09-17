
/**
 * Input a word in uppercase and check for the position of the first occurring
 * vowel and perform the following operation. [10]
 * (i) Words that begin with a vowel are concatenated with “Y”.
 * For example, EUROPE becomes EUROPEY.
 * (ii) Words that contain a vowel in-between should have the first part from
 * the position of the vowel till the end, followed by the part of the string
 * from beginning till the position of the vowel and is concatenated by “C”.
 * For example, PROJECT becomes OJECTPRC.
 * (iii) Words which do not contain a vowel are concatenated with “N”.
 * For example, SKY becomes SKYN.
 * Design a class Rearrange using the description of the data members and member
 * functions given below:
 * Class name: Rearrange
 * Data Members/instance variables:
 * Txt: to store a word
 * Cxt: to store the rearranged word
 * len: to store the length of the word
 * Member functions:
 * Rearrange (): constructor to initialize the instance variables
 * void readword (): to accept the word input in UPPER CASE
 * void convert (): converts the word into its changed form and stores it in
 * string Cxt
 * void display(): displays the original and the changed word
 * Specify the class Rearrange giving the details of the constructor (), void
 * readword ( ), void convert () and void display (). Define a main () function
 * to create an object and call the function accordingly to enable the task.
 */

import java.io.*;

class Rearrange {
    String var_Txt;
    String var_Cxt;
    int var_Len;

    public Rearrange() {
        var_Txt = "";
        var_Cxt = "";
        var_Len = 0;
    }

    // accepts input from the user
    public void readword() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        var_Txt = br.readLine().trim().toUpperCase();
        var_Len = var_Txt.length();
    }

    // checks if a letter is a vowel or not
    static boolean isVowel(char l) {
        if (l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
            return true;
        }
        return false;
    }

    // converts the string
    public void convert() {
        if (isVowel(var_Txt.charAt(0))) {
            var_Cxt = var_Txt + "Y";
        } else {
            boolean containsVowel = false;
            for (int i = 1; i < var_Len; i++) {
                if (isVowel(var_Txt.charAt(i))) {
                    containsVowel = true;
                    var_Cxt = var_Txt.substring(i) + var_Txt.substring(0, i) + "C";
                    break;
                }
            }
            if (!containsVowel) {
                var_Cxt = var_Txt + "N";
            }
        }
    }

    // displays the original and the converted string
    public void display() {
        System.out.println("The original string is " + var_Txt);
        System.out.println(" The new String is " + var_Cxt);
    }

    public static void main(String[] args) throws IOException {
        Rearrange obj = new Rearrange();
        obj.readword(); // accepts the string from the user
        obj.convert(); // converts the string
        obj.display(); // displays the original and the converted string
    }
}