package practice.generics.hard.second;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayMerge {
    public static <T> T[] mergeArrays(T[] first, T[] second) {
        List<T> resultList = new ArrayList<>(first.length + second.length);
        Collections.addAll(resultList, first);
        Collections.addAll(resultList, second);

        @SuppressWarnings("unchecked")
        T[] resultArr = (T[]) Array.newInstance(first.getClass().getComponentType(), 0);
        return resultList.toArray(resultArr);
    }
}
