public class Account {

    private double balance;
    private AccountType accountType;

    public Account(double balance, AccountType accountType) {
        this.balance = balance;
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public void displayLimits(){
        System.out.printf("Withdraw limit: $%.0f\n",accountType.getWithdrawLimit());
        System.out.printf("Deposit limit: $%.0f\n",accountType.getDepositLimit());

    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }
}
