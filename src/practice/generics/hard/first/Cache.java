package practice.generics.hard.first;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Cache<K, V> {
    private final Map<K, V> map = new HashMap<K, V>();

    public Cache() {
    }

    public Cache(K key, V value) {
        map.put(key, value);
    }

    public void put(K key, V value) {
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public List<K> getAllKeyByValue(Predicate<V> predicate) {
        List<K> list = new ArrayList<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (predicate.test(entry.getValue())) {
                list.add(entry.getKey());
            }
        }

        return list;
    }

}
