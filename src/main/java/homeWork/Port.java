package homeWork;

import static homeWork.utilityHelper.Helper.sleep;

public class Port {

    private int maxCapacity;
    private int currentCapacity;

    public Port(int maxCapacity, int currentCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
        System.out.println("Port, maxCapacity:" + maxCapacity +", currentCapacity:"   + currentCapacity);
    }

    public synchronized void addContainers() {
        sleep(500);
        this.currentCapacity++;
        System.out.println("Port add container:  " + this.currentCapacity);
    }

    public synchronized void takeContainer() {
        sleep(500);
        this.currentCapacity--;
        System.out.println("Port take container:  " + this.currentCapacity);
    }


}
