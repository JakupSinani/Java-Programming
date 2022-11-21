package example;

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        //  create a Scanner
        Scanner in = new Scanner(System.in);

        //  read an initial data
        System.out.println("Enter an integer (the input ends if it is 0): ");
        int data=in.nextInt();

        //  keep reading data
        int sum=0;
        while (data!=0){
            sum+=data;

            //  read the next data
            System.out.println("ENter an integer (the input ends if it is 0): ");
            data= in.nextInt();
        }
        System.out.println("the sum is: "+sum);
    }
}
