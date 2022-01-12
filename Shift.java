/*
 * 5. Design the class Shift to shuffle the matrix (the first row becomes the
 * last, the second row becomes the first and so on.)
 * 
 * Class name :Shift
 * Data members
 * mat[][], m,n;
 * Member functions:
 * Shift(int mm, int nn) : constructor to initialize the data members m=mm and
 * n=nn
 * void input() : enters the elements of the array
 * void cyclic(Shift P) : enables the matrix of the object(P) to shift each row
 * upwards in a cyclic manner and store the resultant matrix in the current
 * object.
 * void display() : display the matrix elements.
 * Define the main() to create an object and call the methods accordingly to
 * enable the task of shifting the array elements.
 */

import java.util.Scanner;

public class Shift {
    static Scanner sc = new Scanner(System.in);
    int mat[][];
    int m, n;

    Shift(int mm, int nn) {
        m = mm;
        n = nn;
        mat = new int[m][n];
    }

    void input() {
        System.out.println("Enter elements");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
    }

    void display() {
        for (int i = 0; i < m; i++) {
            System.out.println();
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + "\t");
        }
        System.out.println();
    }

    void cyclic(Shift P) {
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (i != 0)
                    mat[i - 1][j] = P.mat[i][j];
                else
                    mat[m - 1][j] = P.mat[0][j];
            }
    }

    public static void main(String[] args) {
        Shift x = new Shift(3, 3);
        Shift y = new Shift(3, 3);
        x.input();
        y.cyclic(x);
        System.out.println("Initial array is ");
        x.display();
        System.out.print("Array after the shift ");
        y.display();
    }
}