package practice.generics.hard.first;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cache<String, Integer> cache = new Cache<>();
        cache.put("one", 1);
        cache.put("two", 2);
        cache.put("three", 3);

        System.out.println(cache.get("two"));
        List<String> keysList = cache.getAllKeyByValue(value -> value > 1);
        System.out.println(keysList);
    }
}
