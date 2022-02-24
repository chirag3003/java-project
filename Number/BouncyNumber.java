/*A number is said to Bouncy number if the digits of the number are unsorted.

For example,
22344 - It is not a Bouncy number because the digits are sorted in ascending order.
774410 - It is not a Bouncy number because the digits are sorted in descending order.
155349 - It is a Bouncy number because the digits are unsorted.
A number below 100 can never be a Bouncy number.

Write a program in java to accept a number. Check and display whether it is a Bouncy number or not. */

import java.io.*;

public class BouncyNumber {
    static boolean isAscending(String num) {
        if (num.length() < 2)
            return true;
        int first = Integer.parseInt(num.charAt(0) + "");
        int second = Integer.parseInt(num.charAt(1) + "");
        if (first == second)
            return isAscending(num.substring(1));
        return second > first;
    }

    boolean isBouncy(String num) {
        if (num.length() < 3)
            return false;
        boolean ascending = isAscending(num);
        for (int i = 2; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(i - 1)) {
                if (ascending) {
                    if (Integer.parseInt(num.charAt(i) + "") < Integer.parseInt(num.charAt(i - 1) + ""))
                        return true;
                } else {
                    if (Integer.parseInt(num.charAt(i) + "") > Integer.parseInt(num.charAt(i - 1) + ""))
                        return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        String num = br.readLine();
        BouncyNumber ob = new BouncyNumber();
        System.out.println(ob.isBouncy(num) ? "It is a Bouncy Number" : "It is not a Bouncy Number");
    }
}
