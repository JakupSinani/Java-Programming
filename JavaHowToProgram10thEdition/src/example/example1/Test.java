package example.example1;

public class Test {
    public static void main(String[] args) {
        Animal[] a = {new Animal(), new Dog(), new Animal()};
        for (Animal animal : a) {
            animal.makeNoise();
            if (animal instanceof Dog) {
                ((Dog) animal).playDead();

            }
        }
    }
}
