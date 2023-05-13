
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int name_length = 0;
        int longest_name_length = 0;
        String longest_name = "";
        double avg = 0;
        while(true){
            String data = scanner.nextLine();
            if (data.equals("")){
                break;
            }
            String[] token = data.split(",");
            name_length = token[0].length();
            if(name_length > longest_name_length){
                longest_name_length = name_length;
                longest_name = token[0];
            }
            total += Integer.valueOf(token[1]);
            count++;
        }
        System.out.println("Longest name: " + longest_name);
        avg = (double)total/count;
        System.out.println("Average of the birth years: " + avg);
    }
}
System.out.println("total: " + total);
        System.out.println("count: " + count);