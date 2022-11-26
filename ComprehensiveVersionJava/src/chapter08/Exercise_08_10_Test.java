package chapter08;

import java.util.Scanner;

public class Exercise_08_10_Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a, b, c: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

        Exercise_08_10 quadraticEquation= new Exercise_08_10(a,b,c);

        System.out.println("The equation has ");
        if (quadraticEquation.getDiscriminant()<0){
            System.out.println("no real roots");
        }else if (quadraticEquation.getDiscriminant()>0){
            System.out.println("two roots "+quadraticEquation.getRoot1()+ " and "+quadraticEquation.getRoot2());
        }else {
            System.out.println("one root "+(quadraticEquation.getRoot1()>0?quadraticEquation.getRoot1():quadraticEquation.getRoot2()));
        }
    }
}
