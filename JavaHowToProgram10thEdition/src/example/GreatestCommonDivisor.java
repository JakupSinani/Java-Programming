package example;

import java.util.Scanner;

public class GreatestCommonDivisor {
    //  main method
    public static void main(String[] args) {
        //  create a Scanner
        Scanner in = new Scanner(System.in);

        //  prompt the user to enter two integer
        System.out.println("Enter first integer: ");
        int num1=in.nextInt();
        System.out.println("Enter second integer: ");
        int num2=in.nextInt();

        int gcd=1;  //  initial gcd is 1
        int k=2;    //  possible gcd
        while (k<=num1&&k<=num2){
            if (num1%k==0&&num2%k==0){
                gcd=k;  //  update gcd
            }
            k++;
        }
        System.out.println("The gratest common divisor for "+num1+" and "+num2 + " is "+gcd);
    }
}
