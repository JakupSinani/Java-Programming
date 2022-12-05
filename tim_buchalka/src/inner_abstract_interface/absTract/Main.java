package inner_abstract_interface.absTract;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        System.out.println();

        Parrot parrot = new Parrot("Australian rigneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        System.out.println();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
