package BANKSYSTEM;

public class Transaction {
    private double amount;
    private String transactionReason;


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionReason() {
        return transactionReason;
    }

    public void setTransactionReason(String transactionReason) {
        this.transactionReason = transactionReason;
    }


    @Override
    public String toString() {
        return "\nTransaction{" +
                "amount=" + amount +
                ", transactionReason='" + transactionReason + '\'' +
                "}";
    }
}
