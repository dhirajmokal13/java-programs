import java.util.*;

public class numCount {
    public static void main(String[] args) {
        int num, positive = 0, negative = 0, zeros = 0;
        String choice;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Do You want Enter more number Y or N: ");
            choice = sc.next();
            if (choice.equals("Y") || choice.equals("y")) {
                System.out.print("Enter the number: ");
                num = sc.nextInt();
                if (num > 0) {
                    positive += 1;
                } else if (num < 0) {
                    negative += 1;
                } else {
                    zeros += 1;
                }
            } else if (choice.equals("N") || choice.equals("n")) {
                break;
            } else {
                System.out.println("Enter valid Choice");
            }
        }
        System.out.println("POsitive: " + positive + " Nigative is " + negative + " Zeros " + zeros);
        sc.close();
    }
}
