package chapter10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_10_12 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer>arrayList=new ArrayList<>();
        System.out.println("Enter 5 numbers");
        for (int i=0;i<5;i++){
            arrayList.add(in.nextInt());
        }
        sum(arrayList);
    }

    private static int sum(ArrayList<Integer> arrayList) {
        int sum=0;
        for (int i=0;i<arrayList.size();i++){
            sum+= arrayList.get(i);
        }
        System.out.println("The sum of all elements is: "+sum);
        return sum;
    }
}
