import java.util.*;

public class SortArray {

    String[] arr;
    int len;

    // accepts the input from the user
    void acceptArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        len = sc.nextInt(); // accepting the length of the array from the user
        arr = new String[len];
        System.out.println("Enter the words one by one");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.next();
        }

    }

    // sorting the array using selection sort
    void sortArray() {
        for (int i = 0; i < len - 1; i++) {
            int p = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j].compareToIgnoreCase(arr[p]) < 0) {
                    p = j;
                }
            }
            if (p != i) {
                String swap = arr[i];
                arr[i] = arr[p];
                arr[p] = swap;
            }
        }
    }

    // displaying the elements of the array
    void displayArray() {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
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
