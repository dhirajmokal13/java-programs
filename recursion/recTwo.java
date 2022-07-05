package recursion;
public class recTwo {
    public static void printNatural(int num,int i,int sum){
        if(i == num){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printNatural(num, i+1, sum);
    }
    public static void main(String[] args) {
        printNatural(5, 1, 0);
    }
}
