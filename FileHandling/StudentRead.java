// WAP in java to read the names of the students from a file with the name "students.txt"

import java.io.*;

public class StudentRead {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("students.txt");
        BufferedReader br = new BufferedReader(file);
        int c = 0; // counter to count the number of students
        while (true) {
            String text = br.readLine();
            if (text == null)
                break; // break the loop after reaching the end of the file
            c++; // increase the number of names;
            System.out.println("Student " + c + ": " + text);
        }
    }
}
