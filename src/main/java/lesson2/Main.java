package lesson2;

public class Main {
    public static void main(String[] args) {

        Repository repository = new Repository();

        new Thread(new Consumer(repository, "1")).start();
        new Thread(new Consumer(repository, "2")).start();
        new Thread(new Consumer(repository, "3")).start();
        new Thread(new Producer(repository, "1")).start();
        new Thread(new Producer(repository, "2")).start();
    }
}
