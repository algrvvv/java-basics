package practice.generics.advanced.strg;

public class Main {
    public static void main(String[] args) {
        ArrayListStorage<String> strg = new ArrayListStorage<>();
        strg.add("A");
        strg.add("B");
        strg.add("C");

        System.out.println("1:" + strg.get(0) + "\n2:" + strg.get(1) + "\n3:" + strg.get(2));
    }
}
