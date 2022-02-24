// Write a program to take out the tax of a employee. Print the pan number, name , taxable income , and  tax in proper alignment
// tax is 
// 0-100000 – no tax 
// 100001-150000 -10% 
// 150001-250000 20% 
// more than 250000 – 30% 

import java.util.*;

class Employee {
    String pan;
    double taxin;
    double tax;
    String name;

    // accepts user data
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        name = sc.nextLine();
        System.out.println("Enter pan number");
        pan = sc.nextLine();
        System.out.println("Enter Taxable income");
        taxin = sc.nextDouble();
    }

    // calculates the tax user has to pay based on his income
    public void cal() {
        if (taxin <= 100000) {
            tax = 0;
        }
        if (taxin > 100000 && taxin <= 150000) {
            double extra = taxin - 100000.0;
            tax = (10.0 / 100.0) * extra;
        }
        if (taxin > 150000 && taxin <= 250000) {
            double extra1 = taxin - 150000.0;
            tax = 500.0 + ((20.0 / 100.0) * extra1);
        }
        if (taxin > 250000) {
            double extra2 = taxin - 250000.0;
            tax = 2500.0 + ((30.0 / 100.0) * extra2);
        }
    }

    public void display() {
        System.out.println("PAN NUMBER \t\t Name \t\t TaxableIncome \t\t TaxofEmployee");
        System.out.println(pan + " \t\t " + name + " \t\t " + taxin + " \t\t " + tax);
    }

    public static void main(String[] args) {
        Employee ob = new Employee();
        ob.input();
        ob.cal();
        ob.display();
    }
}
