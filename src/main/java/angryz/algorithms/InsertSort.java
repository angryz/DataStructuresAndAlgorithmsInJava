package angryz.algorithms;

import java.util.Arrays;

public class InsertSort {

  private static int compareCount;
  private static int moveCount;

  public static int[] sort(int[] unsorted) {
    compareCount = 0;
    moveCount = 0;
    int[] sorted = Arrays.copyOf(unsorted, unsorted.length);
    int markedVal, idx;
    for (int mark = 1; mark < unsorted.length; mark++) {
      markedVal = sorted[mark];
      idx = mark;
      while (idx > 0 && sorted[idx-1] > markedVal) {
        compareCount++;
        sorted[idx] = sorted[idx-1];
        moveCount++;
        idx--;
      }
      if (mark != idx) {
        sorted[idx] = markedVal;
        moveCount++;
      }
    }
    return sorted;
  }

  public static int totalCompare() {
    return compareCount;
  }

  public static int totalMove() {
    return moveCount;
  }

}
