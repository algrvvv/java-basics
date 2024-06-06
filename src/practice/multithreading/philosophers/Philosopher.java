package practice.multithreading.philosophers;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private Semaphore sem;

    private String name;

    private boolean isHungry = true;

    public Philosopher(Semaphore sem, String name) {
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            // проверяем голоден ли философ
            if (isHungry) {
                sem.acquire(); // запрашиваем разрешение у семафора
                System.out.println(name + " садиться за стол!");

                sleep(300); // кушает :D
                isHungry = false;

                System.out.println(name + " поел и уходит!");
                sem.release();

                sleep(300);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
