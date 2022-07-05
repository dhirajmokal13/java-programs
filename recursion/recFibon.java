public class recFibon {
    public static void getFibo(int num, int a, int b) {
        if (num == 0) {
            return;
        }
        int c = a + b;
        System.out.print("," + c);
        getFibo(num - 1, b, c);
    }

    public static void main(String[] args) {
        System.out.print(0 + "," + 1);
        int num = 50;
        getFibo(num - 2, 0, 1);
    }
}
