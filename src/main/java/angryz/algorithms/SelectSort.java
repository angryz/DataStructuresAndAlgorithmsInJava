package angryz.algorithms;

import java.util.Arrays;

public class SelectSort extends SortAlgorithm {

  private static int compareCount;
  private static int swapCount;

  public static int[] sort(int[] unsorted) {
    compareCount = 0;
    swapCount = 0;
    int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
    int min;
    for (int head = 0; head < unsorted.length - 1; head++) {
      min = head;
      for (int i = head + 1; i < unsorted.length; i++) {
        if (sorted[i] < sorted[min])
          min = i;
        compareCount++;
      }
      if (min != head) {
        swap(sorted, head, min);
        swapCount++;
      }
    }
    return sorted;
  }

  public static int totalCompare() {
    return compareCount;
  }

  public static int totalSwap() {
    return swapCount;
  }

}
