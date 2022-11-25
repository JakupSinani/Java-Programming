package chapter08.Example;

public class F {
    private int i = 5;
    private static double k = 0;

    public void setI(int i) {
        this.i = i;
    }

    public static void setK(double k) {
        F.k = k;
    }

    /* F f1=new F();
     *   F f2=new F();
     * invoking f1.setI(10) is to execute
     * this.i=10, where this is an alias for f1
     * invoking f2.setI(15) is to execute
     * this.i=10, where this is an alias for f1*/


}
