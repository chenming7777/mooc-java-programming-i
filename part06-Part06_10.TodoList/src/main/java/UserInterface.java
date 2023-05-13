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
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scanner = scanner;
        this.todoList = todoList;
    }
    public void start(){
        while(true){
            System.out.print("Command:");
            String command = this.scanner.nextLine();
            if(command.equals("stop")){
                break;
            }
            else if(command.equals("add")){
                System.out.print("To add");
                String task = scanner.nextLine();
                this.todoList.add(task);
            }
            else if(command.equals("list")){
                this.todoList.print();
            }
            else if(command.equals("remove")){
                System.out.print("Which one is removed?");
                int removing = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(removing);
            }
        }
    }
}
