package chapter10;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_10_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(in.nextInt());
        }
        removeDuplicate(integerArrayList);

        System.out.println("The distinct integer are: ");
        for (int i=0;i< integerArrayList.size();i++){
            System.out.println(integerArrayList.get(i)+" ");
        }
        System.out.println();
    }


    private static void removeDuplicate(ArrayList<Integer> integerArrayList) {

        for (int i = 0; i < integerArrayList.size(); i++) {
            for (int j = i + 1; j < integerArrayList.size(); j++) {
                if (integerArrayList.get(i)== integerArrayList.get(j)){
                    integerArrayList.remove(j);
                }
            }
        }
    }
}
