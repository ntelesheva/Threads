package homeWork;

import static homeWork.utilityHelper.Helper.sleep;

public class Ship {
    private int maxCapacity;
    private int currentCapacity;

    public Ship(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
        System.out.println("New Ship, maxCapacity:" + maxCapacity + ", currentCapacity: " + currentCapacity);
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
        System.out.println("loading... ship add container, " + this.currentCapacity);
    }

    public synchronized void takeContainer() {
        sleep(500);
        this.currentCapacity--;
        System.out.println("unloading... ship take container, " + this.currentCapacity);
    }

}

