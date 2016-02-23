
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int i = 0;
        while(true){
            for ( int number : array){
                if(i < array.length - 1){
                  System.out.print(number + ", ");  
                }
                
                else if (i == (array.length -1)){
                    System.out.print(number);
                }
                
                i++;
                
            }
            
            
            
            if (i >= array.length){
                break;
            }
            
        }
        
    }
}
