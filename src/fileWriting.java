import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriting {
    public static void main(String[] args) {
        String filePath = "src//students.txt";
        String content = "Leo 87";

        try {
            appendToFile(filePath, content);
            System.out.println("Content appended to the file successfully.");
        } catch (IOException e) {
            System.out.println("Error appending to the file: " + e.getMessage());
        }
    }

    public static void appendToFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true))) {
            // The second parameter 'true' in the FileWriter constructor
            // indicates that the file should be opened in append mode.
            writer.write(content);
            writer.newLine(); // Add a newline for better readability
        }
    }
}
