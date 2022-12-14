package OCA.LAMBDA;

public class FindMatchingAnimals {
    public static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), a -> a.isCanHop());
        print(new Animal("kangaroo", true, false), a -> a.isCanHop());
    }
}
