package practice.multithreading.philosophers;

import java.util.concurrent.Semaphore;

public class Main {
    /**
     * Разбор работы семафора на примере задачи об обедающих философах
     *
     * @param args аргс
     */
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Philosopher(semaphore, "Пифагор").start();
        new Philosopher(semaphore, "Аристотель").start();
        new Philosopher(semaphore, "Сократ").start();
        new Philosopher(semaphore, "Платон").start();
        new Philosopher(semaphore, "Фалес").start();
    }
}
