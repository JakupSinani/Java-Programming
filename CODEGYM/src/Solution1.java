public class Solution1 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple1 = new Apple();
        apple.addPrice(100);
        System.out.println("Apple price " + Apple.applePrice);
    }
}

