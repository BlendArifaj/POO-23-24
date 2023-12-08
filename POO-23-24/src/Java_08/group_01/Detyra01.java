package Java_08.group_01;

public class Detyra01 {
    public static void main(String[] args){
        Account acc1 = new Account(250);
        acc1.deposit(500);
        acc1.deposit(-200);

        try{

            acc1.withdraw(200);
            acc1.withdraw(1000);
        }catch (InsufficientFundsException ife){
            System.out.println(ife.getMessage());
        }
    }
}

class Account{
    private float amount;

    public Account(float amount){
        this.amount = amount;
    }

    public void deposit(float amount){
        try{
            if(amount < 0){
                throw new InsufficientFundsException(amount);
            }
            this.amount += amount;
            System.out.println("Deposit successfully!");
        }catch (InsufficientFundsException ief){
            System.out.println(ief.getMessage());
        }

    }

    public void withdraw(float amount) throws InsufficientFundsException{
        if(this.amount < amount){
            throw new InsufficientFundsException(amount);
        }
        this.amount -= amount;
        System.out.println("Withdraw successfully!");
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(float amount){
        super("Insufficent amount: " + amount);
    }
}