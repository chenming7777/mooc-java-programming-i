
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldest_name = "";
        while(true){
            String data = scanner.nextLine();
            if (data.length() == 0){
                break;
            }
            String[] token = data.split(",");
            int temp = Integer.valueOf(token[1]);
            if(temp > oldest){
                oldest = temp;
                oldest_name = token[0];
            }
        }
        System.out.println("Name of the oldest: " + oldest_name);
        

    }
}
