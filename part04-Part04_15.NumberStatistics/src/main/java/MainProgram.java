
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        Statistics statistics = new Statistics();
        Statistics totalEven = new Statistics();
        Statistics totalOdd = new Statistics();
        System.out.println("Enter numbers:");
        while(true){
            int temp = Integer.valueOf(scanner.nextLine());
            if(temp == -1){
                break;
            }else{
                statistics.addNumber(temp);
                if(temp % 2 == 0){
                    totalEven.addNumber(temp);
                }else{
                    totalOdd.addNumber(temp);
                }
            }
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + totalEven.sum()); 
        System.out.println("Sum of odd numbers: " + totalOdd.sum() );
    }
}
