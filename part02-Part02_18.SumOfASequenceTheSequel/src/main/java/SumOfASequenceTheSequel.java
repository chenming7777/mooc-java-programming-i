
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Frist number?");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int i = Integer.valueOf(scanner.nextLine());
        int total = 0;
        while(i >= num){
            total += num;
            num++;
        }
        System.out.println("The sum is: "+total);
    }
}
