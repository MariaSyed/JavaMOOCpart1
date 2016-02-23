
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int fnum = 1;
        System.out.println("What number?");
        int number = Integer.parseInt(reader.nextLine());
        
        while (fnum <= number){
            System.out.println(fnum);
            fnum++;
            
        }
        
    }
}
