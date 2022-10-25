class BubbleSort2 {
    // sorts the array which is passed as the paramter
    void sort(int[] var_arr, int var_end) {
        if (var_end < 1)
            return;

        for (int var_i = 0; var_i < var_end; var_i++) {
            if (var_arr[var_i] > var_arr[var_i + 1]) {
                int swap = var_arr[var_i];
                var_arr[var_i] = var_arr[var_i + 1];
                var_arr[var_i + 1] = swap;
            }
        }
        sort(var_arr, var_end - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 24, 6, 2, 5, 3, 10 };
        new BubbleSortRecursive().sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
