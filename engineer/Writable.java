package engineer;

/* NOTE:
 * インターフェース（実装）と呼ばれる.
 * 抽象メソッドを定義するために存在する.（polymorphic）
 * このインターフェースをclassでimplementsすると, 必ずメソッドをオーバーライドする必要がある.
 *
 * また, インターフェースはメンバを持つことができない.
 */
interface Writable {
  // インターフェースでは, 抽象メソッドを定義.
  abstract void execute();
}
