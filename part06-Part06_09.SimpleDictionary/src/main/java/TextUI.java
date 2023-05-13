import java.util.ArrayList;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    public void start(){
        while(true){
            System.out.print("Command:");
            String word = scanner.nextLine();
            if(word.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(word.equals("add")){
                System.out.print("Word:");
                String word1 = scanner.nextLine();
                System.out.print("Translation:");
                String word2 = scanner.nextLine();
                this.dictionary.add(word1, word2);
            }else if(word.equals("search")){
                System.out.print("To be translated:");
                String target = scanner.nextLine();
                if(this.dictionary.translate(target) == null){
                    System.out.println("Word " + target + " was not found");
                }else{
                    System.out.println(this.dictionary.translate(target));
                }
            }else{
                System.out.println("Unknown command");
            }
        }
    }
}
