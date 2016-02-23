
public class Main {

    public static void main(String[] args) {
        // test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayAsStars(array);
    }

    public static void printArrayAsStars(int[] array) {
        for ( int i : array){
            int j = 0;
            while (true){
            System.out.print("*");
            j++;
            if(j >= i){
                System.out.println("");
                break;
            }
           }
        }
            
    }
}
