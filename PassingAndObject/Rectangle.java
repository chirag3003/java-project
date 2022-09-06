public class Rectangle {
    double l;
    double b;
    double area = 0;
    double per = 0;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void calculate() {
        area = l * b;
        per = 2 * (l + b);
    }

    void display() {
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + per);
    }

    boolean isEqual(Rectangle ob) {
        if (ob.l == l && ob.b == b)
            return true;
        return false;
    }
}
