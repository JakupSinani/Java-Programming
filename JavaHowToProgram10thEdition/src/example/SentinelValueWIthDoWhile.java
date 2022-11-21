package example;

import java.util.Scanner;

public class SentinelValueWIthDoWhile {
    public static void main(String[] args) {
        //  create a scanner
        Scanner in = new Scanner(System.in);

        int number,max;
        int sum=0;
        number=in.nextInt();
        max=number;
        do {
            number=in.nextInt();
            sum+=number;
            if (number>max){
                max=number;
            }

        }while (number!=0);
        System.out.println("max is: "+max);

        System.out.println("sum: "+sum);
    }
}
