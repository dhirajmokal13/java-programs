public class facto1{
    
    public static void main (String[] args) {
       System.out.println(factCal(5));
    }
    public static int factCal(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
}