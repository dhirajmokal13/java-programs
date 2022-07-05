import java.util.*;

public class greaterNum {
    public static int greNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter The number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Greater Number is " + greNum(num1, num2));
        sc.close();
    }
}
