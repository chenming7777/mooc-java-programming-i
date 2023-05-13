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
public class Suitcase {
    private ArrayList <Item> items;
    private int maxWeight;
    public Suitcase(int maxWeight){
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    public void addItem(Item item){
        int currentWeight = 0;
        
        for(Item stuff: this.items){
            currentWeight += stuff.getWeight();
        }
        
        int comparedWeight = currentWeight + item.getWeight();
        if(!(comparedWeight > this.maxWeight)){
            this.items.add(item);
        }
    }
    public void printItems(){
        for(Item item: items){
            System.out.println(item);
        }
    }
    public int totalWeight(){
        int finalWeight = 0;
        for(Item item : this.items){
            finalWeight += item.getWeight();
        }
        return finalWeight;
    }
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for(Item item : this.items){
            if(heaviestItem.getWeight() < item.getWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
    
    @Override
    public String toString(){
        if(this.items.isEmpty()){
            return "no items (0 kg)";
        }else if (this.items.size() == 1){
            return this.items.size() + " item (" + this.totalWeight() + " kg)";
        }else
            return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
    
