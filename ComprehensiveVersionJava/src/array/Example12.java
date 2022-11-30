package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example12 {
    public static void main(String[] args) {
      /*  List<String> list=new ArrayList<>();
        list.add("Fluffy");
        list.add("Webby");
        String[]array=new String[list.size()];
        array[0]=list.get(1);
        array[1]=list.get(0);

        for (int i=0;i< array.length;i++){
            System.out.print(array[i]+"-");
        }*/

        String[] array = {"gerbil", "mouse"};
        List<String> list = Arrays.asList(array);
        list.set(1, "test");
        array[0] = "new";
        String[] array2 = (String[]) list.toArray();
        list.remove(1);
    }
}
