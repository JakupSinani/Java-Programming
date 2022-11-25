package chapter06.example;

public class Scope {
    //  field that is accessible to all methods of this class
    private static int x = 1;

    //  method main creates and initialies local variable x
    //  and calls methods useLocalVariable and useField
    public static void main(String[] args) {

        int x = 5;    //  method's local variable x shadows field x

        System.out.printf("local x in main is %d%n", x);

        useLocalVariable(); //  useLocalVariable has local x
        useField(); //  useField uses class Scope's field x
        useLocalVariable(); //  useLocalVariable reinitialzes local x
        useField(); //  class Scope's field x retains its value

    }

    public static void useLocalVariable() {
        int x = 25;   //  initialied each time useLocalVariable is called
        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
        ++x;    //  modifies this method's local variable x
        System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
    }

    //  modifu class Scope's field x during each call
    public static void useField() {
        System.out.printf("%nfield x on entering method useField is %d%n", x);
        x *= 10;  //  modifies class scope's field x
        System.out.printf("field x before exiting method useField is %d%n", x);
    }
}
