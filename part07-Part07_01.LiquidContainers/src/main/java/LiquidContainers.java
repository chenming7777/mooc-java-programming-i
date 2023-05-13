
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont1 = 0;
        int cont2 = 0;
        while (true) {
            System.out.println("First: " + cont1 + "/100");
            System.out.println("Second: " + cont2 + "/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("quit")) {
                break;
            }    
            int amount = Integer.valueOf(parts[1]);
            if (amount < 0){
                continue;
            }
            if(parts[0].equals("add")){
                cont1 += amount;
                if(cont1 > 100){
                    cont1 = 100;
                }
                
            }else if(parts[0].equals("move")){
                if(cont1 < amount){
                    cont2 += cont1;
                    cont1 = 0;
                }else{
                    cont2 += amount;
                    cont1 -= amount;
                }
                
                if(cont2 > 100){
                    cont2 = 100;
                }
            }else if(parts[0].equals("remove")){
                cont2 -= amount;
                if(cont2 < 0){
                    cont2 = 0;
                }
            }

        }
    }
// hihi
}
