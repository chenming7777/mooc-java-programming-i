import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Recipes {
    private String name;
    private int cookingTime;
    private ArrayList <String> ingredient;
    public Recipes(String name, int cookingTime, ArrayList <String> ingredient){
        this.ingredient = ingredient;
        this.name = name;
        this.cookingTime = cookingTime;
    }
    public String showName(){
        return this.name;
    }
    public int showTime(){
        return this.cookingTime;
    }
    public ArrayList<String> showIngredient() {
        return this.ingredient;
    }
    @Override
    public String toString(){
        return this.name + ", cooking time: " + this.cookingTime;
    }
        
}
