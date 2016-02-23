
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int result = 0;
        int i = 0;
        
        System.out.println("Until What?");
        int until = Integer.parseInt(reader.nextLine());
       
        while (i <= until) {
           result += i;  
           i++;         
        }
        
        System.out.println("Sum is " + result);
             
        }
        

    }

