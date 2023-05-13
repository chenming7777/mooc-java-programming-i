
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Wherefrom?");
        int i = Integer.valueOf(scanner.nextLine());
        while(i <= num){
            System.out.println(i);
            i++;
        }
        // Write your program here
    }
}
