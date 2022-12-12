package example.example6.interfaces;

import example.example6.ships.Ship;

public interface IPort {
    void incomingShip(Ship s);

    void outgoingShip(Ship s);
}
