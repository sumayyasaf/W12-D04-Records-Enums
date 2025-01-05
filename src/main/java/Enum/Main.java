package Enum;

public class Main {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        //Create accounts with different account types
        bankingSystem.createAccount("10001",AccountType.SILVER, 1000);
        bankingSystem.createAccount("10002", AccountType.GOLD, 2000);
        bankingSystem.createAccount("10003",AccountType.PLATINUM,3000);

        //Perform valid and invalid deposits and withdrawals
        BankAccount silverAccount = bankingSystem.getAccount("10001");
        silverAccount.deposit(2000); //Invalid
        silverAccount.withdraw(100); //valid

        BankAccount goldAccount = bankingSystem.getAccount("10002");
        goldAccount.deposit(2000); //valid
        goldAccount.withdraw(16000); //Invalid

        BankAccount platinumAccount = bankingSystem.getAccount("10003");
        platinumAccount.deposit(10000); //valid
        platinumAccount.withdraw(5000); //valid

        //Transfer funds between accounts
        bankingSystem.transferFunds("10001","10003",500); //valid
        bankingSystem.transferFunds("10002","10003",120000); //Invalid

        //Display the account types and their limits
        System.out.println("Account Types and their Limits:");
        for (AccountType accountType : AccountType.values()) {
            System.out.println(accountType + " - Withdrawal Limit: " + accountType.getWithdrawLimit() + ", Deposit Limit: " + accountType.getDepositLimit());
        }
    }

}
