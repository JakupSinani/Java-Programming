package control_flow_statement.challenge;

public class DigitSumChallenge {

    //  hint:
    //  use n%10 to extract the least-significant digit
    //  use n=n/10 to discard the least-significant digit

    public static void main(String[] args) {
        System.out.println("The sum of the  digits is " + sumDigits(-125));
        System.out.println("the sum of the digits is " + sumDigits(3213));
        ;
        int sum = sumDigits(125);
        System.out.println(sum);
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;

        //  125 -> 125 / 10 = 12 -> * 10 = 120 -> 125 - 120 = 5
        while (number > 0) {
            //  extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            //  drop the least-significant digit
            number /= 10; // same as number  number = num / 10
        }
        return sum;
    }
}
