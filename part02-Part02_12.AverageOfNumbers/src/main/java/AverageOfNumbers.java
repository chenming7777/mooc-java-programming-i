
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int total = 0;
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
            total += num;
            i++;
        }
        double avg = (double)total/(double)i;
        System.out.println("Average of the numbers: "+avg);
    }
}
