package practice.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainForExeServ {
    public static void main(String[] args) {
        try (ExecutorService executor = Executors.newFixedThreadPool(5)) {
            Runnable task = () -> {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };

            for (int i = 0; i < 5; i++) {
                executor.submit(task);
            }
        }
    }
}
