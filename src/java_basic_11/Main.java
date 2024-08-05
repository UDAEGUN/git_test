package java_basic_11;

/**
 * アクセス修飾子　Activity.
 *
 * <p> メソッドの Activity で作成したプログラムに、適切なアクセス修飾子を設定して改良しましょう
 * <pre>
 *     目標 :
 *      1. フィールド・メソッドに、適切なアクセス修飾子を設定できる
 *      2. アクセス修飾子の設定によって、フィールドやメソッドに実際にアクセスできないようになっているのを確認する
 * </pre>
 */
public class Main {
    public static void main(String[] args) {

        BankAccountManager bankAccountManager = new BankAccountManager();

        //残高を20万円増やし、領収書を出力
//        bankAccountManager.balance += 200000;
//        bankAccountManager.printReceipt("フリコミ", 200000);
        bankAccountManager.deposit(200000);

        //40万円引き落とし、領収書を出力
//        bankAccountManager.balance -= 400000;
//        bankAccountManager.printReceipt("ヒキオトシ", 400000);
        bankAccountManager.withdraw(400000);

    }
}
