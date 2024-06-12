package practice.generics;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionFilter {
    public static <T> Collection<T> filter(Collection<T> collection, Predicate<T> predicate) {
        return collection.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("hello", "world", "!");
        Collection<String> strFiltered = filter(strList, str -> str.length() > 3);
        System.out.println(strFiltered);

        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        Collection<Integer> intFiltered = filter(intList, x -> x % 2 == 0);
        System.out.println(intFiltered);

    }
}
