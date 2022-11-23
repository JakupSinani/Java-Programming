package reference;

public class Test {
    public static void main(String[] args) {
        Ballon red = new Ballon("Red");   //  memory reference 50
        Ballon blue = new Ballon("Blue");   // memory reference 100

        swap(red, blue);
        System.out.println("red color: " + red.getColor());
        System.out.println("blue color: " + blue.getColor());

        foo(blue);
        System.out.println("blue color: " + blue.getColor());

    }

    private static void foo(Ballon ballon) { // ballon = 100
        ballon.setColor("Red =====>> inside foo method"); // ballon = 100
        ballon = new Ballon("Green =====>> inside foo method");   //  baloon = 200
        ballon.setColor("Blue ====> inside foo method");    // baloon = 200
    }

    //  generic swap method
    public static void swap(Object o1, Object o2) {
        Object temp = o1;
        o1 = o2;
        o2 = temp;
    }
}
