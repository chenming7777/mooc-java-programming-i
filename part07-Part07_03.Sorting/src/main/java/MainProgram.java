
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i = 0 ; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
            }
        }
    return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int smallest_index = 0;
        int smallest = array[0];
        for(int i = 0 ; i < array.length; i++){
            if(smallest > array[i]){
                smallest = array[i];
                smallest_index = i;
            }
        }
    return smallest_index;
    }
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest_index = startIndex;
        int smallest = table[startIndex];
        for(int i = startIndex ;i < table.length; i++){
            if(smallest > table[i]){
                smallest = table[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
    }
    public static void sort(int[] array){
        for(int i = 0; i < array.length; i++){
            int smallestIndex = indexOfSmallestFrom(array, i);
            System.out.println(smallestIndex);
            swap(array,smallestIndex,i);
        }
    }
}
