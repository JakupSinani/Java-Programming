package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        //  create a List<String>
        List<String> a = new ArrayList<String>();
        a.add("Don't");
        a.add("blame");
        a.add("me!");

        //  for each == iterate over collection easily
        for (String str : a) {
            System.out.println("Inside foreach method");
            System.out.println(str);
        }

        //  instead of iterator make an iterator<String>
        Iterator<String> it = a.listIterator();
        while (it.hasNext()) {
            //  note: no cast required here == it.next() is a string
            System.out.println("Inside iterator method");
            String string = it.next();
            System.out.println(string);
        }
        List<Integer> ints = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.println("inside for method");
            ints.add(new Integer(i * i));
            System.out.println(ints);
        }

        // no casts needed here,, it knows they are Integer
        int sum = ints.get(0).intValue() + ints.get(1).intValue();

        //with auto unboxing, can just write it like this
        sum = ints.get(0) + ints.get(1);


    }
}
