// import java.util.Scanner;

public class BinarySearchRecursive {
    int[] var_arr; // The array in the which the element is to be searched
    int var_toSearch; // The element which has to be searched in the array

    // Constructor to accept the array and the number to be searched
    BinarySearchRecursive(int[] var_arr, int var_toSearch) {
        this.var_arr = var_arr;
        this.var_toSearch = var_toSearch;
    }

    // The function which should be run to search the element
    int search(int var_start, int var_end) {
        int var_mid = (var_start + var_end) / 2;
        int var_val = var_arr[var_mid];
        if (var_val == var_toSearch) {
            return var_mid;
        }
        if (var_val < var_toSearch) {
            var_start = var_mid + 1;
        } else {
            var_end = var_mid - 1;
        }

        // returns -1 if the number is not present
        if (var_start > var_end)
            return -1;

        return search(var_start, var_end);
    }
}

/*
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.print("Enter the size of the array: ");
 * int n = sc.nextInt();
 * System.out.println("Enter the elements of the array:- ");
 * int[] arr = new int[n];
 * for (int i = 0; i < n; i++) {
 * System.out.print("Index " + i + ": ");
 * arr[i] = sc.nextInt();
 * }
 * System.out.print("Enter the element to be searched: ");
 * int toSearch = sc.nextInt();
 * BinarySearchRecursive obj = new BinarySearchRecursive(arr, toSearch);
 * int index = obj.search(0, arr.length - 1);
 * if (index == -1) {
 * System.out.println("The Element is not present in the array");
 * } else {
 * System.out.println("The Element is present at index: " + index);
 * }
 * }
 */