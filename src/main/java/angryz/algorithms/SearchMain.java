package angryz.algorithms;

import java.util.Random;
import java.util.Arrays;

public class SearchMain {

  public static void main(String[] args) {
    int size = 10000000;
    int seed = 300;
    int[] a = create(size, seed);
    //int target = new Random().nextInt(seed * seed) + size;
    int target = a[size - seed];

    /*StringBuilder sb = new StringBuilder("[ ");
    for (int i : a)
      sb.append(i).append(" ");
    sb.append("]");*/
    System.out.println("Start finding " + target + " in array "/* + sb.toString() + "]"*/);

    int result;
    long startTime, finishTime;

    System.out.println("==> Linear search method");
    startTime = System.nanoTime();
    result = LinearSearch.find(target, a);
    finishTime = System.nanoTime();
    show(result, a);
    System.out.println("cost time: " + (finishTime - startTime) + " ns\n");

    System.out.println("==> Binary search method 1");
    startTime = System.nanoTime();
    result = BinarySearch.find1(target, a);
    finishTime = System.nanoTime();
    show(result, a);
    System.out.println("cost time: " + (finishTime - startTime) + " ns\n");

    System.out.println("==> Binary search method 2");
    startTime = System.nanoTime();
    result = BinarySearch.find2(target, a);
    finishTime = System.nanoTime();
    show(result, a);
    System.out.println("cost time: " + (finishTime - startTime) + " ns\n");

    System.out.println("==> Binary search method in java.util.Arrays");
    startTime = System.nanoTime();
    result = Arrays.binarySearch(a, target);
    finishTime = System.nanoTime();
    show(result, a);
    System.out.println("cost time: " + (finishTime - startTime) + " ns\n");
  }

  private static int[] create(int size, int seed) {
    int[] a = new int[size];
    a[0] = new Random().nextInt(seed);
    for (int i = 1; i < a.length; i++) {
      a[i] = a[i-1] + new Random().nextInt(seed);
    }
    return a;
  }

  private static void show(int result, int[] sortedArray) {
    if (result < 0 || result > (sortedArray.length - 1))
      System.out.println("Target not found");
    else {
      String previous = result == 0 ? "BEGIN" : Integer.toString(sortedArray[result-1]);
      String next = result == (sortedArray.length - 1) ? "END" : Integer.toString(sortedArray[result+1]);
      System.out.println("Target position is " + result + ". Between " + previous + " and " + next);
    }
  }

}
