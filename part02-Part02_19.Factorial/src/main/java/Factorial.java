
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int num = Integer.valueOf(scanner.nextLine());
        int total = 1;
        while(num > 0){
            total *= num;
            num--;
        }
        System.out.println("Factorial: "+total);
    }
}
