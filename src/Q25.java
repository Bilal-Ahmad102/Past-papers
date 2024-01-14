public class Q25 {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 0},
            {1, 2, 3, 4, 5}
            // Add more rows as needed
        };

        int[] digitCount = countDigitOccurrences(array);

        // Display the count of each digit
        for (int i = 0; i < digitCount.length; i++) {
            System.out.println("Digit " + i + " appears " + digitCount[i] + " times.");
        }
    }

    public static int[] countDigitOccurrences(int[][] array) {
        // Assuming digits are from 0 to 9
        int[] digitCount = new int[10];

        for (int[] row : array) {
            for (int number : row) {
                countDigitsInNumber(digitCount, number);
            }
        }

        return digitCount;
    }

    private static void countDigitsInNumber(int[] digitCount, int number) {
        // Extract each digit and increment its count in the array
        digitCount[number]++;        
    }
}
