package Enum;

public enum AccountType {
    SILVER(1000,1500),
    GOLD(10000,15000),
    PLATINUM(20000,30000);

    private double withdrawLimit;
    private double depositLimit;

  //Add two fields to the AccountType enum: withdrawLimit and depositLimit
     AccountType(double withdrawLimit, double depositLimit) {
         this.withdrawLimit = withdrawLimit;
         this.depositLimit = depositLimit;
    }
    //Add methods to retrieve these limits
    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public double getDepositLimit(){
         return depositLimit;
    }



}
