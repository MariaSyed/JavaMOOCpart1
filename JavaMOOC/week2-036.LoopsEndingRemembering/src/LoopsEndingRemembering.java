import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers");
        int sum = 0;
        int number = 0;
        int even = 0;
        int odd = 0;
        while (true){
            
            int value = Integer.parseInt(reader.nextLine());
            number++;
            if (value%2==0){
                even++;
            }
            if (value%2!=0){
                odd++;
            }
            if (value == -1){
                number=number-1;
                odd-=1;
                break;
            }
            
            sum +=value;
             
            
        } 
        double average = (double)sum / number;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + number);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

    }   
}
