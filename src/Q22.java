import java.util.Arrays;
class Q22 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(cal(1,2,3,4,5,6,7,3,24,52,1,2)));
    }
    public static int[] cal(int... values) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum  = 0;

        for(int value: values) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            sum += value;
        }       
        int avg = sum / values.length;
        return new int[]{max,min,avg};
    }
}
