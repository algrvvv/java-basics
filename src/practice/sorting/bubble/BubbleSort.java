package practice.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] res1 = BubbleSort.bubbleSortWithWhile(new int[]{10, 2, 3, 5, 4});
        System.out.println(Arrays.toString(res1));

        int[] res2 = BubbleSort.bubbleSortWithFor(new int[]{10, 2, 3, 5, 4});
        System.out.println(Arrays.toString(res2));
    }

    public static int[] bubbleSortWithWhile(int[] arr) {
        boolean needOperation = true;
        while (needOperation) {
            needOperation = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    needOperation = true;
                }
            }
        }

        return arr;
    }

    public static int[] bubbleSortWithFor(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }
}
