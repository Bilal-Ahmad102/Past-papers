import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[][] m = {{1,2,3},
                     {4,5,6},
                    {7,8,9}};
        System.out.println(Arrays.toString(sumDiagonals(m)));
    }
    public static int[] sumDiagonals(int[][] m) {
        int[] arr = new int[3];
        int anitdia = m.length - 1;
        int middle_col;
        if((m.length % 2) == 0){
            middle_col = m.length / 2;} 
        else{
            middle_col = (m.length)/2;}

        for (int i = 0; i < arr.length; i++) {
            arr[0] += m[i][i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[1] += m[i][anitdia];
            anitdia--;
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[2] += m[i][middle_col];
        }

        return arr;
    }
}
