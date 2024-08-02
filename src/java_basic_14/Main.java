package java_basic_14;

/**
 * 継承　Activity.
 *
 * <p> 用意されているクレジットカードの決済プログラムを利用して、ゴールドカードでの決済プログラムを作りましょう
 * <pre>
 *     目標 :
 *      1. 継承によって子クラスに実装が受け継がれる仕組みを理解している
 *      2. オーバーライドを使って、子クラスでメソッドの実装が変更される仕組みを理解している
 *      3. 上位の型でインスタンスを取り扱う(アップキャスト)のメリットを理解している
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        //インスタンス生成
        //ToDo 4.
        CreditCard myCard = new GoldCard("アクティビティ タロウ");

        //支払処理(テストデータ投入)
        myCard.pay("〇〇スーパー", 5000);
        myCard.pay("レストラン✕✕", 10000);
        myCard.pay("□□オンラインショップ", 50000);

        //利用情報の出力
        myCard.printStatement();

    }

}
