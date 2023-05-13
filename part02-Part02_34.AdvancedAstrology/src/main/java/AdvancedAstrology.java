
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i < number){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int i = 0;
        while(i < number){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i = 1; i < size + 1; i++){
            for(int j = size; i < j; j--){
                System.out.print(" ");
            }
            for(int x = 0; x < i; x++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for(int i = 1; i < height + 1; i++){
            for(int j = height; i < j; j--){
                System.out.print(" ");
            }
            for(int x = 0; x < i; x++){
                System.out.print("*");
            }
            for(int y = 0; y < i - 1; y++ ){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < height - 2; j++){
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
