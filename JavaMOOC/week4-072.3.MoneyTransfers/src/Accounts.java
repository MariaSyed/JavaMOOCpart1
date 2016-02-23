
public class Accounts {
     public static void transfer(Account from, Account to, double howmuch){
           from.withdrawal(howmuch);
           to.deposit(howmuch);
           System.out.println(from.toString());
           System.out.println(to.toString());
       }
       
    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
      
       Account A = new Account("A", 100.0);
       Account B = new Account("B",0.0);
       Account C = new Account("C", 0.0);
       
       transfer(A,B,50.0);
       transfer(B,C,25.0);
    }


}
