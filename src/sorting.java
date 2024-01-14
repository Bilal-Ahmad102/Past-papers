import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 1, 8, 6, 5, 9};
        
        bubbleSort(arr);
        
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr = swap(arr, j, j + 1);
                }
            }
        }
    }

    public static int[] swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
        return num;
    }
}
