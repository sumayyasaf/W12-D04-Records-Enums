package Enum;

public class BankAccount {
    public String accountNumber;
    public AccountType accountType;
    public double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, AccountType accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    //Add Deposit Method
    public void deposit(double amount){
        if(amount <= accountType.getDepositLimit()) {
            balance += amount;
            System.out.println("Deposited amount" + amount + ".New balance : " + balance);
        } else {
            System.out.println("Deposit amount exceeds the limit for " + accountType + " account. ");
        }
    }
    //Add Withdraw Method
    public void withdraw(double amount){
        if(amount <= accountType.getDepositLimit() && balance >= amount){
            balance -= amount;
            System.out.println("Withdraw amount " + amount + " New Balance: " + balance);
        } else if (amount > accountType.getWithdrawLimit()) {
            System.out.println("Withdrawal amount exceeds the limit for " + accountType + "account.");
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }

}
