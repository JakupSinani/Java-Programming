package chapter16.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestGenerics1 {
    public static void main(String[] args) {

    }

    public void go() {
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Dog());
        animalArrayList.add(new Cat());
        animalArrayList.add(new Dog());
        takeAnimals(animalArrayList);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
//        takeAnimals(dogs);  //  can't
    }

    public void takeAnimals(ArrayList<Animal> animals) {
        for (Animal a : animals) {
            a.eat();
        }
    }
}
