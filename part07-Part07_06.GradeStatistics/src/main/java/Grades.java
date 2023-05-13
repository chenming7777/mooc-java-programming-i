import java.util.ArrayList;
/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Grades {
    private ArrayList<Integer> points;
    private ArrayList<Integer> pointsPass;
    private ArrayList<Integer> grades;
    public Grades(){
        this.points = new ArrayList<>();
        this.pointsPass = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    public void add(int points){
        if(points >= 50 && points <=100){
            this.pointsPass.add(points);
        }
        this.points.add(points);
        // add one more grades array
        this.grades.add(indicateGrade(points));
    }
    public double avgPoint(){
        int total = 0;
        for(int point: this.points){
            total += point;
        }
        double avg = (double)total/(double)this.points.size();
        return avg;
    }
    public double avgPassPoint(){
        int total = 0;
        for(int pointPass: this.pointsPass){
            total += pointPass;
            System.out.println(pointPass);
        }
        double avg = (double)total/(double)this.pointsPass.size();
        return avg;
    }
    public double passPercentage(){
        double passing = (double)this.pointsPass.size()/(double)this.points.size();
        passing *= 100;
        return passing;
    }
    public int indicateGrade(int point){
        if(point < 50){
            return 0;
        }else if(point < 60){
            return 1;
        }else if(point < 70){
            return 2;
        }else if(point < 80){
            return 3;
        }else if(point < 90){
            return 4;
        }else{
            return 5;
        }
    }
    public int countStar(int target){
        int count = 0;
        for(int grade : this.grades){
            if(grade == target){
                count++;
            }
        }
        return count;
    }
    public void printStar(){
        for(int i = 5; i >= 0; i--){
            System.out.print(i + ": ");;
            for(int j = 0; j < countStar(i);j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
