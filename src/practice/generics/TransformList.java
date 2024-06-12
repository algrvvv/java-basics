package practice.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class TransformList {
    public static <T,U> List<U> transformList(List<T> list, Function<T,U> func) {
        return list.stream().map(func).toList();
    }


    public static void main(String[] args) {
        List<String> strList = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        List<Integer> intList = transformList(strList, Integer::parseInt);
        System.out.println(intList);
        System.out.println(intList.getFirst().getClass().getName());
    }
}
