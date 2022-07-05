import java.util.*;

public class circumferenceCircle {
   public static float calCircum(float rad) {
      return (float) 2 * (float) 3.14 * rad;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter The radius of circle: ");
      float rad = sc.nextFloat();
      System.out.println("Circumference of circle is " + calCircum(rad));
      sc.close();
   }
}
