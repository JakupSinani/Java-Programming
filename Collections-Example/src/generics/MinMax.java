package generics;

public interface MinMax<T extends Comparable<T>> {
    T min();

    T max();
}

//  now implement minmax
class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    public MyClass(T[] vals) {
        this.vals = vals;
    }
    //  return the minimum value in vals.

    @Override
    public T min() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) v = vals[i];
        }
        return v;
    }

    @Override
    public T max() {
        T v = vals[0];
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) v = vals[i];
        }
        return v;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iOb = new MyClass<>(inums);
        MyClass<Character> cOb = new MyClass<>(chs);
        System.out.println("Max value in inums is: " + iOb.max());
        System.out.println("Min value in inums is: " + iOb.min());

        System.out.println("Max value in chs is: " + cOb.max());
        System.out.println("Min value in chs is: " + cOb.min());
    }
}