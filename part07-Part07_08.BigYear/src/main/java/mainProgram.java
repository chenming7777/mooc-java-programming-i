
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList <Bird> birds = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("?");
            String choice = scan.nextLine();
            if(choice.equals("Add")){
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String nameLatin = scan.nextLine();
                birds.add(new Bird(name, nameLatin));
            }else if(choice.equals("Observation")){
                System.out.println("Bird?");
                String target = scan.nextLine();
                for(Bird bird : birds){
                    if(bird.getName().equals(target)){
                        bird.observation();
                    }else{
                        System.out.println("Not a bird!");
                    }
                }
            }else if(choice.equals("All")){
                for(Bird bird : birds){
                    System.out.println(bird);
                }
            }else if(choice.equals("One")){
                System.out.println("Bird?");
                String target = scan.nextLine();
                for(Bird bird : birds){
                    if(bird.getName().equals(target)){
                        System.out.println(bird);
                    }
                }
            }else if(choice.equals("Quit")){
                break;
            }
                
        }
        
    }

}
