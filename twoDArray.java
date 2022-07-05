import java.util.*;

public class twoDArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = 5, col = 3;
        int[][] twoD = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Enter the " + (i + 1) + "," + (j + 1) + " Element: ");
                twoD[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix " + col + "x" + row);
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}