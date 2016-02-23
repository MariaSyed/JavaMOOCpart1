import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        if (num1 != num2) {
            int bignum = Math.max(num2, num1);
            System.out.println("Greater number: " + bignum);
        }
        else System.out.println("Tne numbers are equal!");
    }
}
