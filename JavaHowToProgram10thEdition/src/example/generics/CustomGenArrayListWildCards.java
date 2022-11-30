package example.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  here T should either be Number or its subclasses
public class CustomGenArrayListWildCards<T extends Number> {
    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;   //  also working index value

    public CustomGenArrayListWildCards() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
        //  do something

        //  here you can pass only NUmber type
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public void resize() {
        Object[] temp = new Object[data.length * 2];

        //  copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();

        CustomGenArrayListWildCards<Integer> list3 = new CustomGenArrayListWildCards<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }
        System.out.println(list3);
    }
}
