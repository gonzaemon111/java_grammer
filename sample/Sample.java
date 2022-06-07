package sample;

public class Sample {
  private String name;
  private int age;

  public Sample() {
    this.age = 20;
    this.name = "hogehoge";
  }

  public Sample(int age, String name) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String nameMessage() {
    return "私の名前は, " + this.name + "です。";
  }
}
