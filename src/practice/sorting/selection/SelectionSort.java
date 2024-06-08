package practice.sorting.selection;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 2, 3, 5, 4};
        SelectionSort.selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int minIndex = left;
            for (int right = left + 1; right < arr.length; right++) {
                if (arr[minIndex] > arr[right]) {
                    minIndex = right;
                }
            }

            int temp = arr[left];
            arr[left] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
