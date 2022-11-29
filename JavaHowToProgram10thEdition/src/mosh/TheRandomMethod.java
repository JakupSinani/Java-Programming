package mosh;

public class TheRandomMethod {
    //  main method
    public static void main(String[] args) {
        System.out.println(mathRandom(15));
    }

    public static int mathRandom(int num1) {
        //  (int)(Math.random()*10)----------> returns a random integer between 0 and 9
        //  50 + (int)(Math.random()*50)-----> returns a random integer between 50 and 99
        int num = (int) (Math.random() * num1);
        return num;
    }
}
