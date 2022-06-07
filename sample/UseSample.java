package sample;
/**
 * UseSample
 */
public class UseSample {
  public static void main(String[] args) {
    Sample s = new Sample();
    s.setName("hogehoge");
    s.setAge(20);

    System.out.println(s.getName());
    System.out.println(s.getAge());
  }
}
