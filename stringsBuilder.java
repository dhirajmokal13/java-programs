import java.util.Scanner;

public class stringsBuilder {
    public static StringBuilder revStr(StringBuilder name){
        for (int i = 0; i < name.length() / 2; i++) {
            char frontChar = name.charAt(i);
            char backChar = name.charAt(name.length() - 1 - i);
            name.setCharAt(i, backChar);
            name.setCharAt(name.length() - 1 - i, frontChar);
        }
        return name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder name = new StringBuilder(sc.nextLine());
        // System.out.println(name.charAt(0));
        // name.setCharAt(0, 'D');
        // System.out.println(name);
        // name.insert(6, 'M');
        // System.out.println(name);
        // name.delete(6, 7);
        // System.out.println(name);
        // name.append(" Mokal");
        // System.out.println(name); 
        System.out.println(revStr(name));
        sc.close();
    }
}