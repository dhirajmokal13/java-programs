import java.util.*;

public class averages {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third Number: ");
        int num3 = sc.nextInt();
        System.out.println("Average is " + average(num1, num2, num3));
        sc.close();
    }

    public static float average(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3;
    }
}