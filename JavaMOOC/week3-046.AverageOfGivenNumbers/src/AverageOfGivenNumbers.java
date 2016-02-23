
public class AverageOfGivenNumbers {
    
    // implement here again the method of exercise 43
    public static int sum(int number1, int number2, int number3, int number4) {
        int sumnum = number1 + number2 + number3 + number4;
        return sumnum;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        double answer = AverageOfGivenNumbers.sum(number1, number2, number3, number4);
        double result = answer/4.0;
        return result;
    }

    public static void main(String[] args) {
        double average = average(4, 3, 6, 1);
        System.out.println("average: " + average);
    }
}
