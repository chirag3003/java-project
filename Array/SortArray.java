import java.util.*;

public class SortArray {

    String[] var_arr;
    int var_len;

    // accepts the input from the user
    void acceptArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        var_len = sc.nextInt(); // accepting the length of the array from the user
        var_arr = new String[var_len];
        System.out.println("Enter the words one by one");
        for (int i = 0; i < var_len; i++) {
            var_arr[i] = sc.next();
        }

    }

    // sorting the array using selection sort
    void sortArray() {
        for (int var_i = 0; var_i < var_len - 1; var_i++) {
            int p = var_i;
            for (int var_j = var_i + 1; var_j < var_len; var_j++) {
                if (var_arr[var_j].compareToIgnoreCase(var_arr[p]) < 0) {
                    p = var_j;
                }
            }
            if (p != var_i) {
                String swap = var_arr[var_i];
                var_arr[var_i] = var_arr[p];
                var_arr[p] = swap;
            }
        }
    }

    // displaying the elements of the array
    void displayArray() {
        for (int var_i = 0; var_i < var_len; var_i++) {
            System.out.print(var_arr[var_i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortArray obj = new SortArray();
        obj.acceptArray(); // accepting the user input
        System.out.println("The Original Array");
        obj.displayArray(); // displaying the original array
        obj.sortArray(); // sorting the array
        System.out.println("The Sorted Array");
        obj.displayArray(); // displaying the sorted array
    }
}
