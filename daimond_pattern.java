public class daimond_pattern {
    public static void main (String[] args) {
        int m=4;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
        for(int j=1;j<=(i*2)-1;j++){
            System.out.print("*");
        }
        System.out.println();
        }
        for(int i=m;i>=1;i--){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
        for(int j=1;j<=(i*2)-1;j++){
            System.out.print("*");
        }
        System.out.println();
        }
        
    }
}