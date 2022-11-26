package chapter09;

public class Exercise_09_03 {
    int value;

    public Exercise_09_03(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(value);
    }

    public boolean isOdd() {
        return isOdd(value);
    }

    public boolean isPrime() {
        return isPrime(value);
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= value * 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(Exercise_09_03 myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(Exercise_09_03 myInteger) {
        return myInteger.isOdd();
    }


    public static boolean isPrime(Exercise_09_03 myInteger) {
        return myInteger.isPrime();
    }


    public boolean equals(int value) {
        return this.value == value;
    }


    public boolean equals(Exercise_09_03 myInteger) {
        return myInteger.value == this.value;
    }


    public static int parseInt(char[] chars) {
        int value = 0;
        for (int i = 0, j = (int) Math.pow(10, chars.length - 1);
             i < chars.length; i++, j /= 10) {
            value += (chars[i] - 48) * j;
        }
        return value;
    }


    public static int parseInt(String str) {
        int value = 0;
        for (int i = 0, j = (int) Math.pow(10, str.length() - 1);
             i < str.length(); i++, j /= 10) {
            value += (str.charAt(i) - 48) * j;
        }
        return value;
    }
}
