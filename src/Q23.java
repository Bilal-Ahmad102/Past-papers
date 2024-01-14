public class Q23 {
    public static void main(String[] args) {
        String original = "Bilal_Sp23-BAI-009";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        
    }

    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, it is already reversed
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive case: reverse the substring excluding the first character,
        // and concatenate the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
