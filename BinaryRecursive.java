import java.io.*;

class BinaryRecursive {
    int binarySearch(int arr[], int l, int r, int toSearch) {

        if (r >= l && l <= arr.length - 1) { // if statement to check if the element is present in the array
            int mid = l + (r - l) / 2;
            if (arr[mid] == toSearch)
                return mid; // returning the position of the element to be searched in the array
            // checking if the element is present in other position if not found in this one
            if (arr[mid] > toSearch)
                return binarySearch(arr, l, mid - 1, toSearch);
            return binarySearch(arr, mid + 1, r, toSearch);
        }
        // returning -1 when the element doesn't exist int the array
        return -1;
    }

    public static void main(String args[]) throws IOException {

        BinaryRecursive ob = new BinaryRecursive(); // creating an object of this class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // creating a buffered reader object
                                                                                  // to accept input from the user
        System.out.print("Enter the number of elements: ");
        int len = Integer.parseInt(br.readLine());
        int[] arr = new int[len];
        System.out.println("Enter the Elements");
        // accepting the elements of the array
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(br.readLine()); // taking user input for the elements of the array
        }
        System.out.print("Enter the number to be searched: ");
        int toSearch = Integer.parseInt(br.readLine()); // accepting the element to be searched from the user
        int result = ob.binarySearch(arr, 0, len - 1, toSearch); // running the binary search function defined in the
                                                                 // class
        // giving the user result based on the search
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
