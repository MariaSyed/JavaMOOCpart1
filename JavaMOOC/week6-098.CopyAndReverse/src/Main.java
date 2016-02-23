
import java.util.Arrays;



public class Main {
    
    public static void main(String[] args) {
       int[] original = {1,2,3,4};
       int[] reverse = reverseCopy(original);
       
       //copied[0] = 99;
       
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }
    
    public static int[] copy(int [] array){
        int[] copyArray = new int[array.length];
        for ( int i = 0; i < array.length; i++){
            copyArray[i] = array[i];
        }
        
        return copyArray;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] reversedArray = new int[array.length];
        for ( int i = array.length - 1; i > -1 ; i--){
            reversedArray[array.length - 1 - i] = array[i];
        }
        
        return reversedArray;
    }
}
