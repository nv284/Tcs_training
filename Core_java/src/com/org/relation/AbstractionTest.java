package com.org.relation;
abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Abstract methods for transactions
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void transfer(BankAccount targetAccount, double amount);

    // Concrete method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}




class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02;

    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // Implement deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            balance += balance * INTEREST_RATE; // Apply interest on deposit
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Implement withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdraw amount.");
        }
    }

    // Implement transfer method
    @Override
    public void transfer(BankAccount targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transferred: $" + amount + " to " + targetAccount.getAccountNumber());
        } else {
            System.out.println("Invalid transfer amount.");
        }
    }
}

class CheckingAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = 500.00;

    // Constructor
    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    // Implement deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Implement withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (amount <= balance || amount - balance <= OVERDRAFT_LIMIT)) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdraw amount. Overdraft limit exceeded.");
        }
    }

    // Implement transfer method
    @Override
    public void transfer(BankAccount targetAccount, double amount) {
        if (amount > 0 && (amount <= balance || amount - balance <= OVERDRAFT_LIMIT)) {
            balance -= amount;
            targetAccount.deposit(amount);
            System.out.println("Transferred: $" + amount + " to " + targetAccount.getAccountNumber());
        } else {
            System.out.println("Invalid transfer amount. Overdraft limit exceeded.");
        }
    }
}
public class AbstractionTest {

	 public static void main(String[] args) {
	        // Create accounts
	        BankAccount savings = new SavingsAccount("SAV123", 1000.00);
	        BankAccount checking = new CheckingAccount("CHK456", 500.00);

	        // Display account details
	        savings.displayAccountDetails();
	        checking.displayAccountDetails();

	        // Perform transactions
	        savings.deposit(200.00);
	        savings.withdraw(100.00);
	        savings.transfer(checking, 50.00);

	        checking.deposit(300.00);
	        checking.withdraw(1000.00);
	        checking.transfer(savings, 150.00);

	        // Display account details after transactions
	        savings.displayAccountDetails();
	        checking.displayAccountDetails();
	    }

}