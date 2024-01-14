public class Q21 {
    public static void main(String[] args) {
        String text = "This is Good";
        int num = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                num++;
            } else {
                for (int j = 0; j < num; j++) {
                    System.out.print(text.charAt(i - num + j));
                }
                System.out.printf(" ----> %d%n", num);
                num = 0;
            }
        }
        System.out.println(num);
        // Handle the last word (if any) after the loop
        for (int j = 0; j < num; j++) {
            System.out.print(text.charAt(text.length() - num + j));
        }
        System.out.printf("----> %d%n", num);
    }
}
