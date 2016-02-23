
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added){
        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;

        Money newMoney = new Money(newEuros,newCents);
         return newMoney;
    }
    
    public boolean less(Money compared){
        if (this.euros < compared.euros){
            return true;
        }
        
        else if (this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        
        else {
            return false;
        }
    }
    
    public Money minus(Money decremented){
        int objectMoney = (this.euros * 100) + this.cents;
        int decrementedMoney = (decremented.euros * 100 ) + decremented.cents;
        int newMoney = objectMoney - decrementedMoney;
        int newMoneyEuros = (newMoney / 100);
        int newMoneyCents = newMoney % 100;
        Money newMoney1 = new Money(newMoneyEuros,newMoneyCents);
        Money newMoney2 = new Money(0,0);
        if( newMoney > 0){
        return newMoney1;
        }
        
        else {
            return newMoney2;
            
        }
        
        
    }

}
