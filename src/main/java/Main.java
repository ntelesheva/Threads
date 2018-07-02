

public class Main {

    public static long getFactorial(int in) {
        long rezult = 1;
        for (int i = 1; i <= in; i++) {
            rezult *= i;
        }
        return rezult;
    }

    public static long getFactorialR(int in) {
        return (in == 0 || in == 1) ? 1 : in * getFactorial(--in);
    }


    public static void main(String[] args) {
        MyFirstThread myFirstThread = new MyFirstThread(5);
        new Thread(myFirstThread).start();
        System.out.println("rezult: " + myFirstThread.getResult());

        MySecondThread mySecondThread = new MySecondThread();
        mySecondThread.start();
    }
}
