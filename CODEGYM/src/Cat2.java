public class Cat2 {
    public static void main(String[] args) {
        Cat18 cat1 = new Cat18();
        Cat18.count++;
        Cat18 cat2 = new Cat18();
        Cat18.count++;
        System.out.println("The cat count is: " + Cat18.count);
    }
}
