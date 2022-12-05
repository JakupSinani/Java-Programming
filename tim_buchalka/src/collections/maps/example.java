package collections.maps;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int counter = 0;
        if (num1 > 0) {
            counter++;
        }
        if (num2 > 0) {
            counter++;
        }
        if (num3 > 0) {
            counter++;
        }
        System.out.println(counter);


    }
}
