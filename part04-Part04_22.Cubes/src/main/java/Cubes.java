
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            int total = 0;
            int num = 0;
            String string = scanner.nextLine();
            if(string.equals("end")){
                break;
            }
            else{
                num = Integer.valueOf(string);
            }
            total = num*num*num;
            System.out.println(total);
        }
    }
}
