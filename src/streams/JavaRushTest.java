package streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class JavaRushTest {
    public static void main(String[] args) {
        // вариант работы используя стрим
        IntStream.of(1,2,3,4,5,6,7,8,9,10).filter(x -> x % 2 == 0).map(x -> x * 2).forEach(System.out::println);

        // точно такой же функционал, но без стримов
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        for (int el : arr) {
            if (el % 2 != 0) continue;
            System.out.println(el * 2);
        }

        List<String> list = new ArrayList<>();
        list.add("One"); list.add("Two"); list.add("Three"); list.add("Four");
        list.stream().filter(s -> s.length() > 3).forEach(System.out::println);

        // убрать повторяющиеся элементы
        int[] dis = IntStream.of(1,1,1,2,3,4,4,5,6,7,7,7,8,9).distinct().toArray();
        System.out.println(Arrays.toString(dis));

        // сортировка элемнтов
        int[] sor = IntStream.of(9,3,4,7,1,5,6,8,2).sorted().toArray();
        System.out.println(Arrays.toString(sor));

        // найти минимальный или максимальный элемент
        int min = IntStream.of(9,3,4,7,1,5,6,8,2).min().getAsInt();
        System.out.println(min);
        int max = IntStream.of(9,3,4,7,1,5,6,8,2).max().getAsInt();
        System.out.println(max);

        // найти сумму всех элементов
        int sum = IntStream.of(9,3,4,7,1,5,6,8,2).sum();
        System.out.println(sum);
    }
}
