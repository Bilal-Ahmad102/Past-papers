public class Q2 {

    public static void main(String[] args) {
        int fac = fac(6);
        System.out.println(fac);        
    }
    public static int  fac(int num) {
        if (num == 1) {
            return 1;
        }
        return num * fac(num-1);
    }
}