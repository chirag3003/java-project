/*A number is said to Bouncy number if the digits of the number are unsorted.

For example,
22344 - It is not a Bouncy number because the digits are sorted in ascending order.
774410 - It is not a Bouncy number because the digits are sorted in descending order.
155349 - It is a Bouncy number because the digits are unsorted.
A number below 100 can never be a Bouncy number.

Write a program in java to accept a number. Check and display whether it is a Bouncy number or not. */

import java.io.*;

public class BouncyNumber {
    // checks if if the first two digits are in ascending order or not
    static boolean isAscending(String var_num) {
        if (var_num.length() < 2)
            return true;
        int var_first = Integer.parseInt(var_num.charAt(0) + "");
        int var_second = Integer.parseInt(var_num.charAt(1) + "");
        if (var_first == var_second)
            return isAscending(var_num.substring(1));
        return var_second > var_first;
    }

    // checks if the number is bouncy or not
    boolean isBouncy(String var_num) {
        // any number with less than 3 digits can not be a bouncy number
        if (var_num.length() < 3)
            return false;
        boolean var_ascending = isAscending(var_num);
        for (int i = 2; i < var_num.length(); i++) {
            if (var_num.charAt(i) != var_num.charAt(i - 1)) {
                if (var_ascending) {
                    if (Integer.parseInt(var_num.charAt(i) + "") < Integer.parseInt(var_num.charAt(i - 1) + ""))
                        return true;
                } else {
                    if (Integer.parseInt(var_num.charAt(i) + "") > Integer.parseInt(var_num.charAt(i - 1) + ""))
                        return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        String var_num = br.readLine(); // accepts the number from the user
        BouncyNumber ob = new BouncyNumber();
        System.out.println(ob.isBouncy(var_num) ? "It is a Bouncy Number" : "It is not a Bouncy Number");
    }
}
