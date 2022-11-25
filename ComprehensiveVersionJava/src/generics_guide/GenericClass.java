package generics_guide;

public class GenericClass<T extends A> {
    private T t;

    public GenericClass(T t) {
        this.t = t;
    }

    public void doRunTest() {
        this.t.displayClass();
    }

    public static void main(String[] args) {

        //  creating object of sub class C and
        //  passing it to bound as a type parameter
        GenericClass<C> c = new GenericClass<C>(new C());
        c.doRunTest();


        //  creating object of sub class B and
        //  passing it to bound as a type parameter
        GenericClass<B> b = new GenericClass<B>(new B());
        b.doRunTest();

        //  creating object of sub class B and
        //  passing it to bound as a type parameter
        GenericClass<A> a = new GenericClass<A>(new A());
        a.doRunTest();
    }
}
