
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while (true) {
            System.out.println("Type in number: ");
            double value = Double.parseDouble(reader.nextLine());
            if ((value > -30 ) && (value < 40 )) {
            Graph.addNumber(value);
        }
            
        }
        
        
        

   
    }
        
        
}     