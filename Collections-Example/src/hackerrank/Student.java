package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
}

class Rockstar {
}

class Hacker {
}

class InstanceOFTutorial {
    static String count(ArrayList myList) {
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < myList.size(); i++) {
            Object element = myList.get(i);
            if (element.getClass().getName() == "Student")
                a++;
            if (element.getClass().getName() == "Rockstar")
                b++;
            if (element.getClass().getName() == "Hacker")
                c++;
        }
        String ret = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c);
        return ret;
    }

    public static void main(String[] args) {
        ArrayList myList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            String s = in.nextLine();
            if (s.equals("Student")) myList.add(new Student());
            if (s.equals("Rockstar")) myList.add(new Rockstar());
            if (s.equals("Hacker")) myList.add(new Hacker());
        }
    }
}
