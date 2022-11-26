package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise_10_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer>arrayList=new ArrayList<>();

        System.out.println("Enter 5 numbers: ");
        for (int i=0;i<5;i++){
            arrayList.add(in.nextInt());
        }
        sort(arrayList);
        System.out.println(arrayList.toString());
    }

    private static void sort(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
    }
}
