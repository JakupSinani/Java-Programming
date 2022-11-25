package chapter04;
//  count positive and negative numbers and compute the average of numbers

import java.util.Scanner;

public class Exercise_04_01 {
    public static void main(String[] args) {
        //  create a Scanner
        Scanner in = new Scanner(System.in);
        int numOfPositive = 0;
        int numOfNegative = 0;
        int sum=0;
        int inputNum= in.nextInt();
        while (inputNum!=0){
            System.out.println("Enter an integer, the input end if it is 0: ");
            inputNum=in.nextInt();
            if (inputNum>0){
                numOfPositive++;
                sum+=inputNum;
            }else if (inputNum<0){
                numOfNegative++;
            }
        }
        System.out.println("The number of positiv is: "+numOfPositive);
        System.out.println("The number of negativ is: "+numOfNegative);
        System.out.println("The total is: "+sum);
    }
}
