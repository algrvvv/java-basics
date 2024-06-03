package practice.streams;

import java.util.*;
import java.util.stream.IntStream;

public class Easy {
    /**
     * Легкий уровень. Фильтрация чисел. Подсчет строк.
     *
     * @param args args
     */
    public static void main(String[] args) {
        System.out.println("Фильтрация чисел\n");
        IntStream.of(1, 65, 4, 2, 76, 2, 5, 27, 43, 25)
                .filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println();

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerList.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

        System.out.println("Подсчет строк\n");

        List<String> stringList = Arrays.asList("hello", "b", "world", "d", "test", "f");
        long count = stringList.stream().filter(x -> x.length() > 3).count();
        System.out.println(count);

    }
}
