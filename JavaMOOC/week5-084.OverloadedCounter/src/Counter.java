/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maria
 */
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0);
        this.check = check;
    }

    public Counter() {
        this(false);
        this.startingValue = 0;
    }

    public int value() {
        return this.startingValue;
    }

    public void increase() {
        this.startingValue++;
    }

    public void decrease() {
        if (this.check == false) {
            this.startingValue--;
        }

        if (this.check == true) {
            if (this.startingValue > 0) {
                this.startingValue--;
            }
        }

    }

    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.startingValue = this.startingValue + increaseAmount;
        }

    }

    public void decrease(int decreaseAmount) {

        if (decreaseAmount >= 0) {
            if (this.check) {
                if (decreaseAmount < this.startingValue) {
                    this.startingValue = this.startingValue - decreaseAmount;
                } 
                else {
                    this.startingValue = 0;
                }
            }

            else {
                this.startingValue = this.startingValue - decreaseAmount;
            }

        }
    }
}
