public class AccountTypeClass {

    public static final String SILVER = "SILVER";
    public static final String GOLD = "GOLD";
    public static final String PLATINUM = "PLATINUM";

    private double withdrawLimit;
    private double depositLimit;

    public AccountTypeClass(double withdrawLimit, double depositLimit) {
        this.withdrawLimit = withdrawLimit;
        this.depositLimit = depositLimit;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public double getDepositLimit() {
        return depositLimit;
    }

    public void setDepositLimit(double depositLimit) {
        this.depositLimit = depositLimit;
    }

}
