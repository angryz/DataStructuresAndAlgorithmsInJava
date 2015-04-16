package angryz;

public class HighArrayMain {

  public static void main(String[] args) {
    HighArrayMain t = new HighArrayMain();
    HighArray<String> ha = t.createArray();
    t.getJava(ha);
    t.containsVim(ha);
    t.deleteAnalyze(ha);
  }

  private HighArray<String> createArray() {
    HighArray<String> ha = new HighArray<String>(10);
    ha.add("data");
    ha.add("structure");
    ha.add("alogrithm");
    ha.add("analyze");
    ha.add("java");
    ha.add("vim");
    ha.add("array");
    System.out.println("HighArray size: " + ha.size());
    return ha;
  }

  private void getJava(HighArray<String> ha) {
    String target = ha.get(4);
    System.out.println("Got element 'java': " + target.equals("java"));
  }

  private void containsVim(HighArray<String> ha) {
    System.out.println("Contains 'vim': " + ha.contains("vim"));
  }

  private void deleteAnalyze(HighArray<String> ha) {
    String deleted = ha.delete(3);
    System.out.println(deleted + " is deleted");
    System.out.println("After deleting 'analyze': " + ha.toString());
  }

}
