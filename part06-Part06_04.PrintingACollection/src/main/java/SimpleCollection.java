
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    @Override
    public String toString(){
        String printOutput = "";
        if(this.elements.size() == 1){
            printOutput = "The collection " + this.name + " has " 
                    + this.elements.size() + " element:\n";
        }else{
            printOutput = "The collection " + this.name + " has "
                + this.elements.size() + " elements:\n";
        }
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        String alphabet = "";
         if (elements.size() == 1) {
            alphabet = alphabet + elements.get(0);
        } else {
            for (String element:elements){
                alphabet = alphabet + element + "\n";
            }
         }    
        return printOutput + alphabet;
    }
}
