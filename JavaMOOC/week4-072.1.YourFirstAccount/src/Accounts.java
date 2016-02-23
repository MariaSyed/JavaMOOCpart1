
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        Account BartosAccount = new Account("Bartos",100.00);
        
        BartosAccount.deposit(20.00);
        
        System.out.println(BartosAccount.toString());
        
    }

}
