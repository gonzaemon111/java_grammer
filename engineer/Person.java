package engineer;

/* NOTE:
 * 抽象クラス
 * Writableインターフェースを実装（implements）している.
 * そのため, 本来はWritableに記述されているexecuteメソッドをオーバーライドしなければならないが,抽象クラスはオーバーライドしない.
 */
abstract class Person implements Writable {
  // ** 2つのフィールドを定義 **
  // NOTE: protectedは, 子クラスでアクセス可能
  protected int age;

  // NOTE: privateは, このクラスからのみアクセス可能. 子クラスでもアクセス不可. メンバにはprivate修飾子が一番よく使われる
  private String name;

  /* NOTE:
   * 抽象メソッド
   * これを記述すると, 子クラスで必ずこのintroduceメソッドをオーバーライドしなければならない.
   */
  abstract void introduce();

  // NOTE: publicがついていないため, 同package内
  Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  /* NOTE: 以下↓↓はすべて getter, setter */
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
