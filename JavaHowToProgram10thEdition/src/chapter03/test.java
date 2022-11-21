package chapter03;

import java.security.SecureRandom;
import java.util.Scanner;

public class test {
    /*public static void main(String[] args) {
        int number1=(int)(System.currentTimeMillis()%10);
        int number2=(int)(System.currentTimeMillis()/7%10);
        Scanner in =new Scanner(System.in);
        System.out.printf("what is "+number1+" + "+number2+"? ");
        int answer=in.nextInt();
        System.out.printf(number1+" + "+number2+" = "+answer+" is "+(number1+ number2 == answer));
    }*/
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while (i < 10) {
            sum += i;
        }
    }
}
