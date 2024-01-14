import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class fileReading {
    public static void main(String[] args) {
        String filePath = "src//students.txt";

        try {
            int[] numberOfStudents = countStudents(filePath);

            System.out.println("Number of students and average marks: " + Arrays.toString(numberOfStudents));
            System.out.println();
            checkStudents(filePath, numberOfStudents[1]);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int[] countStudents(String filePath) throws IOException {
        int[] ans = new int[2];

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int ave = 0;

            while ((line = reader.readLine()) != null) {
                // Assuming each line contains a student name and their marks separated by a space
                // You might need to adjust this based on your file format
                String[] parts = line.split(" ");
                // Check if the line has at least two parts (name and marks)
                ave += Integer.parseInt(parts[1]);
                if (parts.length >= 2) {
                    ans[0]++;
                }
            }
            ans[1] = ave / ans[0];
        }

        return ans;
    }

    public static void checkStudents(String path, int averageMarks) {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (Integer.parseInt(parts[1]) > averageMarks) {
                    System.out.println(parts[0] + " is above average.");
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
