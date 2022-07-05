import java.util.*;

public class twoDArrayExcer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of columns: ");
        int columns = sc.nextInt();
        System.out.print("Enter the no of Rows: ");
        int row = sc.nextInt();
        int[][] matrix = new int[columns][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter the at " + i + "," + j + " index: ");
                matrix[j][i] = sc.nextInt();
            }
        }
        System.out.print("Enter the num to find: ");
        int num = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                if(matrix[j][i] == num){
                    System.out.println(num+" Found at index "+j+","+i);
                }
            }
        }
        sc.close();
    }
}
