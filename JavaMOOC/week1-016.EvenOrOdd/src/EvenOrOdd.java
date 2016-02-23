
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         int c;
        System.out.println("Type a number:");
        int value = Integer.parseInt(reader.nextLine());
        c = value%2;
        if (c == 1)
                System.out.println("Number " + value + " is odd.");
        else if (c == 0)
                System.out.println("Number " + value + " is even");
        else if (c == -1)
                System.out.println("Number " + value + " is odd.");
                
                

        

    }
}
