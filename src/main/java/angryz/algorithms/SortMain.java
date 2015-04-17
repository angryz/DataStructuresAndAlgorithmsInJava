package angryz.algorithms;

import java.util.Random;
import java.util.Arrays;

public class SortMain {

  public static void main(String[] args) {
    int[] a = createArray(10);
    System.out.println("Origin: " + Arrays.toString(a));

    int[] b = BubbleSort.sort1(a);
    System.out.println("Sorted: " + Arrays.toString(b));
    System.out.println("Loop count: " + BubbleSort.totalTimes());

    int[] c = BubbleSort.sort2(a);
    System.out.println("Sorted: " + Arrays.toString(c));
    System.out.println("Loop count: " + BubbleSort.totalTimes());

    int[] d = SelectSort.sort(a);
    System.out.println("Sorted: " + Arrays.toString(d));
    System.out.println("Compare count: " + SelectSort.totalCompare());
    System.out.println("Swap count: " + SelectSort.totalSwap());

    int[] e = InsertSort.sort(a);
    System.out.println("Sorted: " + Arrays.toString(e));
    System.out.println("Compare count: " + InsertSort.totalCompare());
    System.out.println("Move count: " + InsertSort.totalMove());
  }

  private static int[] createArray(int size) {
    int[] a = new int[size];
    for (int i=0; i<size; i++) {
      a[i] = new Random().nextInt(100) + 10;
    }
    return a;
  }

}
