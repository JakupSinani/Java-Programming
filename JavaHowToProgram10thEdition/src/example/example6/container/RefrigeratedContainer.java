package example.example6.container;

public class RefrigeratedContainer extends HeavyContainer {

    public RefrigeratedContainer(int id, int weight) {
        super(id, weight);
    }

    @Override
    public double consumption() {
        return 5.00 * weight;
    }

    @Override
    public boolean equals(Container other) {
        return other.getClass().getSimpleName().equals("RefrigeratedContainer") && id == other.id && weight == other.weight;
    }
}
