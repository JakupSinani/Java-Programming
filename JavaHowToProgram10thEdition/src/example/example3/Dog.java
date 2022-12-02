package example.example3;

public class Dog {
    Collar c;
    String name;

    public static void main(String[] args) {
        Dog d;
        d = new Dog();
        d.go(d);
    }

    void go(Dog dog) {
        c = new Collar();
        dog.setName("Aiko");
    }

    private void setName(String dogName) {
        name = dogName;
    }
}
