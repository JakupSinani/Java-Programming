import java.util.Scanner;

/*Use the keyboard to enter a number. If the number is positive, then double it. If the number is negative, add one.
If the entered number is zero, display zero.
Display the result on the screen.*/
public class Solution3 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        if (num > 0) {
            int sum = num * num;
            System.out.println(sum);
        } else if (num == 0) {
            System.out.println(num);
        } else {
            num = in.nextInt();
        }
    }
}
