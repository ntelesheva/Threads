package lesson3;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) throws Exception {
        Callable<Void> voidCallable = () -> null ;//TODO: return type Void

        long timeOut1 = 3000;
        long timeOut2 = 2000;
        long timeOut3 = 1000;

        Callable<Long> callable1 = () -> {
            Thread.sleep(timeOut1);
            return 1L;
        };
        Callable<Long> callable2 = () -> {
            Thread.sleep(timeOut2);
            return 2L;
        };
        Callable<Long> callable3 = () -> {
            Thread.sleep(timeOut3);
            return 3L;
        };
        /// System.out.println(callable.call());


        FutureTask<Long> task1 = new FutureTask<>(callable1);
        FutureTask<Long> task2 = new FutureTask<>(callable2);
        FutureTask<Long> task3 = new FutureTask<>(callable3);
        long timeStart  =  System.currentTimeMillis();
        new Thread(task1).start();
        new Thread(task2).start();
        new Thread(task3).start();
        System.out.println("result1: " + task1.get());
        System.out.println("result2: " + task2.get());
        System.out.println("result3: " + task3.get());
        System.out.println("time: " + (System.currentTimeMillis() - timeStart));


        ExecutorService service = Executors.newFixedThreadPool(10);

    }

}
