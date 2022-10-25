
//  Design the class Shift to shuffle the matrix (the first row becomes the
//  last, the second row becomes the first and so on.)
 
//  Class name :Shift
//  Data members
//  mat[][], m,n;
//  Member functions:
//  Shift(int mm, int nn) : constructor to initialize the data members m=mm and
//  n=nn
//  void input() : enters the elements of the array
//  void cyclic(Shift P) : enables the matrix of the object(P) to shift each row
//  upwards in a cyclic manner and store the resultant matrix in the current
//  object.
//  void display() : display the matrix elements.
//  Define the main() to create an object and call the methods accordingly to
//  enable the task of shifting the array elements.


import java.util.Scanner;
public class Shift {
    static Scanner sc = new Scanner(System.in);
    int[][] var_mat;
    int var_m, var_n;

    Shift(int var_m, int var_n) {
        this.var_m = var_m;
        this.var_n = var_n;
        var_mat = new int[var_m][var_n];
    }

    // take inputs from the and store them in any array(mat[][])
    void input() {
        System.out.println("Enter elements");
        for (int var_i = 0; var_i < var_m; var_i++)
            for (int var_j = 0; var_j < var_n; var_j++)
                var_mat[var_i][var_j] = sc.nextInt();
    }

    // display the elements the in the matrix(mat[][])
    void display() {
        for (int var_i = 0; var_i < var_m; var_i++) {
            System.out.println();
            for (int var_j = 0; var_j < var_n; var_j++)
                System.out.print(var_mat[var_i][var_j] + "\t");
        }
        System.out.println();
    }

    // shift hte elements in the array
    void cyclic(Shift P) {
        for (int var_i = 0; var_i < var_m; var_i++)
            for (int var_j = 0; var_j < var_n; var_j++) {
                if (var_i != 0)
                    var_mat[var_i - 1][var_j] = P.var_mat[var_i][var_j];
                else
                    var_mat[var_m - 1][var_j] = P.var_mat[0][var_j];
            }
    }

    public static void main(String[] args) {
        Shift x = new Shift(3, 3);
        Shift y = new Shift(3, 3);
        x.input();
        y.cyclic(x);
        System.out.println("Initial array is ");
        x.display(); // display the array without shift
        System.out.print("Array after the shift ");
        y.display(); // display the array after shift
    }
}