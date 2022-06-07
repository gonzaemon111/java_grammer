package engineer;

public class Engineer extends Person {
  // NOTE: フィールド or メンバ と呼ぶ. 呼び方はどちらもでもいい.
  private String lang;

  /* NOTE:
   * **コンストラクタ**
   * コンストラクタは, インスタンスを作成時に呼び出される特殊なメソッド.
   */
  public Engineer(int age, String name) {
    super(age, name);
    this.lang = "JAVA";
  }

  /* NOTE:
   * これもコンストラクタだが, 上と引数が違うためエラーにならない
   * Javaは引数が違うと,__別メソッド__として扱われる。
   * このように複数の同盟メソッドがあることを **オーバーロード**という.
   */
  public Engineer(int age, String name, String lang) {
    super(age, name);
    this.lang = lang;
  }

  /* NOTE:
   * 1. まず Personクラスは,Writableインターフェースを実装（implements）しており, 抽象クラスとして定義されている.
   * 2. Engineerクラスは, Personクラスを継承している.
   * 3. インターフェースで定義されているメソッドは必ずオーバーライドする必要がある.(Personクラスは抽象クラスであるため,定義する必要はない)
   * 4. そのため, EngineerクラスはWritableインターフェースに実装されているexecute()メソッドを**オーバーライド**する必要がある。
  */
  @Override
  public void execute() {
    System.out.println("これはポリモーフィックです : ");
    System.out.println("this.lang : " + this.lang);

    // NOTE: Ageは, Personクラスでprotectedフィールドで定義されているため, 呼び出すことができる.
    System.out.println("this.age : " + this.age);

    // NOTE: 親クラスのフィールドでprivateにしているため, `this.` でアクセスできない. 呼び出すなら,このようにgetterで呼び出す
    System.out.println("this.getName : " + this.getName() + "\n");
  }

  /* NOTE:
   * Personクラスで定義されているintroduceメソッド（抽象メソッド）をオーバーライド.
   * オーバーライド自体は,抽象メソッドじゃなく親クラスのメソッドが存在すればできる.
   * しかしながら, 親クラス or インターフェースが存在する場合は, 必ずオーバーライドしなければならない.
   */
  @Override
  public void introduce() {
    System.out.println("私は," + this.getName() + "です。" + this.age + "歳です。");
  }
}
