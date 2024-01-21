package Sorting;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrays = {13, 46, 24, 52, 20, 9};
        int[] sort = sortBy(arrays);
        System.out.println(Arrays.stream(sort).boxed().collect(Collectors.toList()));
    }

    /* pushes the max element to the last by adjacent swaps */
    /*The time complexity is O(N^2) amd the best case time complexity is O(N) */
    public static int[] sortBy(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            int swapped = 0;

            for (int j = 0; j <= i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    swapped = 1;
                }
            }
            if (swapped == 0) {
                break;
            }
        }
        return array;

    }
}
