package example;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        boolean isExit=false;
        while (!isExit){
            String s=in.nextLine();
            isExit=s.equals("exit");
        }*/
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            continue;
        }
    }
}
