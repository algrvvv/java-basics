package practice.multithreading.blqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Integer takedValue = queue.take();
                System.out.println("[consumer] Полученное значение: " + takedValue);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
