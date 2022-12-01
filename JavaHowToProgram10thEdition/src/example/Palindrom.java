package example;

public class Palindrom {
    public static void main(String[] args) {
        int sum = 0;
        int n = 454;  //  it is the number variable to be checked for palindrom
        int temp = n;
        int r;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("palindrom number");
        } else {
            System.out.println("not palindrom number");
        }
    }
}
