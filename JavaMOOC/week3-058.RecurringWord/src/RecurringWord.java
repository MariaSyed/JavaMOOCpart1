
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) { 
            
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            if (words.contains(word)){
               
               words.add(word);
               break;
               
            }
             words.add(word);
          
        }
        int size = words.size() - 1;
        String lastword = words.get(size);
        System.out.println("You gave the word " + lastword + " twice");
        
       
        }
    }  

