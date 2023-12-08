package Java_08.ushtrime;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(double amount) {
        super("Insufficient funds. Cannot withdraw $" + amount);
    }
}

class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1000);

        try {
            account.deposit(500);
            account.withdraw(1200);
            account.withdraw(800);
        } catch (InsufficientFundsException e) {
            System.out.println("Caught an InsufficientFundsException: " + e.getMessage());
        }

        System.out.println("Current Balance: $" + account.getBalance());
    }
}
