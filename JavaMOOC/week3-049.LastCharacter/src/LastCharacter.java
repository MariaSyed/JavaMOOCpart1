import java.util.Scanner;


public class LastCharacter {
    
    public static char lastCharacter(String text) {
        char lastChar = text.charAt(text.length() - 1);
        return lastChar;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
    }
}
