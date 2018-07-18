package homeWork;

import static homeWork.utilityHelper.Helper.sleep;

public class Ship {
    private int maxCapacity;
    private int currentCapacity;

    public Ship(int capacity, int currentCapacity) {
        this.maxCapacity = capacity;
        this.currentCapacity = currentCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public synchronized int getCurrentCapacity() {
        return currentCapacity;
    }

    public synchronized void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }


    public synchronized void addContainer() {
        sleep(500);
        this.currentCapacity++;
    }

    public synchronized void takeContainer() {
        sleep(500);
        this.currentCapacity--;
    }

}

