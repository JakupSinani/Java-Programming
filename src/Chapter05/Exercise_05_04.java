package Chapter05;

import java.util.Scanner;
/*(Display an integer reversed) Write a method with the following header to display
an integer in reverse order:*/
public class Exercise_05_04 {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number=in.nextInt();
        reverse(number);
    }
    public static void reverse(int number){
        while (number>0){
            System.out.print((number%10));
            number/=10;
        }
        System.out.println();
    }
}
