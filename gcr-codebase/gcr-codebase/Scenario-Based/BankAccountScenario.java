// Problem Overview

// Design a simple BankAccount class that models real-world banking behavior. Each account should store basic details like account number, holder name, and balance.

// You will implement methods to deposit and withdraw money, ensuring that withdrawals don't exceed the available balance. The class should also keep track of how many accounts have been created using a static variable. Finally, create multiple accounts and simulate transactions to observe how the system behaves.

// Key Points

// Create a class with accountNumber, holder, and balance

// Implement deposit() and withdraw() with proper balance checks

// Add getStatement() to display account details

// Use a static variable to count total accounts created

// Create 3 accounts and perform 5 transactions on each
public class BankAccountScenario {
    
    private String accountNumber;
    private String holder;
    private double balance;
    private static int totalAccounts = 0;

    public BankAccountScenario(String accountNumber, String holder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = initialBalance;
        totalAccounts++;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ". New Balance: " + balance);
    }

    public void getStatement() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holder);
        System.out.println("Balance: " + balance);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    


}


