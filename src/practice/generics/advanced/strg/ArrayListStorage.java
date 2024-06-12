package practice.generics.advanced.strg;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStorage<T> implements IStorage<T>{
    private final List<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T get(int index) {
        return list.get(index);
    }
}
