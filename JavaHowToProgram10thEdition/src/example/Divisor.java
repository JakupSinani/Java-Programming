package example;

public class Divisor {
    public static void main(String[] args) {
        int n;
        int maxDivisor = 1;
        int numWithMax = 1;

        for (int i = 2; i < 10000; i++) {
            int divisorCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++;
                }
            }
            if (divisorCount > maxDivisor) {
                maxDivisor = divisorCount;
                numWithMax = i;
            }
        }
        System.out.printf("max num of divisor is " + maxDivisor);
        System.out.printf("a number with " + maxDivisor + " divisor is " + numWithMax);
    }

}
