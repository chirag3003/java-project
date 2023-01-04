//Defining the base class
class Student {
    String name;
    int std, roll;

    Student(String name, int std, int roll) {
        this.name = name;
        this.std = std;
        this.roll = roll;
    }

    void display() {
        System.out.println("Name of the student :- " + name);
        System.out.println("Class :- " + std + " Roll No :- " + roll);
    }
}


//Defining the derived classes
class Result extends Student {
    int eng, maths, phy, chem, comp;
    int total;
    //constructor for the derived class
    Result(String name, int std, int roll, int eng, int maths, int phy, int chem, int comp) {
        //calling the constructor of the parent class
        super(name, std, roll);

        // initializing the instance variables of the derived class
        this.eng = eng;
        this.maths = maths;
        this.phy = phy;
        this.chem = chem;
        this.comp = comp;
    }

    //calculating the total marks excluding one subject with the lowest marks
    void calculate() {
        int low = Math.min(Math.min(Math.min(maths, phy), chem), comp);
        total = (eng + maths + phy + chem + comp) - low;
    }

    void display() {
        super.display();
        System.out.println("Total Marks :- " + total);
    }
}

class Output1 {
    public static void main(String name, int std, int roll, int eng, int maths, int phy, int chem, int comp) {
        Result ob = new Result(name, std, roll, eng, maths, phy, chem, comp);
        ob.calculate();
        ob.display();
    }
}

/*
      Define a base class Student with fields for name, standard, and roll number, and a method display to print these values.
    Define a derived class Result that extends the Student class, with fields for marks in English, Maths, Physics, Chemistry, and Computer Science, and a field for the total marks.
    In the Result class, define a constructor that calls the constructor of the base class and initializes the instance variables of the derived class.
    In the Result class, define a method calculate that calculates the total marks by adding up all the subject marks and subtracting the lowest marks.
    In the Result class, override the display method from the base class to print the name, standard, roll number, and total marks.
    In the main method, create a new Result object and pass the required values to the constructor.
    Call the calculate and display methods on the Result object.
    End the program.
 */