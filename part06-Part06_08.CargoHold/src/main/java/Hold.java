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
public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maxWeight;
    public Hold(int maxWeight){
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void addSuitcase (Suitcase suitcase){
        if(this.totalWeight() + suitcase.totalWeight() <= this.maxWeight){
            this.suitcases.add(suitcase);
        }    
        
    }
    public int totalWeight(){
        int totalWeight = 0;
        for(Suitcase suitcase : suitcases){
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    public void printItems(){
        for(Suitcase suitcase : this.suitcases){
            suitcase.printItems();
        }
    }
        
    @Override
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.totalWeight() +" kg)";
    }
}
