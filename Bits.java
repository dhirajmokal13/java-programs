public class Bits {
    public static void main(String[] args) {
        //int n = 5;
        //int pos = 2;
        //int bitMask = 1 << pos;
        //if ((bitMask & n) == 0) {
        //    System.out.println("Bit Was Zero");
        //} else {
        //    System.out.println("Bit was one");
        //}
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        int newNum = bitMask | n;
        System.out.println(newNum);
    }
}