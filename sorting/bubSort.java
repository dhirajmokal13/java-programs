public class bubSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[] = {7,8,3,2,1,4};
        // bubble sort
        for (int i = 0; i < num.length-1; i++) {
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    //swap
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        printArray(num);
    }
}