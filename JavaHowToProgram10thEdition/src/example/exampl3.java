package example;

import java.util.Scanner;

public class exampl3 {
    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();


        if ((num1 < num2 && num2 < num3) || (num3 < num2 && num2 < num1)) {
            System.out.println(num2);
        } else if ((num2 < num1 && num1 < num3) || (num3 < num1 && num1 < num2)) {
            System.out.println(num1);
        }else if ((num1 == num2 && num1 == num3) || (num2 == num1 && num2 == num3)) {
            System.out.println(num1+"fds");
        }
        else {
            System.out.println(num3);
        }*/
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(numbers[i]+=i);
            System.out.println(numbers[i] = 10 - i);
        }

    }
}
