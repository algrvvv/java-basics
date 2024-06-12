package practice.generics.hard.third;

public class ComparablePair <T extends Comparable<T>, U extends Comparable<U>> implements Comparable<ComparablePair<T,U>> {
    private final T first;
    private final U second;

    public ComparablePair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public int compareTo(ComparablePair<T, U> o) {
        if (first.compareTo(o.first) == 0) {
            return second.compareTo(o.getSecond());
        }
        return first.compareTo(o.getFirst());
    }
}
