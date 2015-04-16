package angryz;

public class HighArray<T> {
  
  private T[] a;
  private int length;

  public HighArray(int maxSize) {
    a = (T[]) new Object[maxSize];
    length = 0;
  }

  public void add(T element) {
    a[length++] = element;
  }

  public T get(int index) {
    return (T) a[index];
  }

  public boolean contains(T target) {
    for(T element : a) {
      if (element.equals(target))
        return true;
    }
    return false;
  }

  public T delete(int index) {
    T element = (T) a[index];
    for (int i = index; i < length; i++) {
      a[i] = a[i+1];
    }
    length--;
    return element;
  }

  public int size() {
    return length;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0; i < a.length; i++) {
      sb.append(a[i]);
      if (i != a.length - 1)
        sb.append(",");
    }
    sb.append("]");
    return sb.toString();
  }

}
