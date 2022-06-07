// NOTE: ディレクトリごとにpackageで管理する
package engineer;

// NOTE: 外部packageを利用する際に記述
import sample.Sample;

public class Execution {
  public static void main(String[] args) {
    // NOTE: Engineerクラス
    System.out.println("Engineer ======");
    Engineer engineer = new Engineer(20, "Sample Taro", "JAVA");
    engineer.execute();

    // NOTE: Sampleクラス（別package）
    System.out.println("Sample ========");
    Sample sample = new Sample();
    sample.setAge(30);
    sample.setName("サンプル");
    String nameMessage = sample.nameMessage();
    System.out.println(nameMessage);
  }
}
