import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        
        String password = "";
        while (password.length() < this.length){
            int i = this.random.nextInt(26);
        char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(i);
        password += symbol;
        }
        return password;
    }
}
