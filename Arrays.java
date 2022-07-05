import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NO of age: ");
        int no = sc.nextInt();
        int[] age = new int[no];
        // int[] age = {20,23,24};
        for (int i = 0; i < no; i++) {
            System.out.print("Enter the " + (i + 1) + " Age: ");
            age[i] = sc.nextInt();
        }
        for (int i : age) {
            System.out.println(i);
        }
        sc.close();
    }
}