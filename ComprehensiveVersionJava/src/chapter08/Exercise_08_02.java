package chapter08;

public class Exercise_08_02 {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Exercise_08_02(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent(){
    return ((currentPrice-previousClosingPrice)/previousClosingPrice)*100;
    }
}
