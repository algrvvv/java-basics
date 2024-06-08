package practice.multithreading.blqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                queue.put(i);
                System.out.println("[producer] Положил: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
