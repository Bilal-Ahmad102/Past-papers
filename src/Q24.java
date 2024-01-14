import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Q24 {
    public static void main(String[] args) {
        String inputString = "Bilal-Sp23-BAI-009";
        char[][] raggedArray = convertToRaggedArray(inputString);
        System.out.println(Arrays.deepToString(raggedArray));

        // Assuming you want to write the ragged array to a file
        fileWrite(raggedArray);
    }

    public static char[][] convertToRaggedArray(String input) {
        // Split the input string using the '-' character
        String[] parts = input.split("-");

        // Create a ragged array based on the length of each part
        char[][] raggedArray = new char[parts.length][];
        for (int i = 0; i < parts.length; i++) {
            raggedArray[i] = parts[i].toCharArray();
        }

        return raggedArray;
    }

    public static void fileWrite(char[][] arr) {
        String path = "example.txt"; // Specify a proper file name and path
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (int i = 0; i < arr.length; i++) {
                writer.write(arr[i]);
                writer.newLine(); // Add a newline between rows
            }

            System.out.println("Data has been written to the file.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
