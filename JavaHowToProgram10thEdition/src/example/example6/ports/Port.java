package example.example6.ports;

import example.example6.container.Container;
import example.example6.interfaces.IPort;
import example.example6.ships.Ship;

import java.util.ArrayList;
import java.util.Collections;

public class Port implements IPort {
    private int id;
    private double x;
    private double y;
    private ArrayList<Container> containers;
    private ArrayList<Ship> history;
    private ArrayList<Ship> current;

    public Port(int id, double x, double y) {
        this.id = id;
        this.x = x;
        this.y = y;
        containers = new ArrayList<Container>();
        history = new ArrayList<Ship>();
        current = new ArrayList<Ship>();
    }

    public double getDistance(Port other) {
        final double x_diff = x - other.x;
        final double y_diff = y - other.y;
        return Math.sqrt(x_diff * x_diff + y_diff * y_diff);

    }

    @Override
    public void incomingShip(Ship s) {
        if (!current.contains(s)) {
            current.add(s);
        }
    }

    @Override
    public void outgoingShip(Ship s) {
        if (!history.contains(s)) {
            history.add(s);
        }
    }

    public ArrayList<Container> getContainers() {
        return containers;
    }

    public ArrayList<Ship> getCurrent() {
        return current;
    }

    @Override
    public String toString() {
        String str = String.format("Port %d: (%.2f, %.2f)\n", id, x, y);
        ArrayList<ArrayList<Container>> sorted = Container.getContainersSortedByType(containers);
        for (ArrayList<Container> conts : sorted) {
            if (!conts.isEmpty()) {
                str += " " + conts.get(0).getClass().getSimpleName() + ":";
                for (Container cont : conts) {
                    str += " " + cont.getId();
                }
                str += "\n";
            }
        }
        Collections.sort(current);
        for (Ship ship : current) {
            str += ship.toString();
        }
        return str;
    }
}
