class BubbleSortRecursive {
    // sorts the array which is passed as the paramter
    void sort(int[] arr, int n, int end) {
        // ends the execution when n is equal to end
        if (n == end)
            return;

        // swaps the number in correct order
        if (arr[n] > arr[n + 1]) {
            int swap = arr[n];
            arr[n] = arr[n + 1];
            arr[n + 1] = swap;
        }

        // calls the function again to sort the remaining part
        if (n == end - 1) {
            sort(arr, 0, end - 1);
        } else {
            sort(arr, n + 1, end);
        }
    }
}

/*
 * 
 * public static void main(String[] args) {
 * int[] arr = { 3, 1, 24, 6, 2, 5, 3, 10 };
 * new BubbleSortRecursive().sort(arr, 0, arr.length - 1);
 * for (int i = 0; i < arr.length; i++) {
 * System.out.println(arr[i]);
 * }
 * }
 */