import java.util.Scanner;

public class fibonisiSeries {
    public static void main(String[] args) {
        int n, a = 0, b = 1, val;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        System.out.print(a + ", " + b);
        for (int i = 3; i <= n; i++) {
            val = a + b;
            System.out.print(", " + val);
            a = b;
            b = val;
        }
        sc.close();
    }
}
