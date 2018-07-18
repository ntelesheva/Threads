package lesson1;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {

    public static long getFactorial(int in) {
        long rezult = 1;
        for (int i = 1; i <= in; i++) {
            rezult *= i;
        }
        return rezult;
    }

    public static long getFactorialR(int in) {
        return (in == 0 || in == 1) ? 1 : in * getFactorialR(--in);
    }

    public  static int getNumberOfFibonacci(int number) {
        int in1 = 1;
        int in2 = 1;
        int in3 = 0;
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        }

        for (int i = 3; i < number; i++) {
            in3 = in1 + in2;
//            System.out.print(in3  + " " );
            in1 = in2;
            in2 = in3;
        }
        return in3;
    }

    public static int getNumberOfFibonacciR(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
           return getNumberOfFibonacciR(number - 1) + getNumberOfFibonacciR(number - 2);
        }
    }

    public static void getAllNumberFibonacciR(int limit, int number){
        for(int i = 1; i <= limit; i++){
            System.out.print(getNumberOfFibonacciR(number--) + " ");
        }
    }


    public static BigInteger getFactorialStream(int in){
        if(in == 0 || in == 1){
            return BigInteger.valueOf(1);
        }
        return IntStream.rangeClosed(2, in).parallel().mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
    }

    public static void main(String[] args) {
        MyFirstThread myFirstThread = new MyFirstThread(5);
        new Thread(myFirstThread).start();
        System.out.println("rezult: " + myFirstThread.getResult());

        MySecondThread mySecondThread = new MySecondThread();
        mySecondThread.start();

        System.out.println("cycle Factorial: " + getFactorial(5));
        System.out.println("recursion Factorial: " + getFactorialR(5));
        getNumberOfFibonacci(11);
        System.out.println(getNumberOfFibonacciR(11));
        getAllNumberFibonacciR(11,11);
        System.out.println(getFactorialStream(5));
    }
}
