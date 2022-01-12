import java.io.*;

class BinarySearch {
    String[] names;
    int len;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void accept() throws IOException {
        System.out.print("Enter the number of names: ");
        len = Integer.parseInt(br.readLine());
        names = new String[len];
        System.out.println("Enter the names:-");
        for (int i = 0; i < len; i++) {
            System.out.print((i + 1) + ": ");
            names[i] = br.readLine();
        }
    }

    void SortAccepted() {
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int diff = names[j].compareTo(names[j + 1]);
                if (diff > 0) {
                    String swap = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = swap;
                }
            }
        }
    }

    void SearchName() throws IOException {
        System.out.print("Enter the name to be searched: ");
        String toSearch = br.readLine();
        int first = 0;
        int last = len - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            int diff = toSearch.compareTo(names[mid]);
            if (diff == 0) {
                System.out.println("Name found ");
                System.out.println((mid + 1) + ": " + toSearch);

                break;
            } else if (diff < 0) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        if (first > last) {
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