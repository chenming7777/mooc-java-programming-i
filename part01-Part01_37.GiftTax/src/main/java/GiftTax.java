
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        System.out.println("Value of the gift?");
        double money = Double.valueOf(scan.nextLine());
        if (money < 5000){
            System.out.println("No tax!");
        }else if(money >= 5000 && money < 25000){
            total = 100 + (money - 5000)*0.08;
        }else if(money >= 25000 && money < 55000){
            total = 1700 + (money - 25000)*0.10;
        }else if(money >= 55000 && money < 200000){
            total = 4700 + (money - 55000)*0.12;
        }else if(money >= 200000 && money < 1000000){
            total = 22100 + (money - 200000)*0.15;
        }else{
            total = 142100 + (money - 1000000)*0.17;
        }
        System.out.println("Tax: "+total);
    }
}
