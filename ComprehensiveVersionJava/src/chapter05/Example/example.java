package chapter05.Example;

public class example {
    public static void main(String[] args) {
        double b = Math.pow(1 * 0.09, 12 * 5);
        double c = Math.pow(1 + 0.09, 2 * 12) * 1000;
        double d = 1000 * Math.pow((1 + 0.0075), 2 * 12);
        double f = 1000 * ((1 + 0.0075) * 24);
        System.out.println(f);
    }
}
