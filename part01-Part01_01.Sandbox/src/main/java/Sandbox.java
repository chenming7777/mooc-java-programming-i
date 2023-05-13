
public class Sandbox {

    public static void main(String[] args) {
      int beginning = 1;
      int end = 5;

      printStars(beginning, end);
   }

   public static void printStars(int beginning, int end) {
      while (beginning < end) {
         System.out.print("*");
         beginning++;
      }
   }
}
