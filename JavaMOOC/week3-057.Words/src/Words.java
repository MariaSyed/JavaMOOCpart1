import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true){
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            words.add(word);
            
            if (word.length() == 0) {
                break;
            }
        }
        System.out.println("You typed the following words:");
        
        int i = 0;
        while (i < words.size() ){
            System.out.println(words.get(i));
            i++;
        }
       
}
}

