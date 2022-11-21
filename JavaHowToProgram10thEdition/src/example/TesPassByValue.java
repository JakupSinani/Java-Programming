package example;

public class TesPassByValue {
    //  main method
    public static void main(String[] args) {

        //  declare and initilize variables
        int num1 = 485;
        int num2 = 713;

        System.out.println("Before invokint the swap method, num1 is " + num1 + " and num2 is " + num2);
        //  invoke the swap method to attempt to swap two variables
        swap(num1, num2);// method void must be statement
        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }

    public static void swap(int num1, int num2) {
        System.out.println("\nInside the swap method");
        System.out.println("Before swapping, num1 is " + num1 + " and num2 is " + num2);

        //  swap num1 with num2
        int temp = num1;
        num1 = num2;
        num2 = num1;

        System.out.println("\t\n After swapping, num1 is " + num1 + " and num2 is " + num2);

    }
}
