
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points[0-100]:");
        int num = Integer.valueOf(scan.nextLine());
        if (num < 0){
            System.out.println("impossible");
        }else if(num >= 0 && num <= 49){
            System.out.println("failed");
        }else if(num >= 50 && num <= 59){
            System.out.println("1");
        }else if(num >=60 && num <= 69){
            System.out.println("2");
        }else if(num >=70 && num <= 79){
            System.out.println("3");
        }else if(num >=80 && num <= 89){
            System.out.println("4");
        }else if(num >=90 && num <= 100){
            System.out.println("5");
        }else{
            System.out.println("incredible!");
        }
        
    }
}
