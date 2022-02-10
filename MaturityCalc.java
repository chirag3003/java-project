import java.util.*;

class Reallife {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creating an object of the scanner class
        System.out.println("enter 1 for term deposit and enter 2 for  recurring deposit");
        int ch = sc.nextInt(); // accepting the user choice
        switch (ch) {
            case 1:
                System.out.print("Enter principal: ");
                int P = sc.nextInt(); // accepting the principal amount
                System.out.print("Enter rate of interest: ");
                int r = sc.nextInt(); // accepting the rate of interest
                System.out.print("Enter period in years: ");
                int n = sc.nextInt(); // accepting the period in years
                double ma = P * Math.pow(1 + r / 100.0, n);
                // printing the maturity amount
                System.out.println("Maturity Amount is " + ma);
                break;
            case 2:
                System.out.print("Enter monthly installment: ");
                int P2 = sc.nextInt(); // accepting the monthly installment
                System.out.print("Enter rate of interest: ");
                int r2 = sc.nextInt(); // accepting the rate of interest
                System.out.print("Enter period in months: ");
                int n2 = sc.nextInt(); // accepting the period in months
                double ma2 = P2 * n2 + P2 * (n2 * (n2 + 1) / 2.0) * (r2 / 100.0) * (1.0 / 12);
                // printing the maturity amount
                System.out.println("Maturity Amount is " + ma2);
                break;
            default: // printing error statement if user entered a wrong choice
                System.out.println("Invalid choice");
        }
    }
}