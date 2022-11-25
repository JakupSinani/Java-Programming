package array;

//   there are three ways to copy arrays:
//  1. use a loop to copy individual elements one by one
//  2.use the static_arraycopy method in the System class
//  3. use the clone method to copy arrays;
public class CopyArray {
    public static void main(String[] args) {
        int[] sourceArray = {2, 3, 1, 5, 10};
        int[] targetArray = new int[sourceArray.length];
        //  before copying
        System.out.println("Source array: ");
        for (int source : sourceArray) {
            System.out.println(source);
        }
        System.out.println("target array: ");
        for (int target : targetArray) {
            System.out.println(target);
        }
        //after copying
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println("target array: ");
        for (int target : targetArray) {
            System.out.println(target);
        }

    }
}
