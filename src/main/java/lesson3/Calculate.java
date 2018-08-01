package lesson3;

import java.util.concurrent.Callable;

public class Calculate implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 10;
    }
}
