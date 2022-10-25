class BubbleSortRecursive {
    // sorts the array which is passed as the paramter
    void sort(int[] var_arr, int var_n, int var_end) {
        // ends the execution when n is equal to end
        if (var_n == var_end)
            return;

        // swaps the number in correct order
        if (var_arr[var_n] > var_arr[var_n + 1]) {
            int swap = var_arr[var_n];
            var_arr[var_n] = var_arr[var_n + 1];
            var_arr[var_n + 1] = swap;
        }

        // calls the function again to sort the remaining part
        if (var_n == var_end - 1) {
            sort(var_arr, 0, var_end - 1);
        } else {
            sort(var_arr, var_n + 1, var_end);
        }
    }

    public static void main(String[] args) {
        int[] var_arr = { 3, 1, 24, 6, 2, 5, 3, 10 };
        System.out.println("The array before sorting is: ");
        for (int var_i = 0; var_i < var_arr.length; var_i++) {
            System.out.println(var_arr[var_i]);
        }
        new BubbleSortRecursive().sort(var_arr, 0, var_arr.length - 1);
        System.out.println("The array after sorting is: ");
        for (int var_i = 0; var_i < var_arr.length; var_i++) {
            System.out.println(var_arr[var_i]);
        }
    }
}
