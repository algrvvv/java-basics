package practice.generics.advanced.trpl;

public class Main {
    public static void main(String[] args) {
        Triple<String, Integer, Boolean> triple = new Triple<>("Hello", 100, true);
        System.out.println(triple.getFirst() + " " + triple.getSecond() + " " + triple.getThird());

        triple.setFirst("World");
        triple.setSecond(1000);
        triple.setThird(false);

        System.out.println(triple.getFirst() + " " + triple.getSecond() + " " + triple.getThird());
    }
}
