package back.banking;

/**
 * Abstract bank account.
 */
public abstract class Account implements AccountInterface {
    private AccountHolder accountHolder;
    private Long accountNumber;
    private int pin;
    private double balance;

    protected Account(AccountHolder accountHolder, Long accountNumber, int pin, double startingDeposit) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = startingDeposit;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public boolean validatePin(int attemptedPin) {
        // TODO: complete the method
        return false;
    }

    public double getBalance() {
        return getBalance();
        
    }

    public Long getAccountNumber() {
        return  getAccountNumber();
    }

    public void creditAccount(double amount) {
        // TODO: complete the method
    }

    public boolean debitAccount(double amount) {
        // TODO: complete the method
        return false;
    }
}
