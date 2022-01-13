import java.util.*;

public class SortArray {

    String[] arr;
    int len;

    void acceptArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        len = sc.nextInt();
        arr = new String[len];
        System.out.println("Enter the words one by one");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.next();
        }

    }

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

    void displayArray() {
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortArray obj = new SortArray();
        obj.acceptArray();
        System.out.println("The Original Array");
        obj.displayArray();
        obj.sortArray();
        System.out.println("The Sorted Array");
        obj.displayArray();
    }
}
