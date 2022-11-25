package chapter05;

import java.util.Scanner;

public class Exercise_05_02 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter a integer: ");
        long number = in.nextLong();

        System.out.println("The sum of the digits in "+number+" is "+sumDigit(number));
    }
    public static long sumDigit(long n){
        int sum=0;
        while (n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
