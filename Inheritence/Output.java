class Output {
    public static void main() {
        Child ob = new Child();
        // running the method of the base class
        ob.show();
        // running the method of the child class
        ob.display();
    }
}

class Base {
    int a;
    // Constructor for the base class
    Base() {
        a = 10;
    }
    void show() {
        System.out.println("Value of a = " + a);
    }
}

class Child extends Base {
    int b;
    // Constructor for the child class
    Child() {
        b = 50;
    }
    void display() {
        System.out.println("Value of b = " + b);
    }
}
