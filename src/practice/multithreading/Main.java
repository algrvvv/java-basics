package practice.multithreading;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinter());
        Thread t2 = new Thread(new NumberPrinter());

        t1.start();
        t2.start();
    }
}
