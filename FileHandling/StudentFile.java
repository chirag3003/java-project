// WAP in java to write  the names of the students to a file with the name "students.txt"

import java.io.*;

public class StudentFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("students.txt");
        DataOutputStream data = new DataOutputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of students: ");
        int num = Integer.parseInt(br.readLine()); // accept the number of students
        for (int i = 0; i < num; i++) {
            System.out.print("Student " + (i + 1) + ":");
            data.writeChars(br.readLine() + "\n"); // write the name in the file
        }
        data.close();
    }
}
