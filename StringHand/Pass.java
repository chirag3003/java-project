import java.util.*;

public class Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var_up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String var_lp = var_up.toLowerCase();
        String var_n = "1234567890";
        String var_sp = "!@#$%^&*;:,.<>/?`~";
        String var_com = var_up + var_lp + var_n + var_sp; // Combines all the possible characters together
        System.out.println("Pls enter the size of your passowrd");
        int var_len = sc.nextInt();
        // Craetes a charecter array of length as given by the user
        char[] var_pass = new char[var_len];
        // Gives a random output everytime
        for (int var_i = 0; var_i < var_len; var_i++) { // initializing the array
            var_pass[var_i] = var_com.charAt((int) Math.floor(Math.random() * var_com.length())); // Takes r and com and
            // creates the password
        }
        System.out.println("The generated password is:" + new String(var_pass));
        // Converts the array into a string and prints it

    }
}
