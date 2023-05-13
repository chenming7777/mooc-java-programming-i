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
    private Scanner scanner;
    private Grades grades;
    public UserInterface(Scanner scanner, Grades grades){
        this.scanner = scanner;
        this.grades = grades;
    }
    public void start(){
        System.out.println("Enter point totals, -1 stops:");
        readPoint();
        printAverage();
        printPassAverage();
        printPassPercentage();
        this.grades.printStar();
    }
    public void readPoint(){
        while(true){
            int points = Integer.valueOf(scanner.nextLine());
            if(points == -1){
                break;
            }
            if(points >= 0 && points <= 100){
                this.grades.add(points);
            }
        }
    }
    public void printAverage(){
        System.out.println("Point average (all): " + this.grades.avgPoint());
    }
    public void printPassAverage(){
        System.out.println("Point average (passing): " + this.grades.avgPassPoint());
    }
    public void printPassPercentage(){
        System.out.println("Pass percentage: " + this.grades.passPercentage());
    }
    public void printStars(){
        
    }
    
}
