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
public class Stack {
    private ArrayList <String> list;
    public Stack(){
        this.list = new ArrayList<>();
    }
    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
    public void add(String values){
        this.list.add(values);
    }
    public ArrayList<String> values(){
        return this.list;
    }
    public String take(){
        String take = this.list.get(this.list.size() - 1);
        this.list.remove(take);
        return take;
    }
}
