package angryz.algorithms;

public class LinearSearch {

  public static int find(int target, int[] sortedArray) {
    if (sortedArray[0] < target && sortedArray[sortedArray.length - 1] > target) {
      for (int i = 0; i < sortedArray.length; i++) {
        if (sortedArray[i] == target)
          return i;
        else if (sortedArray[i] > target) {
          System.out.println("Array element already larger than " + target + " at index " + i + ", quit search.");
          break;
        }
      }//for
    }
    return sortedArray.length;
  }

}
