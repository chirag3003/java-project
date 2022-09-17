public class Rectangle {
    double var_l;
    double var_b;
    double var_area = 0;
    double var_per = 0;

    Rectangle(int var_l, int var_b) {
        this.var_l = var_l;
        this.var_b = var_b;
    }

    void calculate() {
        var_area = var_l * var_b;
        var_per = 2 * (var_l + var_b);
    }

    void display() {
        System.out.println("Area: " + var_area);
        System.out.println("Perimeter: " + var_per);
    }

    boolean isEqual(Rectangle ob) {
        if (ob.var_l == var_l && ob.var_b == var_b)
            return true;
        return false;
    }
}
