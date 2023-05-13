
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        try(Scanner line = new Scanner(Paths.get(file))){
            boolean flag = true;
            while(line.hasNextLine()){
                String row = line.nextLine();
                if(row.equals(searchedFor)){
                    System.out.println("Found!");
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("Not found.");
            }
        }catch(Exception e){
            System.out.println("Reading the file " + e + " failed");
        }
    }
}
