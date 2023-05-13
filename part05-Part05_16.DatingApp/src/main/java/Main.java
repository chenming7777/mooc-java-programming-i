
public class Main {

    public static void main(String[] args) {
        // test your program here!
        int month = 12;
        int year = 2011;
        int day  = 5;
        day += 5;
        while (day > 30) {
            day -= 31;
            month ++;
            while(month > 12) {
                month -= 12;
                year ++;
           }
        }
        System.out.println(day + "|" + month + "|" + year);
    }
}
