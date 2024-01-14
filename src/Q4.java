import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nums of Students: ");
        int nums_students = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        for (int i = 0; i < nums_students; i++) {
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // Consume the newline character after marks input
            write_file(name, marks);
        }

        sc.close();
    }

    public static void write_file(String name, int marks) {
        String path = "example.txt"; // Specify a proper file name and path
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            // Use FileWriter(path, true) to append to the file if it already exists
            writer.write(name + " " + marks);
            writer.newLine();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
