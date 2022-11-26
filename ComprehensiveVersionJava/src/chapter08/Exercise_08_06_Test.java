package chapter08;

public class Exercise_08_06_Test {
    public static void main(String[] args) {
    Exercise_08_06 stopWatch=new Exercise_08_06();

    //  create array of 100.000 random numbers
        int[]randomArray=getArray();

        //  invoke the start method in stopwatch class
        stopWatch.start();

        //  sort array
        selectionSort(randomArray);

        //  invoke the end method in stopwatch class
        stopWatch.stop();

        //  display the execution time
        System.out.println("The execution time of sorting 100.000 number using selection sort: "+stopWatch.getElapsedTime()+" seconda");


    }
    public static int[]getArray(){
        int[]arr1=new int[100000];
        for (int i=0;i< arr1.length;i++){
            arr1[i]=(int)(Math.random()*100000);
        }
        return arr1;
    }
    public static void selectionSort(int[]array){
        for (int i=0;i< array.length-1;i++){
            int min=array[i];
            int minIndex=i;

            for (int j=i+1;j< array.length;j++){
                if (array[j]<min){
                    min=array[j];
                    minIndex=j;
                }
            }
            if (i!=minIndex){
                array[minIndex]=array[i];
                array[i]=min;
            }
        }
    }
}
