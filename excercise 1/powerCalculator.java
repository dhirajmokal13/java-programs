import java.util.*;

public class powerCalculator {
    public static int powerCal(int n, int x) {
        int ans = 1;
        for (int i = 1; i <= x; i++) {
            //ans = n * ans;
            ans*=n;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.print("Enter the x: ");
        int x = sc.nextInt();
        System.out.println("Answer is " + powerCal(n, x));
        sc.close();
    }
}
