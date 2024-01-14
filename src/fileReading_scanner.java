import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class fileReading_scanner {
    public static void main(String[] args) {
        String filePath = "src//students.txt";

        try {
            int sum = calculateSum(filePath);
            System.out.println("Sum of numbers in the file: " + sum);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static int calculateSum(String filePath) throws IOException {
        int sum = 0;

        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    sum += scanner.nextInt();
                } else {
                    // Skip non-integer values
                    scanner.next();
                }
            }
        }

        return sum;
    }
}
