import java.util.*;

public class arrayExcercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of numbers: ");
        int count = sc.nextInt();
        int num[] = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter the " + (i + 1) + " number: ");
            num[i] = sc.nextInt();
        }
        System.out.print("Enter which number want to search: ");
        int number = sc.nextInt();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == number) {
                System.out.println("Number " + number + " is at " + i + " index");
                break;
            }
        }
        sc.close();
    }
}
