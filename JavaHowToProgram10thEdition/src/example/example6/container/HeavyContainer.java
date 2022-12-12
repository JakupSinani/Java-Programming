package example.example6.container;

public class HeavyContainer extends Container {

    public HeavyContainer(int id, int weight) {
        super(id, weight);
    }

    @Override
    public double consumption() {
        return 3.00 * weight;
    }

    @Override
    public boolean equals(Container other) {
        return other.getClass().getSimpleName().equals("HeavyContainer") && id == other.id && weight == other.weight;
    }
}
