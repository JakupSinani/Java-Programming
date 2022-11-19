package Chapter05.Example;

public class Example1 {
    public static void main(String[] args) {
        int max = 0;
        maxx(1,2,max);

    }
    public static void maxx(
            int value1, int value2, int max) {
        if (value1 > value2)
            max = value1;
        else
            max = value2;
        System.out.println(max);
    }

}
