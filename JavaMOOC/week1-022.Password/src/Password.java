
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        while (true) {
            System.out.println("Type the password: ");
            String epass = reader.nextLine();
            if (epass.equals("carrot")){
                System.out.println("Right!");
                break;
            }
            else System.out.println("Wrong!");
            
            
            
            
        }
        System.out.println("The secret is : jryy qbar!");
    }
}