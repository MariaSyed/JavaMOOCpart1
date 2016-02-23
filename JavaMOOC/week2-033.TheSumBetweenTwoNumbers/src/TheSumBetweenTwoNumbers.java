
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int result = 0;
        System.out.println("first: ");
        int i = Integer.parseInt(reader.nextLine());
        
        System.out.println("last: ");
        int last = Integer.parseInt(reader.nextLine());
       
        while (i <= last) {
           result += i;  
           i++;         
        }
        
        System.out.println("Sum is " + result);
    }
}
