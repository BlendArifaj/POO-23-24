package Java_08.group_03;

public class Detyra1 {
    public static void main(String[] args){
        Account account1 = new Account();
        try{
            account1.deposit(200);
            account1.withdraw(100);
            account1.deposit(300);
            account1.withdraw(500);
        }catch (InsufficientFundsException ife){
            System.out.println(ife.getMessage());
        }
    }
}

class Account{
    private float bilance = 0.0f;

    public void deposit(float amount) throws InsufficientFundsException{
        if(amount <= 0){
            throw new InsufficientFundsException("Deposit failed! Amount: " + amount);
        }
        this.bilance += amount;
        System.out.println("Deposit Successfully!");
    }

    public void withdraw(float amount) throws InsufficientFundsException{
        if(amount > this.bilance){
            throw new InsufficientFundsException("Withdraw failed! Amount: " + amount);
        }
        this.bilance -= amount;
        System.out.println("Withdraw successfully!");
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message){
        super(message);
    }
}