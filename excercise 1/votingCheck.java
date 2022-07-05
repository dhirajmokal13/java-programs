import java.util.*;

public class votingCheck {
    public static String checkVote(int age) {
        if (age > 18) {
            return " You are eligible to vote";
        } else {
            return " You are not eligible to vote";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age + checkVote(age));
        sc.close();
    }
}
