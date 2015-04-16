package angryz.algorithms;

public class BinarySearch {

  private static int count;

  public static int find1(int target, int[] sortedArray) {
    count = 0;
    return findFromTo(target, sortedArray, 0, sortedArray.length - 1);
  }

  private static int findFromTo(int target, int[] sortedArray, int from, int to) {
    System.out.print("Comparing times: " + ++count + ". ");
    int cursor = (from + to) / 2;
    if (target < sortedArray[from] || target > sortedArray[to] || from > to)
      return sortedArray.length;
    else if (target < sortedArray[cursor]) {
      System.out.print(target  + " < " + sortedArray[cursor]);
      to = cursor - 1;
    } else if (target > sortedArray[cursor]) {
      System.out.print(target  + " > " + sortedArray[cursor]);
      from = cursor + 1;
    } else {
      return cursor;
    }
    System.out.println("  cursor: " + cursor + " (" + sortedArray[from] + "~" + sortedArray[to] + ")");
    return findFromTo(target, sortedArray, from, to);
  }

  public static int find2(int target, int[] sortedArray) {
    count = 0;
    int lowerBound = 0;
    int upperBound = sortedArray.length - 1;
    int cursor;
    while (true) {
      //System.out.print("Comparing times: " + ++count + ". ");
      cursor = (lowerBound + upperBound) / 2;
      if (sortedArray[cursor] == target) {
        return cursor;
      } else if (lowerBound > upperBound) {
        return sortedArray.length;
      } else {
        if (sortedArray[cursor] < target) {
          //System.out.print(target  + " > " + sortedArray[cursor]);
          lowerBound = cursor + 1;
        } else {
          //System.out.print(target  + " < " + sortedArray[cursor]);
          upperBound = cursor - 1;
        }
      }
      //System.out.println("  cursor: " + cursor + " (" + sortedArray[lowerBound] + "~" + sortedArray[upperBound] + ")");
    }//while
  }

}
