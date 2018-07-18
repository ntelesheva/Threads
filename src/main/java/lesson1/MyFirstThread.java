package lesson1;

public class MyFirstThread implements Runnable {
    public int in;
    public long rezult;

    public MyFirstThread(int in) {
        this.in = in;
    }

    public long getResult() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return rezult;
    }

    private static long getFactorialR(int number) {
        return (number == 0 || number == 1) ? 1 : number * getFactorialR(--number);
    }

    @Override
    public void run() {
         rezult =  getFactorialR(in);
    }


}
