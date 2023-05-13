
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        try(Scanner lines = new Scanner(Paths.get(file))){
            int count = 0;
            int win = 0;
            int lose = 0;
            while(lines.hasNextLine()){
                String row = lines.nextLine();
                if(row.isEmpty()){
                    continue;
                }
                if(row.contains(team)){
                    count++;
                }
                String[] pieces = row.split(",");
                int homeScore = Integer.valueOf(pieces[2]);
                int visitingScore = Integer.valueOf(pieces[3]);
                if(pieces[0].equals(team)){
                    if(homeScore > visitingScore){
                        win++;
                    }else{
                        lose++;
                    }
                }else if(pieces[1].equals(team)){
                    if(visitingScore > homeScore){
                        win++;
                    }else{
                        lose++;
                    }
                }
            }
            System.out.println("Games: " + count);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + lose);
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
    }

}
