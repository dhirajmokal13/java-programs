public class practice {
    public static void getFibo(int num,int a,int b) {
        if (num == 0) {
            return;
        }
        int c = a+b;
        System.out.print(","+c);
        getFibo(num-1, b, c);
    }

    public static void main(String[] args) {
        System.out.print(0+","+1);
        getFibo(8,0,1);
    }
}
