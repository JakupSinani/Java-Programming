package array;

public class Array1 {
    public static void main(String[] args) {
        int[]arr=new int[15];
        arr(arr);
    }
    public static int[]arr(int[]arr){
        for (int i=1;i< arr.length;i++){
            arr[i]=i*5;
        }
        display(arr);
        return arr;
    }
    public static int[] display(int []arr){
        for (int i=1;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        return arr;
    }
}
