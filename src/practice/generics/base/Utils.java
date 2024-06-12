package practice.generics.base;

import java.util.Arrays;

public class Utils {
    public static <T> void swap(T[] array, int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        swap(intArr, 0, 5);
        System.out.println(Arrays.toString(intArr));

        String[] strArr = new String[]{"a", "b", "c", "d", "e", "f"};
        swap(strArr, 3, 4);
        System.out.println(Arrays.toString(strArr));
    }
}
