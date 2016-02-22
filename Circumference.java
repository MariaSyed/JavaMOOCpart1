
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a radius:");
        int radius = Integer.parseInt(reader.nextLine());
        double circ = 2 * Math.PI * (double)radius ;
        System.out.println("Circumference of the circle: " + circ); 
    }
}
