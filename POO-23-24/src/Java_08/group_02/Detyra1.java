package Java_08.group_02;

public class Detyra1 {
    public static void main(String[] args){
        try{
            Account account1 = new Account();
            account1.deposit(-500);
            account1.deposit(1000);
            account1.withdraw(2000);
        }catch (InsufficientFundsException ife){
            System.out.println(ife.getMessage());
        }
    }
}

class Account {
    private float balanca = 0.0f;
    public void deposit(float amount) throws InsufficientFundsException{
        if(amount <= 0){
            throw new InsufficientFundsException("Deposit not valid: " + amount);
        }
        this.balanca += amount;
        System.out.println("Deposit successfully!");
    }
    public void withdraw(float amount) throws InsufficientFundsException{
        if(amount > this.balanca){
            throw new InsufficientFundsException("Withdraw not valid: " + amount);
        }
        this.balanca -= amount;
        System.out.println("Withdraw successfully!");
    }
}
class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}