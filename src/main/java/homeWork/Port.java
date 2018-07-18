package homeWork;

import static homeWork.utilityHelper.Helper.sleep;

public class Port {

    private int maxCapacity;
    private int currentCapacity;

    public Port(int capacity, int currentCapacity) {
        this.maxCapacity = capacity;
        this.currentCapacity = currentCapacity;
    }

    public synchronized void addContainers() {
        sleep(500);
        this.currentCapacity++;
    }

    public synchronized void takeContainer() {
        sleep(500);
        this.currentCapacity--;
    }


}
