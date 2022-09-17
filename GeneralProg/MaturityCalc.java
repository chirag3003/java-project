import java.util.*;

class Reallife {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating an object of the scanner class
        System.out.println("enter 1 for term deposit and enter 2 for  recurring deposit");
        int var_ch = sc.nextInt(); // accepting the user choice
        switch (var_ch) {
            case 1:
                System.out.print("Enter principal: ");
                int var_P = sc.nextInt(); // accepting the principal amount
                System.out.print("Enter rate of interest: ");
                int var_r = sc.nextInt(); // accepting the rate of interest
                System.out.print("Enter period in years: ");
                int var_n = sc.nextInt(); // accepting the period in years
                double var_ma = var_P * Math.pow(1 + var_r / 100.0, var_n);
                // printing the maturity amount
                System.out.println("Maturity Amount is " + var_ma);
                break;
            case 2:
                System.out.print("Enter monthly installment: ");
                int var_P2 = sc.nextInt(); // accepting the monthly installment
                System.out.print("Enter rate of interest: ");
                int var_r2 = sc.nextInt(); // accepting the rate of interest
                System.out.print("Enter period in months: ");
                int var_n2 = sc.nextInt(); // accepting the period in months
                double var_ma2 = var_P2 * var_n2 + var_P2 * (var_n2 * (var_n2 + 1) / 2.0) * (var_r2 / 100.0) * (1.0 / 12);
                // printing the maturity amount
                System.out.println("Maturity Amount is " + var_ma2);
                break;
            default: // printing error statement if user entered a wrong choice
                System.out.println("Invalid choice");
        }
    }
}