package practice.generics.hard.second;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] ints1 = new Integer[]{1, 2};
        Integer[] ints2 = new Integer[]{3, 4};
        Integer[] ints3  = ArrayMerge.mergeArrays(ints1, ints2);
        System.out.println(Arrays.toString(ints3));
    }
}
