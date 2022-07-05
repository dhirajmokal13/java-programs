package recursion;
public class recThree {
    public static int calFact(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        int fact_nm1 = calFact(num - 1);
        System.out.println("factorial "+fact_nm1+"x"+num);
        int fact = num * fact_nm1;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(calFact(5));
    }
}
