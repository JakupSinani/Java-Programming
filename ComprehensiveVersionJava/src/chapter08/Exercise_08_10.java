package chapter08;

public class Exercise_08_10 {
    private int a,b,c;

    public Exercise_08_10(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
    public int getDiscriminant(){
        return ((b*b)-(4*a*c));
    }
    public int getRoot1(){
      return getDiscriminant()<0?0: (int) (((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
    }
    public int getRoot2(){
        return getDiscriminant() < 0 ? 0 :
                (int) (((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
    }
}
