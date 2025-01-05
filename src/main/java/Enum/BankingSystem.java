package Enum;

import java.util.HashMap;

public class BankingSystem {
    private HashMap<String, BankAccount> accounts = new HashMap<>();

    public void createAccount(String accountNumber, AccountType accountType, double initialBalance){
        BankAccount newAccount = new BankAccount(accountNumber,accountType,initialBalance);
        accounts.put(accountNumber,newAccount);
        System.out.println("Account" + accountNumber + " successfully created.");
    }
    public BankAccount getAccount(String accountNumber){
        return accounts.get(accountNumber);
    }
    public void transferFunds(String fromAccountNumber, String toAccountNumber, double transactionAmount){
        BankAccount fromAccount = getAccount(fromAccountNumber);
        BankAccount toAccount = getAccount(toAccountNumber);
        if(fromAccount.getBalance() >= transactionAmount && transactionAmount <= fromAccount.getAccountType().getWithdrawLimit()){
          fromAccount.withdraw(transactionAmount);
          toAccount.deposit(transactionAmount);
            System.out.println(transactionAmount + "amount transferred to" + toAccountNumber);
        } else {
            System.out.println("Transfer failed.");
        }
    }
}
