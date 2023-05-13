
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        while(true){
            String data = scanner.nextLine();
            if (data.length() == 0){
                break;
            }
            String[] token = data.split(",");
            int temp = Integer.valueOf(token[1]);
            if(temp > oldest){
                oldest = temp;
            }
        }
        System.out.println("Age of the oldest: " + oldest);
    }
}
