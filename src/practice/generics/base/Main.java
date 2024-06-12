package practice.generics.base;

public class Main {
    public static void main(String[] args) {
        Pair<String> ps = new Pair<>();
        ps.setFirst("Hello");
        ps.setSecond("world!");

        System.out.println(ps.getFirst() + " " + ps.getSecond());

        Pair<Integer> pi = new Pair<>(1, 2);
        System.out.println(pi.getFirst() + " " + pi.getSecond());
    }
}
