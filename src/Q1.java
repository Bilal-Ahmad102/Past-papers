public class Q1 {
    public static void main(String[] args) {
        String inputString = "ABC,. ABC";
        int result = countNonSpaceCharacters(inputString);
        System.out.println("Number of non-space characters: " + result);
    }

    public static int countNonSpaceCharacters(String input) {
        // Using Java streams to filter out non-space characters and count them
        return (int) input.chars().filter(c -> c != 'A').count();
    }
}
