public class recFour {
    public static int calVal(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        int val = calVal(x, n - 1);
        return x * val;
    }

    public static void main(String[] args) {
        System.out.println(calVal(2, 5));
    }
}