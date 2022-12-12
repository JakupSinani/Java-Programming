package example.example6.container;

public class LiquidContainer extends HeavyContainer {

    public LiquidContainer(int id, int weight) {
        super(id, weight);
    }

    @Override
    public double consumption() {
        return 4.00 * weight;
    }

    @Override
    public boolean equals(Container other) {
        return other.getClass().getSimpleName().equals("LiquidContainer") && id == other.id && weight == other.weight;
    }
}
