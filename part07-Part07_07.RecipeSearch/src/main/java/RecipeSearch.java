
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read:");
        String file = scanner.nextLine();
        ArrayList<Recipes> recipes = readFiles(file);
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredients");
        while(true){
            System.out.println("");
            System.out.println("Enter command: ");
            String command = scanner.nextLine();
            System.out.println("");
            if(command.equals("list")){
                System.out.println("Recipes:");
                for(Recipes recipe : recipes){
                    System.out.println(recipe);
                }
            }else if(command.equals("stop")){
                break;
            }else if(command.equals("find name")){
                System.out.println("Searched word:");
                String target = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for(Recipes recipe : recipes){
                    if(recipe.showName().contains(target)){
                        System.out.println(recipe);
                    }
                }
            }else if(command.equals("find cooking time")){
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("");
                System.out.println("Recipes:");
                for(Recipes recipe : recipes){
                    if(recipe.showTime() <= time){
                        System.out.println(recipe);
                    }
                }
            }else if(command.equals("find ingredient")){
                System.out.println("Ingredient:");
                String target = scanner.nextLine();
                System.out.println("");
                System.out.println("Recipes:");
                for(Recipes recipe : recipes){
                    if(recipe.showIngredient().contains(target)){
                        System.out.println(recipe);
                    }
                }
            }            
        }            
    }
    
    public static ArrayList<Recipes> readFiles(String file){
        ArrayList <Recipes> recipes = new ArrayList<>();
        ArrayList <String> recipe = new ArrayList<>();
        
        try(Scanner lines = new Scanner(Paths.get(file))){
            while(lines.hasNextLine()){
                String line = lines.nextLine();
                if(!line.isEmpty()){
                    recipe.add(line);
                }else{
                    putRecipe(recipes,recipe);
                }
            }
            if (!recipe.isEmpty()){
                    putRecipe(recipes,recipe);
            }
        }catch (Exception e){
            System.out.println("Error:" + e);
        }
        
        return recipes;
    }
    public static void putRecipe(ArrayList<Recipes> recipes, ArrayList<String> recipe){
        String name = recipe.get(0);
        int cookingTime = Integer.valueOf(recipe.get(1));
        recipe.remove(0);
        recipe.remove(0);
        recipes.add(new Recipes(name, cookingTime,new ArrayList<>(recipe)));
        recipe.clear();
        
        
    }

}
