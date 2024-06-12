package practice.generics.hard.third;

public class Main {
    public static void main(String[] args) {
        ComparablePair<Integer, Boolean> pair1 = new ComparablePair<>(1, true);
        ComparablePair<Integer, Boolean> pair2 = new ComparablePair<>(1, false);
        ComparablePair<Integer, Boolean> pair3 = new ComparablePair<>(2, false);

        System.out.println(pair1.compareTo(pair2));
        System.out.println(pair1.compareTo(pair3));
        System.out.println(pair2.compareTo(pair3));

    }
}
