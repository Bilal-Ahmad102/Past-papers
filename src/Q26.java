
// Decimal to Binary

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        int[] binaryArray = convertToBinaryArray(decimalNumber);

        System.out.print("Binary representation: ");
        for (int i = binaryArray.length - 1; i >= 0; i--) {
            System.out.print(binaryArray[i]);
        }
        System.out.println();
        scanner.close();
    }

    public static int[] convertToBinaryArray(int decimalNumber) {
        // Determine the number of bits needed
        int[] binaryArray = new int[32];
        int i = 0;

        while (decimalNumber >= 0) {
            if(decimalNumber == 1){
                binaryArray[i] = 1;
                break; 
            }
            binaryArray[i] = decimalNumber%2;
            decimalNumber /= 2;
            i++;
        }


        return binaryArray;
    }
}