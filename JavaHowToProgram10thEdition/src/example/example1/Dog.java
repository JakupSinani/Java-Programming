package example.example1;

public class Dog extends Animal {
    @Override
    void makeNoise() {
        System.out.println("bark");
    }

    void playDead() {
        System.out.println("roll over");
    }

}
