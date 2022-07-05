import java.util.*;

public class cond {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A");
        int a = sc.nextInt();
        System.out.println("Enter the B");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("A is greater");
        } else if (b > a) {
            System.out.println("B is greater");
        } else {
            System.out.println("Both are equals");
        }
        sc.close();
    }
}