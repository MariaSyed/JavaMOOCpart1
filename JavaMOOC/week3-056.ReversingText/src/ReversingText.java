
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        String result = "";
        int i = text.length() - 1;
        
        while (i>=0){
            
            char letter = text.charAt(i);
            result = result + letter;
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
