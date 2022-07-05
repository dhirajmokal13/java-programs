public class selectionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int num[] = { 7, 8, 3, 2, 1, 4 };
        // selection sort
        for (int i = 0; i < num.length - 1; i++) {
            int smallest = i;
            for (int j = i; j < num.length; j++) {
                if (num[smallest] > num[j]) {
                    smallest = j;
                }
            }
            int temp = num[smallest];
            num[smallest] = num[i];
            num[i] = temp;
        }
        printArray(num);
    }
}