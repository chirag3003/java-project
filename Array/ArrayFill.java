// Write a program to declare a square matrix M [ ] [ ] of order ‘N’ where ‘N’ must be greater than 3 and less than 10. Allow the user to accept three different characters from the keyboard and fill the array according to the instruction given below:

// (i) Fill the four corners of the square matrix by character 1.
// (ii) Fill the boundary elements of the matrix (except the four corners) by character 2.
// (iii) Fill the non-boundary elements of the matrix by character 3.

// Test your program with the following data and some random data:

// Example 1:
// INPUT: N = 4
// FIRST CHARACTER: @
// SECOND CHARACTER: ?
// THIRD CHARACTER: #

// OUTPUT:
// @ ? ? @
// ? # # ?
// ? # # ?
// @ ? ? @

// Example 2: INPUT: N = 5
// FIRST CHARACTER: A
// SECOND CHARACTER: C
// THIRD CHARACTER: X

// OUTPUT:
// A C C C A
// C X X X C
// C X X X C
// C X X X C
// A C C C A

// Example 3: INPUT: N = 12
// OUTPUT: SIZE OUT OF RANGE

import java.io.*;

class ArrayFill {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size N where 3 < N < 10 ");
        int var_N = Integer.parseInt(br.readLine());
        if (var_N > 3 && var_N < 10) {
            char var_M[][] = new char[var_N][var_N];

            System.out.print("FIRST CHARACTER: ");
            char var_c1 = br.readLine().charAt(0);
            System.out.print("SECOND CHARACTER: ");
            char var_c2 = br.readLine().charAt(0);
            System.out.print("THIRD CHARACTER: ");
            char var_c3 = br.readLine().charAt(0);

            for (int i = 0; i < var_N; i++) {
                for (int j = 0; j < var_N; j++) {
                    // fill corners with char 1
                    if ((i == 0 || i == var_N - 1) && (j == 0 || j == var_N - 1))
                        var_M[i][j] = var_c1;
                    // fill non-corner boundary elements with char 2
                    else if (i == 0 || j == 0 || i == var_N - 1 || j == var_N - 1)
                        var_M[i][j] = var_c2;
                    // fill rest with char 3
                    else
                        var_M[i][j] = var_c3;
                }
            }

            // print the array
            System.out.println("");
            for (int i = 0; i < var_N; i++) {
                for (int j = 0; j < var_N; j++) {
                    System.out.print(var_M[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("SIZE OUT OF RANGE");
        }
    }
}