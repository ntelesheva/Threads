package homeWork;

public class Pier extends Thread {

    private Ship ship;
    private  Port port;
    private  boolean isFree;

    public Pier( Port port) {
        this.port = port;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
        this.isFree = false;
    }

    public boolean isFree() {
        return isFree;
    }

    @Override
    public void run() {
        int currentC = ship.getCurrentCapacity();
        if (currentC == 0) {
            while (ship.getCurrentCapacity() != ship.getMaxCapacity()) {
                ship.addContainer();
                port.takeContainer();

            }
        } else {
            while (ship.getCurrentCapacity() != 0) {
                ship.takeContainer();
                port.addContainers();

            }
        }
        this.isFree = true;
    }
}
