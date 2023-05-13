
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cont1 = new Container();
        Container cont2 = new Container();

        while (true) {
            System.out.println("First: " + cont1);
            System.out.println("Second; " + cont2);
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (parts[0].equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);
            switch (parts[0]) {
                case "add":
                    cont1.add(amount);
                    break;
                case "move":
                    if(amount < cont1.contains()){
                        cont2.add(amount);
                        cont1.remove(amount);
                    }else{
                        cont2.add(cont1.contains());
                        cont1 = new Container();
                    }
                    break;

                case "remove":
                    cont2.remove(amount);
                    break;
                default:
                    break;
            }
        }
    }
}
