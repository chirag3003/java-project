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

/*
 * Write a Java program to demonstrate inheritance and method overriding. The
 * program should define a base class Base with a field a and a method show to
 * print the value of a. It should also define a derived class Child that
 * extends the Base class and has a field b and a method display to print the
 * value of b. The Child class should also override the show method from the
 * Base class. In the main method, create an object of the Child class and call
 * both the show and display methods on it. Use appropriate constructors in the
 * base and derived classes to initialize the values of a and b.
 */

 /*
    1. Define a base class Base with a field a and a method show to print the value of a.
    2. Define a constructor for the Base class that initializes the value of a.
    3. Define a derived class Child that extends the Base class, with a field b.
    4. Define a constructor for the Child class that initializes the value of b.
    5. Define a method display in the Child class to print the value of b.
    6. In the main method:
            Create a new Child object.
            Call the show method on the Child object to print the value of a from the base class.
            Call the display method on the Child object to print the value of b from the derived class.
    7. End the program.
  */