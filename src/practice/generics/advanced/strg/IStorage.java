package practice.generics.advanced.strg;

public interface IStorage <T>{
    void add(T item);
    T get(int index);
}
