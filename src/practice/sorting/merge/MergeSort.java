package practice.sorting.merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 6, 2, 3, 4};
        mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int len) {
        if (len < 2) {
            return;
        }

        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        } // or System.arraycopy(arr, 0, left, 0, mid);

        for (int j = mid; j < len; j++) {
            right[j - mid] = arr[j];
        }

        mergeSort(left, mid);
        mergeSort(right, len - mid);

        merge(arr, left, right, mid, len - mid);
    }

    private static void merge(int[] arr, int[] left, int[] right, int l, int r) {
        int i = 0; int j = 0; int k = 0;

        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < l) {
            arr[k++] = left[i++];
        }

        while (j < r) {
            arr[k++] = right[j++];
        }
    }
}
