
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
            if(num > 0){
                total += num;
                i++; 
            }
            
        }
        if(i == 0){
            System.out.println("Cannot calculate the average");
        }else{
            double avg = (double)total/(double)i;
            System.out.println(avg);
        }
        
    }
}
