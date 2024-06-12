package practice.generics.advanced.trpl;

public class Triple<T, U, V> {
    private T first;
    private U second;
    private V third;

    public Triple() {}

    public Triple(T first, U second, V third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getFirst() {
        return first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public U getSecond() {
        return second;
    }

    public void setThird(V third) {
        this.third = third;
    }

    public V getThird() {
        return third;
    }
}
