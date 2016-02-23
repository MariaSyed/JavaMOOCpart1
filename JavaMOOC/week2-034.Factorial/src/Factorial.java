import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i = 1;
        int factorial = 1;
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        while ( i <= number){
            factorial = factorial * i;
            i++;
                    
        }
        
        System.out.println("Factorial is " + factorial);
        
        

    }
}
