package chapter04.dog;

public class DogTest {
    public static void main(String[] args) {

        Dog one = new Dog();
        one.size = 70;

        Dog two = new Dog();
        two.size = 8;

        Dog three = new Dog();
        three.size = 35;

        one.bark();
        two.bark();
        three.bark();

        System.out.println("\n");

        Dog four = new Dog();
        four.bark(3);   //the number inside parentheses is argument

        int theSecret = four.giveSecret();
    }
}
