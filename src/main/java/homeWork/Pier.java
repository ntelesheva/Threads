package homeWork;

public class Pier extends Thread {

    private Ship ship;
    private Port port;
    private boolean isFree;

    public Pier(Port port) {
        this.port = port;
        this.isFree = true;
        System.out.println("new Pier, in  port");
    }

    public void setShip(Ship ship) {
        this.ship = ship;
        this.isFree = false;
        System.out.println("the pier add new ship, the pier is busy");
    }

    public boolean isFree() {
        return isFree;
    }

    @Override
    public void run() {
        int currentC = ship.getCurrentCapacity();
        int maxCapacity = ship.getMaxCapacity();
        System.out.println("        currentCapacity in ship:" + currentC + ", maxCapacity: " + maxCapacity);
        if (currentC == 0) {
            System.out.println("currentC == 0");
            while (ship.getCurrentCapacity() < maxCapacity) {
                ship.addContainer();
                port.takeContainer();

            }
        } else if (ship.getCurrentCapacity() >= maxCapacity) {
            System.out.println("currentC >= maxCapacity");
            while (ship.getCurrentCapacity() != 0) {
                ship.takeContainer();
                port.addContainers();

            }
        }
        this.isFree = true;
    }
}
