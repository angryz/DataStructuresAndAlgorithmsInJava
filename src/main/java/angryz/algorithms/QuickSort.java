package angryz.algorithms;

import java.util.Arrays;

/**
 * @author Zheng Zhipeng
 */
public class QuickSort extends SortAlgorithm {

    public static void sort(int[] sorted, final int low, final int high) {
        int pivot = low;
        int i = low;
        int j = high + 1;
        while (true) {
            while (sorted[++i] < sorted[pivot])
                if (i == high)
                    break;
            while (sorted[--j] > sorted[pivot])
                if (j == low)
                    break;
            System.out.println("i=" + i + ", j=" + j);
            if (i >= j) {
                break;
            }
            swap(sorted, i, j);
            System.out.println(Arrays.toString(sorted));
        }
        if (pivot != j)
            swap(sorted, pivot, j);
        System.out.println(Arrays.toString(sorted));
        if (low < (j - 1))
            sort(sorted, low, j - 1);
        if ((j + 1) < high)
            sort(sorted, j + 1, high);
    }

    public static void main(String[] args) {
        int[] unsorted = {49, 38, 27, 64, 77, 16, 86, 99};
        int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
        QuickSort.sort(sorted, 0, sorted.length - 1);
    }
}
