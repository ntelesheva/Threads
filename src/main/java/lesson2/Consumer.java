package lesson2;

public class Consumer implements Runnable {
    private Repository repository;
    private String name;

    public Consumer(Repository repository, String name) {
        this.repository = repository;
        this.name=name;

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(300);
                repository.getValue(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
