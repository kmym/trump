package trump;

/**
 * テーブルを表すインターフェース.
 */
public interface Table {
  /**
   * カードを置く.
   * テーブルに置かれたカードをどのように扱うかは、サブクラスで実装する.
   *
   * @param card カード
   */
  void putCard(Card[] card);

  /**
   * カードを見る.
   *
   * @return テーブルに置かれたカードを表す配列
   */
  Card[][] getCards();
}
