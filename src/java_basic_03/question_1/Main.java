package java_basic_03.question_1;

/**
 * 演算・文字列結合　Activity ①.
 *
 * <p> 2つの整数に対して、加算・減算などの計算処理を実行するプログラムを作成しましょう
 * <pre>
 *     目標 :
 *      1. どの計算をするときに、どの算術演算子を利用するかを覚える
 *      2. 文字列の結合の書き方を理解し、変数や演算結果を出力メッセージに利用できるようになる
 * </pre>
 */
public class Main {

    public static void main(String[] args) {

        //ToDo 1. 以下の変数aとbを、1以上の任意の値で初期化してください
        int a = 10;
        int b = 24;
        int c = 23;
        int num = a +a;

        //ToDo 2. 変数aとbを使って加算・減算・乗算・除算・剰余算を実行し、答えを以下の形式で出力してください
        //「(実行した計算の種類、加算など)の結果は (計算結果) です。」
        System.out.println("加算の結果は " + (a + b) + " です。");
        System.out.println("減算の結果は " + (a - b) + " です。");
        System.out.println("乗算の結果は " + (a * b + c) + " です。");
        System.out.println("除算の結果は " + (a / b) + " です。");
        System.out.println("剰余算の結果は " + (a % b) + " です。");
        System.out.println("結果は  " + num);

    }

}
