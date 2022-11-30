package example.example3.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            //int c=a/b;
            //divide(a,b);

            String name = "Jakup";
            if (name.equals("Jakup")) {
                throw new MyException("name is Jakup");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally {
            System.out.println("this will always execute");
        }
    }

    static int divide(int a, int b) {
        //return a/b;

        if (b == 0) {
            throw new ArithmeticException("please do not divide by 0");
        }
        return a / b;
    }
}
