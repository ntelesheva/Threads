package lesson2;

public class Producer implements Runnable {
    private Repository repository;
    private String name;

    public Producer(Repository repository, String name) {
        this.repository = repository;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; true; ) {
            try {
                Thread.sleep(100);
                repository.putValue(i++, name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

