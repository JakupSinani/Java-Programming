package mosh;

//  Atention
// when you invoke a method with an argument,
//  the value of the argument is passed to the parameter.
//  THIS IS REFFERED TO AS PASS-BY-VALUE
public class IncrementMethod {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        // invoke increment method
        increment(x); // the increment method is statement because is void method
        System.out.println("After the call, x is " + x);
    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside the methos is " + n);
    }
}
