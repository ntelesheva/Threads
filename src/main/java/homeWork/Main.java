package homeWork;

import java.util.ArrayDeque;
import java.util.Queue;

import static java.lang.Math.*;

/**
 * Порт. Корабли заходят в порт для разгрузки/загрузки контейнеров. Число
 * контейнеров, находящихся в текущий момент в порту и на корабле, должно
 * быть неотрицательным и превышающим заданную грузоподъемность суд-
 * на и вместимость порта. В порту работает несколько причалов. У одного
 * причала может стоять один корабль. Корабль может загружаться у причала,
 * разгружаться или выполнять оба действия.
 */

public class Main {
    public static void main(String[] args) {
        Port port = new Port(1000, 200);
        Queue<Ship> shipsQ = new ArrayDeque<>(5);
        for (int i = 0; i < 5; i++) {
            int capacity = (int) random()*100 + 200;
            int currCapacity = (int) random()*100;
            Ship ship = new Ship(capacity, currCapacity);
            shipsQ.add(ship);
        }

        Execute executer = new Execute(5,port,shipsQ);
        executer.execute();
    }
}
 v