package chapter08;

public class Exercise_08_02_Test {
    public static void main(String[] args) {
        Exercise_08_02 stock=new Exercise_08_02("ORCL","Oracle Corporation");
        System.out.println(stock.currentPrice=34.35);
        System.out.println(stock.previousClosingPrice=34.5);
        System.out.println("Price-change percentage: "+stock.getChangePercent());
    }
}
