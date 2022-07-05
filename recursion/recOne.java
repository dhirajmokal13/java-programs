package recursion;
public class recOne {
    public static void printNum(int num){
        if(num == 6)
        return;
        System.out.println(num);
        printNum(num+1);
    }
    public static void main(String[] args) {
        printNum(1);
    }
}