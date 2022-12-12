package example.example6.interfaces;

import example.example6.container.Container;
import example.example6.ports.Port;

public interface IShip {
    boolean sailTo(Port p);

    void reFuel(double newFuel);

    boolean load(Container cont);

    boolean unLoad(Container cont);
}
