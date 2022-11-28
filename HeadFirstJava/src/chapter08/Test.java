package chapter08;

public class Test {
    public static void main(String[] args) {

        Wolf w = new Wolf();  //  new object

        w.makeNoise();  //  calls the version in wolf

        w.roam();   //  calls the version in Canine

        w.eat();    //  calls the version in Wolf

        w.sleep();  //  calls the version in Animal

        Cat c = new Cat();

        System.out.println("getClass()\t" + c.getClass());
        System.out.println("hashCode()\t" + c.hashCode());
    }
}
