
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        if ((0 <= points) && (points <= 29)) {
            System.out.println("Grade: failed");
        }
        else if ((30 <= points) && (points <= 34)) {
            System.out.println("Grade: 1");
        }
        else if ((35 <= points) && (points <= 39)) {
            System.out.println("Grade: 2");
        }
        else if ((40 <= points) && (points <= 44)) {
            System.out.println("Grade: 3");
        }
        else if ((45 <= points) && (points <= 49)) {
            System.out.println("Grade: 4");
        }
        else if ((50 <= points) && (points <= 60)) {
            System.out.println("Grade: 5");
        }
    }
}
