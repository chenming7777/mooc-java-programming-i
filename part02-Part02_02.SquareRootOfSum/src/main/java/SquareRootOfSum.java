
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        int total = num1+num2;
        if(total > 0){
            double squareroot = Math.sqrt(total);
            System.out.println(squareroot);
        }
    }
}
