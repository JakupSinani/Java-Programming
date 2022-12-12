package example.example6.container;

public class BasicContainer extends Container {

    public BasicContainer(int id, int weight) {
        super(id, weight);
    }

    @Override
    public double consumption() {
        return 2.50 * weight;
    }

    @Override
    public boolean equals(Container other) {
        return other.getClass().getSimpleName().equals("BasicContainer") && id == other.id && weight == other.weight;
    }
}
