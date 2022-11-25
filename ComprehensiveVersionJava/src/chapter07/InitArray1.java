package chapter07;

public class InitArray1 {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * 2 * i;
            System.out.println(array[i]);
        }
    }
}
