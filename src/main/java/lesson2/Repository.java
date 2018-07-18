package lesson2;

public class Repository {
    private int in;
    //    private boolean valueSet = false;
    private int counter = 0;

    synchronized public void putValue(int value, String name) {
        while (counter == 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.in = value;
        counter++;
        System.out.println("Producer:" + name + ", put value:" + counter);
//        valueSet = true;
        notify();
    }

    synchronized public int getValue(String name) {
        while (counter == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        counter--;
        System.out.println("Consumer: " + name + " , get value:" + counter);
//        valueSet = false;
        notify();
        return in;
    }
}
