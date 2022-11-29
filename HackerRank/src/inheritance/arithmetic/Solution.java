package inheritance.arithmetic;

public class Solution {

    public static void main(String[] args) {
        //  create a new Adder object
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        System.out.println(adder.add(10, 32) + " " + adder.add(10, 3) + " " + adder.add(10, 10));
    }
}
