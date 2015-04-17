package angryz.algorithms;

import java.util.Arrays;

public class BubbleSort extends SortAlgorithm {

  private static int count;

  public static int[] sort1(int[] unsorted) {
    count = 0;
    int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
    int i=0, t=0, n=unsorted.length-1;
    while (n > 0) {
      count++;
      // exchange position
      if (sorted[i] > sorted[i+1]) {
        swap(sorted, i, i+1);
      }
      // back to head
      if (++i == n) {
        i = 0;
        n--;
      }
    }//while
    return sorted;
  }

  public static int[] sort2(int[] unsorted) {
    count = 0;
    int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
    for (int out = sorted.length - 1; out > 0; out--) {
      for (int in = 0; in < out; in++) {
        if (sorted[in] > sorted[in+1])
          swap(sorted, in, in+1);
        count++;
      }
    }
    return sorted;
  }

  public static int totalTimes() {
    return count;
  }

}
