package example.example6.container;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Container implements Comparable<Container> {
    protected int id;
    protected int weight;

    public Container(int id, int weight) {
        this.id = id;
        this.weight = weight;
    }

    public abstract double consumption();

    public abstract boolean equals(Container other);

    public int getId() {
        return id;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Container o) {
        return id < o.id ? -1 : (id == o.id ? 0 : 1);
    }

    static public ArrayList<ArrayList<Container>> getContainersSortedByType(ArrayList<Container> containers) {
        Collections.sort(containers);
        ArrayList<Container> basic_conts = new ArrayList<Container>();
        ArrayList<Container> heavy_conts = new ArrayList<Container>();
        ArrayList<Container> refrigerated_conts = new ArrayList<Container>();
        ArrayList<Container> liquid_conts = new ArrayList<Container>();

        for (Container cont : containers) {
            if (cont instanceof BasicContainer) {
                basic_conts.add(cont);
            } else if (cont instanceof RefrigeratedContainer) {
                refrigerated_conts.add(cont);
            } else if (cont instanceof LiquidContainer) {
                liquid_conts.add(cont);
            } else {
                heavy_conts.add(cont);
            }
        }
        ArrayList<ArrayList<Container>> res = new ArrayList<ArrayList<Container>>();
        res.add(basic_conts);
        res.add(heavy_conts);
        res.add(refrigerated_conts);
        res.add(liquid_conts);

        return res;

    }
}
