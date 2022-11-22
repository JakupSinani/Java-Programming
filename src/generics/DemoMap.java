package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DemoMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(new Integer(1), "one");
        map.put(new Integer(2), "two");
        map.put(3, "three"); //  let the autoboxing make the integer
        map.put(4, "four");

        String s = map.get(new Integer(3)); //returns type string
        s = map.get(3);   //same as above, with autoboxing
        //  map.put("hi","there");  // no does not compile

        //  aauto unboxing converts between integer and int
        Integer intObj = new Integer(7);
        int sum = intObj + 3;   // intobj unboxes automatically to an int, sum is 10

        //  more complex example == map string to list of integer
        HashMap<String, List<Integer>> counts = new HashMap<String, List<Integer>>();
        List<Integer> evens = new ArrayList<Integer>();
        evens.add(2);
        evens.add(4);
        evens.add(6);
        counts.put("evens", evens);

        //  get the List<Integer> back out
        List<Integer> evens2 = counts.get("evenes");
        sum = evens2.get(0) + evens2.get(1);    // unboxing here, is sum 6
    }
}
