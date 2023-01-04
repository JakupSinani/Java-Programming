package generics;

public class Gen<T> {
    T ob;   //  declare an object of type T

    //  pass the constructor a reference to
    //  an object of type T

    public Gen(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type of T is: " + ob.getClass().getName());
    }
}

class GenDemo {
    public static void main(String[] args) {
        //  create a Gen reference for Integers.
        Gen<Integer> iOb;

        //  create a Gen<Integer> object and assign its
        //  reference to iOb. Notice the use of autoboxing
        //  to encapsulate the value 88 within an Integer object.
        iOb = new Gen<Integer>(99);

        //  show the type of data used by iOb.
        iOb.showType();

        //  get the value in iOb. Notice that
        //  no case is needed.
        int v = iOb.getOb();
        System.out.println("value: " + v);

        System.out.println();

        //  create a Gen object for Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");

        //  show the type of data used by strOb.
        strOb.showType();

        //  get the value of strOb. Again, notice
        //  that no cast is needed.
        String str = strOb.getOb();
        System.out.println("value: " + str);
    }
}
