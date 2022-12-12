package example.example6.ships;

import example.example6.container.Container;
import example.example6.container.HeavyContainer;
import example.example6.container.LiquidContainer;
import example.example6.container.RefrigeratedContainer;
import example.example6.interfaces.IShip;
import example.example6.ports.Port;

import java.util.ArrayList;

public class Ship implements IShip, Comparable<Ship> {
    private final int id;
    private double fuel;
    private Port currentPort;

    private final ArrayList<Container> containers;
    private final int totalWeightCapacity;
    private final int maxNumberOfAllContainers;
    private final int maxNumberOfHeavyContainers;
    private final int maxNumberOfRefrigeratedContainers;
    private final int maxNumberOfLiquidContainers;
    private final double fuelConsumptionPerKm;
    private int totalWeight;
    private int numberOfAllContainers;
    private int numberOfHeavyContainers;
    private int numberOfRefrigeratedContainers;
    private int numberOfLiquidContainers;

    public Ship(int id, Port p, int totalWeightCapacity, int maxNumberOfAllContainers, int maxNumberOfHeavyContainers, int maxNumberOfRefrigeratedContainers, int maxNumberOfLiquidContainers, double fuelConsumptionPerKm) {
        this.id = id;
        fuel = 0.0;
        currentPort = p;
        currentPort.incomingShip(this);

        containers = new ArrayList<Container>();
        this.totalWeightCapacity = totalWeightCapacity;
        this.maxNumberOfAllContainers = maxNumberOfAllContainers;
        this.maxNumberOfHeavyContainers = maxNumberOfHeavyContainers;
        this.maxNumberOfRefrigeratedContainers = maxNumberOfRefrigeratedContainers;
        this.maxNumberOfLiquidContainers = maxNumberOfLiquidContainers;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        totalWeight = 0;
        numberOfAllContainers = 0;
        numberOfHeavyContainers = 0;
        numberOfRefrigeratedContainers = 0;
        numberOfLiquidContainers = 0;
    }

    @Override
    public boolean sailTo(Port p) {
        double total_fuel_cost = fuelConsumptionPerKm;
        for (Container cont : containers) {
            total_fuel_cost += cont.consumption();
        }
        total_fuel_cost *= currentPort.getDistance(p);
        boolean can_sail = total_fuel_cost <= fuel;

        if (can_sail) {
            fuel -= total_fuel_cost;
            currentPort.getCurrent().remove(this);
            currentPort.outgoingShip(this);
            p.incomingShip(this);
            currentPort = p;
        }
        return can_sail;
    }

    @Override
    public void reFuel(double newFuel) {
        if (newFuel < 0.0) {
            throw new IllegalArgumentException();
        }
        fuel += newFuel;
    }

    @Override
    public boolean load(Container cont) {
        boolean can_load;

        if (!currentPort.getContainers().contains(cont) || maxNumberOfAllContainers >= maxNumberOfAllContainers || totalWeight + cont.getWeight() > totalWeightCapacity) {
            can_load = false;
        } else if (cont instanceof HeavyContainer) {
            if (numberOfHeavyContainers >= maxNumberOfHeavyContainers)
                can_load = false;
            else if (cont instanceof RefrigeratedContainer)
                can_load = numberOfRefrigeratedContainers < maxNumberOfRefrigeratedContainers;
            else if (cont instanceof LiquidContainer)
                can_load = numberOfLiquidContainers < maxNumberOfLiquidContainers;
            else
                can_load = true;
        } else
            can_load = true;
        if (can_load) {
            currentPort.getContainers().remove(cont);
            containers.add(cont);
            numberOfAllContainers++;
            totalWeight += cont.getWeight();
            if (cont instanceof HeavyContainer) {
                numberOfHeavyContainers++;
                if (cont instanceof RefrigeratedContainer)
                    numberOfRefrigeratedContainers++;
                else if (cont instanceof LiquidContainer)
                    numberOfLiquidContainers++;
            }
        }
        return can_load;
    }

    @Override
    public boolean unLoad(Container cont) {
        boolean can_unLoad = containers.contains(cont);

        if (can_unLoad) {
            containers.remove(cont);
            currentPort.getContainers().add(cont);
            numberOfAllContainers--;
            totalWeight -= cont.getWeight();
            if (cont instanceof HeavyContainer) {
                numberOfHeavyContainers--;
                if (cont instanceof RefrigeratedContainer)
                    numberOfRefrigeratedContainers--;
                else if (cont instanceof LiquidContainer)
                    numberOfLiquidContainers--;
            }
        }

        return can_unLoad;
    }

    @Override
    public int compareTo(Ship other) {
        return id < other.id ? -1 : (id == other.id ? 0 : 1);
    }

    @Override
    public String toString() {
        String str = String.format("  Ship %d: %.2f\n", id, fuel);
        ArrayList<ArrayList<Container>> sorted = Container.getContainersSortedByType(containers);
        for (ArrayList<Container> conts : sorted)
            if (!conts.isEmpty()) {
                str += "    " + conts.get(0).getClass().getSimpleName() + ":";
                for (Container cont : conts)
                    str += " " + cont.getId();
                str += "\n";
            }

        return str;
    }
}

