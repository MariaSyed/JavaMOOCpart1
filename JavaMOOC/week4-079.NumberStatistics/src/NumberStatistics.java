
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        if (this.amountOfNumbers > 0) {
            return this.sum;
        }
        
        else {
            return 0;
        }
        
    }

    public double average() {
        double average = ((double) this.sum) / ((double) this.amountOfNumbers);
        if ( this.amountOfNumbers <= 0){
            return 0.0;
        }
        
        else {
            return average;
        }
    }
}
