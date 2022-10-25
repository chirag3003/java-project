import java.util.Scanner;

public class Rectangle {
    double var_l;
    double var_b;
    double var_area = 0;
    double var_per = 0;

    Rectangle(Double var_l, double var_b) {
        this.var_l = var_l;
        this.var_b = var_b;
    }

    void calculate() {
        // calculating area and perimeter
        var_area = var_l * var_b;
        var_per = 2 * (var_l + var_b);
    }

    void display() {
        // display area and perimeter
        System.out.println("Area: " + var_area);
        System.out.println("Perimeter: " + var_per);
    }

    boolean isEqual(Rectangle ob) {
        // comparing ob with this object
        if (ob.var_l == var_l && ob.var_b == var_b)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double var_l = 0.0, var_b = 0.0;
        // Accepting the first rectangle
        System.out.println("First Rectangle: ");
        System.out.print("Length: ");
        var_l = sc.nextDouble();
        System.out.print("Breadth: ");
        var_b = sc.nextDouble();
        // object for the first rectangle
        Rectangle one = new Rectangle(var_l, var_b);
        // Accepting the second rectangle
        System.out.println("Second Rectangle: ");
        System.out.print("Length: ");
        var_l = sc.nextDouble();
        System.out.print("Breadth: ");
        var_b = sc.nextDouble();
        // object for the second rectangle
        Rectangle two = new Rectangle(var_l, var_b);
        // Accepting the third rectangle
        System.out.println("Third Rectangle: ");
        System.out.print("Length: ");
        var_l = sc.nextDouble();
        System.out.print("Breadth: ");
        var_b = sc.nextDouble();
        // object for the third rectangle
        Rectangle three = new Rectangle(var_l, var_b);
        System.out.println("Area and perimeter of the first rectangle: ");
        one.calculate();
        one.display();

        // Checking if the first rectangle and the second rectangle are the same
        if (one.isEqual(two)) {
            System.out.println("The first and the second rectangle are equal");
        } else {
            System.out.println("The first and the second rectangle are not equal");
        }
        // check if the first rectangle and the third rectangle are the same
        if (one.isEqual(three)) {
            System.out.println("The first and the third rectangle are equal");
        } else {
            System.out.println("The first and the third rectangle are not equal");
        }

    }
}
