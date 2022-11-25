package reference;

public class Example {
    int a = 10;

    void call(int a) {
        a += 10;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Example example = new Example();
        System.out.println("Before call-by-value: " + example.a);

        example.call(50510);
        System.out.println("After call-by-value " + example.a);


    }
}
