package exampleeeee;

public class Transaction {
    private Type type;
    private int originAccountId;
    private int resultAccountId;
    private double amount;
    private String reason;

    public Transaction(Type type, int originAccountId, int resultAccountId, double amount, String reason) {
        this.type = type;
        this.originAccountId = originAccountId;
        this.resultAccountId = resultAccountId;
        this.amount = amount;
        this.reason = reason;
    }

    public Type getType() {
        return type;
    }

    public int getOriginAccountId() {
        return originAccountId;
    }

    public int getResultAccountId() {
        return resultAccountId;
    }

    public double getAmount() {
        return amount;
    }

    public String getReason() {
        return reason;
    }

    public enum Type {
        TRANSFER, WITHDRAWAL, DEPOSIT
    }
}
