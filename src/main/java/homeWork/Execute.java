package homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Execute {
    private List<Pier> piers;
    private Queue<Ship> shipsQ;

    private int countOfPiers;
    private Port port;

    public Execute(int countOfPiers, Port port, Queue<Ship> ships) {
        this.countOfPiers = countOfPiers;
        this.port = port;
        this.shipsQ = ships;
        initPiers(countOfPiers, port);
    }

    private void initPiers(int countOfPiers, Port port) {
        this.piers = new ArrayList<>(countOfPiers);
        for (int i = 0; i < countOfPiers; i++) {
            piers.add(new Pier(port));

        }
    }

    public void execute() {
        while (true) {
            for (Ship ship : shipsQ) {
                    int i = 0;
                for (Pier pier : piers) {
                    if (pier.isFree()) {
                        System.out.println("the pier is free");
                        pier.setShip(ship);
                        pier.start();
                        System.out.println(Thread.currentThread().getName() + "["+i+"]->start"); //TODO:
                        i++;
                    }
                }
            }

        }
    }

}
