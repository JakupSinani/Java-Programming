package array.passing_array_to_method;

public class VarArgsDemo {
    public static void main(String[] args) {
        double[] numbers = {34, 3, 3, 2, 56.5};    //  create array and initialize that
        printMax(numbers);      //  invoke printMax method
        printMax(new double[]{1, 2, 3});      //  invoke printMax method and create double array
    }

    public static void printMax(double[] numbers) {
        if (numbers.length == 0) { //  if no argument are passed, then the length of the array is 0
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) { //  if numbers is greater than result above
                result = numbers[i];  //  then result is equal with that number
            }
        }
        System.out.println("The max value is " + result);
    }
}
