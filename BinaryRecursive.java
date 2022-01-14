import java.io.*;

class BinaryRecursive {
    int binarySearch(int arr[], int l, int r, int toSearch) {
        if (r >= l && l <= arr.length - 1) {

            int mid = l + (r - l) / 2;
            if (arr[mid] == toSearch)
                return mid;
            if (arr[mid] > toSearch)
                return binarySearch(arr, l, mid - 1, toSearch);
            return binarySearch(arr, mid + 1, r, toSearch);
        }
        return -1;
    }

    public static void main(String args[]) throws IOException {

        BinaryRecursive ob = new BinaryRecursive();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of elements: ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];
        System.out.println("Enter the Elements");
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.print("Enter the number to be searched: ");
        int toSearch = Integer.parseInt(br.readLine());
        int result = ob.binarySearch(arr, 0, len - 1, toSearch);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
