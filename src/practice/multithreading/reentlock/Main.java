package practice.multithreading.reentlock;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        SafeCounter sc = new SafeCounter();

        Runnable task = () -> {
            for (int i = 0; i < 20; i++) {
                sc.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start(); t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter: " + sc.getCounter());

    }
}
