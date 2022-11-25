package chapter07;

public class InitArray {
    public static void main(String[] args) {
        int[] array = {32, 2, 27, 64, 18, 98, 14, 90, 75, 22, 59};

        System.out.printf("%s%8s%n", "Index", "Value");   //column headings

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}
