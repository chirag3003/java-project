
/*
Write a Program in Java to input a number and check whether it is a Fascinating Number or not.

Fascinating Numbers: Some numbers of 3 digits or more exhibit a very interesting property. The property is such that, when the number is multiplied by 2 and 3, and both these products are concatenated with the original number, all digits from 1 to 9 are present exactly once, regardless of the number of zeroes.

Let's understand the concept of Fascinating Number through the following example:
Consider the number 192
192 x 1 = 192
192 x 2 = 384
192 x 3 = 576
Concatenating the results: 192 384 576
It could be observed that '192384576' consists of all digits from 1 to 9 exactly once. Hence, it could be concluded that 192 is a Fascinating Number. Some examples of fascinating Numbers are: 192, 219, 273, 327, 1902, 1920, 2019 etc.
*/
import java.io.*;

public class Fascinating {
    // finds the products of the number and joins them
    static String concatProducts(int var_num) {
        String var_sum = "";
        for (int i = 1; i <= 3; i++) {
            var_sum += Integer.toString(var_num * i);
        }
        return var_sum;
    }

    // counts the times every digit has been used in the joined number
    static int[] countDigits(String var_number) {
        int[] var_digits = new int[10];
        for (int i = 0; i < var_number.length(); i++) {
            ++var_digits[Integer.parseInt(var_number.charAt(i) + "")];
        }
        return var_digits;
    }

    // checks if the number is fascinating or not
    boolean isFascinating(int var_num) {
        String var_number = concatProducts(var_num);
        int[] var_digits = countDigits(var_number);
        for (int i = 1; i < 10; i++) {
            if (var_digits[i] != 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int var_num = Integer.parseInt(br.readLine()); // accepts input from the user
        Fascinating ob = new Fascinating();
        System.out.println(ob.isFascinating(var_num) ? "It is a fascinating number." : "It is not a fascinating number");
    }
}
