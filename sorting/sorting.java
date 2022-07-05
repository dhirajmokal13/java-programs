public class sorting {
    public static void main (String[] args) {
        int []num = {3,2,5,3,7,4,9,0};
        System.out.println("Before sorting ");
         for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
         for(int i=0;i<num.length;i++){
            int pre = 0;
            int temp;
            for(int j=0;j<num.length;j++){
                if(pre>num[j]){
                    temp = num[j];
                    num[j]=pre;
                    num[j-1]=temp;
                }
                pre=num[j];
            }
        }
        System.out.println("\nAfter sorting ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}