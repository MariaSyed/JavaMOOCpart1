
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int i = 1;
        int result = (int)Math.pow(2, 0);
        System.out.println("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        while ( i <= number) {
            result += Math.pow(2, i);
            i++;
                    
        }
        
        System.out.println("Result is " + result);

    }
}
