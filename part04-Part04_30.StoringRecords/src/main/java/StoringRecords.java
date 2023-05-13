
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records
        try(Scanner lines = new Scanner(Paths.get(file))){
            while(lines.hasNextLine()){
                String row = lines.nextLine();
                if(row.isEmpty()){
                    continue;
                }
                String[] pieces = row.split(",");
                String people = pieces[0];
                int num = Integer.valueOf(pieces[1]);
                persons.add(new Person(people, num));
            }
        }catch(Exception e){
            System.out.println("Error: " + e);
        }
        return persons;

    }
}
