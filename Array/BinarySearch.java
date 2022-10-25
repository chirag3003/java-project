import java.io.*;

class BinarySearch {
    String[] var_names;
    int var_len;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // accepts user input
    void accept() throws IOException {
        System.out.print("Enter the number of names: ");
        var_len = Integer.parseInt(br.readLine());
        var_names = new String[var_len];
        System.out.println("Enter the names:-");
        for (int i = 0; i < var_len; i++) {
            System.out.print((i + 1) + ": ");
            var_names[i] = br.readLine(); // accepting the names to be stored in the array
        }
    }

    // sorting the names alphabetically
    void SortAccepted() {
        for (int var_i = var_len - 1; var_i > 0; var_i--) {
            for (int var_j = 0; var_j < var_i; var_j++) {
                int var_diff = var_names[var_j].compareTo(var_names[var_j + 1]);
                if (var_diff > 0) {
                    String swap = var_names[var_j + 1];
                    var_names[var_j + 1] = var_names[var_j];
                    var_names[var_j] = swap;
                }
            }
        }
    }

    void SearchName() throws IOException {
        System.out.print("Enter the name to be searched: ");
        String toSearch = br.readLine(); // accepting the name to be searched
        int var_first = 0;
        int var_last = var_len - 1;
        // while loop to execute binary search
        while (var_first <= var_last) {
            int var_mid = (var_first + var_last) / 2; // calculating the position of the middle element
            int var_diff = toSearch.compareTo(var_names[var_mid]);
            if (var_diff == 0) {
                System.out.println("Name found ");
                // printing the position of the name if found in the array
                System.out.println((var_mid + 1) + ": " + toSearch);
                break;
            } else if (var_diff < 0) {
                var_last = var_mid - 1;
            } else {
                var_first = var_mid + 1;
            }
        }
        if (var_first > var_last) {
            System.out.println("Name not found");
        }
    }

    public static void main(String[] args) throws IOException {
        BinarySearch obj = new BinarySearch();
        obj.accept(); // accept the names from the user
        obj.SortAccepted(); // sort the names alphabetically
        obj.SearchName(); // accept a name to be searched and check if the names is present in the list
    }
}