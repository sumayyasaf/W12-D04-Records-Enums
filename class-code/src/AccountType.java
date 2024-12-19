public enum AccountType {

    SILVER(1000,1500),
    GOLD(10000,15000),
    PLATINUM(20000,30000);

    private final double withdrawLimit;
    private final double depositLimit;

    AccountType(double withdrawLimit, double depositLimit){
        this.withdrawLimit = withdrawLimit;
        this.depositLimit = depositLimit;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public double getDepositLimit() {
        return depositLimit;
    }
}
