package practice.sorting.quick;

import javax.print.attribute.standard.PrinterURI;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    /**
     * Разделение с использованием в качестве опоры последний элемент
     *
     * @param arr массив
     * @param left левая граница
     * @param right правая граница
     * @return новый индекс опоры
     */
    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }
}
